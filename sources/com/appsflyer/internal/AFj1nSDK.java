package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;

/* loaded from: classes3.dex */
public final class AFj1nSDK extends AFj1mSDK {
    final ProviderInfo AFAdRevenueData;
    private final AFd1gSDK getRevenue;

    public AFj1nSDK(ProviderInfo providerInfo, Runnable runnable, AFd1gSDK aFd1gSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getRevenue = aFd1gSDK;
        this.AFAdRevenueData = providerInfo;
    }

    public static ContentProviderClient D_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e13) {
            AFLogger.INSTANCE.e(AFh1sSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e13, false, true, false);
            return null;
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th3, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    public final void getMonetizationNetwork(final Context context) {
        this.getRevenue.getMediationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1nSDK.4
            /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0097  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 288
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1nSDK.AnonymousClass4.run():void");
            }
        });
    }
}
