import javax.swing.JOptionPane;

public class Exerc4
{
   public static void main (String args[])
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog(" Digite Primeiro: "));
      int b = Integer.parseInt(JOptionPane.showInputDialog(" Digite Segundo: "));
      int c = Integer.parseInt(JOptionPane.showInputDialog(" Digite Terceiro: "));
      
      if(a<b)
      {
         if(b<c)
         {
            System.out.println(a + " " + b + " " + c);
         }
         else if (a<c)
         {
            System.out.println(a + " " + c + " " + b);
         }
         else
         {
            System.out.println(c + " " + a + " " + b); 
         }
      } 
      else if (b<c)
      {
         if(a<c)
         {
            System.out.println(b + " " + a + " " + c);
         }
         else 
         {
            System.out.println(b + " " + c + " " + a);
         }
      }
         else 
         {
            System.out.println(c + " " + b + " " + a);
         }
   }
}