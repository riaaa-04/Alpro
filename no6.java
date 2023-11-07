/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Basisdata
 */
enum agama{
HINDU,BUDHA,YAHUDI,KATOLIK,KRISTEN,ISLAM
}
enum kitab {
VEDA,TRIPITAKA,TAURAT,INJIL,ALQURAN
}
enum nabi {
SIDARTA_GUATAMA,MUSA,YESUS,MUHAMAD
}

public class no6 {
public static void main(String[] args) {

agama a = agama.KATOLIK;
 switch(a){
     case HINDU:
         System.out.println("Agama Hindu ");
         System.out.println("Kitab"+kitab.VEDA);
         System.out.println("Nabi -");
     break;
     case BUDHA :
         System.out.println("Agama Budha");
         System.out.println("Kitab"+kitab.TRIPITAKA);
         System.out.println("Nabi"+nabi.SIDARTA_GUATAMA);
     break;
     case YAHUDI :
         System.out.println("Agama Yahudi");
         System.out.println("Kitab"+kitab.TAURAT);
         System.out.println("Nabi"+nabi.MUSA);
     break;
     case KATOLIK :
         System.out.println("Agama Katolik");
         System.out.println("Kitab"+kitab.INJIL);
         System.out.println("Nabi"+nabi.YESUS);
     break;
     case KRISTEN :
         System.out.println("Agama Kristen");
         System.out.println("Kitab"+kitab.INJIL);
         System.out.println("Nabi"+nabi.YESUS);
    break;
     case ISLAM :
             System.out.println("Agama islam");
             System.out.println("kITAB"+kitab.ALQURAN);
             System.out.println("nabi"+nabi.MUHAMAD);
    break;         
         
         
         
 }  
    }
   
}
