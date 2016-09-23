/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author naveen
 */
public class ChoclateWrappers {
    public static void main(String args[])
    {
        int t;
        Scanner s=new Scanner(System.in);
        
        t=s.nextInt();
        while(t--!=0){
            int n,c,m;
            n=s.nextInt();
            c=s.nextInt();
            m=s.nextInt();
             n=n/c;
             int count=n;
             
              if(n%m>=1&&n>m){count-=n%m; n=n%m+n/m; }
              
              else n=n/m;
              
            while(n>=1){
                count+=n;
                  if(n%m>=1&&n>m){count-=n%m; n=n%m+n/m; }
              else n=n/m;
                 
                
            }
            System.out.println(count);
        }
    }
    
}
