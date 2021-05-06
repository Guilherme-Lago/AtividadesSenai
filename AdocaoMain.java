package AtividadePontuada;

import java.util.ArrayList;
import java.util.Scanner;

public class AdocaoMain {

    public static void main(String[] args) { 
        String x, y;
        int z, w = 0, a = 0;
        
        //Objeto Pet
        Pet adc = new Pet ("Shazam", "Pitbull", 2020, 'M');
        Pet adc2 = new Pet("Zeus", "Rottweiler", 2021, 'M');
        Pet adc3 = new Pet("Xeroza", "Poodle", 2021, 'F');
        Pet adc4 = new Pet("Bagana", "Vira-Lata", 2020, 'M');
       ArrayList <Pet> petsAdocao = new ArrayList<Pet>();
       petsAdocao.add(adc);
       petsAdocao.add(adc2);
       petsAdocao.add(adc3);
       petsAdocao.add(adc4);
       
       //Objeto Pessoa
       Scanner teclado = new Scanner(System.in);
       System.out.println("--------------------------------------------------");
       System.out.println("Digite seu nome:");
       x = teclado.nextLine();
       System.out.println("--------------------------------------------------");
       System.out.println("Digite seu CPF(Somente Números!!!):");
       y = teclado.nextLine();
       System.out.println("--------------------------------------------------");
       System.out.println("Digite seu ano de nascimento:");
       z = teclado.nextInt();
       Pessoa am = new Pessoa (x, y, z);
       
       while (w == 0){
           System.out.printf("\n");
           System.out.println("1) Adotar pet.");
           System.out.println("2) Listar pets adotados.");
           System.out.println("3) Listar pets restantes.");
           System.out.println("4) Sair.");
           System.out.printf("\n");
           
           a = teclado.nextInt();
           switch(a){
               case 1 -> realizarAdocao(am, petsAdocao, teclado);
               case 2 -> listarPetsAdotados(am);
               case 3 -> listarPetsRestantes(petsAdocao);
               case 4 -> w=1;
               
            default -> System.out.println("Opção inválida!");
                
           }
       }
    }
    
    
  
    private static void realizarAdocao(Pessoa pessoa, ArrayList<Pet> petsAdocao, Scanner entrada) {
        System.out.println("Informe qual pet deseja adotar: ");
        for (int i = 0; i < petsAdocao.size(); i++) {
            System.out.println(i + " - " + petsAdocao.get(i).getInfoPet());
        }
        int numeroPet = entrada.nextInt();
        Pet candidato = petsAdocao.get(numeroPet);
        if (pessoa.adotarPet(candidato) == true) {
            System.out.println("Pet " + numeroPet + " adotado com sucesso!\n");
            petsAdocao.remove(candidato);
        } else {
            System.out.println("Você já adotou o máximo de pets permitidos!\n");
        }
    }
    
    private static void listarPetsAdotados(Pessoa pessoa) {
        System.out.println("\nPets adotados até o momento: ");
        System.out.println(pessoa.listarPets());
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsAdocao) {
        System.out.println("\nPets restantes para adoção: ");
        for (Pet p : petsAdocao) {
            System.out.println(p.getInfoPet());
        }
    }
    
}