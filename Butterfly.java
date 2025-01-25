public class Butterfly {
    public static void main(String[]args){
        int n=9;
    for(int i=1;i<=5;i++){
       for(int j=1;j<=n;j++){
        if((i<5)&&(j<=n-i)&&(j>i)){
            System.out.print(" ");
        }
        // else if((i>5)&&(j>())){

        // }
        else{
       System.out.print("*");
        }

       }
    System.out.println("");
    }
    for(int i=1;i<=4;i++){
        for(int k=n/2;k>=i;k--){
        System.out.print("*");
        }
    for(int j=1;j<=((2*i)-1);j++){
        System.out.print(" ");
    }
       for(int p=n/2;p>=i;p--){
        System.out.print("*");
       }
       System.out.println("");
    }
           
            }
}
