
package a3;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samueldemero
 */
public class A3 {

    
    public static void main(String[] args) throws Exception {
        ArrayList<Movie> L = new ArrayList<Movie>();
        library(L);
        
        Movie temp;
        Node root;
        int n = L.size();
        
        // Sorting using bubble sort 
        for (int j = 0; j < n - 1; j++) 
        { 
            for (int i = j + 1; i < n; i++)  
            { 
                if (L.get(j).getTitle().compareTo(L.get(i).getTitle()) > 0) 
                { 
                    temp = L.get(j); 
                    L.set(j, L.get(i)); 
                    L.set(i, temp); 
                } 
            } 
        }
        //end 
        
        MovieBST tree = new MovieBST();
        root = tree.sortedArrayToBST(L, 0, n - 1); 
        tree.preOrder(root);
        
        
       
        
    }
    public static void library(ArrayList L)throws Exception{
        Scanner sc = new Scanner(new File(""
            + "/Users/samueldemero/Desktop/NetBeansProjects/A3/movies.csv"));
         int i = 0;
        while (sc.hasNext()){
           String line = sc.nextLine();
                String[] tokens = line.split(",");
                
                if (tokens.length>3){
                    String[] smoke = line.split("\"");
                    int end = smoke[1].length();
                    //System.out.println(smoke[1].substring(0, end-6));
                    String title = smoke[1].substring(0, end-6);
                    i++;
               String[] p2 = line.split("\\(");
               if (p2.length > 1){
                  StringBuffer year = new StringBuffer(p2[p2.length-1]);
                     year.replace( 4 ,year.length()+1 ,"");
                   //System.out.println(year.toString());
                   
              Movie mov1 = new Movie (title,Integer.parseInt(year.toString()));
                 L.add(mov1);
               }
              
               
                }
                else{
                String pop = tokens[1];
               String[] p2 = pop.split("\\(");
                String title = tokens[1].substring(0, tokens[1].length()-6);
                if (p2.length > 1){
                  StringBuffer year = new StringBuffer(p2[p2.length-1]);
                     year.replace( 4 ,year.length()+1 ,"");
                     //System.out.println(title);
                     i++;
                 // System.out.println(year);
                  int Year = Integer.parseInt(year.toString());
                  
             Movie mov1 = new Movie (title,Year);
              L.add(mov1);
               }
              
                }
            
        } System.out.println("There are "+i+" movies in the library");
        
    }
    
}

