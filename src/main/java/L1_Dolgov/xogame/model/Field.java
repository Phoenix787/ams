package L1_Dolgov.xogame.model;

/**
 * Created by Ксения on 15.03.2016.
 */
public class Field implements Shootable{
    private final static int SIZE = 3;
    private Type cells[][];

    public Field() {
        cells = new Type[SIZE][SIZE];
        init();

    }

    public void init(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cells[i][j] = Type.NOT_SET;
            }
        }
    }

    public void show(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (cells[i][j]){
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("O");
                        break;
                    case NOT_SET:
                        System.out.print(".");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void doShoot(Point point, Type type) {
       if (cells[point.getX()][point.getY()] == Type.NOT_SET){
           cells[point.getX()][point.getY()] = type;
       }
    }
}
