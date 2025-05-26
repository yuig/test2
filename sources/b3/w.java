package b3;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.c3;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b */
    public static final long f21378b = androidx.compose.ui.graphics.a.d(4278190080L);

    /* renamed from: c */
    public static final long f21379c = androidx.compose.ui.graphics.a.d(4282664004L);

    /* renamed from: d */
    public static final long f21380d = androidx.compose.ui.graphics.a.d(4287137928L);

    /* renamed from: e */
    public static final long f21381e = androidx.compose.ui.graphics.a.d(4291611852L);

    /* renamed from: f */
    public static final long f21382f = androidx.compose.ui.graphics.a.d(4294967295L);

    /* renamed from: g */
    public static final long f21383g = androidx.compose.ui.graphics.a.d(4294901760L);

    /* renamed from: h */
    public static final long f21384h = androidx.compose.ui.graphics.a.d(4278255360L);

    /* renamed from: i */
    public static final long f21385i = androidx.compose.ui.graphics.a.d(4278190335L);

    /* renamed from: j */
    public static final long f21386j = androidx.compose.ui.graphics.a.d(4294967040L);

    /* renamed from: k */
    public static final long f21387k = androidx.compose.ui.graphics.a.d(4278255615L);

    /* renamed from: l */
    public static final long f21388l = androidx.compose.ui.graphics.a.d(4294902015L);

    /* renamed from: m */
    public static final long f21389m = androidx.compose.ui.graphics.a.c(0);

    /* renamed from: n */
    public static final long f21390n = androidx.compose.ui.graphics.a.b(0.0f, 0.0f, 0.0f, 0.0f, c3.f.f25510s);

    /* renamed from: o */
    public static final /* synthetic */ int f21391o = 0;

    /* renamed from: a */
    public final long f21392a;

    public /* synthetic */ w(long j13) {
        this.f21392a = j13;
    }

    public static final long a(long j13, c3.d dVar) {
        c3.i iVar;
        c3.d f13 = f(j13);
        int i13 = f13.f25490c;
        int i14 = dVar.f25490c;
        if ((i13 | i14) < 0) {
            iVar = ao2.m0.q(f13, dVar, 0);
        } else {
            g1.u uVar = c3.j.f25520a;
            int i15 = i13 | (i14 << 6);
            Object h10 = uVar.h(i15);
            if (h10 == null) {
                h10 = ao2.m0.q(f13, dVar, 0);
                uVar.l(i15, h10);
            }
            iVar = (c3.i) h10;
        }
        return iVar.a(j13);
    }

    public static long b(long j13, float f13) {
        return androidx.compose.ui.graphics.a.b(h(j13), g(j13), e(j13), f13, f(j13));
    }

    public static final boolean c(long j13, long j14) {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return j13 == j14;
    }

    public static final float d(long j13) {
        float r03;
        float f13;
        long j14 = 63 & j13;
        xk2.d0 d0Var = xk2.e0.f135207b;
        if (j14 == 0) {
            r03 = (float) c3.r0((j13 >>> 56) & 255);
            f13 = 255.0f;
        } else {
            r03 = (float) c3.r0((j13 >>> 6) & 1023);
            f13 = 1023.0f;
        }
        return r03 / f13;
    }

    public static final float e(long j13) {
        int i13;
        int i14;
        int i15;
        float f13;
        long j14 = 63 & j13;
        xk2.d0 d0Var = xk2.e0.f135207b;
        if (j14 == 0) {
            return ((float) c3.r0((j13 >>> 32) & 255)) / 255.0f;
        }
        short s13 = (short) ((j13 >>> 16) & 65535);
        int i16 = 32768 & s13;
        int i17 = ((65535 & s13) >>> 10) & 31;
        int i18 = s13 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i13 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i13 = i17 + RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
            }
            int i23 = i13;
            i14 = i19;
            i15 = i23;
        } else {
            if (i18 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i18 + 1056964608);
                f13 = b0.f21303a;
                float f14 = intBitsToFloat - f13;
                return i16 == 0 ? f14 : -f14;
            }
            i15 = 0;
            i14 = 0;
        }
        return Float.intBitsToFloat((i15 << 23) | (i16 << 16) | i14);
    }

    public static final c3.d f(long j13) {
        float[] fArr = c3.f.f25492a;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return c3.f.f25512u[(int) (j13 & 63)];
    }

    public static final float g(long j13) {
        int i13;
        int i14;
        int i15;
        float f13;
        long j14 = 63 & j13;
        xk2.d0 d0Var = xk2.e0.f135207b;
        if (j14 == 0) {
            return ((float) c3.r0((j13 >>> 40) & 255)) / 255.0f;
        }
        short s13 = (short) ((j13 >>> 32) & 65535);
        int i16 = 32768 & s13;
        int i17 = ((65535 & s13) >>> 10) & 31;
        int i18 = s13 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i13 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i13 = i17 + RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
            }
            int i23 = i13;
            i14 = i19;
            i15 = i23;
        } else {
            if (i18 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i18 + 1056964608);
                f13 = b0.f21303a;
                float f14 = intBitsToFloat - f13;
                return i16 == 0 ? f14 : -f14;
            }
            i15 = 0;
            i14 = 0;
        }
        return Float.intBitsToFloat((i15 << 23) | (i16 << 16) | i14);
    }

    public static final float h(long j13) {
        int i13;
        int i14;
        int i15;
        float f13;
        long j14 = 63 & j13;
        xk2.d0 d0Var = xk2.e0.f135207b;
        if (j14 == 0) {
            return ((float) c3.r0((j13 >>> 48) & 255)) / 255.0f;
        }
        short s13 = (short) ((j13 >>> 48) & 65535);
        int i16 = 32768 & s13;
        int i17 = ((65535 & s13) >>> 10) & 31;
        int i18 = s13 & 1023;
        if (i17 != 0) {
            int i19 = i18 << 13;
            if (i17 == 31) {
                i13 = 255;
                if (i19 != 0) {
                    i19 |= 4194304;
                }
            } else {
                i13 = i17 + RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
            }
            int i23 = i13;
            i14 = i19;
            i15 = i23;
        } else {
            if (i18 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i18 + 1056964608);
                f13 = b0.f21303a;
                float f14 = intBitsToFloat - f13;
                return i16 == 0 ? f14 : -f14;
            }
            i15 = 0;
            i14 = 0;
        }
        return Float.intBitsToFloat((i15 << 23) | (i16 << 16) | i14);
    }

    public static String i(long j13) {
        StringBuilder sb3 = new StringBuilder("Color(");
        sb3.append(h(j13));
        sb3.append(", ");
        sb3.append(g(j13));
        sb3.append(", ");
        sb3.append(e(j13));
        sb3.append(", ");
        sb3.append(d(j13));
        sb3.append(", ");
        return ep.b.k(sb3, f(j13).f25488a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f21392a == ((w) obj).f21392a;
        }
        return false;
    }

    public final int hashCode() {
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f21392a);
    }

    public final String toString() {
        return i(this.f21392a);
    }
}
