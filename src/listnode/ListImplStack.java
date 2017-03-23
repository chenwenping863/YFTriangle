package listnode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by chenwenping on 17/3/23.
 */
public class ListImplStack {

    LinkedList<String> queue1 = new LinkedList<String>();
    LinkedList<String> queue2 = new LinkedList<String>();


    public String pop(){

        String re =null;
        if(queue1.size() == 0 && queue2.size() == 0){
            return null;
        }
        if(queue2.size() == 0){
            while(queue1.size() >0){
                re = queue1.removeFirst();
                if(queue1.size() != 0){
                    queue2.addLast(re);
                }
            }
        }else if(queue1.size() == 0){
            while(queue2.size() >0){
                re = queue2.removeFirst();
                if(queue2.size()!=0){
                    queue1.addLast(re);
                }
            }
        }
        return re;
    }


    public String push(String str) {

        if(queue1.size() == 0 && queue2.size() == 0) {
            queue1.addLast(str);
        }

        if(queue1.size()!= 0) {

            queue1.addLast(str);

        } else if(queue2.size()!= 0){

            queue2.addLast(str);
        }

        return str;
    }



    LinkedList<String> q1 = new LinkedList<>();
    LinkedList<String> q2 = new LinkedList<>();

    private void pushTest(String str) {
         if (q1.size() == 0 && q2.size() == 0) {
             q1.add(str);
         }

         if (q1.size() > 0) {
             q1.add(str);
         } else if (q2.size() > 0){
             q2.add(str);
         }

    }

    /*private String popTest() {
        if (q1.size() == 0 && q2.size() == 0) {
            return null;
        }

        String re ;
        if (q1.size() == 0) {
            while (q2.size() != 0) {
               re = q2.removeFirst();
            }
        }

    }*/

}
