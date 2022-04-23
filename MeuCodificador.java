package Pessoal;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MeuCodificador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá, este é o meu codificador.");
        System.out.println("Por favor, digite uma palavra a ser codificada  na linha a baixo:");
        String palavra = teclado.nextLine().toLowerCase().trim();

        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String soma = "";

        for (int i = 0; i <palavra.length() ; i++) {

            char caractere = palavra.charAt(i);


            String regex1 = "["+ caractere +"]";


            Pattern pattern = Pattern.compile(regex1);
            Matcher matcher = pattern.matcher(alfabeto);



            while (matcher.find()){
                for (int j = 0; j < matcher.start()+1; j++) {
                    char c = alfabeto.charAt(i);
                    soma += c;
                }

            }

        }

        List<Integer> indice = new ArrayList<>();
        for (int i = 0; i < soma.length(); i++) {
            indice.add(i);
        }
        Collections.shuffle(indice);

        char[] caracteres = soma.toCharArray();
        char[] aleatorio = new char[soma.length()];

        for (int i = 0; i < soma.length(); i++) {
            aleatorio[i]=caracteres[indice.get(i)];
        }

        StringBuilder fim = new StringBuilder();
        System.out.println("----------------------------------");
        System.out.println("--------Palavra codificada--------");
        System.out.println("Código da palavra: "+fim.append(aleatorio));


    }
}
