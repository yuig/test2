package w80;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f128244a;

    /* renamed from: b, reason: collision with root package name */
    public final float f128245b;

    /* renamed from: c, reason: collision with root package name */
    public final float f128246c;

    public /* synthetic */ a() {
        this(z.f128436b, z.f128437c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n4.e.a(this.f128244a, aVar.f128244a) && n4.e.a(this.f128245b, aVar.f128245b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f128245b) + (Float.hashCode(this.f128244a) * 31);
    }

    public final String toString() {
        return a.a.m("BottomBarActionDisplayStyle(primaryActionSize=", n4.e.b(this.f128244a), ", secondaryActionSize=", n4.e.b(this.f128245b), ")");
    }

    public a(float f13, float f14) {
        this.f128244a = f13;
        this.f128245b = f14;
        this.f128246c = ((n4.e) al2.b.c(new n4.e(f13), new n4.e(f14))).f89175a;
    }
}
