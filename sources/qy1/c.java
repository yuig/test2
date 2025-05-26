package qy1;

/* loaded from: classes2.dex */
public enum c {
    NOT_DETERMINED("not-determined"),
    AUTHORIZED("authorized"),
    DENIED("denied");

    private final String _analyticsName;

    c(String str) {
        this._analyticsName = str;
    }

    public String getAnalyticsName() {
        return this._analyticsName;
    }
}
