package x8;

import d7.d0;
import j9.l;
import q8.s;
import q8.t;
import q8.u;
import q8.w;

/* loaded from: classes3.dex */
public final class a implements s {

    /* renamed from: b, reason: collision with root package name */
    public u f134138b;

    /* renamed from: c, reason: collision with root package name */
    public int f134139c;

    /* renamed from: d, reason: collision with root package name */
    public int f134140d;

    /* renamed from: e, reason: collision with root package name */
    public int f134141e;

    /* renamed from: g, reason: collision with root package name */
    public e9.a f134143g;

    /* renamed from: h, reason: collision with root package name */
    public t f134144h;

    /* renamed from: i, reason: collision with root package name */
    public c f134145i;

    /* renamed from: j, reason: collision with root package name */
    public l f134146j;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f134137a = new d0(6);

    /* renamed from: f, reason: collision with root package name */
    public long f134142f = -1;

    @Override // q8.s
    public final void a() {
        l lVar = this.f134146j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        if (j13 == 0) {
            this.f134139c = 0;
            this.f134146j = null;
        } else if (this.f134139c == 5) {
            l lVar = this.f134146j;
            lVar.getClass();
            lVar.b(j13, j14);
        }
    }

    public final void c() {
        u uVar = this.f134138b;
        uVar.getClass();
        uVar.A();
        this.f134138b.j(new w(-9223372036854775807L));
        this.f134139c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0184  */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r26, q8.c0 r27) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.a.d(q8.t, q8.c0):int");
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f134138b = uVar;
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        d0 d0Var = this.f134137a;
        d0Var.H(2);
        tVar.s(d0Var.f53806a, 0, 2);
        if (d0Var.E() != 65496) {
            return false;
        }
        d0Var.H(2);
        tVar.s(d0Var.f53806a, 0, 2);
        int E = d0Var.E();
        this.f134140d = E;
        if (E == 65504) {
            d0Var.H(2);
            tVar.s(d0Var.f53806a, 0, 2);
            tVar.m(d0Var.E() - 2);
            d0Var.H(2);
            tVar.s(d0Var.f53806a, 0, 2);
            this.f134140d = d0Var.E();
        }
        if (this.f134140d != 65505) {
            return false;
        }
        tVar.m(2);
        d0Var.H(6);
        tVar.s(d0Var.f53806a, 0, 6);
        return d0Var.A() == 1165519206 && d0Var.E() == 0;
    }
}
