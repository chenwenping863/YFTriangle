/**
 * Created by chenwenping on 17/3/23.
 */
public class JumpFloor {
    public int JumpFloor1(int target) {
        if (target <= 0) {
            return -1;
        }

        if (target == 1) {
            return 1;
        }

        if (target == 2) {
            return 2;
        }

        return JumpFloor1(target - 1) + JumpFloor1(target - 2);

    }





}
