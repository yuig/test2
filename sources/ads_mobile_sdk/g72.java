package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g72 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5469a;

    public g72(a.o8 o8Var) {
        this.f5469a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        m62 refreshGmsgHandler = (m62) this.f5469a.get();
        Intrinsics.checkNotNullParameter(refreshGmsgHandler, "refreshGmsgHandler");
        return new pt(refreshGmsgHandler);
    }
}
