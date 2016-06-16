package com.check.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by chen on 2016/6/16.
 */
public class SocketServerForTest {
    //定义全局的Socket ServerSocket服务
    private Socket socket;
    private ServerSocket serverSocket;

    /**
     * 构造方法 初始化端口通道
     * @throws IOException
     */
    public SocketServerForTest() throws IOException{
        serverSocket = new ServerSocket(8888);
        System.out.println("------------------------------------");
        System.out.println("Socket 8888端口已开启：");
        System.out.println("------------------------------------");
        while(true){
            //查看是否有链接到该端口的socket
            socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            if("exit".equals(message)){
                br.close();
                socket.close();
                break;
            }
            System.out.println("客户端输入的内容为："+ message);
        }
    }

    public static void main(String[] args) {
        try {
            new SocketServerForTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
