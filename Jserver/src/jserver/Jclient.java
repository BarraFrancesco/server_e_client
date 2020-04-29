package jserver;

//@author Francy10

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import static java.lang.System.out;
import java.net.Socket;
import java.net.ClientSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.io.BufferedInputStream;
import static java.time.Clock.system;
public class Jclient {
     public static void main(String[] args) throws IOException {
     
    int server_port=10000;
    InetAddress address= InetAddress.getByName("local host");
    
    Socket client =new Socket(address,server_port);
    System.out.println("client pronto.\n");
    
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
    BufferedReader stldn= new BufferedReader(new InputStreamReader(system.in));
   
    System.out.println("JCLIENT CHAT");
    System.out.println("Inserisci il messaggio e premi INVIO\nINVIA 'quit' per uscire\n\n");
        while(true){
            System.out.print(">>");
            String s=stldn.readLine();
            
            out.println(s);
            
            if(s.equals("quit")){
               client.close();
                break;
            }
            
        }
        }
}
    

