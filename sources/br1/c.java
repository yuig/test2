package br1;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f23765a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23766b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23767c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23768d;

    public c(float f13, float f14, float f15) {
        this.f23765a = f13;
        this.f23766b = f14;
        this.f23767c = f15;
        this.f23768d = (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n4.e.a(this.f23765a, cVar.f23765a) && n4.e.a(this.f23766b, cVar.f23766b) && Float.compare(this.f23767c, cVar.f23767c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23767c) + a.a.a(this.f23766b, Float.hashCode(this.f23765a) * 31, 31);
    }

    public final String toString() {
        return d7.g.i(a.a.w("PinOffsetKeyframe(x=", n4.e.b(this.f23765a), ", y=", n4.e.b(this.f23766b), ", relativeTimestamp="), this.f23767c, ")");
    }
}
