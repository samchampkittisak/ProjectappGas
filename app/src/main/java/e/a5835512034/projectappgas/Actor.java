package e.a5835512034.projectappgas;

/**
 * Created by 5835512034 on 4/19/2018.
 */

public class Actor {
    private String name;
    private int resId;

    public Actor(String name, int resId) {
        this.name = name;
        this.resId = resId;
    }

    public Actor() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }


    @Override
    public String toString() {
        return getName() + ": " ;
    }
}
