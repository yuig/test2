package e82;

/* loaded from: classes4.dex */
public enum w {
    FACEBOOK("facebook"),
    GOOGLE("google"),
    INSTAGRAM("instagram"),
    ETSY("etsy"),
    NONE("");

    private String apiParam;

    w(String str) {
        this.apiParam = str;
    }

    public String getApiParam() {
        return this.apiParam;
    }
}
