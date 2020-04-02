import java.util.*;


public class TaskSubmission {
    public static void main(String[] args) {
        int val;
        for(int i=20; i<=100; i++){
            val = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    val = val+1;
                }

            }
            if(val == 2){
                System.out.print(i + " ");
            }
        }
    }
}

