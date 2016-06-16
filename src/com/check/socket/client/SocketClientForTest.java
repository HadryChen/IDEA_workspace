package com.check.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by chen on 2016/6/16.
 */
public class SocketClientForTest {
    private Socket client;
    private PrintWriter pw;

    public SocketClientForTest() throws Exception {
        //ip 端口 连接服务端
        client = new Socket("localhost",8888);
        pw = new PrintWriter(client.getOutputStream());
        //读取 控制台的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //将控制台的输入发送到服务端
        pw.write(br.readLine());
        //pw.write("this is a test fow socket,if you receive this message in the others class and no error get, meanwhile the test is successfully");

        pw.close();
        br.close();
    }

    public static void main(String[] args) {
        try{
            new SocketClientForTest();
        }catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
