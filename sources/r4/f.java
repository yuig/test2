package r4;

/* loaded from: classes3.dex */
public final class f extends tb.f {
    @Override // tb.f
    public final void a0(g gVar, g gVar2) {
        gVar.f106114b = gVar2;
    }

    @Override // tb.f
    public final void b0(g gVar, Thread thread) {
        gVar.f106113a = thread;
    }

    @Override // tb.f
    public final boolean x(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f106120b != dVar) {
                    return false;
                }
                hVar.f106120b = dVar2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // tb.f
    public final boolean y(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f106119a != obj) {
                    return false;
                }
                hVar.f106119a = obj2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // tb.f
    public final boolean z(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f106121c != gVar) {
                    return false;
                }
                hVar.f106121c = gVar2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
