package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;

/* loaded from: classes.dex */
public final class AFg1vSDK implements AFf1ySDK {
    private final AFd1nSDK AFAdRevenueData;
    private final AFe1sSDK areAllFieldsValid;
    private final AFf1uSDK component1;
    private final AFg1pSDK component2;
    private AFi1sSDK component3;
    private AFg1sSDK component4;
    private final AFg1uSDK getCurrencyIso4217Code;
    public final AFg1rSDK getMediationNetwork;
    private final AFg1qSDK getMonetizationNetwork;
    private final Object getRevenue = new Object();

    public AFg1vSDK(AFg1uSDK aFg1uSDK, AFd1nSDK aFd1nSDK, AFg1qSDK aFg1qSDK, AFg1rSDK aFg1rSDK, AFe1sSDK aFe1sSDK, AFg1pSDK aFg1pSDK, AFf1uSDK aFf1uSDK) {
        this.getCurrencyIso4217Code = aFg1uSDK;
        this.AFAdRevenueData = aFd1nSDK;
        this.getMonetizationNetwork = aFg1qSDK;
        this.getMediationNetwork = aFg1rSDK;
        this.areAllFieldsValid = aFe1sSDK;
        this.component2 = aFg1pSDK;
        this.component1 = aFf1uSDK;
        aFf1uSDK.getMonetizationNetwork.add(this);
    }

    private void getRevenue(@NonNull AFg1sSDK aFg1sSDK, AFg1tSDK aFg1tSDK) {
        synchronized (this.getRevenue) {
            this.component4 = aFg1sSDK;
        }
        if (aFg1tSDK != null) {
            aFg1tSDK.onRemoteConfigUpdateFinished(aFg1sSDK);
        }
    }

    public final void AFAdRevenueData(AFg1tSDK aFg1tSDK) {
        AFg1wSDK aFg1wSDK = new AFg1wSDK(this.getCurrencyIso4217Code, this.AFAdRevenueData, this.getMonetizationNetwork, this.getMediationNetwork, this.areAllFieldsValid, this.component2, "v1", aFg1tSDK);
        AFf1uSDK aFf1uSDK = this.component1;
        aFf1uSDK.getCurrencyIso4217Code.execute(aFf1uSDK.new AnonymousClass3(aFg1wSDK));
    }

    @Override // com.appsflyer.internal.AFf1ySDK
    public final void getMonetizationNetwork(AFe1aSDK<?> aFe1aSDK) {
    }

    public final AFi1sSDK getMonetizationNetwork() {
        AFi1sSDK aFi1sSDK;
        synchronized (this.getRevenue) {
            aFi1sSDK = this.component3;
            this.component3 = null;
        }
        return aFi1sSDK;
    }

    @Override // com.appsflyer.internal.AFf1ySDK
    public final void AFAdRevenueData(AFe1aSDK<?> aFe1aSDK, AFf1wSDK aFf1wSDK) {
        if (aFe1aSDK instanceof AFg1wSDK) {
            AFg1wSDK aFg1wSDK = (AFg1wSDK) aFe1aSDK;
            AFg1sSDK aFg1sSDK = aFg1wSDK.component3;
            if (aFg1sSDK == null) {
                AFLogger.INSTANCE.w(AFh1sSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFg1sSDK = AFg1sSDK.FAILURE;
            }
            if (aFg1sSDK != AFg1sSDK.USE_CACHED) {
                AFi1sSDK aFi1sSDK = aFg1wSDK.component1;
                synchronized (this.getRevenue) {
                    this.component3 = aFi1sSDK;
                }
            }
            getRevenue(aFg1sSDK, aFg1wSDK.areAllFieldsValid);
        }
    }

    @Override // com.appsflyer.internal.AFf1ySDK
    public final void AFAdRevenueData(AFe1aSDK<?> aFe1aSDK) {
        if (aFe1aSDK instanceof AFg1wSDK) {
            AFg1wSDK aFg1wSDK = (AFg1wSDK) aFe1aSDK;
            synchronized (this.getRevenue) {
                this.component3 = null;
            }
            getRevenue(AFg1sSDK.FAILURE, aFg1wSDK.areAllFieldsValid);
        }
    }
}
