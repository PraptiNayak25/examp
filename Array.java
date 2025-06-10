public class Array{
    
    public static void main(String[] args){
        int [] arr={1,2,3,4};
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int values:arr){
            sum+=values;
            if(values>max){
                max=values;

            }

            if(values<min){
                min=values;

            }

        }

        double average=(double)sum/arr.length;
        

        System.out.println("Sum :"+sum);
        System.out.println("MAx :"+max);
        System.out.println("Min :"+min);
         System.out.println("Average :"+average);

    }
}