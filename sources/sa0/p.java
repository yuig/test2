package sa0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final p f112182d = new p(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f112183a;

    /* renamed from: b, reason: collision with root package name */
    public final int f112184b;

    /* renamed from: c, reason: collision with root package name */
    public final float f112185c;

    public p(int i13, int i14) {
        this.f112183a = i13;
        this.f112184b = i14;
        this.f112185c = i13 / i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f112183a == pVar.f112183a && this.f112184b == pVar.f112184b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f112184b) + (Integer.hashCode(this.f112183a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CutoutEditorSourceDimensions(width=");
        sb3.append(this.f112183a);
        sb3.append(", height=");
        return a.a.n(sb3, this.f112184b, ")");
    }
}
