package jk2;

/* loaded from: classes2.dex */
public final class u extends ek2.a {

    /* renamed from: f, reason: collision with root package name */
    public final ak2.f f76703f;

    /* renamed from: g, reason: collision with root package name */
    public final re2.h f76704g;

    /* renamed from: h, reason: collision with root package name */
    public Object f76705h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f76706i;

    public u(uj2.v vVar, ak2.f fVar, re2.h hVar) {
        super(vVar);
        this.f76703f = fVar;
        this.f76704g = hVar;
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f59413d) {
            return;
        }
        int i13 = this.f59414e;
        uj2.v vVar = this.f59410a;
        if (i13 != 0) {
            vVar.c(obj);
            return;
        }
        try {
            Object apply = this.f76703f.apply(obj);
            if (this.f76706i) {
                re2.h hVar = this.f76704g;
                Object obj2 = this.f76705h;
                hVar.getClass();
                boolean a13 = ck2.i.a(obj2, apply);
                this.f76705h = apply;
                if (a13) {
                    return;
                }
            } else {
                this.f76706i = true;
                this.f76705h = apply;
            }
            vVar.c(obj);
        } catch (Throwable th3) {
            d(th3);
        }
    }

    @Override // dk2.i
    public final Object poll() {
        while (true) {
            Object poll = this.f59412c.poll();
            if (poll == null) {
                return null;
            }
            Object apply = this.f76703f.apply(poll);
            if (!this.f76706i) {
                this.f76706i = true;
                this.f76705h = apply;
                return poll;
            }
            Object obj = this.f76705h;
            this.f76704g.getClass();
            if (!ck2.i.a(obj, apply)) {
                this.f76705h = apply;
                return poll;
            }
            this.f76705h = apply;
        }
    }
}
