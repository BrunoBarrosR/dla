package semana1.dia7;

public class SuperDesafio {

//    //Como ainda não estudamos estrutura de dados e nem o conceito de listas e arrays, então o que iremos
//    //fazer, é criar 2 variáveis que controlam o saldo de 2 contas bancárias. As contas compartilham de um
//    //limite (que também será uma outra variável), porém começa com 0.
//    //
//    //A partir do momento que o saldo total das contas atingir R$1000, o limite será de 10%. Utilizando um
//    //saldo inicial dessas contas, efetue alguns cálculos através de funções que façam o seguinte:
//    //
//    //1. Calcular o saldo total das contas
//    //2. Exibir um alerta caso alguma conta esteja sem saldo ou utilizando o limite
//    //3. Fazer depósito em alguma das contas
//    //4. Efetuar débito em alguma das contas
//    //5. Transferir um determinado valor de uma conta para outra, somente se tiver saldo disponível
//    //6. Fazer a conversão do saldo (que está em R$) para dólar (US$)
//    //7. Exibir o limite disponível
//    //
//    //Só para complicar um pouco, se ao efetuar um depósito em uma conta ela estiver usando um limite, desconte do valor a ser depositado 15%.
//
//
//
    //saldo das contas
    static double saldoConta1 = 600.0;
    static double saldoConta2 = 400.0;

    //Limite inicial, juros e configurações de limite
    static double limiteConta = 0.0;
    static double jurosLimite = 0.0;
    static final double PERCENTUAL_JUROS_LIMITE = 0.15; //15% de juros
    static final double PERCENTUAL_LIMITE = 0.10; //10% de limite de crédito
    static final double SALDO_MINIMO_LIMITE = 1000.0;

    static final double CONVERSAO_REAL_PARA_DOLLAR = 5.23;

    public static void main(String[] args) {


        saldoTotal();
        alertaSaldoLimite();
        depositoConta(1, 100);
        debitoConta(2, 50);
        transferenciaEntreContas(1,2,200);
        conversaoRealParaDollar();
        exibirLimite();
        exibirJurosLimite();
        saldoTotal();



    }

    public static void saldoTotal() {
        double total = saldoConta1 + saldoConta2;

        if(total >= SALDO_MINIMO_LIMITE) {
            limiteConta = total * PERCENTUAL_LIMITE;
        }
        System.out.println("O total das 2 contas = R$" + total);
        System.out.println("Conta 1 = R$ " + saldoConta1);
        System.out.println("Conta 2 = R$ " + saldoConta2);
    }

    public static void alertaSaldoLimite() {
        if (saldoConta1 <= 0) {
            System.out.println("Conta 1 está sem saldo ou utilizando o limite!");
        }
        if (saldoConta2 <= 0) {
            System.out.println("Conta 2 está sem saldo ou utilizando o limite!");
        }

    }

    public static void depositoConta(int conta, double valor) {
        if (conta == 1) {
            if (saldoConta1 < 0) {
                jurosLimite = jurosLimite + (valor * PERCENTUAL_JUROS_LIMITE);
                valor = valor - (valor * PERCENTUAL_JUROS_LIMITE);
            }
            saldoConta1 = saldoConta1 + valor;
            System.out.println("Valor atualizado Conta 1 = R$ " + saldoConta1);
        } else if (conta == 2) {
            if(saldoConta2 < 0) {
                jurosLimite = jurosLimite + (valor * PERCENTUAL_JUROS_LIMITE);
                valor = valor - (valor * PERCENTUAL_JUROS_LIMITE);
            }
            saldoConta2 = saldoConta2 + valor;
            System.out.println("Valor atualizado Conta 2 = R$ " + saldoConta2);
        }
    }

    public static void debitoConta(int conta, double valor) {
        if (conta == 1 && valor <= (saldoConta1 + limiteConta)) {
            saldoConta1 = saldoConta1 - valor;
            System.out.println("Valor atualizado Conta 1 = R$ " + saldoConta1);
        } else if (conta == 2 && valor <= (saldoConta2 + limiteConta)) {
            saldoConta2 = saldoConta2 - valor;
            System.out.println("Valor atualizado Conta 2 = R$ " + saldoConta2);
        } else {
            System.out.println("Saldo insuficiente na conta" + conta +" !!");
        }
    }


    public static void transferenciaEntreContas(int contaOrigem, int contaDestino, double valor) {
        if (contaOrigem == 1 && contaDestino == 2 && (saldoConta1 + limiteConta) >= 0) {
            depositoConta(contaDestino,valor);
            debitoConta(contaOrigem, valor);
        } else if (contaOrigem == 2 && contaDestino == 1 && (saldoConta2 + limiteConta) >= 0) {
            depositoConta(contaDestino, valor);
            debitoConta(contaOrigem, valor);
        } else {
            System.out.println("Essa operação não pode ser executada!!");
        }
    }

    public static void conversaoRealParaDollar() {
        double conversao1 = saldoConta1 / CONVERSAO_REAL_PARA_DOLLAR;
        System.out.printf("A conta 1 possui R$ %.2f, ou seja, U$ %.2f%n", saldoConta1, conversao1);

        double conversao2 = saldoConta2 / CONVERSAO_REAL_PARA_DOLLAR;
        System.out.printf("A conta 2 possui R$ %.2f, ou seja, U$ %.2f%n", saldoConta2, conversao2);
    }

    public static void exibirLimite() {
        System.out.println("Limite = R$ " + limiteConta);
    }

    public static void exibirJurosLimite(){
        System.out.println("Juros limite = R$ " + jurosLimite);
    }
}
