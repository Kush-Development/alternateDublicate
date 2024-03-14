public class alteranate {
    


public static void main(String[] args) {
    
String s = "BBBBBHGFVUJUYGUUIUUYGYGYFTFTFFFFTFUUUI";


 int count=0;

for(int  i = 0;  i< s.length()-1; i++)
{



    if( 
         s.charAt(i+1) == s.charAt(i ) )

        {
             count++;

            
        }        
          
        
        
}


System.out.println(count);
        



}

}
