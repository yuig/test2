package a3;

import kh2.s0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f482a;

    public /* synthetic */ c(long j13) {
        this.f482a = j13;
    }

    public static long a(long j13, float f13, int i13) {
        float intBitsToFloat = (i13 & 1) != 0 ? Float.intBitsToFloat((int) (j13 >> 32)) : 0.0f;
        if ((i13 & 2) != 0) {
            f13 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
    }

    public static final boolean b(long j13, long j14) {
        return j13 == j14;
    }

    public static final float c(long j13) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float d(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static final float e(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static final boolean f(long j13) {
        long j14 = j13 & 9223372034707292159L;
        return (((~j14) & (j14 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long g(long j13, long j14) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long h(long j13, long j14) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat((int) (j13 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long i(long j13, float f13) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) * f13;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * f13;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String j(long j13) {
        if (!com.bumptech.glide.c.y0(j13)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + s0.a1(d(j13)) + ", " + s0.a1(e(j13)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f482a == ((c) obj).f482a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f482a);
    }

    public final String toString() {
        return j(this.f482a);
    }
}
