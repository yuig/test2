package androidx.datastore.preferences.protobuf;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f18118f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18119g;

    /* renamed from: h, reason: collision with root package name */
    public int f18120h;

    /* renamed from: i, reason: collision with root package name */
    public final OutputStream f18121i;

    public p(a6.q qVar, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i13, 20);
        this.f18118f = new byte[max];
        this.f18119g = max;
        this.f18121i = qVar;
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void J(byte b13) {
        if (this.f18120h == this.f18119g) {
            s0();
        }
        int i13 = this.f18120h;
        this.f18120h = i13 + 1;
        this.f18118f[i13] = b13;
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void K(int i13, boolean z13) {
        t0(11);
        p0(i13, 0);
        byte b13 = z13 ? (byte) 1 : (byte) 0;
        int i14 = this.f18120h;
        this.f18120h = i14 + 1;
        this.f18118f[i14] = b13;
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void N(byte[] bArr, int i13) {
        k0(i13);
        u0(bArr, 0, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void O(int i13, i iVar) {
        i0(i13, 2);
        P(iVar);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void P(i iVar) {
        k0(iVar.size());
        j jVar = (j) iVar;
        f(jVar.f18079d, jVar.j(), jVar.size());
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void S(int i13, int i14) {
        t0(14);
        p0(i13, 5);
        n0(i14);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void T(int i13) {
        t0(4);
        n0(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void U(int i13, long j13) {
        t0(18);
        p0(i13, 1);
        o0(j13);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void V(long j13) {
        t0(8);
        o0(j13);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void X(int i13, int i14) {
        t0(20);
        p0(i13, 0);
        if (i14 >= 0) {
            q0(i14);
        } else {
            r0(i14);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void Y(int i13) {
        if (i13 >= 0) {
            k0(i13);
        } else {
            m0(i13);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void a0(int i13, b bVar, n1 n1Var) {
        i0(i13, 2);
        k0(bVar.b(n1Var));
        n1Var.i(bVar, this.f18131c);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void b0(b bVar) {
        k0(bVar.a());
        bVar.c(this);
    }

    @Override // androidx.datastore.preferences.protobuf.s1
    public final void f(byte[] bArr, int i13, int i14) {
        u0(bArr, i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void g0(int i13, String str) {
        i0(i13, 2);
        h0(str);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void h0(String str) {
        try {
            int length = str.length() * 3;
            int F = q.F(length);
            int i13 = F + length;
            int i14 = this.f18119g;
            if (i13 > i14) {
                byte[] bArr = new byte[length];
                int h10 = k2.f18088a.h(str, bArr, 0, length);
                k0(h10);
                u0(bArr, 0, h10);
                return;
            }
            if (i13 > i14 - this.f18120h) {
                s0();
            }
            int F2 = q.F(str.length());
            int i15 = this.f18120h;
            byte[] bArr2 = this.f18118f;
            try {
                try {
                    if (F2 == F) {
                        int i16 = i15 + F2;
                        this.f18120h = i16;
                        int h13 = k2.f18088a.h(str, bArr2, i16, i14 - i16);
                        this.f18120h = i15;
                        q0((h13 - i15) - F2);
                        this.f18120h = h13;
                    } else {
                        int b13 = k2.b(str);
                        q0(b13);
                        this.f18120h = k2.f18088a.h(str, bArr2, this.f18120h, b13);
                    }
                } catch (ArrayIndexOutOfBoundsException e13) {
                    throw new CodedOutputStream$OutOfSpaceException(e13);
                }
            } catch (j2 e14) {
                this.f18120h = i15;
                throw e14;
            }
        } catch (j2 e15) {
            I(str, e15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void i0(int i13, int i14) {
        k0((i13 << 3) | i14);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void j0(int i13, int i14) {
        t0(20);
        p0(i13, 0);
        q0(i14);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void k0(int i13) {
        t0(5);
        q0(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void l0(int i13, long j13) {
        t0(20);
        p0(i13, 0);
        r0(j13);
    }

    @Override // androidx.datastore.preferences.protobuf.q
    public final void m0(long j13) {
        t0(10);
        r0(j13);
    }

    public final void n0(int i13) {
        int i14 = this.f18120h;
        byte[] bArr = this.f18118f;
        bArr[i14] = (byte) (i13 & 255);
        bArr[i14 + 1] = (byte) ((i13 >> 8) & 255);
        bArr[i14 + 2] = (byte) ((i13 >> 16) & 255);
        this.f18120h = i14 + 4;
        bArr[i14 + 3] = (byte) ((i13 >> 24) & 255);
    }

    public final void o0(long j13) {
        int i13 = this.f18120h;
        byte[] bArr = this.f18118f;
        bArr[i13] = (byte) (j13 & 255);
        bArr[i13 + 1] = (byte) ((j13 >> 8) & 255);
        bArr[i13 + 2] = (byte) ((j13 >> 16) & 255);
        bArr[i13 + 3] = (byte) (255 & (j13 >> 24));
        bArr[i13 + 4] = (byte) (((int) (j13 >> 32)) & 255);
        bArr[i13 + 5] = (byte) (((int) (j13 >> 40)) & 255);
        bArr[i13 + 6] = (byte) (((int) (j13 >> 48)) & 255);
        this.f18120h = i13 + 8;
        bArr[i13 + 7] = (byte) (((int) (j13 >> 56)) & 255);
    }

    public final void p0(int i13, int i14) {
        q0((i13 << 3) | i14);
    }

    public final void q0(int i13) {
        boolean z13 = q.f18130e;
        byte[] bArr = this.f18118f;
        if (z13) {
            while ((i13 & (-128)) != 0) {
                int i14 = this.f18120h;
                this.f18120h = i14 + 1;
                h2.n(bArr, i14, (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                i13 >>>= 7;
            }
            int i15 = this.f18120h;
            this.f18120h = i15 + 1;
            h2.n(bArr, i15, (byte) i13);
            return;
        }
        while ((i13 & (-128)) != 0) {
            int i16 = this.f18120h;
            this.f18120h = i16 + 1;
            bArr[i16] = (byte) ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            i13 >>>= 7;
        }
        int i17 = this.f18120h;
        this.f18120h = i17 + 1;
        bArr[i17] = (byte) i13;
    }

    public final void r0(long j13) {
        boolean z13 = q.f18130e;
        byte[] bArr = this.f18118f;
        if (z13) {
            while ((j13 & (-128)) != 0) {
                int i13 = this.f18120h;
                this.f18120h = i13 + 1;
                h2.n(bArr, i13, (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                j13 >>>= 7;
            }
            int i14 = this.f18120h;
            this.f18120h = i14 + 1;
            h2.n(bArr, i14, (byte) j13);
            return;
        }
        while ((j13 & (-128)) != 0) {
            int i15 = this.f18120h;
            this.f18120h = i15 + 1;
            bArr[i15] = (byte) ((((int) j13) & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            j13 >>>= 7;
        }
        int i16 = this.f18120h;
        this.f18120h = i16 + 1;
        bArr[i16] = (byte) j13;
    }

    public final void s0() {
        this.f18121i.write(this.f18118f, 0, this.f18120h);
        this.f18120h = 0;
    }

    public final void t0(int i13) {
        if (this.f18119g - this.f18120h < i13) {
            s0();
        }
    }

    public final void u0(byte[] bArr, int i13, int i14) {
        int i15 = this.f18120h;
        int i16 = this.f18119g;
        int i17 = i16 - i15;
        byte[] bArr2 = this.f18118f;
        if (i17 >= i14) {
            System.arraycopy(bArr, i13, bArr2, i15, i14);
            this.f18120h += i14;
            return;
        }
        System.arraycopy(bArr, i13, bArr2, i15, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f18120h = i16;
        s0();
        if (i19 > i16) {
            this.f18121i.write(bArr, i18, i19);
        } else {
            System.arraycopy(bArr, i18, bArr2, 0, i19);
            this.f18120h = i19;
        }
    }
}
