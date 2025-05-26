package nk;

/* loaded from: classes.dex */
public final class z extends x {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f91090g;

    public z(c cVar) {
        this.f91090g = cVar;
    }

    @Override // nk.x
    public final void b() {
        synchronized (this.f91090g.f91067f) {
            try {
                if (this.f91090g.f91073l.get() > 0 && this.f91090g.f91073l.decrementAndGet() > 0) {
                    this.f91090g.f91063b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                c cVar = this.f91090g;
                if (cVar.f91075n != null) {
                    cVar.f91063b.c("Unbind from service.", new Object[0]);
                    c cVar2 = this.f91090g;
                    cVar2.f91062a.unbindService(cVar2.f91074m);
                    c cVar3 = this.f91090g;
                    cVar3.f91068g = false;
                    cVar3.f91075n = null;
                    cVar3.f91074m = null;
                }
                this.f91090g.f();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
