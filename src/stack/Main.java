/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import data.Stack;

/**
 *
 * @author SONPH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack ms = new Stack();

        ms.push(1);
        ms.push(2.3);
        ms.push("Hello World");
        ms.push(1000);
        ms.push(1);

        ms.showStack();

        try {
            System.out.println("Peek the stack: " + ms.peek());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nTotal: " + ms.getSize());

        System.out.println("--------");
        try {
            System.out.println("Pop the stack: " + ms.pop());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        ms.showStack();

        System.out.println("\nTotal: " + ms.getSize());

        System.out.println("--------");
        System.out.println("Search: Hello World");
        if (ms.search("Hello World") > -1) {
            System.out.println("The position of el at: " + ms.search("Hello World"));
        } else {
            System.out.println("Can not exist");
        }
        
        System.out.println("\n--------");
        int size = ms.getSize();
        for (int i = 0; i < size; i++) {
            try {
                System.out.println("Pop the stack #" + i + ": " + ms.pop());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        System.out.println("\nTotal: " + ms.getSize());
    }

}
