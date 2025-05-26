package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class wt implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13240a;

    public wt(a.o8 o8Var) {
        this.f13240a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        sy csiGmsgHandler = (sy) this.f13240a.get();
        Intrinsics.checkNotNullParameter(csiGmsgHandler, "csiGmsgHandler");
        return new pt(csiGmsgHandler);
    }
}
