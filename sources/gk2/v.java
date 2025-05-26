package gk2;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class v extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ak2.f f65657c;

    /* renamed from: d, reason: collision with root package name */
    public final Callable f65658d;

    public v(uj2.h hVar, qk0.b bVar, ck2.d dVar) {
        super(hVar);
        this.f65657c = bVar;
        this.f65658d = dVar;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        try {
            Object call = this.f65658d.call();
            ck2.i.b(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f65321b.l(new u(bVar, this.f65657c, (Collection) call));
        } catch (Throwable th3) {
            bp1.h.H(th3);
            ok2.d.error(th3, bVar);
        }
    }
}
