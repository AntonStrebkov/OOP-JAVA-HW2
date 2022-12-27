import java.util.ArrayList;

public class Writer {
    ArrayList<Node> tree;
    ArrayList<String> result = new ArrayList<>();

    public Writer(GeoTree geoTree) {
        tree = geoTree.getTree();

    }

    public ArrayList<String> spend() {
        for (Node t : tree) {
            result.add(t.p1.getFullName() + " " + t.p1.getAge() + " " + t.re + " " + t.p2.getFullName() + " " + t.p2.getAge() + "\n");
        }


        return result;
    }
}
