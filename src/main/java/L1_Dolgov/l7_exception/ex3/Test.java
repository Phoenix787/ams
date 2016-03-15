package L1_Dolgov.l7_exception.ex3;

/**
 * Created by Ксения on 14.03.2016.
 */
public class Test {
    void foo1(){
        foo2();
    }

    void foo2(){
        try {
            test();
        } catch (Exception e) {
            System.err.println("Exception from test() " + e.getMessage());
        }
    }

    int test() throws Exception {
        throw new Exception();
    }
}
