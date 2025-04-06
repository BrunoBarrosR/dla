package dia3;

public class Soma {

    public static void main(String[] args) {

        // 1. Adicione uma nova pontuação a um total de pontos existente em um jogo ficcítio.
        int pontuacaoInicial = 100;
        int novaPontuacao = 50;

        int totalPontos = pontuacaoInicial +  novaPontuacao;

        System.out.println("Total de pontos: " + totalPontos);


        //2. Para cada dia da semana defina a quantidade de horas trabalhadas e some o total

        int horasSegunda = 8;
        int horasTerca = 8;
        int horasQuarta = 8;
        int horasQuinta = 8;
        int horasSexta = 8;

        int horasTotal = horasSegunda + horasTerca + horasQuarta + horasQuinta + horasSexta;
        System.out.println("Total de horas trabalhadas: " + horasTotal);


        //3. Imagine que na sua casa 3 pessoas ganham salários diferentes, some eles para saber o ganho total.

        double salario1 = 2500.00;
        double salario2 = 7800.00;
        double salario3 = 12200.00;

        double totalSalario = salario1 + salario2 + salario3;

        System.out.println("A soma dos salários é igual a: R$ " + totalSalario);

    }

}
