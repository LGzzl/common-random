import xyz.zzlcjj.commons.random.RandomUtils;

/**
 * @author zzl
 * @since 2023/7/29
 */
public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(RandomUtils.randomIdCard());
        }
    }
}
