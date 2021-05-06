package AtividadePontuada;

public class Pet {
    private String nomedopet;
    private String racadopet;
    private int anoNascimento;
    private char sexo;
    
    public Pet(String nome, String raca, int anoNascimento, char sexo){
        this.nomedopet = nome;
        this.racadopet = raca;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
    }
    
    public String getInfoPet(){
        return nomedopet + ", " + racadopet + ", " + anoNascimento + ", " + sexo+"\n";
    }
}
