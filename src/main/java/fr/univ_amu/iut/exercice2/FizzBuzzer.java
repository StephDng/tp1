package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
    public String[] computeList(int i) {
        throw new RuntimeException("Not yet implemented !");
    }
}
