public class PythagoreanTheoremTest {
    public static void main(String[] args) {
        PythagoreanTheorem TestCase = new PythagoreanTheorem();
        double answer = TestCase.calculateHypotenuse(10.00, 10.00); 
        System.out.println(answer);
    }
}
// Here I am calling the calculateHypotenuse in my other file, Java already knows the method parameter, dont need to input a double in front of the variable values
// The reason why we have the "main" entry method is because we will be testing the functonality of our demo through this

// compile using "javac filename.java", if nothing happens its good, then "java filename" to run





// public class ImportDemoTest {
//     public static void main(String[] args) {
//         ImportDemo iD = new ImportDemo();
//         String currentDate = iD.getCurrentDate();
//         System.out.println(currentDate);
//     }
// }