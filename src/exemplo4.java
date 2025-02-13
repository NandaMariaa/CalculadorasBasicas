import java.util.Scanner;

public class exemplo4 {

    public static double obterNumero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite Um Numero:");
        double x = input.nextDouble();
        return x;
    
}
    public static double Funcao(Double x){
        double result;
        if (x < -1){
            result = x+2;
        }else if(-1 <= x && x <= 2){
            result = (x*x)-4; 
        }else{ 
            result = (2*x)-1;
        }
        return result;
        
    }
    public static void imprimir(Double result){
        System.out.println("Resultado de X: " + result);
    }
    
    public static void main (String[]args){
        imprimir(
                Funcao(
                 obterNumero()
                      )
                );                    
    }
    
}
