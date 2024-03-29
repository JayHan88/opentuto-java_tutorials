package org.opentutorials.javatutorials.accessmodifier.inner;

class A {
    // public : 누구든지 호출해서 사용 가능
    public String y(){
        return "public void y()";
    }
    // private : class 외부에서는 사용 불가
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());
    }
}
