package fi;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f62182b;

    public e(i iVar) {
        this.f62182b = iVar;
    }

    @Override // fi.c
    public final void a() {
        synchronized (this.f62182b.f62194f) {
            try {
                if (this.f62182b.f62199k.get() > 0 && this.f62182b.f62199k.decrementAndGet() > 0) {
                    this.f62182b.f62190b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                i iVar = this.f62182b;
                if (iVar.f62201m != null) {
                    iVar.f62190b.c("Unbind from service.", new Object[0]);
                    i iVar2 = this.f62182b;
                    iVar2.f62189a.unbindService(iVar2.f62200l);
                    i iVar3 = this.f62182b;
                    iVar3.f62195g = false;
                    iVar3.f62201m = null;
                    iVar3.f62200l = null;
                }
                this.f62182b.e();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
