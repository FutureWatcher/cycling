package bike.cycling.util;

import java.util.Random;

/**
 * Created by MrH on 2017/5/2.
 */
public class RandomUtil {
    public static int formMinToMax(int min , int max){
        return new Random().nextInt(max)%(max-min+1) + min;
    }
}
