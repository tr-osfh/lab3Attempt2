package prod.udntk.enums;

public enum Professions {
    SCIENTIST ("Ученый"),
    LOUNGER ("Бездельник"),
    JOURNALIST ("Журналист"),
    NONE ("Никто");

    private String type;

    Professions(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
