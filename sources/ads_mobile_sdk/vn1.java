package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vn1 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final un1 f12574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn1(un1 networkConnectivityManager) {
        super(il0.CUI_NAME_NETWORK_CONNECTIVITY_MANAGER_STATE, false, 6);
        Intrinsics.checkNotNullParameter(networkConnectivityManager, "networkConnectivityManager");
        this.f12574d = networkConnectivityManager;
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        return this.f12574d.b(cVar);
    }
}
