package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1iSDK implements AFc1gSDK {

    @NotNull
    private final AFd1pSDK getCurrencyIso4217Code;

    public AFc1iSDK(@NotNull AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.getCurrencyIso4217Code = aFd1pSDK;
    }

    @Override // com.appsflyer.internal.AFc1gSDK
    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        if (this.getCurrencyIso4217Code.getMediationNetwork("deeplink_data")) {
            try {
                String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code("deeplink_data", null);
                return currencyIso4217Code == null ? z0.d() : AFk1xSDK.getMonetizationNetwork(new JSONObject(currencyIso4217Code));
            } catch (Throwable th3) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th3, true, false);
            }
        }
        return z0.d();
    }

    @Override // com.appsflyer.internal.AFc1gSDK
    public final void getMonetizationNetwork() {
        this.getCurrencyIso4217Code.getCurrencyIso4217Code("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1gSDK
    public final void getRevenue(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getCurrencyIso4217Code.getMonetizationNetwork("deeplink_data", new JSONObject(map).toString());
    }
}
