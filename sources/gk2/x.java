package gk2;

/* loaded from: classes2.dex */
public final class x extends nk2.b implements dk2.a {

    /* renamed from: f, reason: collision with root package name */
    public final ak2.f f65689f;

    /* renamed from: g, reason: collision with root package name */
    public final re2.h f65690g;

    /* renamed from: h, reason: collision with root package name */
    public Object f65691h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65692i;

    public x(xp2.b bVar, ak2.f fVar, re2.h hVar) {
        super(bVar);
        this.f65689f = fVar;
        this.f65690g = hVar;
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (f(obj)) {
            return;
        }
        this.f91187b.request(1L);
    }

    @Override // dk2.a
    public final boolean f(Object obj) {
        if (this.f91189d) {
            return false;
        }
        int i13 = this.f91190e;
        xp2.b bVar = this.f91186a;
        if (i13 != 0) {
            bVar.c(obj);
            return true;
        }
        try {
            Object apply = this.f65689f.apply(obj);
            if (this.f65692i) {
                re2.h hVar = this.f65690g;
                Object obj2 = this.f65691h;
                hVar.getClass();
                boolean a13 = ck2.i.a(obj2, apply);
                this.f65691h = apply;
                if (a13) {
                    return false;
                }
            } else {
                this.f65692i = true;
                this.f65691h = apply;
            }
            bVar.c(obj);
            return true;
        } catch (Throwable th3) {
            b(th3);
            return true;
        }
    }

    @Override // dk2.i
    public final Object poll() {
        while (true) {
            Object poll = this.f91188c.poll();
            if (poll == null) {
                return null;
            }
            Object apply = this.f65689f.apply(poll);
            if (!this.f65692i) {
                this.f65692i = true;
                this.f65691h = apply;
                return poll;
            }
            Object obj = this.f65691h;
            this.f65690g.getClass();
            if (!ck2.i.a(obj, apply)) {
                this.f65691h = apply;
                return poll;
            }
            this.f65691h = apply;
            if (this.f91190e != 1) {
                this.f91187b.request(1L);
            }
        }
    }
}
