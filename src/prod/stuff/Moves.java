package prod.stuff;

public record Moves(String name, String description) {
    @Override
    public String toString(){
        return "\n" + name + ", " + description;
    }
}
