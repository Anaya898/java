public class num_reverse{
    public int nums(int num){
        int reverse=0;

        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        return reverse;

    }
    public static void main(String args[]){
        num_reverse result=new num_reverse();
        int reversed=result.nums(4567);
        System.out.println(reversed);
    }
}