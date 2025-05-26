package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8386a;

    public mu(a.o8 o8Var) {
        this.f8386a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ad1 mraidRequestHandler = (ad1) this.f8386a.get();
        Intrinsics.checkNotNullParameter(mraidRequestHandler, "mraidRequestHandler");
        return new dt(mraidRequestHandler);
    }
}
