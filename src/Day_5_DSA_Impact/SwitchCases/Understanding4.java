package Day_5_DSA_Impact.SwitchCases;

public class Understanding4 {
    public static void main(String[] args) {
        int day = 7;


        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thus");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }

        // switch Lamda
        switch (day){
            case 1 -> System.out.println("Mon");
            case 2 -> System.out.println("Mon");
            case 3 -> System.out.println("Mon");
            case 4 -> System.out.println("Mon");
            case 5 -> System.out.println("Mon");
            case 6 -> System.out.println("Mon");
            case 7 -> System.out.println("Mon");
        }
    }
}
