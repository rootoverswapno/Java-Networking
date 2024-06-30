package JavaNetworking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket=new ServerSocket(2222);

        System.out.println("Server Connected");

        while(true) {
            Socket socket = serversocket.accept();
            System.out.println("Cliant Connected.....");
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            try {
                Object cMsg = ois.readObject();
                System.out.println("From client" + (String) cMsg);

                String serversms = (String) cMsg;
                serversms = serversms.toUpperCase();

                oos.writeObject(serversms);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
