package com.google.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: f, reason: collision with root package name */
    public static final j2 f33911f = new j2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f33912a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f33913b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f33914c;

    /* renamed from: d, reason: collision with root package name */
    public int f33915d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33916e;

    public j2() {
        this(0, new int[8], new Object[8], true);
    }

    public static j2 e(j2 j2Var, j2 j2Var2) {
        int i13 = j2Var.f33912a + j2Var2.f33912a;
        int[] copyOf = Arrays.copyOf(j2Var.f33913b, i13);
        System.arraycopy(j2Var2.f33913b, 0, copyOf, j2Var.f33912a, j2Var2.f33912a);
        Object[] copyOf2 = Arrays.copyOf(j2Var.f33914c, i13);
        System.arraycopy(j2Var2.f33914c, 0, copyOf2, j2Var.f33912a, j2Var2.f33912a);
        return new j2(i13, copyOf, copyOf2, true);
    }

    public final void a() {
        if (!this.f33916e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i13) {
        int[] iArr = this.f33913b;
        if (i13 > iArr.length) {
            int i14 = this.f33912a;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f33913b = Arrays.copyOf(iArr, i13);
            this.f33914c = Arrays.copyOf(this.f33914c, i13);
        }
    }

    public final int c() {
        int E;
        int i13 = this.f33915d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f33912a; i15++) {
            int i16 = this.f33913b[i15];
            int z03 = lb.l0.z0(i16);
            int A0 = lb.l0.A0(i16);
            if (A0 == 0) {
                E = u.E(z03, ((Long) this.f33914c[i15]).longValue());
            } else if (A0 == 1) {
                ((Long) this.f33914c[i15]).getClass();
                E = u.p(z03);
            } else if (A0 == 2) {
                E = u.k(z03, (l) this.f33914c[i15]);
            } else if (A0 == 3) {
                i14 = ((j2) this.f33914c[i15]).c() + (u.B(z03) * 2) + i14;
            } else {
                if (A0 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.c());
                }
                ((Integer) this.f33914c[i15]).getClass();
                E = u.o(z03);
            }
            i14 = E + i14;
        }
        this.f33915d = i14;
        return i14;
    }

    public final boolean d(int i13, p pVar) {
        int A;
        a();
        int i14 = i13 >>> 3;
        int i15 = i13 & 7;
        if (i15 == 0) {
            f(i13, Long.valueOf(pVar.s()));
            return true;
        }
        if (i15 == 1) {
            f(i13, Long.valueOf(pVar.p()));
            return true;
        }
        if (i15 == 2) {
            f(i13, pVar.l());
            return true;
        }
        if (i15 != 3) {
            if (i15 == 4) {
                return false;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            f(i13, Integer.valueOf(pVar.o()));
            return true;
        }
        j2 j2Var = new j2();
        do {
            A = pVar.A();
            if (A == 0) {
                break;
            }
        } while (j2Var.d(A, pVar));
        pVar.a((i14 << 3) | 4);
        f(i13, j2Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        int i13 = this.f33912a;
        if (i13 == j2Var.f33912a) {
            int[] iArr = this.f33913b;
            int[] iArr2 = j2Var.f33913b;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    Object[] objArr = this.f33914c;
                    Object[] objArr2 = j2Var.f33914c;
                    int i15 = this.f33912a;
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

    public final void f(int i13, Object obj) {
        a();
        b(this.f33912a + 1);
        int[] iArr = this.f33913b;
        int i14 = this.f33912a;
        iArr[i14] = i13;
        this.f33914c[i14] = obj;
        this.f33912a = i14 + 1;
    }

    public final void g(rd.j jVar) {
        if (this.f33912a == 0) {
            return;
        }
        jVar.getClass();
        b3 b3Var = b3.ASCENDING;
        for (int i13 = 0; i13 < this.f33912a; i13++) {
            int i14 = this.f33913b[i13];
            Object obj = this.f33914c[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                jVar.A(i15, ((Long) obj).longValue());
            } else if (i16 == 1) {
                jVar.w(i15, ((Long) obj).longValue());
            } else if (i16 == 2) {
                jVar.r(i15, (l) obj);
            } else if (i16 == 3) {
                b3 b3Var2 = b3.ASCENDING;
                u uVar = (u) jVar.f107506b;
                uVar.X(i15, 3);
                ((j2) obj).g(jVar);
                uVar.X(i15, 4);
            } else {
                if (i16 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.c());
                }
                jVar.v(i15, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i13 = this.f33912a;
        int i14 = (527 + i13) * 31;
        int[] iArr = this.f33913b;
        int i15 = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i13; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int i18 = (i14 + i16) * 31;
        Object[] objArr = this.f33914c;
        int i19 = this.f33912a;
        for (int i23 = 0; i23 < i19; i23++) {
            i15 = (i15 * 31) + objArr[i23].hashCode();
        }
        return i18 + i15;
    }

    public j2(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.f33915d = -1;
        this.f33912a = i13;
        this.f33913b = iArr;
        this.f33914c = objArr;
        this.f33916e = z13;
    }
}
