package org.example;

public class App {
    public static void main( String[] args ) {

        int indice = 13;
        int soma = 0;
        int cont = 0;

        while(cont < indice)  {
            cont += 1;
            soma = soma + cont;
        }

        System.out.println(soma);

    }
}
