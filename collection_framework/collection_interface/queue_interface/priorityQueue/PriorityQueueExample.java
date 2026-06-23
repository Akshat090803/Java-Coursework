import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

      //! By default Min Heap is their in Java
      System.out.println("----------------Min Heap:---------------------");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(20);
        queue.add(5);
        queue.offer(15);
        queue.offer(10);
        
        System.out.println("PriorityQueue top/peek(): " + queue.peek());
        System.out.println("PriorityQueue top/element(): " + queue.element());
        System.out.println("PriorityQueue elements: " + queue);
        System.out.println("Removing elements in priority order (Ascending order we get):");
      
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

//! Max Heap

      System.out.println("----------------Max Heap:---------------------");
        // PriorityQueue<Integer> queueMax = new PriorityQueue<>((a,b)->b-a); //This (b-a) can cause overflow
        // PriorityQueue<Integer> queueMax = new PriorityQueue<>(Collections.reverseOrder());//Recommended
        // PriorityQueue<Integer> queueMax = new PriorityQueue<>(Comparator.reverseOrder());//Recommended
        //?Comparator.reverseOrder() and Collections.reverseOrder() works identical
        PriorityQueue<Integer> queueMax = new PriorityQueue<>((a,b)->Integer.compare(b,a));//Prevent overflow error

    
        queueMax.add(20);
        queueMax.add(5);
        queueMax.offer(15);
        queueMax.offer(10);
        
        System.out.println("PriorityQueue top/peek(): " + queueMax.peek());
        System.out.println("PriorityQueue top/element(): " + queueMax.element());
        System.out.println("PriorityQueue elements: " + queueMax);
        System.out.println("Removing elements in priority order (Descending order we get):");
      
        while (!queueMax.isEmpty()) {
            System.out.println(queueMax.poll());
        }



    }
}
