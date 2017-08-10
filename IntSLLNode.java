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
public class IntSLNode {
    int info;
    IntSLNode next;
    IntSLNode(int i){
        this(i, null);
    }
    public IntSLNode(int i, IntSLNode n){
        info = i;
        next = n;
    }

  
}
