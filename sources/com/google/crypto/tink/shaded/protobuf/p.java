package com.google.crypto.tink.shaded.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class p extends r {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f33675e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33676f;

    /* renamed from: g, reason: collision with root package name */
    public int f33677g;

    public p(byte[] bArr, int i13) {
        if (((bArr.length - i13) | i13) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i13)));
        }
        this.f33675e = bArr;
        this.f33677g = 0;
        this.f33676f = i13;
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
        J0(str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void C0(int i13, int i14) {
        E0((i13 << 3) | i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void D0(int i13, int i14) {
        C0(i13, 0);
        E0(i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void E0(int i13) {
        while (true) {
            int i14 = i13 & (-128);
            byte[] bArr = this.f33675e;
            if (i14 == 0) {
                int i15 = this.f33677g;
                this.f33677g = i15 + 1;
                bArr[i15] = (byte) i13;
                return;
            } else {
                try {
                    int i16 = this.f33677g;
                    this.f33677g = i16 + 1;
                    bArr[i16] = (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33677g), Integer.valueOf(this.f33676f), 1), e13);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33677g), Integer.valueOf(this.f33676f), 1), e13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void F0(int i13, long j13) {
        C0(i13, 0);
        G0(j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void G0(long j13) {
        boolean z13 = r.f33684d;
        byte[] bArr = this.f33675e;
        if (z13 && q0() >= 10) {
            while ((j13 & (-128)) != 0) {
                int i13 = this.f33677g;
                this.f33677g = i13 + 1;
                d2.l(bArr, i13, (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                j13 >>>= 7;
            }
            int i14 = this.f33677g;
            this.f33677g = i14 + 1;
            d2.l(bArr, i14, (byte) j13);
            return;
        }
        while ((j13 & (-128)) != 0) {
            try {
                int i15 = this.f33677g;
                this.f33677g = i15 + 1;
                bArr[i15] = (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                j13 >>>= 7;
            } catch (IndexOutOfBoundsException e13) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33677g), Integer.valueOf(this.f33676f), 1), e13);
            }
        }
        int i16 = this.f33677g;
        this.f33677g = i16 + 1;
        bArr[i16] = (byte) j13;
    }

    public final void H0(byte[] bArr, int i13, int i14) {
        try {
            System.arraycopy(bArr, i13, this.f33675e, this.f33677g, i14);
            this.f33677g += i14;
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33677g), Integer.valueOf(this.f33676f), Integer.valueOf(i14)), e13);
        }
    }

    public final void I0(k kVar) {
        E0(kVar.size());
        j jVar = (j) kVar;
        O(jVar.f33635d, jVar.j(), jVar.size());
    }

    public final void J0(String str) {
        int i13 = this.f33677g;
        try {
            int l03 = r.l0(str.length() * 3);
            int l04 = r.l0(str.length());
            byte[] bArr = this.f33675e;
            if (l04 == l03) {
                int i14 = i13 + l04;
                this.f33677g = i14;
                int Q = g2.f33630a.Q(str, bArr, i14, q0());
                this.f33677g = i13;
                E0((Q - i13) - l04);
                this.f33677g = Q;
            } else {
                E0(g2.c(str));
                this.f33677g = g2.f33630a.Q(str, bArr, this.f33677g, q0());
            }
        } catch (f2 e13) {
            this.f33677g = i13;
            o0(str, e13);
        } catch (IndexOutOfBoundsException e14) {
            throw new CodedOutputStream$OutOfSpaceException(e14);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public final void O(byte[] bArr, int i13, int i14) {
        H0(bArr, i13, i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final int q0() {
        return this.f33676f - this.f33677g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void r0(byte b13) {
        try {
            byte[] bArr = this.f33675e;
            int i13 = this.f33677g;
            this.f33677g = i13 + 1;
            bArr[i13] = b13;
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33677g), Integer.valueOf(this.f33676f), 1), e13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void s0(int i13, boolean z13) {
        C0(i13, 0);
        r0(z13 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void t0(int i13, k kVar) {
        C0(i13, 2);
        I0(kVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void u0(int i13, int i14) {
        C0(i13, 5);
        v0(i14);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void v0(int i13) {
        try {
            byte[] bArr = this.f33675e;
            int i14 = this.f33677g;
            bArr[i14] = (byte) (i13 & 255);
            bArr[i14 + 1] = (byte) ((i13 >> 8) & 255);
            bArr[i14 + 2] = (byte) ((i13 >> 16) & 255);
            this.f33677g = i14 + 4;
            bArr[i14 + 3] = (byte) ((i13 >> 24) & 255);
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33677g), Integer.valueOf(this.f33676f), 1), e13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void w0(int i13, long j13) {
        C0(i13, 1);
        x0(j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void x0(long j13) {
        try {
            byte[] bArr = this.f33675e;
            int i13 = this.f33677g;
            bArr[i13] = (byte) (((int) j13) & 255);
            bArr[i13 + 1] = (byte) (((int) (j13 >> 8)) & 255);
            bArr[i13 + 2] = (byte) (((int) (j13 >> 16)) & 255);
            bArr[i13 + 3] = (byte) (((int) (j13 >> 24)) & 255);
            bArr[i13 + 4] = (byte) (((int) (j13 >> 32)) & 255);
            bArr[i13 + 5] = (byte) (((int) (j13 >> 40)) & 255);
            bArr[i13 + 6] = (byte) (((int) (j13 >> 48)) & 255);
            this.f33677g = i13 + 8;
            bArr[i13 + 7] = (byte) (((int) (j13 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33677g), Integer.valueOf(this.f33676f), 1), e13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r
    public final void y0(int i13, int i14) {
        C0(i13, 0);
        z0(i14);
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
