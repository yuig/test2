package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s31 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10929a;

    public s31(a.o8 o8Var) {
        this.f10929a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        kw1 persistentSdkCoreDataGmsgHandler = (kw1) this.f10929a.get();
        Intrinsics.checkNotNullParameter(persistentSdkCoreDataGmsgHandler, "persistentSdkCoreDataGmsgHandler");
        return new m31(persistentSdkCoreDataGmsgHandler);
    }
}
