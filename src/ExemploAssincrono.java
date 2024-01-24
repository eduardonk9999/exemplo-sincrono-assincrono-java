import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExemploAssincrono {
    public static void main(String[] args) {
        System.out.println("Início do Programa");

        // Executa a operação assíncrona
        CompletableFuture<Void> future = CompletableFuture
        .runAsync(() -> operacaoAssincrona());

        // Realiza outras operações enquanto aguarda a conclusão da operação assíncrona
        System.out.println("Realizando outras operações");

        try{
            // Aguarda a conclusão da operação assíncrona
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Fim do Programa");
    }  
    public static void operacaoAssincrona() {
        System.out.println("Início da Operação Assíncrona");

        // Simula uma operação demorada
        for (int i = 0; i < 5; i++) {
            System.out.println("Executando passo " + i);
        }

        System.out.println("Fim da Operação Assíncrona");
    }

}
