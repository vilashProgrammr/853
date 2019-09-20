import java.io.*;
import java.util.Scanner;
class StringReverse{

	public static void main(String a[]) throws Exception
	{
        String st;      //contains user input statement 
      
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Statement:"); 
         st=br.readLine();
        System.out.println("The reverse is:");
       
        String reverse = "";
        for(int i = st. length() - 1; i >= 0; i--) {
        reverse = reverse + st.charAt(i);
        } 
        
        
        System.out.println(reverse);
 	 
        }  
   
}
