package u2;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    public final float f120034b;

    /* renamed from: c, reason: collision with root package name */
    public final float f120035c;

    public i(float f13, float f14) {
        this.f120034b = f13;
        this.f120035c = f14;
    }

    @Override // u2.e
    public final long a(long j13, long j14, n4.k kVar) {
        float f13 = (((int) (j14 >> 32)) - ((int) (j13 >> 32))) / 2.0f;
        float f14 = (((int) (j14 & 4294967295L)) - ((int) (j13 & 4294967295L))) / 2.0f;
        n4.k kVar2 = n4.k.Ltr;
        float f15 = this.f120034b;
        if (kVar != kVar2) {
            f15 *= -1;
        }
        float f16 = 1;
        return d7.b.a(Math.round((f15 + f16) * f13), Math.round((f16 + this.f120035c) * f14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f120034b, iVar.f120034b) == 0 && Float.compare(this.f120035c, iVar.f120035c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f120035c) + (Float.hashCode(this.f120034b) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb3.append(this.f120034b);
        sb3.append(", verticalBias=");
        return d7.g.h(sb3, this.f120035c, ')');
    }
}
