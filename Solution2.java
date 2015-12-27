import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution 
{
    public static void main (String[] args) throws Exception 
    {
        Scanner bt  = new Scanner ( System.in );
        int t = bt.nextInt();
        while(t-- > 0)
        {
            String pa = bt.next();
            String virus = bt.next();
            String subs;
            boolean v = false;
            for(int i = 0; i <= (pa.length() - virus.length()); i++ )
            {
                subs = pa.substring( i,i+virus.length() );
                if( subs.equals(virus) ) { System.out.print(i+" ");v = true; }
                else if( butOne(subs,virus) ) { System.out.print(i+" ");v = true; }
            }
            if(!v) System.out.println("No Match!");
            else System.out.println();
        }   
    }
    public static boolean butOne ( String s, String p )
    {
        int i,c=0;
        for(i = 0; (c != 2) && (i < s.length()) ; i++) if( s.charAt(i) != p.charAt(i) ) c++;
        if( c == 1 || c==0 ) return true;
        else return false;    
    }    
}
