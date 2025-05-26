package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class km2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7387a;

    public km2(a.o8 o8Var) {
        this.f7387a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        gq0 httpTrackGmsgHandler = (gq0) this.f7387a.get();
        Intrinsics.checkNotNullParameter(httpTrackGmsgHandler, "httpTrackGmsgHandler");
        return new hm2(httpTrackGmsgHandler);
    }
}
