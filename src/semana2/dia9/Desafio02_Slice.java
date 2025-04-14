package semana2.dia9;

import java.util.Arrays;

public class Desafio02_Slice {

    //O segundo desafio será recriar o Slice e fazer o seu da sua maneira. Lembre-se que se nenhum parâmetro for fornecido ele simplesmente copia o array original inteiro.
    //
    //Dica: Para funcionar parecido com o original, será necessário enviar como primeiro parâmetro o próprio array.
    //O índice de início e fim podem receber valores por padrão também.

    static String[] array = new String[]{"VW Polo", "Fiat Strada", "GM Onix", "Fiat Argo", "Hyundai HB20", "GM Onix Plus", "VW T-Cross", "GM Tracker", "Fiat Mobi", "VW Saveiro"};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(slice(array, -1, 5)));
        System.out.println(Arrays.toString(slice(array)));
    }

    static String[] slice(String[] array) {
        return slice(array,  0, array.length);
    }

    static String[] slice(String[] array, int primeiroElemento, int ultimoElemento) {

        if(primeiroElemento < 0) primeiroElemento = 0;
        if(ultimoElemento < array.length) ultimoElemento = array.length;
        if (primeiroElemento > ultimoElemento) primeiroElemento = ultimoElemento;

        int quantidadeElementos = ultimoElemento - primeiroElemento;
        String[] arrayResultante = new String[quantidadeElementos];
        int contador = 0;

        for (int i = primeiroElemento; i < ultimoElemento && i < array.length; i++) {

            arrayResultante[contador] = array[i];

            contador++;
        }
        return arrayResultante;
    }
}
