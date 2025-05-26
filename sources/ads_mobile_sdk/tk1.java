package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tk1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11572a;

    public tk1(a.o8 o8Var) {
        this.f11572a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        sy csiGmsgHandler = (sy) this.f11572a.get();
        Intrinsics.checkNotNullParameter(csiGmsgHandler, "csiGmsgHandler");
        return new rk1(csiGmsgHandler);
    }
}
