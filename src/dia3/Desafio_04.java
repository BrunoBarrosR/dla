package dia3;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_04 {
    //Suponha que você está planejando uma viagem de carro. Seu carro faz 12 km por litro de gasolina, e você quer calcular o número de litros de combustível
    //que você precisará para a viagem, bem como o custo total do combustível.

    //Os dados que você tem são:
    //- Distância total da viagem em quilômetros
    //- Preço do litro de gasolina em reais
    //
    //O desafio é escrever um programa que recebe a distância da viagem e o preço da gasolina e calcula:
    //a. Quantos litros de gasolina serão necessários para a viagem (considerando que o carro faz 12 km por litro)
    //b. Quanto vai custar para abastecer o carro para a viagem

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de viagem");

        System.out.print("Digite a distância em Km: ");
        double km =  sc.nextDouble();

        System.out.print("Digite o preço da gasolina: ");
        double precoGasolina = sc.nextDouble();

        double litros = km / 12;

        double custoCombustivel = litros * precoGasolina;

        System.out.println("Você precisará de " + litros + " litros de gasolina para essa viagem.");
        System.out.println("O custo da gasolina será de R$ " + custoCombustivel);


        sc.close();
    }
}
