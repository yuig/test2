package ky;

import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x;
import uj2.q;
import uj2.v;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final w f81117a;

    public d(w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f81117a = eventManager;
    }

    @Override // uj2.q
    public final void G(v observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c cVar = new c(observer);
        this.f81117a.h(cVar);
        observer.b(new x(cVar, null));
    }
}
