
package jserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

//@author Francy10
 
public class Jserver {

   
    public static void main(String[] args) throws IOException {
        int server_port=10000;
       
            ServerSocket s=new ServerSocket(server_port);
            Socket clientsocket;
            BufferedReader in;
            System.out.println("===Chat Server in attesa===\nPer uscire premi CTRL-C\n\n");
            clientsocket=Jserver.accept();
            System.out.println("==>Accettata connessione dal client:"+clientsocket+"\n\n");
            while(true){
                in=new BufferedReader(newInputStreamReader(clientsocket.getInputStream()));
                if(s.equals ("quit")){
                    System.out.println("\n\n=== chiusura del server...===");
                    clientsocket.close();
                    break;
                    
                }else{
                    System.out.println("E'"+s);
                }
            }
          
                   
                    
            
    }
            private static Socket accept() {
        return null;
       }

    private static Reader newInputStreamReader(InputStream inputStream) {
        return null;
    }
    
    

    
}
