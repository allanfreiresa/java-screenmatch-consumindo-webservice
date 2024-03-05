package br.com.alura.desafioCep.Buscador;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalCep {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();

        System.out.println("Digite um número de CEP para consulta:");
        var cep = leitura.nextLine();


        try {

            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

       } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizar a aplicação");
        }


    }
}
