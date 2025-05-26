package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import org.chromium.base.annotations.CalledByNative;
import so.a;

/* loaded from: classes4.dex */
public class RadioUtils {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f97315a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f97316b;

    @CalledByNative
    public static int getCellDataActivity() {
        TraceEvent c13 = TraceEvent.c("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) a.f113317a.getSystemService("phone")).getDataActivity();
                if (c13 != null) {
                    c13.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (c13 == null) {
                    return -1;
                }
                c13.close();
                return -1;
            }
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @CalledByNative
    public static int getCellSignalLevel() {
        SignalStrength signalStrength;
        TraceEvent c13 = TraceEvent.c("RadioUtils::getCellSignalLevel");
        try {
            int i13 = -1;
            try {
                signalStrength = ((TelephonyManager) a.f113317a.getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    i13 = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (c13 != null) {
                c13.close();
            }
            return i13;
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @CalledByNative
    public static boolean isSupported() {
        boolean z13;
        boolean z14;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (f97315a == null) {
            if (a.f113317a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                z14 = true;
                f97315a = Boolean.valueOf(z14);
            }
            z14 = false;
            f97315a = Boolean.valueOf(z14);
        }
        if (!f97315a.booleanValue()) {
            return false;
        }
        if (f97316b == null) {
            if (a.f113317a.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                z13 = true;
                f97316b = Boolean.valueOf(z13);
            }
            z13 = false;
            f97316b = Boolean.valueOf(z13);
        }
        return f97316b.booleanValue();
    }

    @CalledByNative
    public static boolean isWifiConnected() {
        TraceEvent c13 = TraceEvent.c("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a.f113317a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (c13 != null) {
                    c13.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (c13 != null) {
                    c13.close();
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (c13 != null) {
                c13.close();
            }
            return hasTransport;
        } catch (Throwable th3) {
            if (c13 != null) {
                try {
                    c13.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
