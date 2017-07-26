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
public class IntSLLList {
        protected IntSLLNode head, tail;
    public IntSLLList() {
        head = tail = null;
    }
    
    public void addtoHead(int el){
        head = new IntSLLNode(el, head);
        if (tail == null)
            tail = head;
    }

    public void addtoTail(int el){
        if (!isEmpty()){
            tail.next = new IntSLLNode(el);
            tail = tail.next;
        }
        else head = tail = new IntSLLNode(el);
    }

    public void printAll(){
    for(IntSLLNode tmp = head; tmp !=  
                         null; tmp = tmp.next)
            System.out.println(tmp.info + " ");
        
    }

    public boolean isEmpty(){
        return head == null;
    }
    
    public int deleteFromHead(){
        int el = head.info;
        if(head == tail)
            head = tail = null;
        else head = head.next;
        return el;
    }
    
    public int deleteFromTail(){
        int el = tail.info;
        if (head == tail)
            head = tail = null;
        else {
            IntSLLNode tmp;
            for (tmp = head; tmp.next != tail; tmp=tmp.next);
            tail = tmp;
            tail.next = null;
        }
        return el;
    } 

}
