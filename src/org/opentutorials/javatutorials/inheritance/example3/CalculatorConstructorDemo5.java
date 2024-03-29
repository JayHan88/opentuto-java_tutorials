package org.opentutorials.javatutorials.inheritance.example3;

class Calculator {
    int left, right;

    public Calculator() {}

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    // 자식 클래스에서 부모 클래스의 생성자를 사용할 때 : super() 사용, super : 부모 클래스
    public SubstractionableCalculator(int left, int right) {
        super(left, right);
        // this.left = left;
        // this.right = right;
    }
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
