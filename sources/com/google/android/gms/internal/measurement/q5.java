package com.google.android.gms.internal.measurement;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class q5 extends m4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f31596g = Logger.getLogger(q5.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f31597h = x7.f31703e;

    /* renamed from: c, reason: collision with root package name */
    public bb.p f31598c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f31599d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31600e;

    /* renamed from: f, reason: collision with root package name */
    public int f31601f;

    public q5(byte[] bArr, int i13) {
        if (((bArr.length - i13) | i13) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i13)));
        }
        this.f31599d = bArr;
        this.f31601f = 0;
        this.f31600e = i13;
    }

    public static int A(int i13, int i14) {
        return x(i14) + G(i13 << 3);
    }

    public static int B(int i13, long j13) {
        return C(j13) + G(i13 << 3);
    }

    public static int C(long j13) {
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

    public static int D(int i13) {
        return G(i13 << 3) + 4;
    }

    public static int E(int i13) {
        return G(i13 << 3);
    }

    public static int F(int i13, int i14) {
        return G((i14 >> 31) ^ (i14 << 1)) + G(i13 << 3);
    }

    public static int G(int i13) {
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

    public static int H(int i13, int i14) {
        return G(i14) + G(i13 << 3);
    }

    public static int b(int i13) {
        return G(i13 << 3) + 8;
    }

    public static int h(int i13) {
        return G(i13 << 3) + 4;
    }

    public static int j(int i13) {
        return G(i13 << 3) + 1;
    }

    public static int k(int i13, a7 a7Var, n7 n7Var) {
        return ((g5) a7Var).a(n7Var) + (G(i13 << 3) << 1);
    }

    public static int l(int i13, String str) {
        return m(str) + G(i13 << 3);
    }

    public static int m(String str) {
        int length;
        try {
            length = y7.a(str);
        } catch (z7 unused) {
            length = str.getBytes(c6.f31325a).length;
        }
        return G(length) + length;
    }

    public static int p(int i13) {
        return G(i13 << 3) + 8;
    }

    public static int q(int i13, o5 o5Var) {
        int G = G(i13 << 3);
        int j13 = o5Var.j();
        return G(j13) + j13 + G;
    }

    public static int u(int i13, long j13) {
        return C(j13) + G(i13 << 3);
    }

    public static int v(int i13) {
        return G(i13 << 3) + 8;
    }

    public static int w(int i13, int i14) {
        return x(i14) + G(i13 << 3);
    }

    public static int x(int i13) {
        if (i13 >= 0) {
            return G(i13);
        }
        return 10;
    }

    public static int y(int i13, long j13) {
        return C((j13 >> 63) ^ (j13 << 1)) + G(i13 << 3);
    }

    public static int z(int i13) {
        return G(i13 << 3) + 4;
    }

    public final void c(byte b13) {
        try {
            byte[] bArr = this.f31599d;
            int i13 = this.f31601f;
            this.f31601f = i13 + 1;
            bArr[i13] = b13;
        } catch (IndexOutOfBoundsException e13) {
            throw new zzig$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31601f), Integer.valueOf(this.f31600e), 1), e13);
        }
    }

    public final void d(int i13) {
        try {
            byte[] bArr = this.f31599d;
            int i14 = this.f31601f;
            bArr[i14] = (byte) i13;
            bArr[i14 + 1] = (byte) (i13 >> 8);
            bArr[i14 + 2] = (byte) (i13 >> 16);
            this.f31601f = i14 + 4;
            bArr[i14 + 3] = (byte) (i13 >>> 24);
        } catch (IndexOutOfBoundsException e13) {
            throw new zzig$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31601f), Integer.valueOf(this.f31600e), 1), e13);
        }
    }

    public final void e(long j13) {
        try {
            byte[] bArr = this.f31599d;
            int i13 = this.f31601f;
            bArr[i13] = (byte) j13;
            bArr[i13 + 1] = (byte) (j13 >> 8);
            bArr[i13 + 2] = (byte) (j13 >> 16);
            bArr[i13 + 3] = (byte) (j13 >> 24);
            bArr[i13 + 4] = (byte) (j13 >> 32);
            bArr[i13 + 5] = (byte) (j13 >> 40);
            bArr[i13 + 6] = (byte) (j13 >> 48);
            this.f31601f = i13 + 8;
            bArr[i13 + 7] = (byte) (j13 >> 56);
        } catch (IndexOutOfBoundsException e13) {
            throw new zzig$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31601f), Integer.valueOf(this.f31600e), 1), e13);
        }
    }

    public final void f(o5 o5Var) {
        r(o5Var.j());
        n5 n5Var = (n5) o5Var;
        t(n5Var.f31553d, n5Var.l(), n5Var.j());
    }

    public final void g(String str) {
        int i13 = this.f31601f;
        try {
            int G = G(str.length() * 3);
            int G2 = G(str.length());
            byte[] bArr = this.f31599d;
            if (G2 != G) {
                r(y7.a(str));
                this.f31601f = y7.b(str, bArr, this.f31601f, i());
                return;
            }
            int i14 = i13 + G2;
            this.f31601f = i14;
            int b13 = y7.b(str, bArr, i14, i());
            this.f31601f = i13;
            r((b13 - i13) - G2);
            this.f31601f = b13;
        } catch (z7 e13) {
            this.f31601f = i13;
            f31596g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e13);
            byte[] bytes = str.getBytes(c6.f31325a);
            try {
                r(bytes.length);
                t(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e14) {
                throw new zzig$zzb(e14);
            }
        } catch (IndexOutOfBoundsException e15) {
            throw new zzig$zzb(e15);
        }
    }

    public final int i() {
        return this.f31600e - this.f31601f;
    }

    public final void n(int i13) {
        if (i13 >= 0) {
            r(i13);
        } else {
            o(i13);
        }
    }

    public final void o(long j13) {
        boolean z13 = f31597h;
        byte[] bArr = this.f31599d;
        if (z13 && i() >= 10) {
            while ((j13 & (-128)) != 0) {
                int i13 = this.f31601f;
                this.f31601f = i13 + 1;
                x7.g(bArr, i13, (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                j13 >>>= 7;
            }
            int i14 = this.f31601f;
            this.f31601f = i14 + 1;
            x7.g(bArr, i14, (byte) j13);
            return;
        }
        while ((j13 & (-128)) != 0) {
            try {
                int i15 = this.f31601f;
                this.f31601f = i15 + 1;
                bArr[i15] = (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                j13 >>>= 7;
            } catch (IndexOutOfBoundsException e13) {
                throw new zzig$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31601f), Integer.valueOf(this.f31600e), 1), e13);
            }
        }
        int i16 = this.f31601f;
        this.f31601f = i16 + 1;
        bArr[i16] = (byte) j13;
    }

    public final void r(int i13) {
        while (true) {
            int i14 = i13 & (-128);
            byte[] bArr = this.f31599d;
            if (i14 == 0) {
                int i15 = this.f31601f;
                this.f31601f = i15 + 1;
                bArr[i15] = (byte) i13;
                return;
            } else {
                try {
                    int i16 = this.f31601f;
                    this.f31601f = i16 + 1;
                    bArr[i16] = (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new zzig$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31601f), Integer.valueOf(this.f31600e), 1), e13);
                }
            }
            throw new zzig$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31601f), Integer.valueOf(this.f31600e), 1), e13);
        }
    }

    public final void s(int i13, int i14) {
        r((i13 << 3) | i14);
    }

    public final void t(byte[] bArr, int i13, int i14) {
        try {
            System.arraycopy(bArr, i13, this.f31599d, this.f31601f, i14);
            this.f31601f += i14;
        } catch (IndexOutOfBoundsException e13) {
            throw new zzig$zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f31601f), Integer.valueOf(this.f31600e), Integer.valueOf(i14)), e13);
        }
    }
}
