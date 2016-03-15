package L1_Dolgov.l7_exception.ex3;

import java.io.OutputStream;
import java.util.Random;

/**
 * Created by Ксения on 14.03.2016.
 */
public class Test2 {
    void foo1(){
        foo2();
    }

    void foo2(){
        try {
            test();
        } catch (OurException e) {
            System.err.println("Поймали ошибку " + e.getMessage() );
        }finally {
            System.out.println("Close all resources");
        }
    }

    int test() throws OurException {
        if (new Random().nextInt(3)%2 == 0){
            throw new OurException("Что-то пошло не так");
        }
        else
        return 1;
    }
}
