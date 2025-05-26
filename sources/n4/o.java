package n4;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f89193b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f89194a;

    public /* synthetic */ o(long j13) {
        this.f89194a = j13;
    }

    public static final /* synthetic */ o a(long j13) {
        return new o(j13);
    }

    public static long b(long j13, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = Float.intBitsToFloat((int) (j13 >> 32));
        }
        if ((i13 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (j13 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
    }

    public static final boolean c(long j13) {
        return j13 == 0;
    }

    public static final float d(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static final float e(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static final long f(long j13, long j14) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat((int) (j14 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat((int) (j14 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long g(long j13, long j14) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat((int) (j13 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long h(long j13, float f13) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) * f13;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) * f13;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String i(long j13) {
        return "(" + d(j13) + ", " + e(j13) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f89194a == ((o) obj).f89194a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89194a);
    }

    public final /* synthetic */ long j() {
        return this.f89194a;
    }

    public final String toString() {
        return i(this.f89194a);
    }
}
