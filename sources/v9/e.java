package v9;

/* loaded from: classes3.dex */
public final class e implements q8.s {

    /* renamed from: d, reason: collision with root package name */
    public final d7.d0 f124547d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.c0 f124548e;

    /* renamed from: f, reason: collision with root package name */
    public q8.u f124549f;

    /* renamed from: g, reason: collision with root package name */
    public long f124550g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124553j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124554k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f124555l;

    /* renamed from: a, reason: collision with root package name */
    public final int f124544a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final f f124545b = new f(null, 0, "audio/mp4a-latm", true);

    /* renamed from: c, reason: collision with root package name */
    public final d7.d0 f124546c = new d7.d0(2048);

    /* renamed from: i, reason: collision with root package name */
    public int f124552i = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f124551h = -1;

    public e() {
        d7.d0 d0Var = new d7.d0(10);
        this.f124547d = d0Var;
        this.f124548e = new d7.c0(d0Var.f53806a, 0, 0);
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.f124554k = false;
        this.f124545b.f();
        this.f124550g = j14;
    }

    public final int c(q8.t tVar) {
        int i13 = 0;
        while (true) {
            d7.d0 d0Var = this.f124547d;
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
        if (this.f124551h == -1) {
            this.f124551h = i13;
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r19, q8.c0 r20) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.e.d(q8.t, q8.c0):int");
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        this.f124549f = uVar;
        this.f124545b.g(uVar, new h0(0, 1));
        uVar.A();
    }

    @Override // q8.s
    public final boolean i(q8.t tVar) {
        int c13 = c(tVar);
        int i13 = c13;
        int i14 = 0;
        int i15 = 0;
        do {
            d7.d0 d0Var = this.f124547d;
            tVar.s(d0Var.f53806a, 0, 2);
            d0Var.K(0);
            if ((d0Var.E() & 65526) == 65520) {
                i14++;
                if (i14 >= 4 && i15 > 188) {
                    return true;
                }
                tVar.s(d0Var.f53806a, 0, 4);
                d7.c0 c0Var = this.f124548e;
                c0Var.m(14);
                int g13 = c0Var.g(13);
                if (g13 <= 6) {
                    i13++;
                    tVar.g();
                    tVar.m(i13);
                } else {
                    tVar.m(g13 - 6);
                    i15 += g13;
                }
            } else {
                i13++;
                tVar.g();
                tVar.m(i13);
            }
            i14 = 0;
            i15 = 0;
        } while (i13 - c13 < 8192);
        return false;
    }
}
