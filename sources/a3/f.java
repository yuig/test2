package a3;

import kh2.s0;
import y2.h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b */
    public static final /* synthetic */ int f496b = 0;

    /* renamed from: a */
    public final long f497a;

    public /* synthetic */ f(long j13) {
        this.f497a = j13;
    }

    public static final boolean a(long j13, long j14) {
        return j13 == j14;
    }

    public static final float b(long j13) {
        if (j13 != h.f136670b) {
            return Float.intBitsToFloat((int) (j13 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float c(long j13) {
        if (j13 != h.f136670b) {
            return Math.min(Float.intBitsToFloat((int) ((j13 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j13 & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float d(long j13) {
        if (j13 != h.f136670b) {
            return Float.intBitsToFloat((int) (j13 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final boolean e(long j13) {
        if (j13 == h.f136670b) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j14 = j13 & (~((((-9223372034707292160L) & j13) >>> 31) * (-1)));
        return ((j14 & 4294967295L) & (j14 >>> 32)) == 0;
    }

    public static String f(long j13) {
        if (j13 == h.f136670b) {
            return "Size.Unspecified";
        }
        return "Size(" + s0.a1(d(j13)) + ", " + s0.a1(b(j13)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f497a == ((f) obj).f497a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f497a);
    }

    public final String toString() {
        return f(this.f497a);
    }
}
