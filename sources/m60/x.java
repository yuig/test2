package m60;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final t f85946a;

    /* renamed from: b, reason: collision with root package name */
    public final xj2.c f85947b;

    public x(t eventListener, xj2.c cVar) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f85946a = eventListener;
        this.f85947b = cVar;
    }

    @Override // xj2.c
    public final void dispose() {
        u.f85943a.j(this.f85946a);
        xj2.c cVar = this.f85947b;
        if (cVar == null || cVar.isDisposed()) {
            return;
        }
        cVar.dispose();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return !u.f85943a.c(this.f85946a);
    }
}
