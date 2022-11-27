import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    Socket soc;
    BufferedReader br;
    PrintWriter out;

    public client(){
        try {
            System.out.println("Sending request to Server...");
            soc = new Socket("127.0.0.1",7777);
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Connection Done.");

            br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            out = new PrintWriter(soc.getOutputStream());

        startReading();
        startWriting();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void startReading() {
        // Creating thread
        Runnable ra = () -> {
            System.out.println("Reader has started...");
            System.out.println("...");
            try{
            while(!soc.isClosed()){
                
                    String msg = br.readLine();
                    if(msg.equals("Exit")){
                        System.out.println("Server has terminated the chat!!!");
                        soc.close();
                        break;
                        
                    }
                    System.out.println("Server : " + msg);
                
             
            }
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Connection closed");
        }
                };
                new Thread(ra).start();
        }
        
    

    public void startWriting() {
        Runnable rb = () -> {
            System.out.println("Writer has started ...");
            System.out.println("...");
            
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
            }
            catch(Exception e){
    //e.printStackTrace(); 
}
        };
        new Thread(rb).start();
    }
    public static void main(String[] args) {
        System.out.println("This the Client ...");
        new client();
        
    }
}
