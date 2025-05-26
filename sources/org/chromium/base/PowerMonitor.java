package org.chromium.base;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import dp2.i;
import le.n;
import org.chromium.base.annotations.CalledByNative;
import so.a;

/* loaded from: classes4.dex */
public class PowerMonitor {

    /* renamed from: b, reason: collision with root package name */
    public static PowerMonitor f97313b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f97314a;

    public static void a() {
        PowerManager powerManager;
        Object obj = ThreadUtils.f97317a;
        if (f97313b != null) {
            return;
        }
        Context context = a.f113317a;
        f97313b = new PowerMonitor();
        Intent h10 = a.h(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (h10 != null) {
            f97313b.f97314a = h10.getIntExtra("plugged", 0) == 0;
            N.MCImhGql();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(new n(1), intentFilter, null, null, 0);
        if (Build.VERSION.SDK_INT < 29 || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return;
        }
        powerManager.addThermalStatusListener(new i());
    }

    @CalledByNative
    public static int getCurrentThermalStatus() {
        int currentThermalStatus;
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (f97313b == null) {
            a();
        }
        PowerManager powerManager = (PowerManager) a.f113317a.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        currentThermalStatus = powerManager.getCurrentThermalStatus();
        return currentThermalStatus;
    }

    @CalledByNative
    public static int getRemainingBatteryCapacity() {
        if (f97313b == null) {
            a();
        }
        return ((BatteryManager) a.f113317a.getSystemService("batterymanager")).getIntProperty(1);
    }

    @CalledByNative
    public static boolean isBatteryPower() {
        if (f97313b == null) {
            a();
        }
        return f97313b.f97314a;
    }
}
