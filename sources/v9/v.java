package v9;

import q8.k0;

/* loaded from: classes3.dex */
public final class v implements i {

    /* renamed from: e, reason: collision with root package name */
    public String f124804e;

    /* renamed from: f, reason: collision with root package name */
    public k0 f124805f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f124808i;

    /* renamed from: k, reason: collision with root package name */
    public int f124810k;

    /* renamed from: l, reason: collision with root package name */
    public int f124811l;

    /* renamed from: n, reason: collision with root package name */
    public int f124813n;

    /* renamed from: o, reason: collision with root package name */
    public int f124814o;

    /* renamed from: s, reason: collision with root package name */
    public int f124818s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f124820u;

    /* renamed from: d, reason: collision with root package name */
    public int f124803d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d7.d0 f124800a = new d7.d0(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final d7.c0 f124801b = new d7.c0();

    /* renamed from: c, reason: collision with root package name */
    public final d7.d0 f124802c = new d7.d0();

    /* renamed from: p, reason: collision with root package name */
    public final j9.a f124815p = new j9.a();

    /* renamed from: q, reason: collision with root package name */
    public int f124816q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f124817r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f124819t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124809j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f124812m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f124806g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f124807h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0458 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x040b  */
    @Override // v9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(d7.d0 r22) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.v.e(d7.d0):void");
    }

    @Override // v9.i
    public final void f() {
        this.f124803d = 0;
        this.f124811l = 0;
        this.f124800a.H(2);
        this.f124813n = 0;
        this.f124814o = 0;
        this.f124816q = -2147483647;
        this.f124817r = -1;
        this.f124818s = 0;
        this.f124819t = -1L;
        this.f124820u = false;
        this.f124808i = false;
        this.f124812m = true;
        this.f124809j = true;
        this.f124806g = -9.223372036854776E18d;
        this.f124807h = -9.223372036854776E18d;
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124804e = h0Var.f124635e;
        h0Var.b();
        this.f124805f = uVar.D(h0Var.f124634d, 1);
    }

    @Override // v9.i
    public final void h(boolean z13) {
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124810k = i13;
        if (!this.f124809j && (this.f124814o != 0 || !this.f124812m)) {
            this.f124808i = true;
        }
        if (j13 != -9223372036854775807L) {
            if (this.f124808i) {
                this.f124807h = j13;
            } else {
                this.f124806g = j13;
            }
        }
    }
}
