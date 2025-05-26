package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import oi.u6;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: f, reason: collision with root package name */
    public static final w1 f33704f = new w1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f33705a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f33706b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f33707c;

    /* renamed from: d, reason: collision with root package name */
    public int f33708d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33709e;

    public w1(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.f33705a = i13;
        this.f33706b = iArr;
        this.f33707c = objArr;
        this.f33709e = z13;
    }

    public static w1 c() {
        return new w1(0, new int[8], new Object[8], true);
    }

    public final void a(int i13) {
        int[] iArr = this.f33706b;
        if (i13 > iArr.length) {
            int i14 = this.f33705a;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f33706b = Arrays.copyOf(iArr, i13);
            this.f33707c = Arrays.copyOf(this.f33707c, i13);
        }
    }

    public final int b() {
        int m03;
        int i13 = this.f33708d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f33705a; i15++) {
            int i16 = this.f33706b[i15];
            int J2 = u1.J(i16);
            int K = u1.K(i16);
            if (K == 0) {
                m03 = r.m0(J2, ((Long) this.f33707c[i15]).longValue());
            } else if (K == 1) {
                ((Long) this.f33707c[i15]).getClass();
                m03 = r.W(J2);
            } else if (K == 2) {
                m03 = r.R(J2, (k) this.f33707c[i15]);
            } else if (K == 3) {
                i14 = ((w1) this.f33707c[i15]).b() + (r.j0(J2) * 2) + i14;
            } else {
                if (K != 5) {
                    int i17 = InvalidProtocolBufferException.f33590b;
                    throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
                ((Integer) this.f33707c[i15]).getClass();
                m03 = r.V(J2);
            }
            i14 = m03 + i14;
        }
        this.f33708d = i14;
        return i14;
    }

    public final void d(int i13, Object obj) {
        if (!this.f33709e) {
            throw new UnsupportedOperationException();
        }
        a(this.f33705a + 1);
        int[] iArr = this.f33706b;
        int i14 = this.f33705a;
        iArr[i14] = i13;
        this.f33707c[i14] = obj;
        this.f33705a = i14 + 1;
    }

    public final void e(u6 u6Var) {
        if (this.f33705a == 0) {
            return;
        }
        u6Var.getClass();
        h2 h2Var = h2.ASCENDING;
        for (int i13 = 0; i13 < this.f33705a; i13++) {
            int i14 = this.f33706b[i13];
            Object obj = this.f33707c[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                u6Var.y(i15, ((Long) obj).longValue());
            } else if (i16 == 1) {
                u6Var.t(i15, ((Long) obj).longValue());
            } else if (i16 == 2) {
                u6Var.p(i15, (k) obj);
            } else if (i16 == 3) {
                h2 h2Var2 = h2.ASCENDING;
                ((r) u6Var.f95225b).C0(i15, 3);
                ((w1) obj).e(u6Var);
                ((r) u6Var.f95225b).C0(i15, 4);
            } else {
                if (i16 != 5) {
                    int i17 = InvalidProtocolBufferException.f33590b;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException());
                }
                u6Var.s(i15, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        int i13 = this.f33705a;
        if (i13 == w1Var.f33705a) {
            int[] iArr = this.f33706b;
            int[] iArr2 = w1Var.f33706b;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    Object[] objArr = this.f33707c;
                    Object[] objArr2 = w1Var.f33707c;
                    int i15 = this.f33705a;
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
        int i13 = this.f33705a;
        int i14 = (527 + i13) * 31;
        int[] iArr = this.f33706b;
        int i15 = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i13; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = (i14 + i16) * 31;
        Object[] objArr = this.f33707c;
        int i19 = this.f33705a;
        for (int i23 = 0; i23 < i19; i23++) {
            i15 = (i15 * 31) + objArr[i23].hashCode();
        }
        return i18 + i15;
    }
}
