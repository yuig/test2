package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t82 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11453a;

    public t82(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f11453a = requestId;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.REQUEST_ID;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        return new pk0(new s82(this.f11453a));
    }
}
