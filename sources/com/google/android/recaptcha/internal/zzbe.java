package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.s0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    @NotNull
    public static final Set zza(@NotNull Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return s0.f80394a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap h10 = z0.h(new Pair(0, zzqi.NET_CAPABILITY_MMS), new Pair(1, zzqi.NET_CAPABILITY_SUPL), new Pair(2, zzqi.NET_CAPABILITY_DUN), new Pair(3, zzqi.NET_CAPABILITY_FOTA), new Pair(4, zzqi.NET_CAPABILITY_IMS), new Pair(5, zzqi.NET_CAPABILITY_CBS), new Pair(6, zzqi.NET_CAPABILITY_WIFI_P2P), new Pair(7, zzqi.NET_CAPABILITY_IA), new Pair(8, zzqi.NET_CAPABILITY_RCS), new Pair(9, zzqi.NET_CAPABILITY_XCAP), new Pair(10, zzqi.NET_CAPABILITY_EIMS), new Pair(11, zzqi.NET_CAPABILITY_NOT_METERED), new Pair(12, zzqi.NET_CAPABILITY_INTERNET), new Pair(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new Pair(14, zzqi.NET_CAPABILITY_TRUSTED), new Pair(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i13 = Build.VERSION.SDK_INT;
        h10.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        h10.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i13 >= 28) {
            h10.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            h10.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            h10.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            h10.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i13 >= 29) {
            h10.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i13 >= 30) {
            h10.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i13 >= 31) {
            h10.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            h10.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i13 >= 33) {
            h10.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            h10.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            h10.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return h10;
    }
}
