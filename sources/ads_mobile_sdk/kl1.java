package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kl1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7383a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f7384b;

    public kl1(xv0 xv0Var, a.o8 o8Var) {
        this.f7383a = xv0Var;
        this.f7384b = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        r0 adConfiguration = (r0) this.f7383a.get();
        ne2 sendMessageToSdkGmsgHandler = (ne2) this.f7384b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sendMessageToSdkGmsgHandler, "sendMessageToSdkGmsgHandler");
        return new hl1(sendMessageToSdkGmsgHandler);
    }
}
