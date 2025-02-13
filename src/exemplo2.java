import java.util.Scanner;

public class exemplo2 {

    public static float obterNumeros(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite Um Numero:");
        float n1 = input.nextFloat();
        return n1;
    }

    public static Float definirMaior(float n1, float n2){
    Float maior;
    if (n1 >= n2){
        maior = n1;
        
    }else{
        maior = n2;
    }
      return maior;  

    }
     
    public static void imprimir(Float maior){
        System.out.println("Maior entre dos dois: " + maior);   
    }
     
    public static void main (String[] args){
        imprimir(
                definirMaior(
                        obterNumeros(),
                        obterNumeros()
                )
        );   
    } 
    
}
