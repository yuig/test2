package a7;

import java.util.Locale;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f1163d = new p0(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f1164a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1166c;

    static {
        d7.n0.Q(0);
        d7.n0.Q(1);
    }

    public p0(float f13) {
        this(f13, 1.0f);
    }

    public final long a(long j13) {
        return j13 * this.f1166c;
    }

    public final p0 b(float f13) {
        return new p0(f13, this.f1165b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0.class != obj.getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f1164a == p0Var.f1164a && this.f1165b == p0Var.f1165b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1165b) + ((Float.floatToRawIntBits(this.f1164a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1164a), Float.valueOf(this.f1165b)};
        int i13 = d7.n0.f53866a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public p0(float f13, float f14) {
        bf.b.i(f13 > 0.0f);
        bf.b.i(f14 > 0.0f);
        this.f1164a = f13;
        this.f1165b = f14;
        this.f1166c = Math.round(f13 * 1000.0f);
    }
}
