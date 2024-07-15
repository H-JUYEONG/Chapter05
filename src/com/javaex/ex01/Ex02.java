package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteBuffImg.jpg");

		byte[] buff = new byte[1024];

		while (true) {

			int data = in.read(buff);
			System.out.println(data);

			// -1아면 탈출 조건
			if (data == -1) {
				System.out.println("읽기 끝");
				break;
			}

		}

		in.close();
		out.close();
		System.out.println("프로그램 끝");
	}

}
