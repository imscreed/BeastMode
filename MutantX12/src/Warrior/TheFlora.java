package Warrior;

import java.util.ArrayList;
import java.util.List;

public class TheFlora {

    public static void main(String[] args){
        System.out.println(subStringsKDist("awaglknagawunagwkwagl", 4));
    }

    public static List<String> subStringsKDist(String inputStr, int num){
        char[] arr = inputStr.toCharArray();
        List<String> result = new ArrayList<>();
        if(num > arr.length) return result;
        for(int i = 0; i < arr.length; i++){
            List<Character> temp = new ArrayList<>();
            temp.add(arr[i]);
           for(int j = i+1; j < arr.length; j++){
               if(!temp.contains(arr[j])){
                   temp.add(arr[j]);
                   if(temp.size() == num) {
                       StringBuilder substring = new StringBuilder();
                       for(char c: temp) {
                           substring.append(c);
                       }
                       if(!result.contains(substring.toString())) result.add(substring.toString());
                       break;
                   }
               }
           }
        }
        return result;
    }


}

//    List<Character> temp = new ArrayList<>();
//            if(temp.size() == 4) break;
//                    if(!temp.contains(arr[i])){
//                    temp.add(arr[i]);
//                    count++;
//                    }
