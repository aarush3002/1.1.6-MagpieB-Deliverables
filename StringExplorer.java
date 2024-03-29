/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        // the following calls show that indexOf will return -1 if the substring is not found
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        // demonstration of indexOf(String str, int fromIndex)
        int startposition = sample.indexOf("fast", 3);
        System.out.println ("sample.indexOf(\"fast\", 3) = " + position);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
        

    }

}
