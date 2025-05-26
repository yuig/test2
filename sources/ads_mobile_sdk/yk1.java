package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yk1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14300a;

    public yk1(a.o8 o8Var) {
        this.f14300a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ay2 videoMetadataGmsgHandler = (ay2) this.f14300a.get();
        Intrinsics.checkNotNullParameter(videoMetadataGmsgHandler, "videoMetadataGmsgHandler");
        return new rk1(videoMetadataGmsgHandler);
    }
}
