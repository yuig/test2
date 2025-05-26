package s3;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f110967a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f110968b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f110970d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110971e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f110972f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110973g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f110974h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f110975i;

    /* renamed from: j, reason: collision with root package name */
    public int f110976j;

    /* renamed from: k, reason: collision with root package name */
    public int f110977k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f110978l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f110979m;

    /* renamed from: n, reason: collision with root package name */
    public int f110980n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f110981o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f110982p;

    /* renamed from: q, reason: collision with root package name */
    public int f110983q;

    /* renamed from: s, reason: collision with root package name */
    public q0 f110985s;

    /* renamed from: c, reason: collision with root package name */
    public g0 f110969c = g0.Idle;

    /* renamed from: r, reason: collision with root package name */
    public final t0 f110984r = new t0(this);

    /* renamed from: t, reason: collision with root package name */
    public long f110986t = bs1.c.b(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final androidx.activity.a0 f110987u = new androidx.activity.a0(this, 13);

    public v0(k0 k0Var) {
        this.f110967a = k0Var;
    }

    public final void a() {
        if (this.f110985s == null) {
            this.f110985s = new q0(this);
        }
    }

    public final q1 b() {
        return this.f110967a.f110837y.f110806c;
    }

    public final void c(int i13) {
        int i14 = this.f110980n;
        this.f110980n = i13;
        if ((i14 == 0) != (i13 == 0)) {
            k0 v13 = this.f110967a.v();
            v0 v0Var = v13 != null ? v13.f110838z : null;
            if (v0Var != null) {
                if (i13 == 0) {
                    v0Var.c(v0Var.f110980n - 1);
                } else {
                    v0Var.c(v0Var.f110980n + 1);
                }
            }
        }
    }

    public final void d(int i13) {
        int i14 = this.f110983q;
        this.f110983q = i13;
        if ((i14 == 0) != (i13 == 0)) {
            k0 v13 = this.f110967a.v();
            v0 v0Var = v13 != null ? v13.f110838z : null;
            if (v0Var != null) {
                if (i13 == 0) {
                    v0Var.d(v0Var.f110983q - 1);
                } else {
                    v0Var.d(v0Var.f110983q + 1);
                }
            }
        }
    }

    public final void e(boolean z13) {
        if (this.f110979m != z13) {
            this.f110979m = z13;
            if (z13 && !this.f110978l) {
                c(this.f110980n + 1);
            } else {
                if (z13 || this.f110978l) {
                    return;
                }
                c(this.f110980n - 1);
            }
        }
    }

    public final void f(boolean z13) {
        if (this.f110978l != z13) {
            this.f110978l = z13;
            if (z13 && !this.f110979m) {
                c(this.f110980n + 1);
            } else {
                if (z13 || this.f110979m) {
                    return;
                }
                c(this.f110980n - 1);
            }
        }
    }

    public final void g(boolean z13) {
        if (this.f110982p != z13) {
            this.f110982p = z13;
            if (z13 && !this.f110981o) {
                d(this.f110983q + 1);
            } else {
                if (z13 || this.f110981o) {
                    return;
                }
                d(this.f110983q - 1);
            }
        }
    }

    public final void h(boolean z13) {
        if (this.f110981o != z13) {
            this.f110981o = z13;
            if (z13 && !this.f110982p) {
                d(this.f110983q + 1);
            } else {
                if (z13 || this.f110982p) {
                    return;
                }
                d(this.f110983q - 1);
            }
        }
    }

    public final void i() {
        t0 t0Var = this.f110984r;
        Object obj = t0Var.f110947r;
        k0 k0Var = this.f110967a;
        v0 v0Var = t0Var.H;
        if ((obj != null || v0Var.b().a() != null) && t0Var.f110946q) {
            t0Var.f110946q = false;
            t0Var.f110947r = v0Var.b().a();
            k0 v13 = k0Var.v();
            if (v13 != null) {
                k0.Y(v13, false, 7);
            }
        }
        q0 q0Var = this.f110985s;
        if (q0Var == null || !q0Var.O0()) {
            return;
        }
        if (com.bumptech.glide.c.t0(k0Var)) {
            k0 v14 = k0Var.v();
            if (v14 != null) {
                k0.Y(v14, false, 7);
                return;
            }
            return;
        }
        k0 v15 = k0Var.v();
        if (v15 != null) {
            k0.V(v15, false, 7);
        }
    }
}
