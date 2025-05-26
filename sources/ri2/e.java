package ri2;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final qi2.c f108403a;

    /* renamed from: b, reason: collision with root package name */
    public final String f108404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f108405c;

    public e(qi2.c cVar, String str) {
        if (cVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f108403a = cVar;
        this.f108404b = str;
        this.f108405c = ((cVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static e a(qi2.c cVar, String str) {
        if (str == null) {
            str = "";
        }
        return new e(cVar, str);
    }

    public static void b(String str) {
        a(qi2.c.LONG, str);
    }

    public static void c(String str) {
        a(qi2.c.STRING, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f108403a.equals(eVar.f108403a) && this.f108404b.equals(eVar.f108404b);
    }

    public final int hashCode() {
        return this.f108405c;
    }

    public final String toString() {
        return this.f108404b;
    }
}
