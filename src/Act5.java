public class Act5 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(28, 15);
        calculator.Compute();
    }

}

class Calculator{

    double x, y;

    Calculator(int x, int y){
        this.x = x;
        this. y = y;
    }

    public double Add(){
        return x + y;
    }

    public double Subtract(){
        return x - y;
    }

    public double Multiply(){
        return x * y;
    }

    public double Divide(){
        return x / y;
    }

    public double Modulus(){
        return x % y;
    }

    public void Compute(){
        System.out.println("X = " + x + "\nY = " + y + "\nSum: " + Add() + "\nSubtract: " + Subtract() +
                "\nMultiply: " + Multiply() + "\nDivide: " + Divide() + "\nModulus: " + Modulus());
    }

}
