import java.io.*;
class Inter
{
   public static void main(String args[])throws IOException
   {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int Array1[];
      int Array2[];
      System.out.print("Enter any digits");

      for(int i = 0; i<Array1.length; i++ )
      {
         for(int j = 0; j<Array2.length; j++)
         {
            if(Array1[i]==Array2[j])
            {
               System.out.println("Intersection is= "+Array2);
            }
         }
      }
   }
}