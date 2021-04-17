
package Atividade_DS;

public class GeometriaMain {
    public static void main(String[] args){
        Quadrado.setDiagonal(1.41);
        Quadrado util1 = new Quadrado(2.5);
        
        System.out.printf("\n");
        System.out.printf("---- Quadrado -----\n");
        System.out.printf("Área do Quadrado: %.3f Cm²\n",util1.getArea());
        System.out.printf("Perimetro do Quadrado: %.3f\n",util1.getPerimetro());
        System.out.printf("Diagonal do Quadrado: %.3f\n",util1.getDiagonal());
        
        Quadrado.setDiagonal(Math.sqrt(2));
        
        System.out.printf("\n");
        System.out.printf("---- Math Class ----\n");
         System.out.printf("Área do Quadrado: %.3f Cm²\n",util1.getArea());
        System.out.printf("Perimetro do Quadrado: %.3f\n",util1.getPerimetro());
        System.out.printf("Diagonal do Quadrado: %.3f\n",util1.getDiagonal());
        
        Circulo.setPi(3.14);
        Circulo util2 = new Circulo(2.5);
        
        System.out.printf("\n");
        System.out.printf("---- Círculo ----\n");
        System.out.printf("Área do Círculo: %.3f Cm²\n",util2.getArea());
        System.out.printf("Circunferência do Círculo: %.3f\n",util2.getCircunferencia());
        
        Circulo.setPi(Math.PI);
        
        System.out.printf("\n");
        System.out.printf("---- Math Class ----\n");
        System.out.printf("Área do Círculo: %.3f Cm²\n",util2.getArea());
        System.out.printf("Circunferência do Círculo: %.3f\n",util2.getCircunferencia());
    }
}

