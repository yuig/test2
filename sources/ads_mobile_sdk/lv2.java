package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8004a;

    public lv2(a.o8 o8Var) {
        this.f8004a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ay2 videoMetadataGmsgHandler = (ay2) this.f8004a.get();
        Intrinsics.checkNotNullParameter(videoMetadataGmsgHandler, "videoMetadataGmsgHandler");
        return new yu2(videoMetadataGmsgHandler);
    }
}
