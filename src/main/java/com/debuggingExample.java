package com;

public class debuggingExample {

    public static int findMax(int a,int b){
        int max=0;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        return max;
    }

    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        findMax(45,89);
        factorial(2);
    }
}

