package om0;

/* loaded from: classes5.dex */
public final class s implements u50.o {

    /* renamed from: c, reason: collision with root package name */
    public static final s f96582c = new s(true, true);

    /* renamed from: d, reason: collision with root package name */
    public static final s f96583d = new s(true, false);

    /* renamed from: e, reason: collision with root package name */
    public static final s f96584e = new s(false, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96585a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96586b;

    public s(boolean z13, boolean z14) {
        this.f96585a = z13;
        this.f96586b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f96585a == sVar.f96585a && this.f96586b == sVar.f96586b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96586b) + (Boolean.hashCode(this.f96585a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardTopBarAction(visible=");
        sb3.append(this.f96585a);
        sb3.append(", enabled=");
        return a.a.r(sb3, this.f96586b, ")");
    }
}
