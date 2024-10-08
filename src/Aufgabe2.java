public class Aufgabe2 {
    //1
    public static int maxim(int[] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;

    }

    //2
    public static int minim(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    //3
    public static int maximalSumme(int[] array){
        int min=minim(array);
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum-min;

    }

    //4
    public static int minimalSumme(int[] array){
        int max=maxim(array);
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum-max;
    }
}
