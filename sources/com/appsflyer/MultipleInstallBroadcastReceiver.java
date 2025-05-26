package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.AFb1tSDK;

/* loaded from: classes3.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
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
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AFb1tSDK.getCurrencyIso4217Code().g_(context, intent);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                StringBuilder sb3 = new StringBuilder("trigger onReceive: class: ");
                sb3.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                AFLogger.afInfoLog(sb3.toString());
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th4) {
                    StringBuilder sb4 = new StringBuilder("error in BroadcastReceiver ");
                    sb4.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    AFLogger.afErrorLog(sb4.toString(), th4);
                }
            }
        }
    }
}
