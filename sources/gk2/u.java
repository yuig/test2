package gk2;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class u extends nk2.b {

    /* renamed from: f, reason: collision with root package name */
    public final Collection f65648f;

    /* renamed from: g, reason: collision with root package name */
    public final ak2.f f65649g;

    public u(xp2.b bVar, ak2.f fVar, Collection collection) {
        super(bVar);
        this.f65649g = fVar;
        this.f65648f = collection;
    }

    @Override // nk2.b, xp2.b
    public final void a() {
        if (this.f91189d) {
            return;
        }
        this.f91189d = true;
        this.f65648f.clear();
        this.f91186a.a();
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
            Object apply = this.f65649g.apply(obj);
            ck2.i.b(apply, "The keySelector returned a null key");
            if (this.f65648f.add(apply)) {
                bVar.c(obj);
            } else {
                this.f91187b.request(1L);
            }
        } catch (Throwable th3) {
            b(th3);
        }
    }

    @Override // nk2.b, dk2.i
    public final void clear() {
        this.f65648f.clear();
        super.clear();
    }

    @Override // nk2.b, xp2.b
    public final void onError(Throwable th3) {
        if (this.f91189d) {
            lb.l0.R0(th3);
            return;
        }
        this.f91189d = true;
        this.f65648f.clear();
        this.f91186a.onError(th3);
    }

    @Override // dk2.i
    public final Object poll() {
        Object poll;
        while (true) {
            poll = this.f91188c.poll();
            if (poll == null) {
                break;
            }
            Object apply = this.f65649g.apply(poll);
            ck2.i.b(apply, "The keySelector returned a null key");
            if (this.f65648f.add(apply)) {
                break;
            }
            if (this.f91190e == 2) {
                this.f91187b.request(1L);
            }
        }
        return poll;
    }
}
