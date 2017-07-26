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
public class IntStack {
        IntSLLList list2 = new IntSLLList();
    
    public IntStack() {
        
    }

    public IntStack(int i) {
        list2.addtoTail(i);
    }
    public void pushObj(int i){
        list2.addtoTail(i);
    }
    
    public void printStack(){
    	list2.printAll();
    }
    
    public void popObj(){
    	list2.deleteFromTail();
    }

}
