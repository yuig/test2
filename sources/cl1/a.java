package cl1;

import kotlin.jvm.internal.Intrinsics;
import m60.t;
import m60.u;

/* loaded from: classes5.dex */
public final class a implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final t f27978a;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.c f27979b;

    public a(d eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f27978a = eventListener;
        this.f27979b = null;
    }

    @Override // xj2.c
    public final void dispose() {
        u.f85943a.j(this.f27978a);
        xj2.c cVar = this.f27979b;
        if (cVar == null || cVar.isDisposed()) {
            return;
        }
        cVar.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return !u.f85943a.c(this.f27978a);
    }
}
