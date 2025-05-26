package ub;

import kb.b0;

/* loaded from: classes3.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final v f121697a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.j f121698b;

    public u(v vVar, tb.j jVar) {
        this.f121697a = vVar;
        this.f121698b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f121697a.f121703d) {
            try {
                if (((u) this.f121697a.f121701b.remove(this.f121698b)) != null) {
                    t tVar = (t) this.f121697a.f121702c.remove(this.f121698b);
                    if (tVar != null) {
                        tb.j jVar = this.f121698b;
                        nb.f fVar = (nb.f) tVar;
                        b0.e().a(nb.f.f90123o, "Exceeded time limits on execution for " + jVar);
                        fVar.f90131h.execute(new nb.e(fVar, 4));
                    }
                } else {
                    b0.e().a("WrkTimerRunnable", "Timer with " + this.f121698b + " is already marked as complete.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
