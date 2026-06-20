package Java;
class stackk {
    int top=-1;
    int stack[]=new int[5];
    void push(int num){
        if(top==4){
            System.out.println("Stack is full");
        }else{
        top++;
        stack[top]=num;
        System.out.println("inserted Successfully");
    }}
    void display(){
        System.out.println("Stack elements are: ");
        for(int i =0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }
    void peak(){
        System.out.println("top of stack is: "+stack[top]);
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }else{
        System.out.println(stack[top]+"is deleted from stack");
        top--;
    }}
    void isempty(){
        if(top==-1){
            System.out.println("stack is empty");
        }
    }
    void isfull(){
        if (top==4){
            System.out.println("stack is full");
        }
    }
}

public class stack{
    public static void main(String[] args) {
        stackk s =new stackk();
        s.push(4);
        s.push(10);
        s.push(6);
        s.push(3);
        s.push(62);
        s.push(72);
        s.push(96);
        s.display();
        s.peak();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.isempty();
        s.isfull();
    }

}
