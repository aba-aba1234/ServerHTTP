package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("server avviato");
        ServerSocket mioServerSocket = new ServerSocket(3000);
        Socket mioSocket = mioServerSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);

        String StringaRicevuta = in.readLine();
        System.out.println(StringaRicevuta);
        String[] parte = StringaRicevuta.split(" ");
        do {
            StringaRicevuta = in.readLine();
            System.out.println(StringaRicevuta);

        } while (!in.readLine().isEmpty());

        System.out.println(parte[0]);
        System.out.println(parte[1]);
        System.out.println(parte[2]);

        mioServerSocket.close();
    }
}