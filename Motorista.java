package Habilitação;

public class Motorista {
    private String nomeMotorista;
    private int anoDeNascimento;
    private char tipoCNH;

    public String getNome(){
        return this.nomeMotorista;
    }
    
    public int getAnoNasci(){
        return this.anoDeNascimento;
    }
    
    public char getTipoCnh(){
        return this.tipoCNH;
    }
    
    public Motorista(String nUser, int anoNasc, char tipoCnh){
        this.nomeMotorista = nUser;
        this.anoDeNascimento = anoNasc;
        this.tipoCNH = '-';
    }

    public void tipoC(char opcao){
        if (opcao == 'A' || opcao == 'B' || opcao == 'Z'){
            this.tipoCNH = opcao;
        }
    }

}