package gk2;

/* loaded from: classes2.dex */
public final class e1 extends nk2.b {

    /* renamed from: f, reason: collision with root package name */
    public final ak2.f f65389f;

    public e1(xp2.b bVar, ak2.f fVar) {
        super(bVar);
        this.f65389f = fVar;
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f91189d) {
            return;
        }
        int i13 = this.f91190e;
        xp2.b bVar = this.f91186a;
        if (i13 != 0) {
            bVar.c(null);
            return;
        }
        try {
            Object apply = this.f65389f.apply(obj);
            ck2.i.b(apply, "The mapper function returned a null value.");
            bVar.c(apply);
        } catch (Throwable th3) {
            b(th3);
        }
    }

    @Override // dk2.i
    public final Object poll() {
        Object poll = this.f91188c.poll();
        if (poll == null) {
            return null;
        }
        Object apply = this.f65389f.apply(poll);
        ck2.i.b(apply, "The mapper function returned a null value.");
        return apply;
    }
}
