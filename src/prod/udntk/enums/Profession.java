package prod.udntk.enums;

public enum Profession {
    SCIENTIST ("Ученый"),
    LOUNGER ("Бездельник"),
    JOURNALIST ("Журналист"),
    NONE ("Никто");

    private String type;

    Profession(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
