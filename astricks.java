public class App {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                if(i+j==10)
                break;
                System.out.print("*");
            }
            System.out.println("");
        }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
        
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i=1;i<=4;i++){
        for(int j=4;j>=i;j--){
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
