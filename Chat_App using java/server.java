import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class server {
    ServerSocket ser;
        Socket soc;

    BufferedReader br;
    PrintWriter out;

    public server() {
        
        try {
            ser = new ServerSocket(7777);
            System.out.println("Server has started");
            soc = ser.accept();

            br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            out = new PrintWriter(soc.getOutputStream());

        startReading();
        startWriting();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            
        }

    }

    public void startReading() {
        // Creating thread
        Runnable ra = () -> {
            System.out.println("Reader has started...");
           
            try{
                while(!soc.isClosed()){
                    
                        String msg = br.readLine();
                        if(msg.equals("Exit")){
                            System.out.println("Client has terminated the chat!!!");
                            soc.close();
                            break;
                            
                        }
                        System.out.println("Client : " + msg);
                    
            }
        }catch(Exception e){
           // e.printStackTrace();
           System.out.println("Connection closed");
        }
        };
        new Thread(ra).start();
    }

    public void startWriting() {
        Runnable rb = () -> {
            System.out.println("Writer has started ...");
           
           try{
            while(!soc.isClosed()){
                
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    String content = br1.readLine();
                    out.println(content);
                    out.flush();
                    if(content.equals("Exit")){
                        soc.close();
                        break;
                    } 
                 
                
        }
    }catch(Exception e){
       // e.printStackTrace();
       
    }

        };
        new Thread(rb).start();

    }

    public static void main(String[] args) {
        System.out.println("This is Server starting...");
        new server();
    }

}
