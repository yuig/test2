package kk;

/* loaded from: classes3.dex */
public final class b extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79863c;

    public /* synthetic */ b(Object obj, int i13) {
        this.f79862b = i13;
        this.f79863c = obj;
    }

    @Override // kk.u
    public final void c() {
        switch (this.f79862b) {
            case 0:
                ja.v vVar = (ja.v) this.f79863c;
                c cVar = (c) vVar.f75280b;
                cVar.f79866b.g("unlinkToDeath", new Object[0]);
                cVar.f79877m.asBinder().unlinkToDeath(cVar.f79874j, 0);
                c cVar2 = (c) vVar.f75280b;
                cVar2.f79877m = null;
                cVar2.f79871g = false;
                return;
            default:
                synchronized (((c) this.f79863c).f79870f) {
                    try {
                        if (((c) this.f79863c).f79875k.get() > 0 && ((c) this.f79863c).f79875k.decrementAndGet() > 0) {
                            ((c) this.f79863c).f79866b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar3 = (c) this.f79863c;
                        if (cVar3.f79877m != null) {
                            cVar3.f79866b.g("Unbind from service.", new Object[0]);
                            c cVar4 = (c) this.f79863c;
                            cVar4.f79865a.unbindService(cVar4.f79876l);
                            Object obj = this.f79863c;
                            ((c) obj).f79871g = false;
                            ((c) obj).f79877m = null;
                            ((c) obj).f79876l = null;
                        }
                        ((c) this.f79863c).d();
                        return;
                    } finally {
                    }
                }
        }
    }
}
