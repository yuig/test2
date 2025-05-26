package w80;

/* loaded from: classes5.dex */
public final class b1 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f128260a;

    /* renamed from: b, reason: collision with root package name */
    public final float f128261b;

    /* renamed from: c, reason: collision with root package name */
    public final float f128262c;

    public b1(float f13, float f14, int i13) {
        this.f128260a = i13;
        this.f128261b = f13;
        this.f128262c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f128260a == b1Var.f128260a && n4.e.a(this.f128261b, b1Var.f128261b) && n4.e.a(this.f128262c, b1Var.f128262c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f128262c) + a.a.a(this.f128261b, Integer.hashCode(this.f128260a) * 31, 31);
    }

    public final String toString() {
        String b13 = n4.e.b(this.f128261b);
        String b14 = n4.e.b(this.f128262c);
        StringBuilder sb3 = new StringBuilder("CutoutPreviewDisplayState(assetResId=");
        a.a.A(sb3, this.f128260a, ", width=", b13, ", height=");
        return a.a.p(sb3, b14, ")");
    }
}
