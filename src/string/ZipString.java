package string;

/**
 * Created by chenwenping on 17/3/23.
 */
public class ZipString {
    public static void main(String[] argv) {

        System.out.print(zipString("soooggrrrhhhhk"));;
    }
    public static String zipString(String iniString) {
        // write code here
        if (iniString == null || iniString.length() <= 0) {
            return null;
        }

        String str=new String("");
        int i=0,cnt=1;
        char c=iniString.charAt(0);
        for(i=1;i<iniString.length();i++){
            if(c==iniString.charAt(i)){
                cnt++;
            }else{
                str+=String.valueOf(c)+Integer.toString(cnt);
                c=iniString.charAt(i);
                cnt=1;
            }
        }
        str+=String.valueOf(c)+Integer.toString(cnt);
        if(str.length()<iniString.length()){
            return str;
        }else{
            return iniString;
        }
    }
}
