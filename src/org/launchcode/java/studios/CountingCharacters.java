package org.launchcode.java.studios;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bikram on 3/1/2017.
 */
public class CountingCharacters {
    public static void main(String[] args) throws IOException {
//        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
//                " Nunc accumsan sem ut ligula scelerisque sollicitudin. " +
//                "Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
//                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac " +
//                "suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        FileInputStream myString = new FileInputStream("C:\\Users\\Bikram\\Desktop\\input.txt");
//        char[] charactersInString = myString.toLowerCase().toCharArray();
        char[] charactersInString = myString.toString().toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<charactersInString.length;i++) {
            char c = charactersInString[i];
            if(Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    int cnt = map.get(c);
                    map.put(c, ++cnt);
                } else {
                    map.put(c, 1);
                }
            }
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println( key+":" + value);
        }


    }
}
