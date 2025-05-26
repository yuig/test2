package s2;

import i2.a4;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f110707a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f110708b;

    /* renamed from: c, reason: collision with root package name */
    public a4[] f110709c;

    public final void a(Object obj) {
        int i13 = this.f110707a;
        int identityHashCode = System.identityHashCode(obj);
        int i14 = -1;
        if (i13 > 0) {
            int i15 = this.f110707a - 1;
            int i16 = 0;
            while (true) {
                if (i16 > i15) {
                    i14 = -(i16 + 1);
                    break;
                }
                int i17 = (i16 + i15) >>> 1;
                int i18 = this.f110708b[i17];
                if (i18 < identityHashCode) {
                    i16 = i17 + 1;
                } else if (i18 > identityHashCode) {
                    i15 = i17 - 1;
                } else {
                    a4 a4Var = this.f110709c[i17];
                    if (obj == (a4Var != null ? a4Var.get() : null)) {
                        i14 = i17;
                    } else {
                        int i19 = i17 - 1;
                        while (-1 < i19 && this.f110708b[i19] == identityHashCode) {
                            a4 a4Var2 = this.f110709c[i19];
                            if ((a4Var2 != null ? a4Var2.get() : null) == obj) {
                                break;
                            } else {
                                i19--;
                            }
                        }
                        int i23 = this.f110707a;
                        i19 = i17 + 1;
                        while (true) {
                            if (i19 >= i23) {
                                i19 = -(this.f110707a + 1);
                                break;
                            } else {
                                if (this.f110708b[i19] != identityHashCode) {
                                    i19 = -(i19 + 1);
                                    break;
                                }
                                a4 a4Var3 = this.f110709c[i19];
                                if ((a4Var3 != null ? a4Var3.get() : null) == obj) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        i14 = i19;
                    }
                }
            }
            if (i14 >= 0) {
                return;
            }
        }
        int i24 = -(i14 + 1);
        a4[] a4VarArr = this.f110709c;
        int length = a4VarArr.length;
        if (i13 == length) {
            int i25 = length * 2;
            a4[] a4VarArr2 = new a4[i25];
            int[] iArr = new int[i25];
            int i26 = i24 + 1;
            kotlin.collections.z.h(i26, i24, i13, a4VarArr, a4VarArr2);
            kotlin.collections.z.l(this.f110709c, a4VarArr2, 0, i24, 6);
            kotlin.collections.z.g(i26, i24, i13, this.f110708b, iArr);
            kotlin.collections.z.k(this.f110708b, iArr, 0, i24, 6);
            this.f110709c = a4VarArr2;
            this.f110708b = iArr;
        } else {
            int i27 = i24 + 1;
            kotlin.collections.z.h(i27, i24, i13, a4VarArr, a4VarArr);
            int[] iArr2 = this.f110708b;
            kotlin.collections.z.g(i27, i24, i13, iArr2, iArr2);
        }
        this.f110709c[i24] = new a4(obj);
        this.f110708b[i24] = identityHashCode;
        this.f110707a++;
    }

    public final int[] b() {
        return this.f110708b;
    }

    public final a4[] c() {
        return this.f110709c;
    }

    public final void d(int i13) {
        this.f110707a = i13;
    }
}
