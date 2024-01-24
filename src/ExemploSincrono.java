public class ExemploSincrono {
    public static void main(String[] args){
        System.out.println("Início do Programa");

        //Executa a operação síncrona
        operacaoSincrona();

        System.out.println("Fim do Programa");
    }

    public static void operacaoSincrona() {
        System.out.println("Início da operação Síncrona");

        // Simula uma operação demorada
        for(int i = 0; i < 5; i++) {
            System.out.println("Executando passo " + i);
        }
        System.out.println("Fim da Operação Síncrona");
    }
}