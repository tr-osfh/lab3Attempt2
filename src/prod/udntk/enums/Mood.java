package prod.udntk.enums;

public enum Mood {
    GOOD ("хорошее"),
    BAD ("плохое"),
    NEUTRAL ("нейтральное"),
    NONE ("отсутствует");

    private String type;

    Mood(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
