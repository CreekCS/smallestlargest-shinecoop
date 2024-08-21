//put your name here
public class SmallestLargest{
    public static void main(String[] args){

        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i] = (int)(Math.random()*101);
            System.out.print(a[i]+" ");
        }
        System.out.print("\n");

        System.out.println("Smallest value: "+ smallestValue(a));
        System.out.println("Largest value: "+largestValue(a));

    }
    public static int smallestValue(int[] a){
        int min = a[0];
        for(int x: a){
            if(x<min){
                min=x;
            }
        }
        return min;
    }
    public static int largestValue(int[] a){
        int max = a[0];
        for(int x:a){
            if(x>max){
                max=x;
            }
        }
        return max;

    }
}