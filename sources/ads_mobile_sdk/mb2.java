package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mb2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8159a;

    public mb2(a.o8 o8Var) {
        this.f8159a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        yb2 renderer = (yb2) this.f8159a.get();
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        kh2.a1.p(renderer);
        return renderer;
    }
}
