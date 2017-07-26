//package prelimexam_cornelio;

//Raeniel Jan A. Cornelio
//Intec 3A
//July 26, 2017
//Prelim Exam

import java.util.*;
import java.io.*;

public class PrelimExam_Cornelio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        IntStack s1 = new IntStack(); // Initiate new Stack
        IntQueue q1 = new IntQueue(); // Initiate new Queue
        
        int sCnt = 0;   //Counter
        int qCnt = 0;   //
        
        FileReader read = new FileReader("exam.in"); //Input file is named exam.in but content is still the same with the given input in the exam.
        
        Scanner scan = new Scanner(read); // Reads input file
        
        String s = scan.nextLine(); // assign the contents of the line
        while(!s.equals("Stop")){ //starts the process for getting the output
           
            if(!s.equals("Stop"))
            {
                if(s.contains("Stack")){ 
                    String[] split = s.split(" ");          //Splits the string where there is space thus splitting the number and the word inside the string
                    s1.pushObj(Integer.parseInt(split[0]));
                    sCnt++;
                }
                else if(s.contains("Queue")){
                    String[] split = s.split(" ");
                    q1.enqueueObj(Integer.parseInt(split[0]));
                    qCnt++;
                }
                else if(s.contains("Pop")){
                    s1.popObj();
                    sCnt--;
                }
                else if(s.contains("Dequeue")){
                    q1.dequeueObj();
                    qCnt--;
                }
               
            }
            else
            {
               
            }
            s = scan.nextLine();
        }
        
        //Prints the output
        System.out.println("Stack: ");
               s1.printStack();
               System.out.println();
               System.out.println("Queue: ");
               q1.printQueue();
               System.out.println();
               System.out.println("Total Stack Elements Left: " + sCnt);
               System.out.println("Total Queue Elements Left: " + qCnt);
       
    }
    
}
