package org.example;

public class Main {
    public static void main(String[] args) {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        try{
            exceptionGenerator.generateException();
        }
        catch(Exception e){
            System.out.println("printStackTrace() method:");
            e.printStackTrace();
            System.out.println("toString()/n" + e.toString());
        }
    }
}