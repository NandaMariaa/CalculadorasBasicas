import java.util.Scanner;

public class exemplo5 {

    public static int menu (){
    int op;
    System.out.println("Digite 1 P/Adicao");
    System.out.println("Digite 2 P/Subtracao");
    System.out.println("Digite 3 P/Multiplicacao");
    System.out.println("Digite 4 P/Divisao");
    Scanner input = new Scanner(System.in);
    op = input.nextInt(); 
    return op;
    }
 
    public static float entradaDados (){
    Scanner input = new Scanner(System.in);    
    System.out.println("Digite 1 Numero: "); 
    float n1 = input.nextFloat();
    return n1;   
    }

    public static float adicao(float n1, float n2){
        System.out.println("Adicao: ");
        return n1+n2;
    }
    public static float subtracao(float n1, float n2){
        System.out.println("Subtracao: ");
        return n1-n2;
    }
    public static float multiplicacao(float n1, float n2){
        System.out.println("Multiplicacao: ");
        return n1*n2;
    }
     public static float divisao(float n1, float n2){
        System.out.println("Divisao: ");
        return n1/n2;
    }
    
    public static void imprimir (float result){
    System.out.println("Resultado: " + result);    
    }
    
    public static float controlador (int op, float n1, float n2){
    float result = 0;
    switch (op){
       case 1:
       result = adicao(n1, n2);
       break;
       
       case 2:
       result = subtracao(n1, n2);
       break;
       
       case 3:
       result = multiplicacao(n1, n2);
       break;
       
       case 4:
       result = divisao(n1, n2);
       break;
           
    }    
    return result;
    }
    
    public static void main(String[]args){
     int op = menu();
     float n1 = entradaDados();
     float n2 = entradaDados();
     float result = controlador(op, n1, n2);
     imprimir(result);
        
    }
    
}
