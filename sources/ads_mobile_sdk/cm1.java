package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cm1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3966a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f3967b;

    public cm1(xv0 xv0Var, q70 q70Var) {
        this.f3966a = xv0Var;
        this.f3967b = q70Var;
    }

    @Override // a.v7
    public final Object get() {
        r0 adConfiguration = (r0) this.f3966a.get();
        cp0 hideValidatorOverlayGmsgHandler = (cp0) this.f3967b.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(hideValidatorOverlayGmsgHandler, "hideValidatorOverlayGmsgHandler");
        return new yl1(hideValidatorOverlayGmsgHandler);
    }
}
