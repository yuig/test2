package n4;

import kh2.w;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f89188b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f89189c = w.r0(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f89190a;

    public /* synthetic */ m(long j13) {
        this.f89190a = j13;
    }

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static final long b(long j13) {
        return f89188b[(int) ((j13 & 1095216660480L) >>> 32)].f89192a;
    }

    public static final float c(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static String d(long j13) {
        long b13 = b(j13);
        if (n.a(b13, 0L)) {
            return "Unspecified";
        }
        if (n.a(b13, 4294967296L)) {
            return c(j13) + ".sp";
        }
        if (!n.a(b13, 8589934592L)) {
            return "Invalid";
        }
        return c(j13) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f89190a == ((m) obj).f89190a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89190a);
    }

    public final String toString() {
        return d(this.f89190a);
    }
}
