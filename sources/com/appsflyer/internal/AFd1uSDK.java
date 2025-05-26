package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1wSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class AFd1uSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final AFi1jSDK AFAdRevenueData;
    private boolean component2;
    private boolean component3;

    @NotNull
    private final Executor getCurrencyIso4217Code;

    @NotNull
    private final ScheduledExecutorService getMediationNetwork;

    @NotNull
    private final AFc1kSDK getMonetizationNetwork;

    @NotNull
    final AFd1wSDK.AFa1ySDK getRevenue;

    public AFd1uSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFi1jSDK aFi1jSDK, @NotNull AFd1wSDK.AFa1ySDK aFa1ySDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        Intrinsics.checkNotNullParameter(aFa1ySDK, "");
        this.getCurrencyIso4217Code = executor;
        this.getMediationNetwork = scheduledExecutorService;
        this.getMonetizationNetwork = aFc1kSDK;
        this.AFAdRevenueData = aFi1jSDK;
        this.getRevenue = aFa1ySDK;
    }

    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK, AFh1iSDK aFh1iSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        Intrinsics.checkNotNullParameter(aFh1iSDK, "");
        if (!aFd1uSDK.component2) {
            try {
                aFd1uSDK.getRevenue.getCurrencyIso4217Code(aFh1iSDK);
            } catch (Exception e13) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e13, true);
            }
        }
        aFd1uSDK.component3 = false;
        aFd1uSDK.component2 = true;
    }

    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.component3 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1uSDK.getMediationNetwork;
            k kVar = new k(aFd1uSDK, 0);
            AFd1wSDK.Companion companion = AFd1wSDK.INSTANCE;
            scheduledExecutorService.schedule(kVar, AFd1wSDK.Companion.AFAdRevenueData(), TimeUnit.MILLISECONDS);
        } catch (Throwable th3) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1kSDK aFc1kSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFc1kSDK.AFAdRevenueData) {
            aFc1kSDK.AFAdRevenueData = intent;
        }
        this.AFAdRevenueData.getCurrencyIso4217Code(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.getCurrencyIso4217Code.execute(new k(this, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.getCurrencyIso4217Code.execute(new l(0, this, new AFh1iSDK(activity, this.AFAdRevenueData)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        if (aFd1uSDK.component2 && aFd1uSDK.component3) {
            aFd1uSDK.component2 = false;
            try {
                aFd1uSDK.getRevenue.getMediationNetwork();
            } catch (Exception e13) {
                AFLogger.afErrorLog("Listener threw exception! ", e13);
            }
        }
    }
}
