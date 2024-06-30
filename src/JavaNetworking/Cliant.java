package JavaNetworking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliant {
    public static void main(String[] args) {
        System.out.println("Client Started....");
        try {
            Socket socket=new Socket("127.0.0.1",2222);
            System.out.println("Client connected....");
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());


            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a object : ");
            String message=sc.nextLine();
            oos.writeObject(message);
            try {
                Object fromserver=ois.readObject();
                System.out.println("From server : "+(String)fromserver);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
