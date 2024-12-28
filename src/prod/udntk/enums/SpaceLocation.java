package prod.udntk.enums;

public enum SpaceLocation {
    FARSPACE ("Далекий космос"),
    CLOSESPACE ("Близкий космос"),
    NONE ("отсутствует");

    private String type;

    SpaceLocation(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
