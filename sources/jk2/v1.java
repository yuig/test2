package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class v1 extends uj2.q {

    /* renamed from: a, reason: collision with root package name */
    public final qk2.a f76725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76726b;

    /* renamed from: c, reason: collision with root package name */
    public gk2.d2 f76727c;

    public v1(qk2.a aVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f76725a = aVar;
        this.f76726b = 1;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        gk2.d2 d2Var;
        boolean z13;
        synchronized (this) {
            try {
                d2Var = this.f76727c;
                z13 = true;
                if (d2Var == null) {
                    d2Var = new gk2.d2(this, 1);
                    this.f76727c = d2Var;
                }
                long j13 = d2Var.f65376b + 1;
                d2Var.f65376b = j13;
                if (d2Var.f65377c || j13 != this.f76726b) {
                    z13 = false;
                } else {
                    d2Var.f65377c = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f76725a.d(new u1(vVar, this, d2Var));
        if (z13) {
            this.f76725a.Q(d2Var);
        }
    }

    public final void Q(gk2.d2 d2Var) {
        synchronized (this) {
            try {
                if (this.f76725a instanceof n1) {
                    gk2.d2 d2Var2 = this.f76727c;
                    if (d2Var2 != null && d2Var2 == d2Var) {
                        this.f76727c = null;
                        d2Var.getClass();
                    }
                    long j13 = d2Var.f65376b - 1;
                    d2Var.f65376b = j13;
                    if (j13 == 0) {
                        uj2.t tVar = this.f76725a;
                        if (tVar instanceof xj2.c) {
                            ((xj2.c) tVar).dispose();
                        } else if (tVar instanceof bk2.f) {
                            ((bk2.f) tVar).e((xj2.c) d2Var.get());
                        }
                    }
                } else {
                    gk2.d2 d2Var3 = this.f76727c;
                    if (d2Var3 != null && d2Var3 == d2Var) {
                        d2Var.getClass();
                        long j14 = d2Var.f65376b - 1;
                        d2Var.f65376b = j14;
                        if (j14 == 0) {
                            this.f76727c = null;
                            uj2.t tVar2 = this.f76725a;
                            if (tVar2 instanceof xj2.c) {
                                ((xj2.c) tVar2).dispose();
                            } else if (tVar2 instanceof bk2.f) {
                                ((bk2.f) tVar2).e((xj2.c) d2Var.get());
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void R(gk2.d2 d2Var) {
        synchronized (this) {
            try {
                if (d2Var.f65376b == 0 && d2Var == this.f76727c) {
                    this.f76727c = null;
                    xj2.c cVar = (xj2.c) d2Var.get();
                    bk2.c.dispose(d2Var);
                    uj2.t tVar = this.f76725a;
                    if (tVar instanceof xj2.c) {
                        ((xj2.c) tVar).dispose();
                    } else if (tVar instanceof bk2.f) {
                        if (cVar == null) {
                            d2Var.f65378d = true;
                        } else {
                            ((bk2.f) tVar).e(cVar);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
