import java.util.Scanner;

public class exemplo1 {

    public static float obtermedia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a média");
        float media = scanner.nextFloat();
        return media;
    }

    public static String definirstatus(float media){
    String status;
    if (media >=6){
        status = "Aprovado!";
        
    }else{
        status = "Reprovado";
    }
      return status;  
      
    }
     public static void imprimir(String status){
         System.out.println("Status: " + status);
    }
     
    public static void main (String[] args){
        float media = obtermedia();
        String status = definirstatus(media);
        imprimir(status);
    }
    
}
