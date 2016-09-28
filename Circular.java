/**
 * Created by Володимир on 26.09.2016.
 */
public class Circular {
    static int counter;
    public static void main(String[] args) {
        Integer i;
        for (i = 0; i < 1000000; i++) {

            if(func(i) == true){
                counter++;
            }

        }
        System.out.println(counter);
    }


    public static boolean func(Integer b){
        String s;
        char tmp;
        int tmpcount= 0;
        boolean boolx = false;
        s = b.toString();
        Integer[] k = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            tmp = s.charAt(0);
            s= s.substring(1)+ tmp;
            k[i] = Integer.valueOf(s);
        }

        for (int i = 0; i < k.length; i++) {
            if((k[i]%2!=0) && (k[i]%3!=0) && (k[i]%5!=0) && (k[i]%7!=0) && k[i]!=1){
                tmpcount ++;
            }else {
                if(k[i] == 2 || k[i] == 3 || k[i] == 5 || k[i] == 7){
                    tmpcount++;
                }
            }
        }

        if(tmpcount == k.length){
             boolx=true;
        }

        return boolx;

    }
}
