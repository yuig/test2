package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class q extends s1 {

    /* renamed from: d */
    public static final Logger f18129d = Logger.getLogger(q.class.getName());

    /* renamed from: e */
    public static final boolean f18130e = h2.f18072f;

    /* renamed from: c */
    public h1.b f18131c;

    public static int A(long j13) {
        return H((j13 >> 63) ^ (j13 << 1));
    }

    public static int B(int i13, String str) {
        return C(str) + D(i13);
    }

    public static int C(String str) {
        int length;
        try {
            length = k2.b(str);
        } catch (j2 unused) {
            length = str.getBytes(j0.f18080a).length;
        }
        return F(length) + length;
    }

    public static int D(int i13) {
        return F(i13 << 3);
    }

    public static int E(int i13, int i14) {
        return F(i14) + D(i13);
    }

    public static int F(int i13) {
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

    public static int G(int i13, long j13) {
        return H(j13) + D(i13);
    }

    public static int H(long j13) {
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

    public static int g(int i13) {
        return D(i13) + 1;
    }

    public static int h(byte[] bArr) {
        int length = bArr.length;
        return F(length) + length;
    }

    public static int i(int i13, i iVar) {
        return j(iVar) + D(i13);
    }

    public static int j(i iVar) {
        int size = iVar.size();
        return F(size) + size;
    }

    public static int k(int i13) {
        return D(i13) + 8;
    }

    public static int l(int i13, int i14) {
        return s(i14) + D(i13);
    }

    public static int m(int i13) {
        return s(i13);
    }

    public static int n(int i13) {
        return D(i13) + 4;
    }

    public static int o(int i13) {
        return D(i13) + 8;
    }

    public static int p(int i13) {
        return D(i13) + 4;
    }

    public static int q(int i13, b bVar, n1 n1Var) {
        return bVar.b(n1Var) + (D(i13) * 2);
    }

    public static int r(int i13, int i14) {
        return s(i14) + D(i13);
    }

    public static int s(int i13) {
        if (i13 >= 0) {
            return F(i13);
        }
        return 10;
    }

    public static int t(int i13, long j13) {
        return H(j13) + D(i13);
    }

    public static int u(long j13) {
        return H(j13);
    }

    public static int v(int i13) {
        return D(i13) + 4;
    }

    public static int w(int i13) {
        return D(i13) + 8;
    }

    public static int x(int i13, int i14) {
        return y(i14) + D(i13);
    }

    public static int y(int i13) {
        return F((i13 >> 31) ^ (i13 << 1));
    }

    public static int z(int i13, long j13) {
        return A(j13) + D(i13);
    }

    public final void I(String str, j2 j2Var) {
        f18129d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) j2Var);
        byte[] bytes = str.getBytes(j0.f18080a);
        try {
            k0(bytes.length);
            f(bytes, 0, bytes.length);
        } catch (CodedOutputStream$OutOfSpaceException e13) {
            throw e13;
        } catch (IndexOutOfBoundsException e14) {
            throw new CodedOutputStream$OutOfSpaceException(e14);
        }
    }

    public abstract void J(byte b13);

    public abstract void K(int i13, boolean z13);

    public final void L(boolean z13) {
        J(z13 ? (byte) 1 : (byte) 0);
    }

    public final void M(byte[] bArr) {
        N(bArr, bArr.length);
    }

    public abstract void N(byte[] bArr, int i13);

    public abstract void O(int i13, i iVar);

    public abstract void P(i iVar);

    public final void Q(double d2) {
        V(Double.doubleToRawLongBits(d2));
    }

    public final void R(int i13) {
        Y(i13);
    }

    public abstract void S(int i13, int i14);

    public abstract void T(int i13);

    public abstract void U(int i13, long j13);

    public abstract void V(long j13);

    public final void W(float f13) {
        T(Float.floatToRawIntBits(f13));
    }

    public abstract void X(int i13, int i14);

    public abstract void Y(int i13);

    public final void Z(long j13) {
        m0(j13);
    }

    public abstract void a0(int i13, b bVar, n1 n1Var);

    public abstract void b0(b bVar);

    public final void c0(int i13) {
        T(i13);
    }

    public final void d0(long j13) {
        V(j13);
    }

    public final void e0(int i13) {
        k0((i13 >> 31) ^ (i13 << 1));
    }

    public final void f0(long j13) {
        m0((j13 >> 63) ^ (j13 << 1));
    }

    public abstract void g0(int i13, String str);

    public abstract void h0(String str);

    public abstract void i0(int i13, int i14);

    public abstract void j0(int i13, int i14);

    public abstract void k0(int i13);

    public abstract void l0(int i13, long j13);

    public abstract void m0(long j13);
}
