/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import exception.EmptyStackException;
import son.util.EmptyListException;

/**
 *
 * @author SONPH
 * @param <E> Object
 */
public class Stack<E> {
    LinkedList<E> list;
    
    /**
     * 
     * @return the size of stack 
     */
    public int getSize() {
        return list.size();
    }
    
    /**
     * Create an empty stack
     */
    public Stack() {
        list = new LinkedList<>();
    }
    
//    private final int lastInsert = list.size;
    
    /**
     * Check stack
     * @return Return true if the stack includes no element and false otherwise
     */
    public boolean empty() {
        return list.isEmpty();
    }
    
    /**
     * Peek element in stack
     * @return Return the top element on the stack
     * @throws exception.EmptyStackException
     * @throws son.util.EmptyListException
     */
    public E peek() throws EmptyStackException, EmptyListException{
        if (empty()) {
            throw new EmptyStackException("The stack is empty");
        } else {
            return list.get(getSize() - 1);
        }
    }
    
    /**
     * Pop element in stack
     * @return Remove the top element of the stack and return it.
     * @throws exception.EmptyStackException 
     */
    public E pop() throws EmptyStackException{
        if (empty()) {
            throw new EmptyStackException("The stack is empty");
        } else {
            return list.deleteFromTail();
        }
    }
    
    /**
     * Insert Object to stack
     * @param obj Object
     * @return Insert element at the top of the stack and return it
     */
    public E push(E obj) {
        list.addToTail(obj);
        return obj;
    }
    
    /**
     * Search element in stack
     * @param obj
     * @return Return the position of element on the stack(The first position is at the top; -1 in case of failure).
     */
    public int search(E obj) {
        return list.IndexOf(obj);
    }
    
    /**
     * Show all element in stack 
     */
    public void showStack() {
        try {
            list.printAll();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The list is empty");
        }
    }
}
