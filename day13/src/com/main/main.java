package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.Person;

public class main {

	public static void main(String[] args) {
		Person p = new Person(007,"Nguyen Van Lam Son");
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fileout=new FileOutputStream("data/person.txt");
			oos = new ObjectOutputStream(fileout);
			oos.writeObject(p);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				
			}
		}

		
		
		ObjectInputStream ois = null;
		try {
			FileInputStream fileIn = new FileInputStream("data/person.txt");
			ois = new ObjectInputStream(fileIn);
			Person P =(Person)ois.readObject();
			System.out.println("id:"+P.getId());
			System.out.println("name:"+P.getName());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				
			}
		}
	}

}
