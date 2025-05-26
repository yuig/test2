package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class AFe1aSDK<Result> implements Comparable<AFe1aSDK<?>>, Callable<AFf1wSDK> {
    private static final AtomicInteger areAllFieldsValid = new AtomicInteger();
    public AFf1wSDK AFAdRevenueData;
    private final int component1;
    private long component2;
    private final String component3;
    private Throwable component4;
    private boolean copydefault;
    public volatile int getCurrencyIso4217Code;

    @NonNull
    public final Set<AFf1rSDK> getMediationNetwork;

    @NonNull
    public final Set<AFf1rSDK> getMonetizationNetwork;

    @NonNull
    public final AFf1rSDK getRevenue;

    public AFe1aSDK(@NonNull AFf1rSDK aFf1rSDK, @NonNull AFf1rSDK[] aFf1rSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getMonetizationNetwork = hashSet;
        this.getMediationNetwork = new HashSet();
        int incrementAndGet = areAllFieldsValid.incrementAndGet();
        this.component1 = incrementAndGet;
        this.copydefault = false;
        this.getCurrencyIso4217Code = 0;
        this.getRevenue = aFf1rSDK;
        Collections.addAll(hashSet, aFf1rSDKArr);
        if (str != null) {
            this.component3 = str;
        } else {
            this.component3 = String.valueOf(incrementAndGet);
        }
    }

    public void AFAdRevenueData() {
        this.copydefault = true;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: component1, reason: merged with bridge method [inline-methods] */
    public final AFf1wSDK call() {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.AFAdRevenueData = null;
        this.component4 = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.getCurrencyIso4217Code++;
        try {
            AFf1wSDK currencyIso4217Code = getCurrencyIso4217Code();
            this.AFAdRevenueData = currencyIso4217Code;
            return currencyIso4217Code;
        } finally {
        }
    }

    public final boolean component3() {
        return this.copydefault;
    }

    public final Throwable component4() {
        return this.component4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1aSDK aFe1aSDK = (AFe1aSDK) obj;
        if (this.getRevenue != aFe1aSDK.getRevenue) {
            return false;
        }
        return this.component3.equals(aFe1aSDK.component3);
    }

    @NonNull
    public abstract AFf1wSDK getCurrencyIso4217Code();

    public void getCurrencyIso4217Code(Throwable th3) {
    }

    public void getMediationNetwork() {
    }

    public abstract long getMonetizationNetwork();

    public abstract boolean getRevenue();

    public final int hashCode() {
        return this.component3.hashCode() + (this.getRevenue.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.getRevenue);
        sb3.append("-");
        sb3.append(this.component3);
        String obj = sb3.toString();
        if (String.valueOf(this.component1).equals(this.component3)) {
            return obj;
        }
        StringBuilder D = ep.b.D(obj, "-");
        D.append(this.component1);
        return D.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1aSDK<?> aFe1aSDK) {
        int i13 = this.getRevenue.f29089d - aFe1aSDK.getRevenue.f29089d;
        if (i13 != 0) {
            return i13;
        }
        if (this.component3.equals(aFe1aSDK.component3)) {
            return 0;
        }
        return this.component1 - aFe1aSDK.component1;
    }
}
