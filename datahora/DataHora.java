package datahora;

import java.util.Date;

public class DataHora{
    public static void main(String[] args){
        Date hora = new Date(); // Importa a classe Date da biblioteca java.util
        System.out.println("A hora do sistema é: ");
        System.out.println(hora.toString());
    }
}