package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r31 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10477a;

    public r31(a.o8 o8Var) {
        this.f10477a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        q92 resultGmsgHandler = (q92) this.f10477a.get();
        Intrinsics.checkNotNullParameter(resultGmsgHandler, "resultGmsgHandler");
        return new m31(resultGmsgHandler);
    }
}
