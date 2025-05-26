package oc;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pc.c0;
import pc.d0;
import tb.f;

/* loaded from: classes.dex */
public final class d implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f94029d = new f0();

    /* renamed from: b, reason: collision with root package name */
    public final ao2.f0 f94030b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f94031c;

    public d(ao2.f0 dispatcher, ho2.c coroutineScope) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f94030b = dispatcher;
        this.f94031c = coroutineScope;
    }

    @Override // pc.f0
    public final c0 a(d0 d0Var) {
        return f.M(this, d0Var);
    }

    @Override // pc.f0
    public final pc.f0 b(d0 d0Var) {
        return f.W(this, d0Var);
    }

    @Override // pc.f0
    public final pc.f0 c(pc.f0 f0Var) {
        return f.Z(this, f0Var);
    }

    @Override // pc.f0
    public final Object d(Object obj) {
        return f.K(this, obj);
    }

    @Override // pc.c0
    public final f0 getKey() {
        return f94029d;
    }
}
