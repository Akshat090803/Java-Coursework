
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;


//!Queue works on FiFo principle

//! ArrayDeque is backed by a resizable, circular array, while a LinkedList-based queue is backed by separate, doubly-linked node objects. This structural difference makes ArrayDeque faster and more memory-efficient for almost all standard queue operations

//! ArrayDeque don't allow null elements , whereas LinkedList allows Null element insertion

public class ArrayDeque_Example {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new ArrayDeque<>();
        // List<Integer> lq = new ArrayDeque<>();

        //?Adding element  (add elemet at last)
            // add(e)
            //  queue.add(2); //? returns true if successfull else throw exception

            //offer(e)
        queue.offer(9);  //? if successfull -> true else false . No exception are thrown
        queue.offer(22);
        queue.offer(12);
        queue.offer(27);
        queue.offer(25);
        System.out.println("Queue: "+ queue);

        //?removing element

        // remove()
        queue.remove(); //? return and remove the head of queue.Throws exception if queue empty
        //poll()
        queue.poll();  //? return and remove the head of queue.Return null if queue empty

         
       System.out.println("After removal : "+ queue);
       

       //?  head of quee
        
        // element(); -> //? return  the head of queue.Throws exception if queue empty
        System.out.println("Head : "+queue.element()); 

        //peek(); -> //? return the head of queue.Return null if queue empty
        System.out.println("Head: "+queue.peek());

           //? isEmpty();
          System.out.println("Is empty : "+queue.isEmpty());

          //? Contains
          System.out.println("Is queue contains 15: "+queue.contains(15));


        //!Traversing 
         while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        
        
         //! Deque ( double ended queue) (Insertion and deletion from both ends)
       Deque<Integer> dq = new ArrayDeque<>();

       //insertion from start (front)
       dq.offerFirst(43);
       dq.offerFirst(32);
       dq.offerFirst(23);
       dq.addFirst(56);

       System.out.println("Dq after front insertion: "+dq); //[56,23,32,43];


       //insertion from tail /end
       dq.offer(76); //[56,23,32,43, 76];
       dq.offerLast(87); //[56,23,32,43, 76,87];
       dq.addLast(97); //[56,23,32,43, 76,87, 97];

       System.out.println("Dq after tail/end insertion: "+dq); //[56,23,32,43];


       //removal from start (front)
       dq.poll();
       dq.pollFirst();
    //    dq.remove();
    //    dq.removeFirst();

       System.out.println("Dq after front remova;: "+dq); //[56,23,32,43];


       //removal from tail /end
   
       dq.pollLast(); 
       dq.removeLast(); //[56,23,32,43, 76,87, 97];

       System.out.println("Dq after tail/end removal: "+dq); 

       //! similary for peek() ;
        
       System.out.println("Head: "+dq.peek()); //front head
       System.out.println("Head: "+dq.element()); //front head
       System.out.println("Head: "+dq.peekFirst()); //front head
       System.out.println("Head: "+dq.peekLast()); //Last  tail

       
       //! we can perform push ,pop , peek () , isEmpty() elso that is use deque as Stack
         
    }
}



//! Quick Comparison ArrayDequ vs LinkedList
//? Feature                     ArrayDeque Queue                  LinkedList Queue
// Underlying Structure    Resizable circular array                Doubly-linked list
// Memory Consumption     Lower (stores data contiguously)    Higher (node wrappers overhead)
// Cache Locality         Excellent (highly cache-friendly)   Poor (nodes scattered in memory)
// Null Elements                    Strictly prohibited                    Allowed
// Operation Time                     Amortized O(1)                     Guaranteed O(1)