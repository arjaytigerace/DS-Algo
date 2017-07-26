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
public class IntSLLNode {
    int info;
    IntSLLNode next;
    IntSLLNode(int i){
        this(i, null);
    }
    public IntSLLNode(int i, IntSLLNode n){
        info = i;
        next = n;
    }
    
}
