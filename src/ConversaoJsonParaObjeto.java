import br.com.alura.screenmatch.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
       // Gson gson = new Gson();
        //Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        //System.out.println("Objeto Pessoa: " + pessoa);
        //String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
