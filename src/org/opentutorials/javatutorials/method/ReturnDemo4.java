package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
    public static String[] getMembers() {
        String[] members = { "jay", "flora", "james"};
        return members;
    }

    public static void main(String[] args){
        String[] members = getMembers();
    }
}
