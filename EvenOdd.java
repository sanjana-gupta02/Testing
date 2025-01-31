import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

        for(int j=0; j<5; j++){
            if(j%2==0){
                System.out.println("Number is Even " + j);
            }
            else{
                System.out.println("Number is odd " + j);

            }
        }
    }
}
