package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFb1tSDK;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes3.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (Throwable th3) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th3);
            str = null;
        }
        if (str != null && AFb1tSDK.h_(context).getString("referrer", null) != null) {
            AFb1tSDK.getCurrencyIso4217Code().getMediationNetwork(context, str);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (string == null || currentTimeMillis - Long.parseLong(string) >= CameraPreview.AUTOFOCUS_INTERVAL_MILLIS) {
            AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
            AFb1tSDK.getCurrencyIso4217Code().g_(context, intent);
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}
