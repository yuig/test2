package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import oi.u6;

/* loaded from: classes3.dex */
public abstract class r extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f33683c = Logger.getLogger(r.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f33684d = d2.f33604e;

    /* renamed from: b, reason: collision with root package name */
    public u6 f33685b;

    public static int Q(int i13) {
        return j0(i13) + 1;
    }

    public static int R(int i13, k kVar) {
        return S(kVar) + j0(i13);
    }

    public static int S(k kVar) {
        int size = kVar.size();
        return l0(size) + size;
    }

    public static int T(int i13) {
        return j0(i13) + 8;
    }

    public static int U(int i13, int i14) {
        return a0(i14) + j0(i13);
    }

    public static int V(int i13) {
        return j0(i13) + 4;
    }

    public static int W(int i13) {
        return j0(i13) + 8;
    }

    public static int X(int i13) {
        return j0(i13) + 4;
    }

    public static int Y(int i13, b bVar, q1 q1Var) {
        return bVar.a(q1Var) + (j0(i13) * 2);
    }

    public static int Z(int i13, int i14) {
        return a0(i14) + j0(i13);
    }

    public static int a0(int i13) {
        if (i13 >= 0) {
            return l0(i13);
        }
        return 10;
    }

    public static int b0(int i13, long j13) {
        return n0(j13) + j0(i13);
    }

    public static int c0(int i13, k kVar) {
        return R(3, kVar) + k0(2, i13) + (j0(1) * 2);
    }

    public static int d0(int i13) {
        return j0(i13) + 4;
    }

    public static int e0(int i13) {
        return j0(i13) + 8;
    }

    public static int f0(int i13, int i14) {
        return l0((i14 >> 31) ^ (i14 << 1)) + j0(i13);
    }

    public static int g0(int i13, long j13) {
        return n0((j13 >> 63) ^ (j13 << 1)) + j0(i13);
    }

    public static int h0(int i13, String str) {
        return i0(str) + j0(i13);
    }

    public static int i0(String str) {
        int length;
        try {
            length = g2.c(str);
        } catch (f2 unused) {
            length = str.getBytes(l0.f33646a).length;
        }
        return l0(length) + length;
    }

    public static int j0(int i13) {
        return l0(i13 << 3);
    }

    public static int k0(int i13, int i14) {
        return l0(i14) + j0(i13);
    }

    public static int l0(int i13) {
        if ((i13 & (-128)) == 0) {
            return 1;
        }
        if ((i13 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i13) == 0) {
            return 3;
        }
        return (i13 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int m0(int i13, long j13) {
        return n0(j13) + j0(i13);
    }

    public static int n0(long j13) {
        int i13;
        if (((-128) & j13) == 0) {
            return 1;
        }
        if (j13 < 0) {
            return 10;
        }
        if (((-34359738368L) & j13) != 0) {
            j13 >>>= 28;
            i13 = 6;
        } else {
            i13 = 2;
        }
        if (((-2097152) & j13) != 0) {
            i13 += 2;
            j13 >>>= 14;
        }
        return (j13 & (-16384)) != 0 ? i13 + 1 : i13;
    }

    public static p p0(byte[] bArr) {
        return new p(bArr, bArr.length);
    }

    public abstract void A0(int i13, b bVar, q1 q1Var);

    public abstract void B0(int i13, String str);

    public abstract void C0(int i13, int i14);

    public abstract void D0(int i13, int i14);

    public abstract void E0(int i13);

    public abstract void F0(int i13, long j13);

    public abstract void G0(long j13);

    public final void P() {
        if (q0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void o0(String str, f2 f2Var) {
        f33683c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) f2Var);
        byte[] bytes = str.getBytes(l0.f33646a);
        try {
            E0(bytes.length);
            O(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(e13);
        }
    }

    public abstract int q0();

    public abstract void r0(byte b13);

    public abstract void s0(int i13, boolean z13);

    public abstract void t0(int i13, k kVar);

    public abstract void u0(int i13, int i14);

    public abstract void v0(int i13);

    public abstract void w0(int i13, long j13);

    public abstract void x0(long j13);

    public abstract void y0(int i13, int i14);

    public abstract void z0(int i13);
}
