package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFd1wSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1vSDK implements AFd1wSDK {
    private AFd1uSDK AFAdRevenueData;

    @NotNull
    private final Executor getCurrencyIso4217Code;

    @NotNull
    private final AFc1kSDK getMediationNetwork;

    @NotNull
    private final ScheduledExecutorService getMonetizationNetwork;

    @NotNull
    private final AFi1jSDK getRevenue;

    public AFd1vSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFi1jSDK aFi1jSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        this.getCurrencyIso4217Code = executor;
        this.getMonetizationNetwork = scheduledExecutorService;
        this.getMediationNetwork = aFc1kSDK;
        this.getRevenue = aFi1jSDK;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData != null;
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void getCurrencyIso4217Code() {
        AFd1wSDK.AFa1ySDK aFa1ySDK;
        AFd1uSDK aFd1uSDK = this.AFAdRevenueData;
        if (aFd1uSDK == null || (aFa1ySDK = aFd1uSDK.getRevenue) == null) {
            return;
        }
        aFa1ySDK.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFd1wSDK
    public final void getMonetizationNetwork(@NotNull Context context, @NotNull AFd1wSDK.AFa1ySDK aFa1ySDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFAdRevenueData != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
        this.AFAdRevenueData = null;
        AFd1uSDK aFd1uSDK = new AFd1uSDK(this.getCurrencyIso4217Code, this.getMonetizationNetwork, this.getMediationNetwork, this.getRevenue, aFa1ySDK);
        this.AFAdRevenueData = aFd1uSDK;
        if (context instanceof Activity) {
            aFd1uSDK.onActivityResumed((Activity) context);
        }
        Application f_ = AFb1qSDK.f_(context);
        if (f_ != null) {
            f_.registerActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
    }
}
