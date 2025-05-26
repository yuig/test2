package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AFf1mSDK extends AFf1hSDK<String> {
    private final String component2;

    @NonNull
    private final LinkGenerator copy;

    @NonNull
    private final UUID copydefault;
    private final String equals;
    private final LinkGenerator.ResponseListener hashCode;
    private final Map<String, String> toString;

    public AFf1mSDK(@NonNull AFd1gSDK aFd1gSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFf1rSDK.ONELINK, new AFf1rSDK[]{AFf1rSDK.RC_CDN}, aFd1gSDK, uuid.toString());
        this.copydefault = uuid;
        this.component2 = str;
        this.toString = new HashMap(map);
        this.hashCode = responseListener;
        this.equals = str2;
        this.copy = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AFe1rSDK<String> getCurrencyIso4217Code(@NonNull String str) {
        return this.areAllFieldsValid.getRevenue(this.component2, this.toString, this.equals, this.copydefault, str);
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        ResponseNetwork responseNetwork;
        super.getMediationNetwork();
        LinkGenerator.ResponseListener responseListener = this.hashCode;
        if (responseListener != null) {
            if (this.AFAdRevenueData == AFf1wSDK.SUCCESS && (responseNetwork = ((AFf1hSDK) this).component1) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable component4 = component4();
            if (!(component4 instanceof ParsingException)) {
                responseListener.onResponse(this.copy.generateLink());
            } else if (((ParsingException) component4).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.copy.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }
}
