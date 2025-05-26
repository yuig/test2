package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public abstract class AFj1mSDK extends Observable {
    public final String areAllFieldsValid;
    long component2;
    public final String getMediationNetwork;
    final Runnable getMonetizationNetwork;
    public final Map<String, Object> getCurrencyIso4217Code = new HashMap();
    public AFa1zSDK component1 = AFa1zSDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFj1mSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Observer {
        public AnonymousClass3() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1mSDK.this.getMonetizationNetwork.run();
        }
    }

    public enum AFa1zSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFj1mSDK(String str, String str2, Runnable runnable) {
        this.getMonetizationNetwork = runnable;
        this.getMediationNetwork = str2;
        this.areAllFieldsValid = str;
    }

    public void AFAdRevenueData() {
        this.getCurrencyIso4217Code.put("latency", Long.valueOf(System.currentTimeMillis() - this.component2));
    }

    public abstract void getMonetizationNetwork(Context context);

    public final void getRevenue() {
        this.getCurrencyIso4217Code.put("source", this.getMediationNetwork);
        this.getCurrencyIso4217Code.put("type", this.areAllFieldsValid);
        AFAdRevenueData();
        this.component1 = AFa1zSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
