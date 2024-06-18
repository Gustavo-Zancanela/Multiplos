import java.util.Scanner;

public class DisplayMultiples {

    public int multiplos(int num)
    {
     for(int i = 1; i <= 12; i++) //recebe o numero digitado pelo usuario e calcula seus multiplos de 1 a 12
        {
            int resultado = i * num; 
                System.out.println(num + "x" + i + " = " + resultado ); //escreve o resultado 
           
        }
      return num;
    }
    
    public static void main(String args[]) {
     
        Scanner sc = new Scanner(System.in);
        DisplayMultiples DM = new DisplayMultiples();
        
        System.out.println("Digite um número");
        
        int num = sc.nextInt(); //escreva um numero
        DM.multiplos(num);// faz aparecer o resultado
       
        sc.close();
       
    }

}
