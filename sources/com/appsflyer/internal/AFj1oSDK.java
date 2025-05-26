package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import com.appsflyer.AFLogger;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1oSDK extends AFj1wSDK {

    @NotNull
    private final ExecutorService AFAdRevenueData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1oSDK(@NotNull ExecutorService executorService, @NotNull AFd1nSDK aFd1nSDK, @NotNull Runnable runnable) {
        super("preload", "samsung", aFd1nSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.AFAdRevenueData = executorService;
    }

    private static boolean E_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    private final boolean getRevenue(Context context) {
        if (!getMonetizationNetwork()) {
            AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getMediationNetwork(context)) {
            return true;
        }
        AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    public final void AFAdRevenueData() {
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getRevenue(context)) {
            this.AFAdRevenueData.execute(new l(2, this, context));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0121, code lost:
    
        if (r3 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010c, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        if (r3 != null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void getRevenue(com.appsflyer.internal.AFj1oSDK r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1oSDK.getRevenue(com.appsflyer.internal.AFj1oSDK, android.content.Context):void");
    }
}
