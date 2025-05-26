package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o31 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9119a;

    public o31(a.o8 o8Var) {
        this.f9119a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        qw2 updateConsentAllowlistGmsgHandler = (qw2) this.f9119a.get();
        Intrinsics.checkNotNullParameter(updateConsentAllowlistGmsgHandler, "updateConsentAllowlistGmsgHandler");
        return new m31(updateConsentAllowlistGmsgHandler);
    }
}
