import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTees {
    private static List<String> originalList = Arrays.asList("BrownTee", "WhiteTee", "BlackPant", "WhitePant", "PurpleShort", "GreenShirt");

    public static void main(String[] args) {
        List<String> teeList = new ArrayList<String>();

        for (String item : originalList) {
            if (item.contains("Tee")) {
                teeList.add(item);
            }
        }

        if (teeList.isEmpty()) {
            System.out.println("There were no Tees in your inventory");
        }

        System.out.println(teeList);
    }
}