package serialclonable;

import java.io.*;

/**
 * Created by Ксения on 06.03.2016.
 */
public class SerialClonable implements Cloneable, Serializable {

    private static final long serialVersionUID = 5113595000430274605L;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            ByteArrayOutputStream baus = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(baus);
            out.writeObject(this);
            out.close();

            //вывести клон объекта
            ByteArrayInputStream bais = new ByteArrayInputStream(baus.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bais);
            Object object = in.readObject();
            in.close();
            return object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
