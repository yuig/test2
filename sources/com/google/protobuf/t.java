package com.google.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class t extends u {

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f33992s;

    /* renamed from: t, reason: collision with root package name */
    public final int f33993t;

    /* renamed from: u, reason: collision with root package name */
    public int f33994u;

    /* renamed from: v, reason: collision with root package name */
    public final OutputStream f33995v;

    public t(OutputStream outputStream, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i13, 20);
        this.f33992s = new byte[max];
        this.f33993t = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f33995v = outputStream;
    }

    @Override // com.google.protobuf.u
    public final int H() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.u
    public final void I(byte b13) {
        if (this.f33994u == this.f33993t) {
            h0();
        }
        int i13 = this.f33994u;
        this.f33994u = i13 + 1;
        this.f33992s[i13] = b13;
    }

    @Override // com.google.protobuf.u
    public final void J(int i13, boolean z13) {
        j0(11);
        e0(i13, 0);
        byte b13 = z13 ? (byte) 1 : (byte) 0;
        int i14 = this.f33994u;
        this.f33994u = i14 + 1;
        this.f33992s[i14] = b13;
    }

    @Override // com.google.protobuf.u
    public final void K(byte[] bArr, int i13) {
        Z(i13);
        k0(bArr, 0, i13);
    }

    @Override // com.google.protobuf.u
    public final void L(int i13, l lVar) {
        X(i13, 2);
        M(lVar);
    }

    @Override // com.google.protobuf.u
    public final void M(l lVar) {
        Z(lVar.size());
        lVar.s(this);
    }

    @Override // com.google.protobuf.u
    public final void N(int i13, int i14) {
        j0(14);
        e0(i13, 5);
        c0(i14);
    }

    @Override // com.google.protobuf.u
    public final void O(int i13) {
        j0(4);
        c0(i13);
    }

    @Override // com.google.protobuf.u
    public final void P(int i13, long j13) {
        j0(18);
        e0(i13, 1);
        d0(j13);
    }

    @Override // com.google.protobuf.u
    public final void Q(long j13) {
        j0(8);
        d0(j13);
    }

    @Override // com.google.protobuf.u
    public final void R(int i13, int i14) {
        j0(20);
        e0(i13, 0);
        if (i14 >= 0) {
            f0(i14);
        } else {
            g0(i14);
        }
    }

    @Override // com.google.protobuf.u
    public final void S(int i13) {
        if (i13 >= 0) {
            Z(i13);
        } else {
            b0(i13);
        }
    }

    @Override // com.google.protobuf.u
    public final void T(int i13, o1 o1Var, d2 d2Var) {
        X(i13, 2);
        Z(((b) o1Var).getSerializedSize(d2Var));
        d2Var.h(o1Var, this.f34002p);
    }

    @Override // com.google.protobuf.u
    public final void U(o1 o1Var) {
        Z(o1Var.getSerializedSize());
        o1Var.writeTo(this);
    }

    @Override // com.google.protobuf.u
    public final void V(int i13, String str) {
        X(i13, 2);
        W(str);
    }

    @Override // com.google.protobuf.u
    public final void W(String str) {
        try {
            int length = str.length() * 3;
            int D = u.D(length);
            int i13 = D + length;
            int i14 = this.f33993t;
            if (i13 > i14) {
                byte[] bArr = new byte[length];
                int K0 = t2.f33999a.K0(str, bArr, 0, length);
                Z(K0);
                k0(bArr, 0, K0);
                return;
            }
            if (i13 > i14 - this.f33994u) {
                h0();
            }
            int D2 = u.D(str.length());
            int i15 = this.f33994u;
            byte[] bArr2 = this.f33992s;
            try {
                try {
                    if (D2 == D) {
                        int i16 = i15 + D2;
                        this.f33994u = i16;
                        int K02 = t2.f33999a.K0(str, bArr2, i16, i14 - i16);
                        this.f33994u = i15;
                        f0((K02 - i15) - D2);
                        this.f33994u = K02;
                    } else {
                        int b13 = t2.b(str);
                        f0(b13);
                        this.f33994u = t2.f33999a.K0(str, bArr2, this.f33994u, b13);
                    }
                } catch (ArrayIndexOutOfBoundsException e13) {
                    throw new CodedOutputStream$OutOfSpaceException(e13);
                }
            } catch (s2 e14) {
                this.f33994u = i15;
                throw e14;
            }
        } catch (s2 e15) {
            G(str, e15);
        }
    }

    @Override // com.google.protobuf.u
    public final void X(int i13, int i14) {
        Z((i13 << 3) | i14);
    }

    @Override // com.google.protobuf.u
    public final void Y(int i13, int i14) {
        j0(20);
        e0(i13, 0);
        f0(i14);
    }

    @Override // com.google.protobuf.u
    public final void Z(int i13) {
        j0(5);
        f0(i13);
    }

    @Override // com.google.protobuf.u
    public final void a0(int i13, long j13) {
        j0(20);
        e0(i13, 0);
        g0(j13);
    }

    @Override // com.google.protobuf.u
    public final void b0(long j13) {
        j0(10);
        g0(j13);
    }

    public final void c0(int i13) {
        int i14 = this.f33994u;
        byte[] bArr = this.f33992s;
        bArr[i14] = (byte) (i13 & 255);
        bArr[i14 + 1] = (byte) ((i13 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((i13 >> 16) & 255);
        this.f33994u = i14 + 4;
        bArr[i14 + 3] = (byte) ((i13 >> 24) & 255);
    }

    public final void d0(long j13) {
        int i13 = this.f33994u;
        byte[] bArr = this.f33992s;
        bArr[i13] = (byte) (j13 & 255);
        bArr[i13 + 1] = (byte) ((j13 >> 8) & 255);
        bArr[i13 + 2] = (byte) ((j13 >> 16) & 255);
        bArr[i13 + 3] = (byte) (255 & (j13 >> 24));
        bArr[i13 + 4] = (byte) (((int) (j13 >> 32)) & 255);
        bArr[i13 + 5] = (byte) (((int) (j13 >> 40)) & 255);
        bArr[i13 + 6] = (byte) (((int) (j13 >> 48)) & 255);
        this.f33994u = i13 + 8;
        bArr[i13 + 7] = (byte) (((int) (j13 >> 56)) & 255);
    }

    public final void e0(int i13, int i14) {
        f0((i13 << 3) | i14);
    }

    public final void f0(int i13) {
        boolean z13 = u.f34001r;
        byte[] bArr = this.f33992s;
        if (z13) {
            while ((i13 & (-128)) != 0) {
                int i14 = this.f33994u;
                this.f33994u = i14 + 1;
                q2.o(bArr, i14, (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                i13 >>>= 7;
            }
            int i15 = this.f33994u;
            this.f33994u = i15 + 1;
            q2.o(bArr, i15, (byte) i13);
            return;
        }
        while ((i13 & (-128)) != 0) {
            int i16 = this.f33994u;
            this.f33994u = i16 + 1;
            bArr[i16] = (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            i13 >>>= 7;
        }
        int i17 = this.f33994u;
        this.f33994u = i17 + 1;
        bArr[i17] = (byte) i13;
    }

    public final void g0(long j13) {
        boolean z13 = u.f34001r;
        byte[] bArr = this.f33992s;
        if (z13) {
            while ((j13 & (-128)) != 0) {
                int i13 = this.f33994u;
                this.f33994u = i13 + 1;
                q2.o(bArr, i13, (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                j13 >>>= 7;
            }
            int i14 = this.f33994u;
            this.f33994u = i14 + 1;
            q2.o(bArr, i14, (byte) j13);
            return;
        }
        while ((j13 & (-128)) != 0) {
            int i15 = this.f33994u;
            this.f33994u = i15 + 1;
            bArr[i15] = (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            j13 >>>= 7;
        }
        int i16 = this.f33994u;
        this.f33994u = i16 + 1;
        bArr[i16] = (byte) j13;
    }

    public final void h0() {
        this.f33995v.write(this.f33992s, 0, this.f33994u);
        this.f33994u = 0;
    }

    @Override // me.o
    public final void i(byte[] bArr, int i13, int i14) {
        k0(bArr, i13, i14);
    }

    public final void i0() {
        if (this.f33994u > 0) {
            h0();
        }
    }

    public final void j0(int i13) {
        if (this.f33993t - this.f33994u < i13) {
            h0();
        }
    }

    public final void k0(byte[] bArr, int i13, int i14) {
        int i15 = this.f33994u;
        int i16 = this.f33993t;
        int i17 = i16 - i15;
        byte[] bArr2 = this.f33992s;
        if (i17 >= i14) {
            System.arraycopy(bArr, i13, bArr2, i15, i14);
            this.f33994u += i14;
            return;
        }
        System.arraycopy(bArr, i13, bArr2, i15, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f33994u = i16;
        h0();
        if (i19 > i16) {
            this.f33995v.write(bArr, i18, i19);
        } else {
            System.arraycopy(bArr, i18, bArr2, 0, i19);
            this.f33994u = i19;
        }
    }
}
