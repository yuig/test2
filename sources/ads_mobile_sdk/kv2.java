package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kv2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7549a;

    public kv2(a.o8 o8Var) {
        this.f7549a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.uf videoGmsgHandler = (a.uf) this.f7549a.get();
        Intrinsics.checkNotNullParameter(videoGmsgHandler, "videoGmsgHandler");
        return new yu2(videoGmsgHandler);
    }
}
