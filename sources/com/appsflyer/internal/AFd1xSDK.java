package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1xSDK implements AFd1ySDK {

    @NotNull
    private final AFd1lSDK getCurrencyIso4217Code;

    @NotNull
    private final AFd1oSDK getMediationNetwork;

    @NotNull
    private final AFg1qSDK getRevenue;

    public AFd1xSDK(@NotNull AFd1lSDK aFd1lSDK, @NotNull AFd1oSDK aFd1oSDK, @NotNull AFg1qSDK aFg1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        this.getCurrencyIso4217Code = aFd1lSDK;
        this.getMediationNetwork = aFd1oSDK;
        this.getRevenue = aFg1qSDK;
    }

    public static final void getMonetizationNetwork(AFd1xSDK aFd1xSDK, ah.b bVar) {
        Intrinsics.checkNotNullParameter(aFd1xSDK, "");
        AFd1lSDK aFd1lSDK = aFd1xSDK.getCurrencyIso4217Code;
        int i13 = bVar.f15166b;
        String str = bVar.f15165a;
        Intrinsics.checkNotNullExpressionValue(str, "");
        aFd1lSDK.component2 = new AFd1tSDK(i13, str);
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final boolean getCurrencyIso4217Code() {
        return !this.getRevenue.getRevenue() && AFb1qSDK.getRevenue(this.getMediationNetwork.getMonetizationNetwork) && AFb1qSDK.getMediationNetwork(this.getMediationNetwork.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFd1ySDK
    public final void getRevenue() {
        Context context = this.getMediationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(new yh.i(context).a().addOnSuccessListener(new d(this)), "");
            } catch (Throwable th3) {
                AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th3, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
                Unit unit = Unit.f80348a;
            }
        }
    }
}
