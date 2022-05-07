/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

public class MinMax {
    
    public static <T extends Comparable<T>> String minmax(T[] arr){
        T min = arr[0], max = arr[0];
        for (T obj : arr) {
            if (obj.compareTo(min) < 0){
                min = obj;
            }
            if (obj.compareTo(max) > 0){
                max = obj;
            }
        }
        return String.format("Min = %s Max = %s", min, max);
    }
    
    public static void main(String[] args) {
        Integer[] intArr = {5, 3, 7, 1, 4, 9, 8, 2};
        String[] strArr = {"red", "blue", "orange", "tan"};
        
        String intStr = minmax(intArr);
        String str = minmax(strArr);
        System.out.println(intStr);
        System.out.println(str);
    }
    
}
