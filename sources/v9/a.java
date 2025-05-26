package v9;

/* loaded from: classes3.dex */
public final class a implements q8.s {

    /* renamed from: a, reason: collision with root package name */
    public final b f124484a = new b("audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f124485b = new d7.d0(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f124486c;

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.f124486c = false;
        this.f124484a.f();
    }

    @Override // q8.s
    public final int d(q8.t tVar, q8.c0 c0Var) {
        d7.d0 d0Var = this.f124485b;
        int read = tVar.read(d0Var.f53806a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        d0Var.K(0);
        d0Var.J(read);
        boolean z13 = this.f124486c;
        b bVar = this.f124484a;
        if (!z13) {
            bVar.f124511n = 0L;
            this.f124486c = true;
        }
        bVar.e(d0Var);
        return 0;
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        this.f124484a.g(uVar, new h0(0, 1));
        uVar.A();
        uVar.j(new q8.w(-9223372036854775807L));
    }

    @Override // q8.s
    public final boolean i(q8.t tVar) {
        int d2;
        d7.d0 d0Var = new d7.d0(10);
        int i13 = 0;
        while (true) {
            tVar.s(d0Var.f53806a, 0, 10);
            d0Var.K(0);
            if (d0Var.B() != 4801587) {
                break;
            }
            d0Var.L(3);
            int x13 = d0Var.x();
            i13 += x13 + 10;
            tVar.m(x13);
        }
        tVar.g();
        tVar.m(i13);
        int i14 = 0;
        int i15 = i13;
        while (true) {
            tVar.s(d0Var.f53806a, 0, 6);
            d0Var.K(0);
            if (d0Var.E() != 2935) {
                tVar.g();
                i15++;
                if (i15 - i13 >= 8192) {
                    return false;
                }
                tVar.m(i15);
                i14 = 0;
            } else {
                i14++;
                if (i14 >= 4) {
                    return true;
                }
                byte[] bArr = d0Var.f53806a;
                if (bArr.length < 6) {
                    d2 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    d2 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b13 = bArr[4];
                    d2 = q8.b.d((b13 & 192) >> 6, b13 & 63);
                }
                if (d2 == -1) {
                    return false;
                }
                tVar.m(d2 - 6);
            }
        }
    }
}
