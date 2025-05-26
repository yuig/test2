package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class iu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6547a;

    public iu(a.o8 o8Var) {
        this.f6547a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.uf videoGmsgHandler = (a.uf) this.f6547a.get();
        Intrinsics.checkNotNullParameter(videoGmsgHandler, "videoGmsgHandler");
        return new pt(videoGmsgHandler);
    }
}
