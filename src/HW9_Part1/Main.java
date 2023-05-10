import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        Book b1 = new Book("Physics", 50.0, "Ali" );
        Book b2 = new Book("Java 101", 30.0, "Maha" );
        Book b3 = new Book("Stay Home", 20.0, "Omar" );
        Book b4 = new Book("How to save money", 80.0, "Saleh" );

        Movie m1 = new Movie("The Master", 10.0, "John" );
        Movie m2 = new Movie("Go Away", 5.0, "Sam" );
        Movie m3 = new Movie("The GodFather", 20.0, "Mohammed" );
        Movie m4 = new Movie("Mission Impossible", 15.0, "Tom" );

        Book[] bookArr = {b1,b2,b3,b4};
        Movie[] movieArr = {m1,m2,m3,m4};

        System.out.println("Welcome to our store we have 10% discount on Movies and 20% on Books");
        System.out.println("Enter what movie or book you want:");
        String name = s.nextLine();

        System.out.println("Searching for '" + name + "'...");
        for (int i = 0 ; i < 4; i++){
            if (movieArr[i].getName().equalsIgnoreCase(name)){
                System.out.println("found it!!");
                System.out.println(movieArr[i].toString());

            }
            if (bookArr[i].getName().equalsIgnoreCase(name)){
                System.out.println("found it !!");
                System.out.println(bookArr[i].toString());
            }
        }

    }
}






//                System.out.println("Enter your Discount code:");
//                String disCode = s.nextLine();
//
//                switch (disCode){
//                    case "mv10": movieArr[i].getDiscount(0.10); System.out.println(movieArr[i].toString()); break;
//                    case "mv20": movieArr[i].getDiscount(0.20); System.out.println(movieArr[i].toString()); break;
//                    case "mv25": movieArr[i].getDiscount(0.25); System.out.println(movieArr[i].toString()); break;
//                    default:
//                        System.out.println("Sorry no Discount");
//                }



//                System.out.println("Enter your Discount code:");
//                String disCode = s.nextLine();
//
//                switch (disCode){
//                    case "bk10": bookArr[i].getDiscount(0.10); break;
//                    case "bk20": bookArr[i].getDiscount(0.20); break;
//                    case "bk25": bookArr[i].getDiscount(0.25); break;
//                    default:
//                        System.out.println("Sorry no Discount");
//                }
