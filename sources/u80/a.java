package u80;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f120911a;

    /* renamed from: b, reason: collision with root package name */
    public final float f120912b;

    public a(float f13, float f14) {
        this.f120911a = f13;
        this.f120912b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Float.compare(0.15f, 0.15f) == 0 && Float.compare(this.f120911a, aVar.f120911a) == 0 && Float.compare(this.f120912b, aVar.f120912b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f120912b) + a.a.a(this.f120911a, Float.hashCode(0.15f) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CardOverlapPercentages(one=0.15, two=");
        sb3.append(this.f120911a);
        sb3.append(", three=");
        return d7.g.i(sb3, this.f120912b, ")");
    }
}
