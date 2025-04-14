package semana2.dia9;

public class Desafio01_FuncoesArrayList {

    static String[] array = new String[]{"VW Polo", "Fiat Strada", "GM Onix", "Fiat Argo", "Hyundai HB20", "GM Onix Plus", "VW T-Cross", "GM Tracker", "Fiat Mobi", "VW Saveiro"};

    public static void main(String[] args) {

        System.out.println(indexOf("GM Onix"));
        System.out.println(includes("Hyundai HB20"));
        System.out.println(includes("L200"));
        System.out.println(lastIndexOf("GM Onix"));

    }


    public static int indexOf(String elemento){
        int index = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(elemento)){
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean includes(String elemento) {
        boolean resposta = false;

        for (String item : array) {
            if (item.equals(elemento)) {
                resposta = true;
                break;
            }
        }
        return resposta;
    }

    public static int lastIndexOf(String elemento) {
        int index = -1;

        for (int i = array.length-1 ; i >= 0; i--) {
            if(array[i].equals(elemento)) {
                index = i;
            }
        }
        return index;
    }

}
