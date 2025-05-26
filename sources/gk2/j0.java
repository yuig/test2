package gk2;

/* loaded from: classes4.dex */
public final class j0 extends nk2.b implements dk2.a {

    /* renamed from: f, reason: collision with root package name */
    public final ak2.g f65469f;

    public j0(xp2.b bVar, ak2.g gVar) {
        super(bVar);
        this.f65469f = gVar;
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
            bVar.c(null);
            return true;
        }
        try {
            boolean test = this.f65469f.test(obj);
            if (test) {
                bVar.c(obj);
            }
            return test;
        } catch (Throwable th3) {
            b(th3);
            return true;
        }
    }

    @Override // dk2.i
    public final Object poll() {
        dk2.f fVar = this.f91188c;
        while (true) {
            Object poll = fVar.poll();
            if (poll == null) {
                return null;
            }
            if (this.f65469f.test(poll)) {
                return poll;
            }
            if (this.f91190e == 2) {
                fVar.request(1L);
            }
        }
    }
}
