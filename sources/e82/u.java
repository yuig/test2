package e82;

/* loaded from: classes4.dex */
public enum u {
    QUARTER(Integer.valueOf(h82.a.ninety_days), "quarter"),
    HALF_YEAR(Integer.valueOf(h82.a.one_hundred_eighty_days), "half_year"),
    YEAR(Integer.valueOf(h82.a.three_hundred_sixty_five_days), "year"),
    NONE(Integer.valueOf(h82.a.none), "none");

    private String apiParam;
    private Integer displayString;

    u(Integer num, String str) {
        this.displayString = num;
        this.apiParam = str;
    }

    public String getApiParam() {
        return this.apiParam;
    }

    public Integer getDisplayString() {
        return this.displayString;
    }
}
