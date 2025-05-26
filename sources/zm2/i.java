package zm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a */
    public final byte[] f142219a;

    /* renamed from: b */
    public final int f142220b;

    /* renamed from: c */
    public int f142221c = 0;

    /* renamed from: d */
    public final OutputStream f142222d;

    public i(OutputStream outputStream, byte[] bArr) {
        this.f142222d = outputStream;
        this.f142219a = bArr;
        this.f142220b = bArr.length;
    }

    public static int a(byte[] bArr) {
        return k(bArr.length) + bArr.length;
    }

    public static int b(g gVar) {
        return gVar.size() + k(gVar.size());
    }

    public static int c() {
        return q(4) + 8;
    }

    public static int d(int i13, int i14) {
        return g(i14) + q(i13);
    }

    public static int e() {
        return q(3) + 4;
    }

    public static int f(int i13, int i14) {
        return g(i14) + q(i13);
    }

    public static int g(int i13) {
        if (i13 >= 0) {
            return k(i13);
        }
        return 10;
    }

    public static int h(long j13) {
        return l(j13);
    }

    public static int i(int i13, c cVar) {
        return j(cVar) + q(i13);
    }

    public static int j(c cVar) {
        int a13 = cVar.a();
        return k(a13) + a13;
    }

    public static int k(int i13) {
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

    public static int l(long j13) {
        if (((-128) & j13) == 0) {
            return 1;
        }
        if (((-16384) & j13) == 0) {
            return 2;
        }
        if (((-2097152) & j13) == 0) {
            return 3;
        }
        if (((-268435456) & j13) == 0) {
            return 4;
        }
        if (((-34359738368L) & j13) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j13) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j13) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j13) == 0) {
            return 8;
        }
        return (j13 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int m(int i13) {
        return k((i13 >> 31) ^ (i13 << 1));
    }

    public static int n(long j13) {
        return o(j13) + q(2);
    }

    public static int o(long j13) {
        return l((j13 >> 63) ^ (j13 << 1));
    }

    public static int p(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return k(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException("UTF-8 not supported.", e13);
        }
    }

    public static int q(int i13) {
        return k(i13 << 3);
    }

    public static int r(int i13) {
        return k(i13);
    }

    public static int s(long j13) {
        return l(j13);
    }

    public static i u(OutputStream outputStream, int i13) {
        return new i(outputStream, new byte[i13]);
    }

    public final void A(int i13, int i14) {
        X(i13, 0);
        G(i14);
    }

    public final void B(int i13) {
        N(i13);
    }

    public final void C(long j13) {
        O(j13);
    }

    public final void D(float f13) {
        X(3, 5);
        E(f13);
    }

    public final void E(float f13) {
        N(Float.floatToRawIntBits(f13));
    }

    public final void F(int i13, int i14) {
        X(i13, 0);
        G(i14);
    }

    public final void G(int i13) {
        if (i13 >= 0) {
            P(i13);
        } else {
            Q(i13);
        }
    }

    public final void H(long j13) {
        Q(j13);
    }

    public final void I(int i13, c cVar) {
        X(i13, 2);
        J(cVar);
    }

    public final void J(c cVar) {
        P(cVar.a());
        cVar.d(this);
    }

    public final void K(int i13) {
        byte b13 = (byte) i13;
        if (this.f142221c == this.f142220b) {
            v();
        }
        int i14 = this.f142221c;
        this.f142221c = i14 + 1;
        this.f142219a[i14] = b13;
    }

    public final void L(g gVar) {
        int size = gVar.size();
        int i13 = this.f142221c;
        int i14 = this.f142220b;
        int i15 = i14 - i13;
        byte[] bArr = this.f142219a;
        if (i15 >= size) {
            gVar.d(0, i13, size, bArr);
            this.f142221c += size;
            return;
        }
        gVar.d(0, i13, i15, bArr);
        int i16 = size - i15;
        this.f142221c = i14;
        v();
        if (i16 > i14) {
            gVar.u(this.f142222d, i15, i16);
        } else {
            gVar.d(i15, 0, i16, bArr);
            this.f142221c = i16;
        }
    }

    public final void M(byte[] bArr) {
        int length = bArr.length;
        int i13 = this.f142221c;
        int i14 = this.f142220b;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f142219a;
        if (i15 >= length) {
            System.arraycopy(bArr, 0, bArr2, i13, length);
            this.f142221c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i13, i15);
        int i16 = length - i15;
        this.f142221c = i14;
        v();
        if (i16 > i14) {
            this.f142222d.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f142221c = i16;
        }
    }

    public final void N(int i13) {
        K(i13 & 255);
        K((i13 >> 8) & 255);
        K((i13 >> 16) & 255);
        K((i13 >> 24) & 255);
    }

    public final void O(long j13) {
        K(((int) j13) & 255);
        K(((int) (j13 >> 8)) & 255);
        K(((int) (j13 >> 16)) & 255);
        K(((int) (j13 >> 24)) & 255);
        K(((int) (j13 >> 32)) & 255);
        K(((int) (j13 >> 40)) & 255);
        K(((int) (j13 >> 48)) & 255);
        K(((int) (j13 >> 56)) & 255);
    }

    public final void P(int i13) {
        while ((i13 & (-128)) != 0) {
            K((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            i13 >>>= 7;
        }
        K(i13);
    }

    public final void Q(long j13) {
        while (((-128) & j13) != 0) {
            K((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            j13 >>>= 7;
        }
        K((int) j13);
    }

    public final void R(int i13) {
        N(i13);
    }

    public final void S(long j13) {
        O(j13);
    }

    public final void T(int i13) {
        P((i13 >> 31) ^ (i13 << 1));
    }

    public final void U(long j13) {
        X(2, 0);
        V(j13);
    }

    public final void V(long j13) {
        Q((j13 >> 63) ^ (j13 << 1));
    }

    public final void W(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        P(bytes.length);
        M(bytes);
    }

    public final void X(int i13, int i14) {
        P((i13 << 3) | i14);
    }

    public final void Y(int i13) {
        P(i13);
    }

    public final void Z(long j13) {
        Q(j13);
    }

    public final void t() {
        if (this.f142222d != null) {
            v();
        }
    }

    public final void v() {
        OutputStream outputStream = this.f142222d;
        if (outputStream == null) {
            throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            };
        }
        outputStream.write(this.f142219a, 0, this.f142221c);
        this.f142221c = 0;
    }

    public final void w(byte[] bArr) {
        P(bArr.length);
        M(bArr);
    }

    public final void x(g gVar) {
        P(gVar.size());
        L(gVar);
    }

    public final void y(double d2) {
        X(4, 1);
        z(d2);
    }

    public final void z(double d2) {
        O(Double.doubleToRawLongBits(d2));
    }
}
