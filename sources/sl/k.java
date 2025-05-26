package sl;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final q f113150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f113152c;

    public k(int i13, int i14, Class cls) {
        this(q.a(cls), i13, i14);
    }

    public static k a(Class cls) {
        return new k(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f113150a.equals(kVar.f113150a) && this.f113151b == kVar.f113151b && this.f113152c == kVar.f113152c;
    }

    public final int hashCode() {
        return ((((this.f113150a.hashCode() ^ 1000003) * 1000003) ^ this.f113151b) * 1000003) ^ this.f113152c;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("Dependency{anInterface=");
        sb3.append(this.f113150a);
        sb3.append(", type=");
        int i13 = this.f113151b;
        sb3.append(i13 == 1 ? "required" : i13 == 0 ? "optional" : "set");
        sb3.append(", injection=");
        int i14 = this.f113152c;
        if (i14 == 0) {
            str = "direct";
        } else if (i14 == 1) {
            str = "provider";
        } else {
            if (i14 != 2) {
                throw new AssertionError(a.a.d("Unsupported injection: ", i14));
            }
            str = "deferred";
        }
        return a.a.p(sb3, str, "}");
    }

    public k(q qVar, int i13, int i14) {
        this.f113150a = qVar;
        this.f113151b = i13;
        this.f113152c = i14;
    }
}
