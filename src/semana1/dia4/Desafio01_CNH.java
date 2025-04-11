package semana1.dia4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Desafio01_CNH {
    //Renovação da CNH
    //
    //Vamos supor que estamos criando um sistema para controlar a renovação da carteira de motorista e
    //precisamos saber em quanto tempo a mesma irá vencer de acordo com a legislação.
    //
    //1. De acordo com a lei, se você está tirando a carteira pela 1a vez (independentemente da sua idade), o
    //tempo de vencimento dela é de 1 ano;
    //2. Se você tem idade inferior a 50 anos o vencimento é de 10 anos;
    //3. Se for igual ou superior a 50 anos ou inferior a 70 anos o vencimento é de 5 anos;
    //4. Mas se for igual ou superior a 70 anos o vencimento será de 3 anos.
    //
    //Você deve criar variáveis e estruturas condicionais
    //para controlar esse vencimento.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("É sua primeira habilitação? (s/n): ");
        String primeiraHabilitacao = sc.nextLine().trim().toLowerCase();
        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        LocalDate anoNascimento = LocalDate.parse(sc.nextLine(), fmt);

        LocalDate agora = LocalDate.now();
        LocalDate umAnoDepois = agora.plusYears(1);
        long idade = ChronoUnit.YEARS.between(anoNascimento, agora);
        String vencimento = "";


        if(primeiraHabilitacao.equals("s")) {
            vencimento = "1 ano";
        } else if (idade < 50) {
            vencimento = "10 anos";
        } else if (idade < 70) {
            vencimento = "5 anos";
        } else {
            vencimento = "3 anos";
        }

        System.out.println("Sua carteira vence em " + vencimento + ".");

        sc.close();
    }
}
