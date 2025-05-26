package com.google.crypto.tink.shaded.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class q extends r {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f33679e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33680f;

    /* renamed from: g, reason: collision with root package name */
    public int f33681g;

    /* renamed from: h, reason: collision with root package name */
    public final OutputStream f33682h;

    public q(OutputStream outputStream, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i13, 20);
        this.f33679e = new byte[max];
        this.f33680f = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f33682h = outputStream;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void A0(int i13, b bVar, q1 q1Var) {
        C0(i13, 2);
        E0(bVar.a(q1Var));
        q1Var.j(bVar, this.f33685b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void B0(int i13, String str) {
        C0(i13, 2);
        R0(str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void C0(int i13, int i14) {
        E0((i13 << 3) | i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void D0(int i13, int i14) {
        O0(20);
        J0(i13, 0);
        K0(i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void E0(int i13) {
        O0(5);
        K0(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void F0(int i13, long j13) {
        O0(20);
        J0(i13, 0);
        L0(j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void G0(long j13) {
        O0(10);
        L0(j13);
    }

    public final void H0(int i13) {
        int i14 = this.f33681g;
        byte[] bArr = this.f33679e;
        bArr[i14] = (byte) (i13 & 255);
        bArr[i14 + 1] = (byte) ((i13 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((i13 >> 16) & 255);
        this.f33681g = i14 + 4;
        bArr[i14 + 3] = (byte) ((i13 >> 24) & 255);
    }

    public final void I0(long j13) {
        int i13 = this.f33681g;
        byte[] bArr = this.f33679e;
        bArr[i13] = (byte) (j13 & 255);
        bArr[i13 + 1] = (byte) ((j13 >> 8) & 255);
        bArr[i13 + 2] = (byte) ((j13 >> 16) & 255);
        bArr[i13 + 3] = (byte) (255 & (j13 >> 24));
        bArr[i13 + 4] = (byte) (((int) (j13 >> 32)) & 255);
        bArr[i13 + 5] = (byte) (((int) (j13 >> 40)) & 255);
        bArr[i13 + 6] = (byte) (((int) (j13 >> 48)) & 255);
        this.f33681g = i13 + 8;
        bArr[i13 + 7] = (byte) (((int) (j13 >> 56)) & 255);
    }

    public final void J0(int i13, int i14) {
        K0((i13 << 3) | i14);
    }

    public final void K0(int i13) {
        boolean z13 = r.f33684d;
        byte[] bArr = this.f33679e;
        if (z13) {
            while ((i13 & (-128)) != 0) {
                int i14 = this.f33681g;
                this.f33681g = i14 + 1;
                d2.l(bArr, i14, (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                i13 >>>= 7;
            }
            int i15 = this.f33681g;
            this.f33681g = i15 + 1;
            d2.l(bArr, i15, (byte) i13);
            return;
        }
        while ((i13 & (-128)) != 0) {
            int i16 = this.f33681g;
            this.f33681g = i16 + 1;
            bArr[i16] = (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            i13 >>>= 7;
        }
        int i17 = this.f33681g;
        this.f33681g = i17 + 1;
        bArr[i17] = (byte) i13;
    }

    public final void L0(long j13) {
        boolean z13 = r.f33684d;
        byte[] bArr = this.f33679e;
        if (z13) {
            while ((j13 & (-128)) != 0) {
                int i13 = this.f33681g;
                this.f33681g = i13 + 1;
                d2.l(bArr, i13, (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                j13 >>>= 7;
            }
            int i14 = this.f33681g;
            this.f33681g = i14 + 1;
            d2.l(bArr, i14, (byte) j13);
            return;
        }
        while ((j13 & (-128)) != 0) {
            int i15 = this.f33681g;
            this.f33681g = i15 + 1;
            bArr[i15] = (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            j13 >>>= 7;
        }
        int i16 = this.f33681g;
        this.f33681g = i16 + 1;
        bArr[i16] = (byte) j13;
    }

    public final void M0() {
        this.f33682h.write(this.f33679e, 0, this.f33681g);
        this.f33681g = 0;
    }

    public final void N0() {
        if (this.f33681g > 0) {
            M0();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public final void O(byte[] bArr, int i13, int i14) {
        P0(bArr, i13, i14);
    }

    public final void O0(int i13) {
        if (this.f33680f - this.f33681g < i13) {
            M0();
        }
    }

    public final void P0(byte[] bArr, int i13, int i14) {
        int i15 = this.f33681g;
        int i16 = this.f33680f;
        int i17 = i16 - i15;
        byte[] bArr2 = this.f33679e;
        if (i17 >= i14) {
            System.arraycopy(bArr, i13, bArr2, i15, i14);
            this.f33681g += i14;
            return;
        }
        System.arraycopy(bArr, i13, bArr2, i15, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f33681g = i16;
        M0();
        if (i19 > i16) {
            this.f33682h.write(bArr, i18, i19);
        } else {
            System.arraycopy(bArr, i18, bArr2, 0, i19);
            this.f33681g = i19;
        }
    }

    public final void Q0(k kVar) {
        E0(kVar.size());
        j jVar = (j) kVar;
        O(jVar.f33635d, jVar.j(), jVar.size());
    }

    public final void R0(String str) {
        try {
            int length = str.length() * 3;
            int l03 = r.l0(length);
            int i13 = l03 + length;
            int i14 = this.f33680f;
            if (i13 > i14) {
                byte[] bArr = new byte[length];
                int Q = g2.f33630a.Q(str, bArr, 0, length);
                E0(Q);
                P0(bArr, 0, Q);
                return;
            }
            if (i13 > i14 - this.f33681g) {
                M0();
            }
            int l04 = r.l0(str.length());
            int i15 = this.f33681g;
            byte[] bArr2 = this.f33679e;
            try {
                try {
                    if (l04 == l03) {
                        int i16 = i15 + l04;
                        this.f33681g = i16;
                        int Q2 = g2.f33630a.Q(str, bArr2, i16, i14 - i16);
                        this.f33681g = i15;
                        K0((Q2 - i15) - l04);
                        this.f33681g = Q2;
                    } else {
                        int c13 = g2.c(str);
                        K0(c13);
                        this.f33681g = g2.f33630a.Q(str, bArr2, this.f33681g, c13);
                    }
                } catch (f2 e13) {
                    this.f33681g = i15;
                    throw e13;
                }
            } catch (ArrayIndexOutOfBoundsException e14) {
                throw new CodedOutputStream$OutOfSpaceException(e14);
            }
        } catch (f2 e15) {
            o0(str, e15);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final int q0() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void r0(byte b13) {
        if (this.f33681g == this.f33680f) {
            M0();
        }
        int i13 = this.f33681g;
        this.f33681g = i13 + 1;
        this.f33679e[i13] = b13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void s0(int i13, boolean z13) {
        O0(11);
        J0(i13, 0);
        byte b13 = z13 ? (byte) 1 : (byte) 0;
        int i14 = this.f33681g;
        this.f33681g = i14 + 1;
        this.f33679e[i14] = b13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void t0(int i13, k kVar) {
        C0(i13, 2);
        Q0(kVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void u0(int i13, int i14) {
        O0(14);
        J0(i13, 5);
        H0(i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void v0(int i13) {
        O0(4);
        H0(i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void w0(int i13, long j13) {
        O0(18);
        J0(i13, 1);
        I0(j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void x0(long j13) {
        O0(8);
        I0(j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void y0(int i13, int i14) {
        O0(20);
        J0(i13, 0);
        if (i14 >= 0) {
            K0(i14);
        } else {
            L0(i14);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void z0(int i13) {
        if (i13 >= 0) {
            E0(i13);
        } else {
            G0(i13);
        }
    }
}
