package u2;

import lb.l0;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: b */
    public final float f120030b;

    /* renamed from: c */
    public final float f120031c;

    public f(float f13, float f14) {
        this.f120030b = f13;
        this.f120031c = f14;
    }

    @Override // u2.e
    public final long a(long j13, long j14, n4.k kVar) {
        long d2 = l0.d(((int) (j14 >> 32)) - ((int) (j13 >> 32)), ((int) (j14 & 4294967295L)) - ((int) (j13 & 4294967295L)));
        float f13 = 1;
        return d7.b.a(Math.round((this.f120030b + f13) * (((int) (d2 >> 32)) / 2.0f)), Math.round((f13 + this.f120031c) * (((int) (d2 & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f120030b, fVar.f120030b) == 0 && Float.compare(this.f120031c, fVar.f120031c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f120031c) + (Float.hashCode(this.f120030b) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        sb3.append(this.f120030b);
        sb3.append(", verticalBias=");
        return d7.g.h(sb3, this.f120031c, ')');
    }
}
