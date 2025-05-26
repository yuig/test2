package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes.dex */
public final class AFg1nSDK {

    public interface AFa1ySDK {
        void AFAdRevenueData(@NonNull String str, @NonNull String str2);

        void getMediationNetwork(String str, Exception exc);
    }

    public final boolean getCurrencyIso4217Code(long j13, @NonNull Context context, @NonNull final AFa1ySDK aFa1ySDK) {
        try {
            AppsFlyerLVL.checkLicense(j13, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1nSDK.4
                public final void onLvlFailure(Exception exc) {
                    aFa1ySDK.getMediationNetwork("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1ySDK.AFAdRevenueData(str, str2);
                    } else if (str2 == null) {
                        aFa1ySDK.getMediationNetwork("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1ySDK.getMediationNetwork("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
