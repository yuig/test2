package gk2;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class a3 extends ok2.c implements uj2.k, xp2.c {

    /* renamed from: c, reason: collision with root package name */
    public xp2.c f65331c;

    @Override // xp2.b
    public final void a() {
        e(this.f95469b);
    }

    @Override // xp2.b
    public final void c(Object obj) {
        Collection collection = (Collection) this.f95469b;
        if (collection != null) {
            collection.add(obj);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        set(4);
        this.f95469b = null;
        this.f65331c.cancel();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65331c, cVar)) {
            this.f65331c = cVar;
            this.f95468a.d(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f95469b = null;
        this.f95468a.onError(th3);
    }
}
