/**
 * Created by zeweiyang on 2017/7/27.
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if (target<1)
            return -1;
        if (target==1)
            return 1;
        return 2*JumpFloorII(target-1);
    }
}
