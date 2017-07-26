/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelimexam_cornelio;

/**
 *
 * @author raeni
 */
public class IntQueue {
    IntSLLList list1 = new IntSLLList();
    
    public IntQueue() {

    }

    public IntQueue(int i) {
        list1.addtoTail(i);
    }

    public void enqueueObj(int i){
        list1.addtoTail(i);
    }
    
    public void printQueue(){
    	list1.printAll();
    }
    
    public void dequeueObj(){
    	list1.deleteFromHead();
    }

}
