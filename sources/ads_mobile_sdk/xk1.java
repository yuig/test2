package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xk1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13708a;

    public xk1(a.o8 o8Var) {
        this.f13708a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.uf videoGmsgHandler = (a.uf) this.f13708a.get();
        Intrinsics.checkNotNullParameter(videoGmsgHandler, "videoGmsgHandler");
        return new rk1(videoGmsgHandler);
    }
}
