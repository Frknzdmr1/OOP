public class Enums {

    public static void main(String[] args) {
        whichSeason(5);
    }

    public static void whichSeason(Month month) {

    }

    public static void whichSeason(int month){
        switch (month) {
            case 1:
                System.out.println("January is Winter");
                break;
            case 2:
                System.out.println("February is Winter");
                break;
            case 3:
                System.out.println("March is Spring");
                break;
            case 4:
                System.out.println("April is Spring");
                break;
            case 5:
                System.out.println("May is Spring");
                break;
            case 6:
                System.out.println("June is Summer");
                break;
            case 7:
                System.out.println("July is Summer");
                break;
            case 8:
                System.out.println("August is Summer");
                break;
            case 9:
                System.out.println("September is Autumn");
                break;
            case 10:
                System.out.println("October is Autumn");
                break;
            case 11:
                System.out.println("November is Autumn");
                break;
            case 12:
                System.out.println("December is Winter");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}