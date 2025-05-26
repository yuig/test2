package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class eu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4946a;

    public eu(a.o8 o8Var) {
        this.f4946a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        yt1 openGmsgHandler = (yt1) this.f4946a.get();
        Intrinsics.checkNotNullParameter(openGmsgHandler, "openGmsgHandler");
        return new pt(openGmsgHandler);
    }
}
