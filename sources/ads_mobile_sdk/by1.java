package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class by1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3641a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f3642b;

    public by1(a.o8 o8Var, a.o8 o8Var2) {
        this.f3641a = o8Var;
        this.f3642b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        r0 adConfiguration = (r0) this.f3641a.get();
        em canOpenIntentsGmsgHandler = (em) this.f3642b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(canOpenIntentsGmsgHandler, "canOpenIntentsGmsgHandler");
        return new zx1(adConfiguration, canOpenIntentsGmsgHandler);
    }
}
