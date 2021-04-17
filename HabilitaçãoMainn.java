package Habilitação;

import java.util.Scanner;

public class HabilitaçãoMainn {

    public static void main(String[] args) {
        String x;
        int y;
        char z;
        z = '-';
        char opcao;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Digite seu nome!");
        x = teclado.nextLine();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Digite seu ano de nascimento (4 dígitos)!");
        y = teclado.nextInt();
        System.out.println("-------------------------------------------------------------------");
        Motorista util = new Motorista(x, y, z);
        
        if (y<=2003){
            System.out.println("Digite o tipo da Habilitação desejada!");
            System.out.println("A) Moto");
            System.out.println("B) Carro");
            System.out.println("Z) Moto e Carro");
            
            opcao = teclado.next().charAt(0);
            
            util.tipoC(opcao);           
        
            System.out.println("---- DADOS DO(A) MOTORISTA ----");
            System.out.println("Nome: "+util.getNome());
            System.out.println("Ano Nasc.: "+util.getAnoNasci());
            System.out.println("Tipo da CNH: "+util.getTipoCnh());
        }
        else{
            System.out.println("Idade insuficiênte para dirigir!");
        }
        System.out.println("-------------------------------------------------------------------");
    }  
}