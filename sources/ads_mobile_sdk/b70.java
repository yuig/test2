package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b70 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final fg f2753a;

    public b70(fg appState) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.f2753a = appState;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.DEBUG_SIGNAL;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        Object obj = this.f2753a.f5146f.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new pk0(new a70((String) obj, this.f2753a.f5147g.get()));
    }
}
