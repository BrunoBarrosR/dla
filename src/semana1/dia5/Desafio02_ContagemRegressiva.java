package semana1.dia5;

public class Desafio02_ContagemRegressiva {
    //Imagine que você é um engenheiro da NASA e está prestes a lançar um foguete. Você precisa fazer uma contagem regressiva a partir de 10 até o lançamento.
    //No entanto, quando chegar nos últimos 3 segundos, é importante dar um aviso, então inclua o texto"Atenção!" junto à contagem.
    // Quando a contagem terminar mostre a mensagem: "Lançamento do foguete!"

    public static void main(String[] args) throws InterruptedException {

        int segundos = 10;

        while(segundos > 0) {

            if(segundos <= 3) {
                System.out.println("Atenção! " + segundos + "...");
            } else {
                System.out.println(segundos + "...");
            }
            Thread.sleep(1000);
            segundos--;

        }
        System.out.println("\uD83D\uDE80 Lançamento do foguete!");
    }
}
