package wb0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f128979a;

    /* renamed from: b, reason: collision with root package name */
    public final float f128980b;

    /* renamed from: c, reason: collision with root package name */
    public final float f128981c;

    public c(float f13, float f14, int i13) {
        this.f128979a = i13;
        this.f128980b = f13;
        this.f128981c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f128979a == cVar.f128979a && n4.e.a(this.f128980b, cVar.f128980b) && n4.e.a(this.f128981c, cVar.f128981c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f128981c) + a.a.a(this.f128980b, Integer.hashCode(this.f128979a) * 31, 31);
    }

    public final String toString() {
        String b13 = n4.e.b(this.f128980b);
        String b14 = n4.e.b(this.f128981c);
        StringBuilder sb3 = new StringBuilder("ActionButtonGridStyle(maxButtonsPerRow=");
        a.a.A(sb3, this.f128979a, ", horizontalSpacing=", b13, ", verticalSpacing=");
        return a.a.p(sb3, b14, ")");
    }
}
