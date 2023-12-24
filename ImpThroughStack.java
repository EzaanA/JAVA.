import java.util.Stack;
public class ImpThroughStack {


        static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


        public static boolean isEmpty() {
            return s1.isEmpty();
        }
//        O(1)
        public static void add(int data) {
           s1.push(data);
        }

//        O(n)
        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("STACK IS EMPTY");
                return -1;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int nu=s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        return nu;
        }
//            O(n)
        public static int peek() {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int nu=s1.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return nu;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(4);
        q.add(5);
        q.add(23);
        q.add(43);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
