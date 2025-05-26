package com.google.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class s extends u {

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f33973s;

    /* renamed from: t, reason: collision with root package name */
    public final int f33974t;

    /* renamed from: u, reason: collision with root package name */
    public int f33975u;

    public s(byte[] bArr, int i13) {
        if (((bArr.length - i13) | i13) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i13)));
        }
        this.f33973s = bArr;
        this.f33975u = 0;
        this.f33974t = i13;
    }

    @Override // com.google.protobuf.u
    public final int H() {
        return this.f33974t - this.f33975u;
    }

    @Override // com.google.protobuf.u
    public final void I(byte b13) {
        try {
            byte[] bArr = this.f33973s;
            int i13 = this.f33975u;
            this.f33975u = i13 + 1;
            bArr[i13] = b13;
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33975u), Integer.valueOf(this.f33974t), 1), e13);
        }
    }

    @Override // com.google.protobuf.u
    public final void J(int i13, boolean z13) {
        X(i13, 0);
        I(z13 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.u
    public final void K(byte[] bArr, int i13) {
        Z(i13);
        c0(bArr, 0, i13);
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
        X(i13, 5);
        O(i14);
    }

    @Override // com.google.protobuf.u
    public final void O(int i13) {
        try {
            byte[] bArr = this.f33973s;
            int i14 = this.f33975u;
            bArr[i14] = (byte) (i13 & 255);
            bArr[i14 + 1] = (byte) ((i13 >> 8) & 255);
            bArr[i14 + 2] = (byte) ((i13 >> 16) & 255);
            this.f33975u = i14 + 4;
            bArr[i14 + 3] = (byte) ((i13 >> 24) & 255);
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33975u), Integer.valueOf(this.f33974t), 1), e13);
        }
    }

    @Override // com.google.protobuf.u
    public final void P(int i13, long j13) {
        X(i13, 1);
        Q(j13);
    }

    @Override // com.google.protobuf.u
    public final void Q(long j13) {
        try {
            byte[] bArr = this.f33973s;
            int i13 = this.f33975u;
            bArr[i13] = (byte) (((int) j13) & 255);
            bArr[i13 + 1] = (byte) (((int) (j13 >> 8)) & 255);
            bArr[i13 + 2] = (byte) (((int) (j13 >> 16)) & 255);
            bArr[i13 + 3] = (byte) (((int) (j13 >> 24)) & 255);
            bArr[i13 + 4] = (byte) (((int) (j13 >> 32)) & 255);
            bArr[i13 + 5] = (byte) (((int) (j13 >> 40)) & 255);
            bArr[i13 + 6] = (byte) (((int) (j13 >> 48)) & 255);
            this.f33975u = i13 + 8;
            bArr[i13 + 7] = (byte) (((int) (j13 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33975u), Integer.valueOf(this.f33974t), 1), e13);
        }
    }

    @Override // com.google.protobuf.u
    public final void R(int i13, int i14) {
        X(i13, 0);
        S(i14);
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
        int i13 = this.f33975u;
        try {
            int D = u.D(str.length() * 3);
            int D2 = u.D(str.length());
            byte[] bArr = this.f33973s;
            if (D2 == D) {
                int i14 = i13 + D2;
                this.f33975u = i14;
                int K0 = t2.f33999a.K0(str, bArr, i14, H());
                this.f33975u = i13;
                Z((K0 - i13) - D2);
                this.f33975u = K0;
            } else {
                Z(t2.b(str));
                this.f33975u = t2.f33999a.K0(str, bArr, this.f33975u, H());
            }
        } catch (s2 e13) {
            this.f33975u = i13;
            G(str, e13);
        } catch (IndexOutOfBoundsException e14) {
            throw new CodedOutputStream$OutOfSpaceException(e14);
        }
    }

    @Override // com.google.protobuf.u
    public final void X(int i13, int i14) {
        Z((i13 << 3) | i14);
    }

    @Override // com.google.protobuf.u
    public final void Y(int i13, int i14) {
        X(i13, 0);
        Z(i14);
    }

    @Override // com.google.protobuf.u
    public final void Z(int i13) {
        while (true) {
            int i14 = i13 & (-128);
            byte[] bArr = this.f33973s;
            if (i14 == 0) {
                int i15 = this.f33975u;
                this.f33975u = i15 + 1;
                bArr[i15] = (byte) i13;
                return;
            } else {
                try {
                    int i16 = this.f33975u;
                    this.f33975u = i16 + 1;
                    bArr[i16] = (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e13) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33975u), Integer.valueOf(this.f33974t), 1), e13);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33975u), Integer.valueOf(this.f33974t), 1), e13);
        }
    }

    @Override // com.google.protobuf.u
    public final void a0(int i13, long j13) {
        X(i13, 0);
        b0(j13);
    }

    @Override // com.google.protobuf.u
    public final void b0(long j13) {
        boolean z13 = u.f34001r;
        byte[] bArr = this.f33973s;
        if (z13 && H() >= 10) {
            while ((j13 & (-128)) != 0) {
                int i13 = this.f33975u;
                this.f33975u = i13 + 1;
                q2.o(bArr, i13, (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                j13 >>>= 7;
            }
            int i14 = this.f33975u;
            this.f33975u = i14 + 1;
            q2.o(bArr, i14, (byte) j13);
            return;
        }
        while ((j13 & (-128)) != 0) {
            try {
                int i15 = this.f33975u;
                this.f33975u = i15 + 1;
                bArr[i15] = (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                j13 >>>= 7;
            } catch (IndexOutOfBoundsException e13) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33975u), Integer.valueOf(this.f33974t), 1), e13);
            }
        }
        int i16 = this.f33975u;
        this.f33975u = i16 + 1;
        bArr[i16] = (byte) j13;
    }

    public final void c0(byte[] bArr, int i13, int i14) {
        try {
            System.arraycopy(bArr, i13, this.f33973s, this.f33975u, i14);
            this.f33975u += i14;
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f33975u), Integer.valueOf(this.f33974t), Integer.valueOf(i14)), e13);
        }
    }

    @Override // me.o
    public final void i(byte[] bArr, int i13, int i14) {
        c0(bArr, i13, i14);
    }
}
