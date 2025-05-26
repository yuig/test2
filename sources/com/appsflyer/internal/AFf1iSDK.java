package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFf1iSDK extends AFf1nSDK {
    public AFf1iSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1gSDK aFd1gSDK) {
        super(AFf1rSDK.PURCHASE_VALIDATE, new AFf1rSDK[]{AFf1rSDK.RC_CDN, AFf1rSDK.FETCH_ADVERTISING_ID}, aFd1gSDK, map, purchaseValidationCallback);
        this.getMediationNetwork.add(AFf1rSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<String> AFAdRevenueData(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        return this.areAllFieldsValid.getCurrencyIso4217Code(map, str, str2);
    }
}
