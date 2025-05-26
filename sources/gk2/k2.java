package gk2;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class k2 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f65488b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65489c;

    public k2(ak2.f fVar, Object obj) {
        this.f65488b = obj;
        this.f65489c = fVar;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        try {
            Object apply = this.f65489c.apply(this.f65488b);
            ck2.i.b(apply, "The mapper returned a null Publisher");
            xp2.a aVar = (xp2.a) apply;
            if (!(aVar instanceof Callable)) {
                aVar.b(bVar);
                return;
            }
            try {
                Object call = ((Callable) aVar).call();
                if (call == null) {
                    ok2.d.complete(bVar);
                } else {
                    bVar.d(new ok2.e(call, bVar));
                }
            } catch (Throwable th3) {
                bp1.h.H(th3);
                ok2.d.error(th3, bVar);
            }
        } catch (Throwable th4) {
            ok2.d.error(th4, bVar);
        }
    }
}
