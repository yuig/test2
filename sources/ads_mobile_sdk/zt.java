package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zt implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14915a;

    public zt(a.o8 o8Var) {
        this.f14915a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        gq0 httpTrackGmsgHandler = (gq0) this.f14915a.get();
        Intrinsics.checkNotNullParameter(httpTrackGmsgHandler, "httpTrackGmsgHandler");
        return new pt(httpTrackGmsgHandler);
    }
}
