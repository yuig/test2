package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class lo extends oo {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7902d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7903e;

    /* renamed from: f, reason: collision with root package name */
    public int f7904f;

    public lo(byte[] bArr, int i13) {
        if (((bArr.length - i13) | i13) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a.a.f("Array range is invalid. Buffer.length=", bArr.length, ", offset=0, length=", i13));
        }
        this.f7902d = bArr;
        this.f7904f = 0;
        this.f7903e = i13;
    }

    public final int a() {
        return this.f7903e - this.f7904f;
    }

    @Override // ads_mobile_sdk.oo
    public final void b(int i13, a.xe xeVar, a.tb tbVar) {
        g(i13, 2);
        m(((g) xeVar).a(tbVar));
        tbVar.a((Object) xeVar, this.f9381a);
    }

    @Override // ads_mobile_sdk.oo
    public final void c(long j13) {
        int i13 = this.f7904f;
        try {
            byte[] bArr = this.f7902d;
            bArr[i13] = (byte) j13;
            bArr[i13 + 1] = (byte) (j13 >> 8);
            bArr[i13 + 2] = (byte) (j13 >> 16);
            bArr[i13 + 3] = (byte) (j13 >> 24);
            bArr[i13 + 4] = (byte) (j13 >> 32);
            bArr[i13 + 5] = (byte) (j13 >> 40);
            bArr[i13 + 6] = (byte) (j13 >> 48);
            bArr[i13 + 7] = (byte) (j13 >> 56);
            this.f7904f = i13 + 8;
        } catch (IndexOutOfBoundsException e13) {
            throw new mo(i13, this.f7903e, 8, e13);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void d(int i13, long j13) {
        g(i13, 1);
        c(j13);
    }

    @Override // ads_mobile_sdk.oo
    public final void e(int i13, int i14) {
        g(i13, 5);
        k(i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void f(int i13, int i14) {
        g(i13, 0);
        l(i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void g(int i13, int i14) {
        m((i13 << 3) | i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void h(int i13, int i14) {
        g(i13, 0);
        m(i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void k(int i13) {
        int i14 = this.f7904f;
        try {
            byte[] bArr = this.f7902d;
            bArr[i14] = (byte) i13;
            bArr[i14 + 1] = (byte) (i13 >> 8);
            bArr[i14 + 2] = (byte) (i13 >> 16);
            bArr[i14 + 3] = (byte) (i13 >> 24);
            this.f7904f = i14 + 4;
        } catch (IndexOutOfBoundsException e13) {
            throw new mo(i14, this.f7903e, 4, e13);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void l(int i13) {
        if (i13 >= 0) {
            m(i13);
        } else {
            d(i13);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void m(int i13) {
        int i14;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i15 = this.f7904f;
        while ((i13 & (-128)) != 0) {
            try {
                i14 = i15 + 1;
            } catch (IndexOutOfBoundsException e13) {
                indexOutOfBoundsException = e13;
                throw new mo(i15, this.f7903e, 1, indexOutOfBoundsException);
            }
            try {
                this.f7902d[i15] = (byte) (i13 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                i13 >>>= 7;
                i15 = i14;
            } catch (IndexOutOfBoundsException e14) {
                indexOutOfBoundsException = e14;
                i15 = i14;
                throw new mo(i15, this.f7903e, 1, indexOutOfBoundsException);
            }
        }
        i14 = i15 + 1;
        this.f7902d[i15] = (byte) i13;
        this.f7904f = i14;
    }

    @Override // ads_mobile_sdk.oo
    public final void a(byte b13) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i13;
        int i14 = this.f7904f;
        try {
            i13 = i14 + 1;
        } catch (IndexOutOfBoundsException e13) {
            indexOutOfBoundsException = e13;
        }
        try {
            this.f7902d[i14] = b13;
            this.f7904f = i13;
        } catch (IndexOutOfBoundsException e14) {
            indexOutOfBoundsException = e14;
            i14 = i13;
            throw new mo(i14, this.f7903e, 1, indexOutOfBoundsException);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void d(long j13) {
        int i13;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i14;
        int i15 = this.f7904f;
        if (oo.f9380c && this.f7903e - i15 >= 10) {
            while ((j13 & (-128)) != 0) {
                mw2.f8408c.a((Object) this.f7902d, mw2.f8411f + i15, (byte) (((int) j13) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
                j13 >>>= 7;
                i15++;
            }
            i13 = i15 + 1;
            mw2.f8408c.a((Object) this.f7902d, mw2.f8411f + i15, (byte) j13);
        } else {
            while ((j13 & (-128)) != 0) {
                try {
                    i14 = i15 + 1;
                } catch (IndexOutOfBoundsException e13) {
                    e = e13;
                }
                try {
                    this.f7902d[i15] = (byte) (((int) j13) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    j13 >>>= 7;
                    i15 = i14;
                } catch (IndexOutOfBoundsException e14) {
                    e = e14;
                    i15 = i14;
                    indexOutOfBoundsException = e;
                    throw new mo(i15, this.f7903e, 1, indexOutOfBoundsException);
                }
            }
            i13 = i15 + 1;
            try {
                this.f7902d[i15] = (byte) j13;
            } catch (IndexOutOfBoundsException e15) {
                indexOutOfBoundsException = e15;
                i15 = i13;
                throw new mo(i15, this.f7903e, 1, indexOutOfBoundsException);
            }
        }
        this.f7904f = i13;
    }

    @Override // ads_mobile_sdk.oo
    public final void e(int i13, long j13) {
        g(i13, 0);
        d(j13);
    }

    @Override // ads_mobile_sdk.oo
    public final void b(int i13, il ilVar) {
        g(i13, 2);
        m(ilVar.size());
        ilVar.a(this);
    }

    @Override // ads_mobile_sdk.oo
    public final void a(int i13, boolean z13) {
        g(i13, 0);
        a(z13 ? (byte) 1 : (byte) 0);
    }

    @Override // ads_mobile_sdk.oo
    public final void b(il ilVar) {
        m(ilVar.size());
        ilVar.a(this);
    }

    @Override // ads_mobile_sdk.oo
    public final void a(byte[] bArr, int i13) {
        m(i13);
        try {
            System.arraycopy(bArr, 0, this.f7902d, this.f7904f, i13);
            this.f7904f += i13;
        } catch (IndexOutOfBoundsException e13) {
            throw new mo(this.f7904f, this.f7903e, i13, e13);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void b(String str, int i13) {
        g(i13, 2);
        b(str);
    }

    @Override // ads_mobile_sdk.oo
    public final void b(String str) {
        int i13 = this.f7904f;
        try {
            int i14 = oo.i(str.length() * 3);
            int i15 = oo.i(str.length());
            if (i15 == i14) {
                int i16 = i13 + i15;
                this.f7904f = i16;
                int a13 = rx2.f10845a.a(str, this.f7902d, i16, this.f7903e - i16);
                this.f7904f = i13;
                m((a13 - i13) - i15);
                this.f7904f = a13;
            } else {
                m(rx2.a(str));
                byte[] bArr = this.f7902d;
                int i17 = this.f7904f;
                this.f7904f = rx2.f10845a.a(str, bArr, i17, this.f7903e - i17);
            }
        } catch (px2 e13) {
            this.f7904f = i13;
            a(str, e13);
        } catch (IndexOutOfBoundsException e14) {
            throw new mo(e14);
        }
    }

    @Override // a.lg
    public final void a(byte[] bArr, int i13, int i14) {
        try {
            System.arraycopy(bArr, i13, this.f7902d, this.f7904f, i14);
            this.f7904f += i14;
        } catch (IndexOutOfBoundsException e13) {
            throw new mo(this.f7904f, this.f7903e, i14, e13);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void a(a.xe xeVar) {
        sj0 sj0Var = (sj0) xeVar;
        m(sj0Var.a((a.tb) null));
        sj0Var.a(this);
    }
}
