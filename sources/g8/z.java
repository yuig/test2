package g8;

/* loaded from: classes.dex */
public final class z extends n1 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f64482l;

    /* renamed from: m, reason: collision with root package name */
    public final a7.a1 f64483m;

    /* renamed from: n, reason: collision with root package name */
    public final a7.z0 f64484n;

    /* renamed from: o, reason: collision with root package name */
    public x f64485o;

    /* renamed from: p, reason: collision with root package name */
    public w f64486p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f64487q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f64488r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f64489s;

    public z(a aVar, boolean z13) {
        super(aVar);
        this.f64482l = z13 && aVar.k();
        this.f64483m = new a7.a1();
        this.f64484n = new a7.z0();
        a7.b1 i13 = aVar.i();
        if (i13 == null) {
            this.f64485o = new x(new y(aVar.j()), a7.a1.f927q, x.f64469e);
        } else {
            this.f64485o = new x(i13, null, null);
            this.f64489s = true;
        }
    }

    @Override // g8.n1
    public final e0 C(e0 e0Var) {
        Object obj = e0Var.f64233a;
        Object obj2 = this.f64485o.f64471d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = x.f64469e;
        }
        return e0Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ce  */
    @Override // g8.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(a7.b1 r15) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.z.D(a7.b1):void");
    }

    @Override // g8.n1
    public final void F() {
        if (this.f64482l) {
            return;
        }
        this.f64487q = true;
        E();
    }

    @Override // g8.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final w b(e0 e0Var, l8.m mVar, long j13) {
        w wVar = new w(e0Var, mVar, j13);
        bf.b.t(wVar.f64461d == null);
        wVar.f64461d = this.f64356k;
        if (this.f64488r) {
            Object obj = this.f64485o.f64471d;
            Object obj2 = e0Var.f64233a;
            if (obj != null && obj2.equals(x.f64469e)) {
                obj2 = this.f64485o.f64471d;
            }
            wVar.b(e0Var.a(obj2));
        } else {
            this.f64486p = wVar;
            if (!this.f64487q) {
                this.f64487q = true;
                E();
            }
        }
        return wVar;
    }

    public final boolean H(long j13) {
        w wVar = this.f64486p;
        int b13 = this.f64485o.b(wVar.f64458a.f64233a);
        if (b13 == -1) {
            return false;
        }
        x xVar = this.f64485o;
        a7.z0 z0Var = this.f64484n;
        xVar.g(b13, z0Var, false);
        long j14 = z0Var.f1254d;
        if (j14 != -9223372036854775807L && j13 >= j14) {
            j13 = Math.max(0L, j14 - 1);
        }
        wVar.f64464g = j13;
        return true;
    }

    @Override // g8.j, g8.a
    public final void l() {
    }

    @Override // g8.a
    public final void q(c0 c0Var) {
        ((w) c0Var).j();
        if (c0Var == this.f64486p) {
            this.f64486p = null;
        }
    }

    @Override // g8.j, g8.a
    public final void t() {
        this.f64488r = false;
        this.f64487q = false;
        super.t();
    }

    @Override // g8.n1, g8.a
    public final void w(a7.i0 i0Var) {
        if (this.f64489s) {
            x xVar = this.f64485o;
            this.f64485o = new x(new a8.a0(this.f64485o.f64402b, i0Var), xVar.f64470c, xVar.f64471d);
        } else {
            this.f64485o = new x(new y(i0Var), a7.a1.f927q, x.f64469e);
        }
        this.f64356k.w(i0Var);
    }
}
