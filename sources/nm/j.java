package nm;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f91310d = new j("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f91311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91312b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f91313c;

    static {
        new j("\n", "  ", true);
    }

    public j(String str, String str2, boolean z13) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f91311a = str;
        this.f91312b = str2;
        this.f91313c = z13;
    }
}
