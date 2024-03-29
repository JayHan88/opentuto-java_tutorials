package org.opentutorials.javatutorials.constructor;

class Calculator {
    int left, right;

    public Calculator(int left, int right) { // 생성자, constructor : class가 생성될 때 class 이름과 동일한 method가 우선적으로 생성되게 약속되어 있음
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
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 20); // new Calculator : 생성자 method, 이 생성자를 이용해서 Calculator instance를 생성하는 것
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20, 30);
        c2.sum();
        c2.avg();
    }


}
