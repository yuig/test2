package a3;

import kh2.s0;
import lb.l0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f476a = l0.c(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f477b = 0;

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
        if (b(j13) == c(j13)) {
            return "CornerRadius.circular(" + s0.a1(b(j13)) + ')';
        }
        return "CornerRadius.elliptical(" + s0.a1(b(j13)) + ", " + s0.a1(c(j13)) + ')';
    }
}
