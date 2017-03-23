/**
 * Created by chenwenping on 17/3/23.
 */
public class JumpFloor {

    public int jumpFloor1(int target) {
        if (target <= 0) {
            return -1;
        }

        if (target == 1) {
            return 1;
        }

        if (target == 2) {
            return 2;
        }

        return jumpFloor1(target - 1) + jumpFloor1(target - 2);

    }





}
