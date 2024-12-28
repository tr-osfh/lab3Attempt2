package prod.udntk.enums;

public enum Light {
    DIRECT ("прямые"),
    OBLIQUE ("косые"),
    NONE ("Н/Д");

    private String type;

    Light(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
