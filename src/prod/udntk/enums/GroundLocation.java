package prod.udntk.enums;

public enum GroundLocation {
    CAVE ("пещера"),
    FIELD ("поле"),
    MOUNTAIN ("гора"),
    HORIZON ("горизонт"),
    ROCKET ("ракета"),
    NONE ("отсутствует");

    private String type;

    GroundLocation(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}