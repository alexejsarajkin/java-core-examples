package com.ocp.serialization;

import java.io.*;

public class SerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat cat = new Cat();
		cat.setName("CatName");
		cat.setType("CatType");
		cat.setGender("CatGender");
		cat.setCollar(new Collar(3));

		System.out.println(cat.toString());

		File file = new File("src/main/java/com/ocp/serialization/CatSer");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(cat);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Cat newCat = (Cat) objectInputStream.readObject();
		objectInputStream.close();

		System.out.println(newCat.toString());
	}
}
