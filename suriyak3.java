import java.util.Scanner;
class ticket{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
       
    char[][]seat=new char[8][8];
       for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
          seat[i][j]='O';
        }
       }
      
     while(true){
        System.out.println("Seats Availability");
           System.out.println();
            for(int i=0;i<8;i++){
              for(int j=0;j<8;j++){
                 System.out.print(seat[i][j]+" ");
               }
              System.out.println();
            }
      System.out.println();

   System.out.println("Select the Row and Seats ");
     int row=sc.nextInt();
     int col=sc.nextInt();
           
      if(row<1 || row>8 ||col<1 || col>8){
         System.out.println("Invalid seats");
         continue;
      }
 
     if(seat[row-1][col-1]=='*'){
        System.out.println("Seat is already booked");
    }
    else{
       seat[row-1][col-1]='*';
        System.out.println("Seat booked Succeccfully");
   }

    System.out.print("Book another ticket ?(Y/N):");
     char  choice=sc.next().charAt(0);

      if(choice=='n'|| choice=='N')
       break;
       }
   System.out.println("Your seat is:");
     for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
          System.out.print(seat[i][j]+" ");
       }
      System.out.println();  
    }
}
}