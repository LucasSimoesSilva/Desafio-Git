package Pessoal.CoisasGerais;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MeuDecodificador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char c ='a';
        String soma ="";

        System.out.println("Olá, esté é o SUPER decodificador");
        System.out.println("Por favor, insira o código na linha abaixo:");
        String texto1 = teclado.nextLine().toLowerCase().trim();

        for (int i = 0; i <alfabeto.length() ; i++) {
            char caractere = alfabeto.charAt(i);
            int somaMat = 0;

            String regex1 = "["+ caractere +"]";

            Pattern pattern = Pattern.compile(regex1);
            Matcher matcher = pattern.matcher(texto1);


            while (matcher.find()){
                somaMat += -matcher.start() + matcher.end();

            }

            try {
                c = alfabeto.charAt(somaMat - 1);
                soma += c;
            }catch (StringIndexOutOfBoundsException e){
                break;
            }




        }

        System.out.println("-----------------------------------");
        System.out.println("--------Código decodificado--------");
        System.out.println("Código da palavra: "+soma);






    }
}
