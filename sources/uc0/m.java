package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class m extends l82.b {

    /* renamed from: c, reason: collision with root package name */
    public final oc0.h f121823c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.a f121824d;

    /* renamed from: e, reason: collision with root package name */
    public final do2.t2 f121825e;

    /* renamed from: f, reason: collision with root package name */
    public final do2.f2 f121826f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(oc0.h eventManager, Object obj, l82.a scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f121823c = eventManager;
        this.f121824d = scope;
        this.f121825e = do2.u2.a(obj);
        this.f121826f = do2.g2.b(0, 0, null, 7);
        kotlin.jvm.internal.j.z(scope, null, null, new g(this, null), 3);
    }

    public abstract Object h(k kVar, bl2.c cVar);

    public final void i(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.j.z(this.f121824d, null, null, new l(this, event, null), 3);
    }
}
