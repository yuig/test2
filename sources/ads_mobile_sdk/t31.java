package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t31 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11386a;

    public t31(a.o8 o8Var) {
        this.f11386a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        gr0 inMemorySdkCoreDataGmsgHandler = (gr0) this.f11386a.get();
        Intrinsics.checkNotNullParameter(inMemorySdkCoreDataGmsgHandler, "inMemorySdkCoreDataGmsgHandler");
        return new m31(inMemorySdkCoreDataGmsgHandler);
    }
}
