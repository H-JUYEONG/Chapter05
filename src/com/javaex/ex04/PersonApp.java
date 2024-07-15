package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PersonApp {

	public static void main(String[] args) throws IOException {

		List<Person> person = new ArrayList<Person>();

		// 읽기 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);

		// 한줄씩 읽기 반복
		while (true) {
			// 파일을 한줄씩 읽는다.
			String str = br.readLine();

			// 데이터 없으면 끝
			if (str == null) {
				break;
			}

			// 데이터가 있으면
			// 데이터를 3기준으로 나눠주고
			String[] file = str.split("#");

			String name = file[0];
			String hp = file[1];
			String company = file[2];

			Person p = new Person(name, hp, company);
			person.add(p);
		}

		for (int i = 0; i < person.size(); i++) {
			person.get(i).showInfo();
		}

		br.close();
	}

}
