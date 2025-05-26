package ads_mobile_sdk;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class no extends ko {

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f8887g;

    public no(OutputStream outputStream, int i13) {
        super(i13);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f8887g = outputStream;
    }

    public final void a() {
        this.f8887g.write(this.f7417d, 0, this.f7419f);
        this.f7419f = 0;
    }

    @Override // ads_mobile_sdk.oo
    public final void b(int i13, a.xe xeVar, a.tb tbVar) {
        g(i13, 2);
        int a13 = ((g) xeVar).a(tbVar);
        p(5);
        o(a13);
        tbVar.a((Object) xeVar, this.f9381a);
    }

    @Override // ads_mobile_sdk.oo
    public final void c(long j13) {
        p(8);
        e(j13);
    }

    @Override // ads_mobile_sdk.oo
    public final void d(int i13, long j13) {
        p(18);
        i(i13, 1);
        e(j13);
    }

    @Override // ads_mobile_sdk.oo
    public final void e(int i13, int i14) {
        p(14);
        i(i13, 5);
        n(i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void f(int i13, int i14) {
        p(20);
        i(i13, 0);
        if (i14 >= 0) {
            o(i14);
        } else {
            f(i14);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void g(int i13, int i14) {
        p(5);
        o((i13 << 3) | i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void h(int i13, int i14) {
        p(20);
        i(i13, 0);
        o(i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void k(int i13) {
        p(4);
        n(i13);
    }

    @Override // ads_mobile_sdk.oo
    public final void l(int i13) {
        if (i13 >= 0) {
            p(5);
            o(i13);
        } else {
            p(10);
            f(i13);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void m(int i13) {
        p(5);
        o(i13);
    }

    public final void p(int i13) {
        if (this.f7418e - this.f7419f < i13) {
            a();
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void a(byte b13) {
        if (this.f7419f == this.f7418e) {
            a();
        }
        int i13 = this.f7419f;
        this.f7417d[i13] = b13;
        this.f7419f = i13 + 1;
    }

    @Override // ads_mobile_sdk.oo
    public final void d(long j13) {
        p(10);
        f(j13);
    }

    @Override // ads_mobile_sdk.oo
    public final void e(int i13, long j13) {
        p(20);
        i(i13, 0);
        f(j13);
    }

    public final void b(byte[] bArr, int i13, int i14) {
        int i15 = this.f7418e;
        int i16 = this.f7419f;
        int i17 = i15 - i16;
        if (i17 >= i14) {
            System.arraycopy(bArr, i13, this.f7417d, i16, i14);
            this.f7419f += i14;
            return;
        }
        System.arraycopy(bArr, i13, this.f7417d, i16, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f7419f = this.f7418e;
        a();
        if (i19 <= this.f7418e) {
            System.arraycopy(bArr, i18, this.f7417d, 0, i19);
            this.f7419f = i19;
        } else {
            this.f8887g.write(bArr, i18, i19);
        }
    }

    @Override // ads_mobile_sdk.oo
    public final void a(int i13, boolean z13) {
        p(11);
        i(i13, 0);
        byte b13 = z13 ? (byte) 1 : (byte) 0;
        int i14 = this.f7419f;
        this.f7417d[i14] = b13;
        this.f7419f = i14 + 1;
    }

    @Override // ads_mobile_sdk.oo
    public final void a(byte[] bArr, int i13) {
        p(5);
        o(i13);
        b(bArr, 0, i13);
    }

    @Override // a.lg
    public final void a(byte[] bArr, int i13, int i14) {
        b(bArr, i13, i14);
    }

    @Override // ads_mobile_sdk.oo
    public final void a(a.xe xeVar) {
        sj0 sj0Var = (sj0) xeVar;
        int a13 = sj0Var.a((a.tb) null);
        p(5);
        o(a13);
        sj0Var.a(this);
    }

    @Override // ads_mobile_sdk.oo
    public final void b(int i13, il ilVar) {
        g(i13, 2);
        b(ilVar);
    }

    @Override // ads_mobile_sdk.oo
    public final void b(il ilVar) {
        int size = ilVar.size();
        p(5);
        o(size);
        ilVar.a(this);
    }

    @Override // ads_mobile_sdk.oo
    public final void b(String str, int i13) {
        g(i13, 2);
        b(str);
    }

    @Override // ads_mobile_sdk.oo
    public final void b(String str) {
        try {
            int length = str.length() * 3;
            int i13 = oo.i(length);
            int i14 = i13 + length;
            int i15 = this.f7418e;
            if (i14 > i15) {
                byte[] bArr = new byte[length];
                int a13 = rx2.f10845a.a(str, bArr, 0, length);
                p(5);
                o(a13);
                b(bArr, 0, a13);
                return;
            }
            if (i14 > i15 - this.f7419f) {
                a();
            }
            int i16 = oo.i(str.length());
            int i17 = this.f7419f;
            try {
                if (i16 == i13) {
                    int i18 = i17 + i16;
                    this.f7419f = i18;
                    int a14 = rx2.f10845a.a(str, this.f7417d, i18, this.f7418e - i18);
                    this.f7419f = i17;
                    o((a14 - i17) - i16);
                    this.f7419f = a14;
                } else {
                    int a15 = rx2.a(str);
                    o(a15);
                    this.f7419f = rx2.f10845a.a(str, this.f7417d, this.f7419f, a15);
                }
            } catch (px2 e13) {
                this.f7419f = i17;
                throw e13;
            } catch (ArrayIndexOutOfBoundsException e14) {
                throw new mo(e14);
            }
        } catch (px2 e15) {
            a(str, e15);
        }
    }
}
