package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class AFc1aSDK<T> {
    public final String AFAdRevenueData;
    public final FutureTask<T> getCurrencyIso4217Code = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFc1aSDK.2
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFc1aSDK.this.getRevenue()) {
                return (T) AFc1aSDK.this.getCurrencyIso4217Code();
            }
            return null;
        }
    });
    public final Executor getMediationNetwork;
    public final Context getMonetizationNetwork;
    private final String[] getRevenue;

    public AFc1aSDK(Context context, Executor executor, String str, String... strArr) {
        this.getMonetizationNetwork = context;
        this.AFAdRevenueData = str;
        this.getRevenue = strArr;
        this.getMediationNetwork = executor;
    }

    public abstract T getCurrencyIso4217Code();

    public T getMediationNetwork() {
        try {
            return this.getCurrencyIso4217Code.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e13) {
            e = e13;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e14) {
            e = e14;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e15) {
            AFLogger.afErrorLog(e15.getMessage(), e15, false, false);
            return null;
        }
    }

    public final boolean getRevenue() {
        try {
            ProviderInfo resolveContentProvider = this.getMonetizationNetwork.getPackageManager().resolveContentProvider(this.AFAdRevenueData, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.getRevenue).contains(AFb1qSDK.e_(this.getMonetizationNetwork.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e13) {
            AFLogger.afErrorLog(e13.getMessage(), e13, false, true);
            return false;
        }
    }
}
