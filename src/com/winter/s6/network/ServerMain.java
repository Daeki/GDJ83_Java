package com.winter.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		// Network
		// ip:port => Socket
		// Network 통신은 Socket끼리 1:1 통신
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;

		Scanner scanner = new Scanner(System.in);
		try {
			ss = new ServerSocket(8282);

			while (true) {
				// 서버를 열고 Client 접속을 기다림
				System.out.println("서버실행 후 클라이언트를 기다림");
				sc = ss.accept();
				System.out.println("client와 연결 성공");

				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);

				while (true) {
					String msg = br.readLine();
					if (msg.toUpperCase().equals("EXIT")) {
						break;
					}
					System.out.println(msg);

					System.out.println("클라이언트로 보낼거 입력");
					msg = scanner.next();

					ow.write(msg + "\r\n");
					ow.flush();

					if (msg.toUpperCase().equals("EXIT")) {
						break;
					}

				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				os.close();
				ow.close();
				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
