
package Atividade_DS;

public class Quadrado {
    private static double diagonal;
    private double lado;
    
    //Construtor
    public Quadrado(double lado){
        this.lado=lado;
    }
    
    //Getters
    public double getArea(){
        return lado*lado;
    }
    public double getPerimetro(){
        return lado*4;
    }
    public double getDiagonal(){
        return lado*diagonal;
    }
    
    //Setters
    public static void setDiagonal(double diagonal){
        Quadrado.diagonal=diagonal;
}
    
}
