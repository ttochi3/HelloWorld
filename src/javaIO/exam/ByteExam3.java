package javaIO.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {
		try (
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
		){
			out.writeInt(100); //int���� 4 byte.
			out.writeBoolean(true); //boolean���� 1 byte.
			out.writeDouble(50.5); //Double���� 8 byte.
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
