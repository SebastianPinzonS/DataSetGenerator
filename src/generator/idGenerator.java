package generator;

public class idGenerator {

    private static int id = 0;

    public int getId() {
        id++;
        return id;
    }

}
