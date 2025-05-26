package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1mSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFf1uSDK AFAdRevenueData;

    @NonNull
    public final AFd1gSDK getMonetizationNetwork;

    @NonNull
    private final AFd1nSDK getRevenue;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th3);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFd1gSDK aFd1gSDK) {
        this.getMonetizationNetwork = aFd1gSDK;
        this.getRevenue = aFd1gSDK.getMonetizationNetwork();
        this.AFAdRevenueData = aFd1gSDK.copy();
    }

    public final boolean AFAdRevenueData(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean monetizationNetwork = AFb1mSDK.getMonetizationNetwork(map, strArr, this.getRevenue);
        if (!monetizationNetwork && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return monetizationNetwork;
    }
}
