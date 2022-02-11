//package domain;

public class Exercise {
    public static void Calculate(int A, int B){
      int []array = new int [(B-A)];
      int C=A;
      String res="";
         for(int i=0;i<(B-A);i++){
          array[i]=C;
          C++;
         }
         for(int i=0;i<(B-A);i++){        
          System.out.print(array[i]);
          if(i != (B-A)-1){
            System.out.print(",");
          }
          else{
             System.out.print(".");
          }          
         }
    }
}
