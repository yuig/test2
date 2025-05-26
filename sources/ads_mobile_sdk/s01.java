package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10899a;

    public s01(a.o8 o8Var) {
        this.f10899a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        h92 requestType = (h92) this.f10899a.get();
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        kh2.a1.p(requestType);
        return requestType;
    }
}
