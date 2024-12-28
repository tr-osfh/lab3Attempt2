package prod.udntk.enums;

public enum Color {
    DARKRED ("темно-красный"),
    RED ("красный"),
    BLUE ("голубой"),
    PURPLE ("фиолетовый"),
    GREEN ("зеленый"),
    METALLIC ("металлический"),
    GRAY ("серый"),
    COLDBLUE ("холодный голубой"),
    NONE ("отсутствует"),;

    private String type;

    Color (String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
