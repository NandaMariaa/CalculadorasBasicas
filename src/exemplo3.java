public class exemplo3 {

    static String verificarPar(float n1){
        if (n1 % 2 == 0){
            return "Par";        
        }else{
            return "Impar";
        }
    }
    
    public static void main (String[]args){
        System.out.println(verificarPar(20));
    }
    
}
