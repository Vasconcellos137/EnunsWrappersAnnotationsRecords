package WrapperExemplos;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int num = 0;
        Integer numr = new Integer(7); //o risco é p sinalizar q isso n é mais tão usual nas versões atuais.
        Integer numro = 3; //o mais usual é usar assim..

        Integer obj = Integer.valueOf(9);

        //Autoboxing faz a conversão direto, então n precisa fazer manualmente com new
        ArrayList<Integer> nunros = new ArrayList<>();
        nunros.add(5);

        int n = nunros.get(0);

        //Comparação entre classes wrapper
        if (nunros.equals(numro)) {
        
        }
    }
}
