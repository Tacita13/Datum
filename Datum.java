/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datum;
import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Datum {
   public  static Scanner input = new Scanner(System.in);
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.");
    private int monat;
    private int tag;
    
    Datum(int tag, int monat) throws DateFormatException{
       if(monat<0 || monat>12){throw new DateFormatException();}
       if(tag<0 || tag>32){throw new DateFormatException();}
         
       this.tag = tag;
       this.monat=monat;
        
    }
    
    Datum(String datum)throws DateFormatException{
       datum=input.nextLine();
       int date =Integer.parseInt(datum);
       int x=1;
       if(date == (int)date){throw new DateFormatException();}
    
    }
    

    
    public static void main(String[] args) {
   

// split function: to split the String ""\\.""\\.""      
        
       /*System.out.println("ENTER SOMETHING"); 
       String datu=input.nextLine();
       int date =Integer.parseInt(datu);
       if(date == (int)date)
           System.out.println("yay");
       else System.out.println("nay");
       */
        
           int [] monat ={1,2,3,4,5,6,7,8,9,10,11,12};
           int [] tag ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   //     String [] mes ={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    //      "Agosto", "Semptiembre", "Octubre", "Noviembre", "Diciembre"};
           //System.out.println("Ungültiger Tag ");
            //System.out.println("Ungültiger Monat ");
 
       int n=input.nextInt();
      for(int i=0;i<tag.length;i++){
           System.out.println(tag[i]);
       }
       for(int i=0;i<monat.length;i++){
           System.out.println(monat[i]);
           if(n<0 || n>monat[i]){
           
           }
       }
        
        
    }
    
}
