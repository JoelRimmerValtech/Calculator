package joel.calculator;

public class Subtract implements Calculator {
    @Override
    public int calculate(int input1, int input2) {
        return (input1 - input2);
    }
}
