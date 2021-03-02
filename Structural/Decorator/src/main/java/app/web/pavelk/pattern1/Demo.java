package app.web.pavelk.pattern1;

import app.web.pavelk.pattern1.decorators.CompressionDecorator;
import app.web.pavelk.pattern1.decorators.DataSource;
import app.web.pavelk.pattern1.decorators.EncryptionDecorator;
import app.web.pavelk.pattern1.decorators.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSource encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}