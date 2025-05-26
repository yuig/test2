package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class u extends me.o {

    /* renamed from: q */
    public static final Logger f34000q = Logger.getLogger(u.class.getName());

    /* renamed from: r */
    public static final boolean f34001r = q2.f33964e;

    /* renamed from: p */
    public rd.j f34002p;

    public static int A(String str) {
        int length;
        try {
            length = t2.b(str);
        } catch (s2 unused) {
            length = str.getBytes(w0.f34008a).length;
        }
        return D(length) + length;
    }

    public static int B(int i13) {
        return D(i13 << 3);
    }

    public static int C(int i13, int i14) {
        return D(i14) + B(i13);
    }

    public static int D(int i13) {
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

    public static int E(int i13, long j13) {
        return F(j13) + B(i13);
    }

    public static int F(long j13) {
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

    public static int j(int i13) {
        return B(i13) + 1;
    }

    public static int k(int i13, l lVar) {
        return l(lVar) + B(i13);
    }

    public static int l(l lVar) {
        int size = lVar.size();
        return D(size) + size;
    }

    public static int m(int i13) {
        return B(i13) + 8;
    }

    public static int n(int i13, int i14) {
        return t(i14) + B(i13);
    }

    public static int o(int i13) {
        return B(i13) + 4;
    }

    public static int p(int i13) {
        return B(i13) + 8;
    }

    public static int q(int i13) {
        return B(i13) + 4;
    }

    public static int r(int i13, o1 o1Var, d2 d2Var) {
        return ((b) o1Var).getSerializedSize(d2Var) + (B(i13) * 2);
    }

    public static int s(int i13, int i14) {
        return t(i14) + B(i13);
    }

    public static int t(int i13) {
        if (i13 >= 0) {
            return D(i13);
        }
        return 10;
    }

    public static int u(int i13, long j13) {
        return F(j13) + B(i13);
    }

    public static int v(int i13) {
        return B(i13) + 4;
    }

    public static int w(int i13) {
        return B(i13) + 8;
    }

    public static int x(int i13, int i14) {
        return D((i14 >> 31) ^ (i14 << 1)) + B(i13);
    }

    public static int y(int i13, long j13) {
        return F((j13 >> 63) ^ (j13 << 1)) + B(i13);
    }

    public static int z(int i13, String str) {
        return A(str) + B(i13);
    }

    public final void G(String str, s2 s2Var) {
        f34000q.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) s2Var);
        byte[] bytes = str.getBytes(w0.f34008a);
        try {
            Z(bytes.length);
            i(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(e13);
        }
    }

    public abstract int H();

    public abstract void I(byte b13);

    public abstract void J(int i13, boolean z13);

    public abstract void K(byte[] bArr, int i13);

    public abstract void L(int i13, l lVar);

    public abstract void M(l lVar);

    public abstract void N(int i13, int i14);

    public abstract void O(int i13);

    public abstract void P(int i13, long j13);

    public abstract void Q(long j13);

    public abstract void R(int i13, int i14);

    public abstract void S(int i13);

    public abstract void T(int i13, o1 o1Var, d2 d2Var);

    public abstract void U(o1 o1Var);

    public abstract void V(int i13, String str);

    public abstract void W(String str);

    public abstract void X(int i13, int i14);

    public abstract void Y(int i13, int i14);

    public abstract void Z(int i13);

    public abstract void a0(int i13, long j13);

    public abstract void b0(long j13);
}
