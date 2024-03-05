import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraDeArquivo {
    public static void main(String[] args) {

/*        try {

            File arquivo = new File("github.json");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }

//Titulo titulo = new Titulo("Matrix",2015);
//System.out.println(titulo.getNome());

        Titulo titulo = new Titulo("Matrix", 2015);

        Gson gson = new Gson();
        String json = gson.toJson(titulo);
        System.out.

                println(json);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(titulo);

        System.out.

                println(json2);
 */

        Veiculo carro = new Veiculo();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2022);
        carro.setPreco(75000.00);

        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); //imprime mais bonito
        String jsonVeiculo = gson.toJson(carro);

        // Imprima o JSON resultante
        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);
    }
}
