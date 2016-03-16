package Level2.ex1;

/**
 * Created by Ксения on 15.03.2016.
 * не используем параметризацию и обобщения
 */
public class NonGen {
    Object object;

    public NonGen(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
