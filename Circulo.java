
package Atividade_DS;

public class Circulo {
    private double raio;
    private static double pi;
    
    //Construtor
    public Circulo(double raio){
        this.raio = raio;
    }
    //Getters
    public double getArea(){
        return pi*raio;
    }
    public double getCircunferencia(){
        return 2*pi*raio;
    }
     //Setters
    public static void setPi(double pi){
        Circulo.pi=pi;
}
    
}
