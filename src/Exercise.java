//package domain;

public class Exercise {
 /**
 * Метод який приймаючи два числа создає масив в середені якого числа в діапазоні між цими числами які ми приймає, і виводи числа, які знаходяться в масиві через кому 
 * @param A Початок діапазону
 * @param B Кінець діапазону
 */
    public static void Calculate(int A, int B){
      int []array = new int [(B-A)];
      int C=0,count;
      if(A<=2){
        A=2;
      }
      
         for(int i=A;i<B;i++){
           count = 0;
           for(int j=A;j<B;j++){             
          if( i % j  == 0 ){
           count++;
          }         
           }
           if( i % 1  == 0 ){            
           count++;
          }
           if(count == 2 && i/i==1 && i/1 == i ){
              array[C]=i;
               C++;
           }
          
         }
          for(int i=0;i<C;i++){        
          System.out.print(array[i]);
          if(i != C-1){
            System.out.print(",");
          }
          else{
             System.out.print(".");
          }          
         }

    }
}
