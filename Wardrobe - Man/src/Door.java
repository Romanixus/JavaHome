public class Door extends Thing{
    private String name;
    public Door(String name) {
        super("Дверца");
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        String wardrobeClass = super.toString();
        return wardrobeClass + " " + this.name;
    }
}
