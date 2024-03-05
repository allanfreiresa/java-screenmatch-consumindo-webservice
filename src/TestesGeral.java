import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestesGeral {
    public static void main(String[] args) throws IOException, InterruptedException {

/*
        try {
            FileWriter writer = new FileWriter("arquivo");

            writer.write("HelloOOOO");
            writer.close();
            writer.write(" World!");
            writer.close();
        } catch (Exception e) {
            System.out.println("Erro!");
        }

        /*File file1 = new File("C:\\Projetos\\Alura\\Java\\meuarquivo.txt");
        FileWriter writer = new FileWriter(file1);
        writer.write("Olá, mundo maluco!");
        writer.close();
*/

        File file = new File("C:\\Projetos\\Alura\\Java\\meuarquivo.txt");
        FileReader reader = new FileReader(file);

        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();


    }
}
