package page;

import java.util.ArrayList;
import java.util.List;

public class FindEvenNumsAndSort {
    public static void main(String[] args) {
        int[] arr={10,15,8,49,25,98,32};
        List<Integer> arr_even=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr_even.add(arr[i]);
            }
        }
        //System.out.println(arr_even.get(0));
        System.out.println(arr_even.toString());
    }
}
