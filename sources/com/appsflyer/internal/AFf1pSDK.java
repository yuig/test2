package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFf1pSDK extends AFf1nSDK {
    public AFf1pSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1gSDK aFd1gSDK) {
        super(AFf1rSDK.ARS_VALIDATE, new AFf1rSDK[]{AFf1rSDK.RC_CDN, AFf1rSDK.FETCH_ADVERTISING_ID}, aFd1gSDK, map, purchaseValidationCallback);
        this.getMediationNetwork.add(AFf1rSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<String> AFAdRevenueData(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        AFe1sSDK aFe1sSDK = this.areAllFieldsValid;
        return (AFe1rSDK) AFe1sSDK.AFAdRevenueData(new Object[]{aFe1sSDK, map, str, str2}, -1521127320, 1521127320, System.identityHashCode(aFe1sSDK));
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        ResponseNetwork responseNetwork = ((AFf1hSDK) this).component1;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.getRevenue();
        }
        return true;
    }
}
