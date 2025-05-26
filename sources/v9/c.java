package v9;

/* loaded from: classes3.dex */
public final class c implements q8.s {

    /* renamed from: a, reason: collision with root package name */
    public final d f124512a = new d(null, 0, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f124513b = new d7.d0(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f124514c;

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.f124514c = false;
        this.f124512a.f();
    }

    @Override // q8.s
    public final int d(q8.t tVar, q8.c0 c0Var) {
        d7.d0 d0Var = this.f124513b;
        int read = tVar.read(d0Var.f53806a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        d0Var.K(0);
        d0Var.J(read);
        boolean z13 = this.f124514c;
        d dVar = this.f124512a;
        if (!z13) {
            dVar.f124534n = 0L;
            this.f124514c = true;
        }
        dVar.e(d0Var);
        return 0;
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        this.f124512a.g(uVar, new h0(0, 1));
        uVar.A();
        uVar.j(new q8.w(-9223372036854775807L));
    }

    @Override // q8.s
    public final boolean i(q8.t tVar) {
        int i13;
        d7.d0 d0Var = new d7.d0(10);
        int i14 = 0;
        while (true) {
            tVar.s(d0Var.f53806a, 0, 10);
            d0Var.K(0);
            if (d0Var.B() != 4801587) {
                break;
            }
            d0Var.L(3);
            int x13 = d0Var.x();
            i14 += x13 + 10;
            tVar.m(x13);
        }
        tVar.g();
        tVar.m(i14);
        int i15 = 0;
        int i16 = i14;
        while (true) {
            int i17 = 7;
            tVar.s(d0Var.f53806a, 0, 7);
            d0Var.K(0);
            int E = d0Var.E();
            if (E == 44096 || E == 44097) {
                i15++;
                if (i15 >= 4) {
                    return true;
                }
                byte[] bArr = d0Var.f53806a;
                if (bArr.length < 7) {
                    i13 = -1;
                } else {
                    int i18 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i18 == 65535) {
                        i18 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i17 = 4;
                    }
                    if (E == 44097) {
                        i17 += 2;
                    }
                    i13 = i18 + i17;
                }
                if (i13 == -1) {
                    return false;
                }
                tVar.m(i13 - 7);
            } else {
                tVar.g();
                i16++;
                if (i16 - i14 >= 8192) {
                    return false;
                }
                tVar.m(i16);
                i15 = 0;
            }
        }
    }
}
