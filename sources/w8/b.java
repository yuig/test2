package w8;

import d7.d0;
import q8.r;
import q8.s;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f128219a = new d0(4);

    /* renamed from: b, reason: collision with root package name */
    public final d0 f128220b = new d0(9);

    /* renamed from: c, reason: collision with root package name */
    public final d0 f128221c = new d0(11);

    /* renamed from: d, reason: collision with root package name */
    public final d0 f128222d = new d0();

    /* renamed from: e, reason: collision with root package name */
    public final c f128223e;

    /* renamed from: f, reason: collision with root package name */
    public u f128224f;

    /* renamed from: g, reason: collision with root package name */
    public int f128225g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f128226h;

    /* renamed from: i, reason: collision with root package name */
    public long f128227i;

    /* renamed from: j, reason: collision with root package name */
    public int f128228j;

    /* renamed from: k, reason: collision with root package name */
    public int f128229k;

    /* renamed from: l, reason: collision with root package name */
    public int f128230l;

    /* renamed from: m, reason: collision with root package name */
    public long f128231m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f128232n;

    /* renamed from: o, reason: collision with root package name */
    public a f128233o;

    /* renamed from: p, reason: collision with root package name */
    public d f128234p;

    public b() {
        c cVar = new c(new r());
        cVar.f128235b = -9223372036854775807L;
        cVar.f128236c = new long[0];
        cVar.f128237d = new long[0];
        this.f128223e = cVar;
        this.f128225g = 1;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        if (j13 == 0) {
            this.f128225g = 1;
            this.f128226h = false;
        } else {
            this.f128225g = 3;
        }
        this.f128228j = 0;
    }

    public final d0 c(t tVar) {
        int i13 = this.f128230l;
        d0 d0Var = this.f128222d;
        byte[] bArr = d0Var.f53806a;
        if (i13 > bArr.length) {
            d0Var.I(0, new byte[Math.max(bArr.length * 2, i13)]);
        } else {
            d0Var.K(0);
        }
        d0Var.J(this.f128230l);
        tVar.readFully(d0Var.f53806a, 0, this.f128230l);
        return d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r17, q8.c0 r18) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.b.d(q8.t, q8.c0):int");
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f128224f = uVar;
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        d0 d0Var = this.f128219a;
        tVar.s(d0Var.f53806a, 0, 3);
        d0Var.K(0);
        if (d0Var.B() != 4607062) {
            return false;
        }
        tVar.s(d0Var.f53806a, 0, 2);
        d0Var.K(0);
        if ((d0Var.E() & 250) != 0) {
            return false;
        }
        tVar.s(d0Var.f53806a, 0, 4);
        d0Var.K(0);
        int k13 = d0Var.k();
        tVar.g();
        tVar.m(k13);
        tVar.s(d0Var.f53806a, 0, 4);
        d0Var.K(0);
        return d0Var.k() == 0;
    }
}
