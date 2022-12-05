import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6,7,8,1,2};
        Main m1 =new Main();
        boolean b = m1.containsDuplicate(a1);
        boolean c = m1.containsDuplicate1(a1);

        System.out.println(b);
        System.out.println(c);

    }

    public boolean containsDuplicate1(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] arr){
        HashSet a =new HashSet<Integer>();
        int n =arr.length;
        for(int i =0;i<n;i++){
            if(a.contains(arr[i])){
                return true;
            }else{
                a.add(arr[i]);
            }
        }
        return false;
    }

}