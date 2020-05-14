package main.java;

import java.util.Scanner;

public class Task1 {


        public int main(int a1, int b1, int c1) {
                        Min min = new Min(a1, b1, c1);
                        ManipulationOfFunction manipulationOfFunction = new ManipulationOfFunction(min);
                        manipulationOfFunction.makeK();
                        return  manipulationOfFunction.makeK();
                }


        class Min {
                private int a;
                private int b;
                private int c;

                public Min(int a, int b, int c){
                        this.a = a;
                        this.b = b;
                        this.c = c;
                }
                public int MinFunction() {
                        int answer = Math.min(Math.min(a, b), c);
                        return answer;
                }
        }

        class ManipulationOfFunction {
                private Min min;
                public ManipulationOfFunction(Min min) {
                        this.min = min;
                }
                public int makeK() {
                        int answer = min.MinFunction();
                        System.out.println(answer);
                        return answer;
                }
        }
}

