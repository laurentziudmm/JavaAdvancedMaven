package enums;

public enum Colors {
    RED("#FF0000",31),
    BLUE("#0000FF",33),
    GREEN("#00FF00",34);

    private String colorCode;
    private Integer transparency;

    Colors(String colorCode,Integer transparency) {
        this.transparency = transparency;
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
    public Integer getTransparency() {
        return transparency;
    }
}
