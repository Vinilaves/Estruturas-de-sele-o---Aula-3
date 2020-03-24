import javax.swing.JOptionPane;

public class Exerc2
{
   public static void main (String args[])
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite número: " ));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
      
      int soma = a + b;
      
      if(soma<=20)
      {
         int somado = soma - 5;
         System.out.println( " O valor " + somado);
      }
      else
      {
        
         System.out.println (" O valor " + soma);
      }
   }
}