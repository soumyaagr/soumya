public class Stack {
    private int s[] = new int[3];
    private int top;
    Stack() {
        top = -1;
    }
    void push(int itm) {
        if(top == 2) {
            System.out.println("Stack overflow\n");
            
        }else {
            s[++top] = itm;
            System.out.println(itm + " inserted\n");
        }
    }
    
    int pop () {
        if(top==-1) {
            System.out.println("undrflow\n");
            return -1;
        }else {
            System.out.println(s[top] + " popped\n");
            return s[--top];
        }
    }
    
    void display() {
        System.out.println("stack list:\n");
        int i;
        for(i=0;i<top+1;i++)
            System.out.print(s[i] + " ");
    }
}
