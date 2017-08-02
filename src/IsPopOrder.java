import java.util.Stack;

/**
 * Created by zeweiyang on 2017/8/2.
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (popA.length==0||pushA.length==0||popA.length!=pushA.length)
            return false;
        Stack<Integer> stack=new Stack<Integer>();
        int popIndex=0;
        for (int i=0;i<popA.length;i++){
            stack.push(pushA[i]);
            while(!stack.empty()&&stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }

}
