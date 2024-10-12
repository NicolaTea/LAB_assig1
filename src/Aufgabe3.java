public class Aufgabe3 {
    //1
    public int[] suma(int[] n1,int[] n2){
        int[] result= new int[n1.length+1];
        int carry=0;
        for(int i=n1.length-1;i>=0;i--){
            int sum=n1[i]+n2[i]+carry;
            result[i+1]=sum%10;
            carry=sum/10;
        }
        result[0]=carry;
        return result;
    }

    //2
    public int[] diferenta(int n1[], int[] n2){
        int[] result=new int[n1.length+1];
        int borrow=0;
        for(int i=n1.length-1;i>=0;i--){
            int diff=n1[i]-n2[i]-borrow;
            if(diff<0){
                diff+=10;
                borrow=1;
            }else{
                borrow=0;
            }
            result[i]=diff;
        }
        return result;
    }

    //3
    //4

}
