import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThemTees
{
    private static List<String> ogList = Arrays.asList("BrownTee", "WhiteTee", "BlackPant", "WhitePant", "PurpleShort", "GreenShirt");  

    public static void main(String[] args) {
        List<String> teeList= new ArrayList<String>();
        List<String> otroList= new ArrayList<String>();
        for(String clothes : ogList) {
            if (clothes.contains("Tee")) {
                teeList.add(clothes);
                System.out.println("These are the tee(s) that you found" + teeList);
            }
            else {
                otroList.add(clothes);
                System.out.println("These are not T-Shirts"+ otroList);
            }
        }
        System.out.println(teeList);
        System.out.println(otroList);
    }
}