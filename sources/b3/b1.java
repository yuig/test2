package b3;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f21304b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21305c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f21306a;

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static final float b(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static final float c(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static String d(long j13) {
        return "TransformOrigin(packedValue=" + j13 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1) {
            return this.f21306a == ((b1) obj).f21306a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21306a);
    }

    public final String toString() {
        return d(this.f21306a);
    }
}
