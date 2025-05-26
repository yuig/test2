package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class AFf1nSDK extends AFf1oSDK {
    private final PurchaseHandler.PurchaseValidationCallback component2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1nSDK(@NotNull AFf1rSDK aFf1rSDK, @NotNull AFf1rSDK[] aFf1rSDKArr, @NotNull AFd1gSDK aFd1gSDK, @NotNull Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFf1rSDK, aFf1rSDKArr, aFd1gSDK, null, map);
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        Intrinsics.checkNotNullParameter(aFf1rSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean component2() {
        return true;
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getMediationNetwork();
        Throwable component4 = component4();
        if (component4 != null && (purchaseValidationCallback2 = this.component2) != null) {
            purchaseValidationCallback2.onFailure(component4);
        }
        ResponseNetwork<String> responseNetwork = ((AFf1hSDK) this).component1;
        if (responseNetwork == null || (purchaseValidationCallback = this.component2) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object remove = map.remove("billing_library_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final String getRevenue(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object remove = map.remove("connector_version");
            if (remove instanceof String) {
                return (String) remove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public boolean getRevenue() {
        ResponseNetwork responseNetwork = ((AFf1hSDK) this).component1;
        if (responseNetwork != null) {
            Intrinsics.f(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.getRevenue();
    }
}
