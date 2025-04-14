package semana2.dia9;

import java.util.Arrays;

public class Slice {

    static String[] array = new String[]{"VW Polo", "Fiat Strada", "GM Onix", "Fiat Argo", "Hyundai HB20", "GM Onix Plus", "VW T-Cross", "GM Tracker", "Fiat Mobi", "VW Saveiro"};


    public static void main(String[] args) {

        System.out.println(Arrays.toString(slice(array, 0, 5)));
        System.out.println(Arrays.toString(slice(array, -1, 11)));
        System.out.println(Arrays.toString(slice(array)));

    }


    public static String[] slice(String[] array) {
        return slice(array, 0, array.length);
    }


    public static String[] slice(String[] array, int primeiroElemento, int ultimoElemento){

        if (primeiroElemento < 0) primeiroElemento = 0;
        if (ultimoElemento > array.length) ultimoElemento = array.length;
        if (primeiroElemento > ultimoElemento) primeiroElemento = ultimoElemento;

        String[] arraySlice = new String[ultimoElemento - primeiroElemento];
        int contador = 0;

        for(int i = primeiroElemento; i < ultimoElemento && i < array.length; i++){
            arraySlice[contador] = array[i];
            contador++;
        }
        return arraySlice;
    }

}
