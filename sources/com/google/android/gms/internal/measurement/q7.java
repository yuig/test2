package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q7 {

    /* renamed from: f, reason: collision with root package name */
    public static final q7 f31604f = new q7(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f31605a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f31606b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f31607c;

    /* renamed from: d, reason: collision with root package name */
    public int f31608d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31609e;

    public q7(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.f31605a = i13;
        this.f31606b = iArr;
        this.f31607c = objArr;
        this.f31609e = z13;
    }

    public static void d(int i13, Object obj, bb.p pVar) {
        int i14 = i13 >>> 3;
        int i15 = i13 & 7;
        if (i15 == 0) {
            pVar.v(i14, ((Long) obj).longValue());
            return;
        }
        if (i15 == 1) {
            pVar.n(i14, ((Long) obj).longValue());
            return;
        }
        if (i15 == 2) {
            pVar.o(i14, (o5) obj);
            return;
        }
        if (i15 != 3) {
            if (i15 == 5) {
                pVar.u(i14, ((Integer) obj).intValue());
                return;
            } else {
                int i16 = zzji.f31732a;
                throw new RuntimeException(new zzjh("Protocol message tag had invalid wire type."));
            }
        }
        if (pVar.h() == 1) {
            ((q5) pVar.f22464b).s(i14, 3);
            ((q7) obj).e(pVar);
            ((q5) pVar.f22464b).s(i14, 4);
        } else {
            ((q5) pVar.f22464b).s(i14, 4);
            ((q7) obj).e(pVar);
            ((q5) pVar.f22464b).s(i14, 3);
        }
    }

    public static q7 f() {
        return new q7(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int B;
        int i13 = this.f31608d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f31605a; i15++) {
            int i16 = this.f31606b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 == 0) {
                B = q5.B(i17, ((Long) this.f31607c[i15]).longValue());
            } else if (i18 == 1) {
                ((Long) this.f31607c[i15]).getClass();
                B = q5.p(i17);
            } else if (i18 == 2) {
                B = q5.q(i17, (o5) this.f31607c[i15]);
            } else if (i18 == 3) {
                i14 = ((q7) this.f31607c[i15]).a() + (q5.E(i17) << 1) + i14;
            } else {
                if (i18 != 5) {
                    int i19 = zzji.f31732a;
                    throw new IllegalStateException(new zzjh("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.f31607c[i15]).getClass();
                B = q5.z(i17);
            }
            i14 = B + i14;
        }
        this.f31608d = i14;
        return i14;
    }

    public final void b(int i13) {
        int[] iArr = this.f31606b;
        if (i13 > iArr.length) {
            int i14 = this.f31605a;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f31606b = Arrays.copyOf(iArr, i13);
            this.f31607c = Arrays.copyOf(this.f31607c, i13);
        }
    }

    public final void c(int i13, Object obj) {
        if (!this.f31609e) {
            throw new UnsupportedOperationException();
        }
        b(this.f31605a + 1);
        int[] iArr = this.f31606b;
        int i14 = this.f31605a;
        iArr[i14] = i13;
        this.f31607c[i14] = obj;
        this.f31605a = i14 + 1;
    }

    public final void e(bb.p pVar) {
        if (this.f31605a == 0) {
            return;
        }
        if (pVar.h() == 1) {
            for (int i13 = 0; i13 < this.f31605a; i13++) {
                d(this.f31606b[i13], this.f31607c[i13], pVar);
            }
            return;
        }
        for (int i14 = this.f31605a - 1; i14 >= 0; i14--) {
            d(this.f31606b[i14], this.f31607c[i14], pVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        int i13 = this.f31605a;
        if (i13 == q7Var.f31605a) {
            int[] iArr = this.f31606b;
            int[] iArr2 = q7Var.f31606b;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    Object[] objArr = this.f31607c;
                    Object[] objArr2 = q7Var.f31607c;
                    int i15 = this.f31605a;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if (objArr[i16].equals(objArr2[i16])) {
                        }
                    }
                    return true;
                }
                if (iArr[i14] != iArr2[i14]) {
                    break;
                }
                i14++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f31605a;
        int i14 = (i13 + 527) * 31;
        int[] iArr = this.f31606b;
        int i15 = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i13; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = (i14 + i16) * 31;
        Object[] objArr = this.f31607c;
        int i19 = this.f31605a;
        for (int i23 = 0; i23 < i19; i23++) {
            i15 = (i15 * 31) + objArr[i23].hashCode();
        }
        return i18 + i15;
    }
}
