package jk2;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class t extends ek2.a {

    /* renamed from: f, reason: collision with root package name */
    public final Collection f76693f;

    /* renamed from: g, reason: collision with root package name */
    public final ak2.f f76694g;

    public t(uj2.v vVar, ak2.f fVar, Collection collection) {
        super(vVar);
        this.f76694g = fVar;
        this.f76693f = collection;
    }

    @Override // ek2.a, uj2.v
    public final void a() {
        if (this.f59413d) {
            return;
        }
        this.f59413d = true;
        this.f76693f.clear();
        this.f59410a.a();
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f59413d) {
            return;
        }
        int i13 = this.f59414e;
        uj2.v vVar = this.f59410a;
        if (i13 != 0) {
            vVar.c(null);
            return;
        }
        try {
            Object apply = this.f76694g.apply(obj);
            ck2.i.b(apply, "The keySelector returned a null key");
            if (this.f76693f.add(apply)) {
                vVar.c(obj);
            }
        } catch (Throwable th3) {
            d(th3);
        }
    }

    @Override // ek2.a, dk2.i
    public final void clear() {
        this.f76693f.clear();
        super.clear();
    }

    @Override // ek2.a, uj2.v
    public final void onError(Throwable th3) {
        if (this.f59413d) {
            lb.l0.R0(th3);
            return;
        }
        this.f59413d = true;
        this.f76693f.clear();
        this.f59410a.onError(th3);
    }

    @Override // dk2.i
    public final Object poll() {
        Object poll;
        Object apply;
        do {
            poll = this.f59412c.poll();
            if (poll == null) {
                break;
            }
            apply = this.f76694g.apply(poll);
            ck2.i.b(apply, "The keySelector returned a null key");
        } while (!this.f76693f.add(apply));
        return poll;
    }
}
