package gk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f2 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final zj2.a f65405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65406c;

    /* renamed from: d, reason: collision with root package name */
    public d2 f65407d;

    public f2(zj2.a aVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f65405b = aVar;
        this.f65406c = 1;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        d2 d2Var;
        boolean z13;
        synchronized (this) {
            try {
                d2Var = this.f65407d;
                z13 = false;
                if (d2Var == null) {
                    d2Var = new d2(this, 0);
                    this.f65407d = d2Var;
                }
                long j13 = d2Var.f65376b + 1;
                d2Var.f65376b = j13;
                if (!d2Var.f65377c && j13 == this.f65406c) {
                    z13 = true;
                    d2Var.f65377c = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f65405b.l(new e2(bVar, this, d2Var));
        if (z13) {
            this.f65405b.o(d2Var);
        }
    }

    public final void o(d2 d2Var) {
        synchronized (this) {
            try {
                if (this.f65405b instanceof y1) {
                    d2 d2Var2 = this.f65407d;
                    if (d2Var2 != null && d2Var2 == d2Var) {
                        this.f65407d = null;
                        d2Var.getClass();
                    }
                    long j13 = d2Var.f65376b - 1;
                    d2Var.f65376b = j13;
                    if (j13 == 0) {
                        xp2.a aVar = this.f65405b;
                        if (aVar instanceof xj2.c) {
                            ((xj2.c) aVar).dispose();
                        } else if (aVar instanceof bk2.f) {
                            ((bk2.f) aVar).e((xj2.c) d2Var.get());
                        }
                    }
                } else {
                    d2 d2Var3 = this.f65407d;
                    if (d2Var3 != null && d2Var3 == d2Var) {
                        d2Var.getClass();
                        long j14 = d2Var.f65376b - 1;
                        d2Var.f65376b = j14;
                        if (j14 == 0) {
                            this.f65407d = null;
                            xp2.a aVar2 = this.f65405b;
                            if (aVar2 instanceof xj2.c) {
                                ((xj2.c) aVar2).dispose();
                            } else if (aVar2 instanceof bk2.f) {
                                ((bk2.f) aVar2).e((xj2.c) d2Var.get());
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p(d2 d2Var) {
        synchronized (this) {
            try {
                if (d2Var.f65376b == 0 && d2Var == this.f65407d) {
                    this.f65407d = null;
                    xj2.c cVar = (xj2.c) d2Var.get();
                    bk2.c.dispose(d2Var);
                    xp2.a aVar = this.f65405b;
                    if (aVar instanceof xj2.c) {
                        ((xj2.c) aVar).dispose();
                    } else if (aVar instanceof bk2.f) {
                        if (cVar == null) {
                            d2Var.f65378d = true;
                        } else {
                            ((bk2.f) aVar).e(cVar);
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
