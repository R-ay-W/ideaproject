public class a1p4 {


    public int encode(int d, int i){
        int res = 0;

        if(i<0){
            res=(int)(Math.pow(10,d)+i);
        }
        else{
            res=i;
        }
        return res;

    }

    public int decode(int d, int i){
        int res = 0;
        if(i> (int) (Math.pow(10,d)/2-1)){
            res = (i - (int) (Math.pow(10,d))) ;
        }
        else{
            res = i;
        }
        return res;
    }

    public int add(int d, int i, int j){
        int res=0;
        if(i+j>Math.pow(10,d)){
            res = (int) (i+j-Math.pow(10,d));
        }
        else{
            res = i+j;
        }
        return res;
    }

    public int multiply(int d, int i, int j){
        int res=0;
        if(j == 0){
            res = 0;
            System.out.println(res);
        }
        else if(j>0 && j%2==0){
            res = multiply(d, add(d,i,i), j/2);
            System.out.println(res);
        }
        else{
            res = add( d,  i,  multiply(d,add(d,i,i),j/2) );
            System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
        a1p4 My = new a1p4();

        System.out.println(My.encode(2,-15));
        System.out.println(My.decode(2,85));
        System.out.println(My.add(3,412,23));
        System.out.println(My.add(3,412,895));
        System.out.println(My.multiply(2,13,11));


    }

}
