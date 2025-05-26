package ky;

import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x;
import uj2.q;
import uj2.v;

/* loaded from: classes3.dex */
public final class k extends q {

    /* renamed from: a, reason: collision with root package name */
    public final w f81119a;

    public k(w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f81119a = eventManager;
    }

    @Override // uj2.q
    public final void G(v observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        j jVar = new j(observer);
        this.f81119a.h(jVar);
        observer.b(new x(jVar, null));
    }
}
