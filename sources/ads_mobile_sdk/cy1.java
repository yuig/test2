package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cy1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4062a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f4063b;

    public cy1(a.o8 o8Var) {
        a.h hVar = a.l9.f91l;
        this.f4062a = o8Var;
        this.f4063b = hVar;
    }

    @Override // a.v7
    public final Object get() {
        r0 adConfiguration = (r0) this.f4062a.get();
        a.c4 canOpenUrlsGmsgHandler = (a.c4) this.f4063b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(canOpenUrlsGmsgHandler, "canOpenUrlsGmsgHandler");
        return new zx1(adConfiguration, canOpenUrlsGmsgHandler);
    }
}
