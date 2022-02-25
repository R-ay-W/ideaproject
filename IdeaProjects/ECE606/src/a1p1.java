public class a1p1 {
    public static void main(String[] args) {
        int[] A = {7,86,97,234,4,44,5,1,302,0,-2,402,-95,1000,1556,-956};
        int min = A[0];
        int max = A[0];
        int i = 1;


        while (i<(A.length-1)){
            if (A[i]<=A[i+1]){
                if (A[i]<min){
                    min = A[i];
                }
                if (A[i+1]>max){
                    max = A[i+1];
                }
            }
            else{
                if (A[i]>max){
                    max = A[i];
                }
                if (A[i+1]<min){
                    min = A[i+1];
                }
            }
            i+=2;
        }

        if(i==A.length-1){
            if(A[A.length-1]<min){
                min = A[A.length-1];
            }
            else if(A[A.length-1]>max){
                max = A[A.length-1];
            }

        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(i);


    }

}
