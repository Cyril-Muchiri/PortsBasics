package example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sockets {
    public static void main(String []args) throws IOException {
        int port=9090;

        ServerSocket serverSocketocket=new ServerSocket(port);
        System.out.println("waiting for clients.............");
        boolean stop=false;

        while (!stop){
        Socket socket=serverSocketocket.accept();
        PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);
        writer.println("Hello client...!");
        BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

                String clientInput= reader.readLine();
        System.out.println(clientInput);
        socket.close();
        writer.close();
        reader.close();
        }
        serverSocketocket.close();

    }
}
