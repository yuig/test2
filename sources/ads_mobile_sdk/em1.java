package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class em1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4889a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f4890b;

    public em1(xv0 xv0Var, a.o8 o8Var) {
        this.f4889a = xv0Var;
        this.f4890b = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        r0 adConfiguration = (r0) this.f4889a.get();
        ne2 sendMessageToSdkGmsgHandler = (ne2) this.f4890b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sendMessageToSdkGmsgHandler, "sendMessageToSdkGmsgHandler");
        return new yl1(sendMessageToSdkGmsgHandler);
    }
}
