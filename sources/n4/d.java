package n4;

import kh2.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f89171a;

    /* renamed from: b, reason: collision with root package name */
    public final float f89172b;

    /* renamed from: c, reason: collision with root package name */
    public final o4.a f89173c;

    public d(float f13, float f14, o4.a aVar) {
        this.f89171a = f13;
        this.f89172b = f14;
        this.f89173c = aVar;
    }

    @Override // n4.b
    public final float b() {
        return this.f89171a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f89171a, dVar.f89171a) == 0 && Float.compare(this.f89172b, dVar.f89172b) == 0 && Intrinsics.d(this.f89173c, dVar.f89173c);
    }

    public final int hashCode() {
        return this.f89173c.hashCode() + a.a.a(this.f89172b, Float.hashCode(this.f89171a) * 31, 31);
    }

    @Override // n4.b
    public final float j0() {
        return this.f89172b;
    }

    @Override // n4.b
    public final long o(float f13) {
        return w.P(this.f89173c.a(f13));
    }

    @Override // n4.b
    public final float t(long j13) {
        if (n.a(m.b(j13), 4294967296L)) {
            return this.f89173c.b(m.c(j13));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f89171a + ", fontScale=" + this.f89172b + ", converter=" + this.f89173c + ')';
    }
}
