package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1rSDK;

/* loaded from: classes.dex */
public final class AFa1tSDK implements AFd1rSDK {
    private static IntentFilter getCurrencyIso4217Code = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFd1rSDK
    @NonNull
    public final AFd1rSDK.AFa1vSDK getRevenue(@NonNull Context context) {
        String str = null;
        float f13 = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, getCurrencyIso4217Code);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    str = intExtra != 1 ? intExtra != 2 ? intExtra != 4 ? "other" : "wireless" : "usb" : "ac";
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f13 = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th3);
        }
        return new AFd1rSDK.AFa1vSDK(f13, str);
    }
}
