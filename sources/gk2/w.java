package gk2;

/* loaded from: classes2.dex */
public final class w extends nk2.a {

    /* renamed from: f, reason: collision with root package name */
    public final ak2.f f65669f;

    /* renamed from: g, reason: collision with root package name */
    public final re2.h f65670g;

    /* renamed from: h, reason: collision with root package name */
    public Object f65671h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f65672i;

    public w(dk2.a aVar, ak2.f fVar, re2.h hVar) {
        super(aVar);
        this.f65669f = fVar;
        this.f65670g = hVar;
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (f(obj)) {
            return;
        }
        this.f91182b.request(1L);
    }

    @Override // dk2.a
    public final boolean f(Object obj) {
        if (this.f91184d) {
            return false;
        }
        int i13 = this.f91185e;
        dk2.a aVar = this.f91181a;
        if (i13 != 0) {
            return aVar.f(obj);
        }
        try {
            Object apply = this.f65669f.apply(obj);
            if (this.f65672i) {
                re2.h hVar = this.f65670g;
                Object obj2 = this.f65671h;
                hVar.getClass();
                boolean a13 = ck2.i.a(obj2, apply);
                this.f65671h = apply;
                if (a13) {
                    return false;
                }
            } else {
                this.f65672i = true;
                this.f65671h = apply;
            }
            aVar.c(obj);
            return true;
        } catch (Throwable th3) {
            b(th3);
            return true;
        }
    }

    @Override // dk2.i
    public final Object poll() {
        while (true) {
            Object poll = this.f91183c.poll();
            if (poll == null) {
                return null;
            }
            Object apply = this.f65669f.apply(poll);
            if (!this.f65672i) {
                this.f65672i = true;
                this.f65671h = apply;
                return poll;
            }
            Object obj = this.f65671h;
            this.f65670g.getClass();
            if (!ck2.i.a(obj, apply)) {
                this.f65671h = apply;
                return poll;
            }
            this.f65671h = apply;
            if (this.f91185e != 1) {
                this.f91182b.request(1L);
            }
        }
    }
}
