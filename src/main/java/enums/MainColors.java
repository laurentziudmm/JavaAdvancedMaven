package enums;

public class MainColors {
    public static void main(String[] args) {

//        Colors[] colors = Colors.values();
//
//        for (Colors colors1 : colors) {
//            System.out.println(colors1);
//        }

        System.out.println(Colors.RED.getColorCode());
        System.out.println(Colors.values());

        for (Colors colors1 : Colors.values()) {
            System.out.println(colors1.name()+" "+colors1.getColorCode());
        }

        System.out.println(Colors.valueOf("RED"));

    }
}
