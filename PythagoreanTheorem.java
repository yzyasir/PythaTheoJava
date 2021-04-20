// Java has many things that you can just import
// import java.lang; //DONT NEED TO IMPORT THIS BECAUSE ITS IN IT ALREADY
// import java.util; Contains the collections framework, legacy collection classes, event model, date and time facilities, internationalization, and miscellaneous utility classes (a string tokenizer, a random-number generator, and a bit array).
public class PythagoreanTheorem {
    public double calculateHypotenuse(double legA, double legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double LegASquared = Math.pow(legA, 2);
        double LegBSquared = Math.pow(legB, 2);
        System.out.println("I like Java");  
        double sum = LegASquared + LegBSquared;
        double hypotenuse = Math.sqrt(sum);
        return hypotenuse;
    }
}

// import java.util.Date;
// public class ImportDemo {
//     public String getCurrentDate() {
//         Date date = new Date();
//         return "Current date is: " + date;
//     }
// }