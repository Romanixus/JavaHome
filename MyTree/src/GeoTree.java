import java.util.HashSet;

public class GeoTree {
    private HashSet<Inheritage> geoTree = new HashSet<>();
    public HashSet<Inheritage> getGeoTree() {
        return geoTree;
    }
    public void setGeoTree(HashSet<Inheritage> geoTree) {
        this.geoTree = geoTree;
    }

    public void add(Inheritage inheritage){
        geoTree.add(inheritage);
    }

    @Override
    public String toString() {
        return geoTree.toString();
    }
}
