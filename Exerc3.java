import javax.swing.JOptionPane;

public class Exerc3
{
   public static void main ( String args[])
   {
      double a = Double.parseDouble(JOptionPane.showInputDialog(" Digite um número: "));
      
      if(a>=0)
      {
         double resultado = Math.pow (a, 0.5);
         System.out.println(" valor " + resultado );
      }
      else 
      {
          double resultado = Math.pow (a, 2);
          System.out.println(" valor " + resultado);
          
      }
   }
}