import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.sound.sampled.Line;
public class sumNumbersFromTextFile {

	public static void main(String[] args){

        try{
            BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
            String line;
            long sum = 0;
            while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line);
             sum+=number;
            }
            System.out.println(sum);
            reader.close();
        }catch(Exception exeption){
            System.out.println("Error");
            exeption.printStackTrace();           
        }    
	}
}
