import javax.swing.JOptionPane;

public class Exerc1
{
   public static void main ( String args[])
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog(" Digite o Número"));
      int b = Integer.parseInt(JOptionPane.showInputDialog(" Digite o Número"));
      
      int soma = a + b;
       
      if (soma> 10)
      {  
         System.out.println(" o valor " + soma);   
      }
   }
}