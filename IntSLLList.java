/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midlab2_cornelio;

/**
 *
 * @author raeni
 */
public class IntSLList {
    protected IntSLNode head, tail;
    public IntSLList() {
        head = tail = null;
    }
    
    public void addtoHead(int el){
        head = new IntSLNode(el, head);
        if (tail == null)
            tail = head;
    }

    public void addtoTail(int el){
        if (!isEmpty()){
            tail.next = new IntSLNode(el);
            tail = tail.next;
        }
        else head = tail = new IntSLNode(el);
    }

    public void printAll(){
    for(IntSLNode tmp = head; tmp !=  
                         null; tmp = tmp.next)
            System.out.print(tmp.info + " ");
            System.out.println();
        
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
            IntSLNode tmp;
            for (tmp = head; tmp.next != tail; tmp=tmp.next);
            tail = tmp;
            tail.next = null;
        }
        return el;
    } 
}
