/**
 * Created by zeweiyang on 2017/8/2.
 */
import java.util.Stack;
public class MinStack {
    Stack<Integer> data=new Stack<Integer>();
    Stack<Integer> min =new Stack<Integer>();
    Integer temp =null;
    public void push(int node) {
        if (temp==null){
            temp=node;
            data.push(temp);
            min.push(temp);
        }else{
            if(node<=temp){
                temp=node;
                min.push(node);
            }
            data.push(node);
        }
    }

    public void pop() {
        int num1=data.pop();
        int num2=min.pop();
        if (num1!=num2){
            min.push(num2);
        }
    }

    public int top() {
        int num=data.pop();
        data.push(num);
        return num;

    }

    public int min() {
        int num=min.pop();
        min.push(num);
        return num;
    }
}

