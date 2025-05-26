package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pm1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9743a;

    public pm1(a.o8 o8Var) {
        this.f9743a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        qo2 renderer = (qo2) this.f9743a.get();
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        kh2.a1.p(renderer);
        return renderer;
    }
}
