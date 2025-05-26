package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class iv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6570a;

    public iv2(q70 q70Var) {
        this.f6570a = q70Var;
    }

    @Override // a.v7
    public final Object get() {
        yt1 openGmsgHandler = (yt1) this.f6570a.get();
        Intrinsics.checkNotNullParameter(openGmsgHandler, "openGmsgHandler");
        return new yu2(openGmsgHandler);
    }
}
