package seleniumdemo2;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReadDemo {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("test-data/login-data.csv"));

        reader.readLine(); // Skip header

      //  String line = reader.readLine();
        
        String line;
        while((line = reader.readLine()) !=null) {

        String[] data = line.split(",");

        String username = data[0];
        String password = data[1];

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        }
        reader.close();
    }
}