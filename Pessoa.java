package AtividadePontuada;

import java.util.ArrayList;

public class Pessoa{
    private String nome;
    private String cpf;
    private  int AnoNascimento;
    private ArrayList<Pet> petsAdotados;
    private static final int MAXIMO_PETS=2;
    
    
    //Contrutor 
    public Pessoa(String nome, String cpf, int AnoNasimento){
        this.nome = nome;
        this.cpf = cpf;
        this.AnoNascimento = AnoNascimento;
        this.petsAdotados = new ArrayList<>();
    }
    
    //boolean
    public boolean adotarPet(Pet animalestimacao){
        if (AnoNascimento<2003 && petsAdotados.size()<=MAXIMO_PETS){
            petsAdotados.add(animalestimacao);
            
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public String listarPets(){
        String animais = "";
        for (Pet animal : petsAdotados){
            animais = animais + animal.getInfoPet();
        }
        return animais;
    }
}