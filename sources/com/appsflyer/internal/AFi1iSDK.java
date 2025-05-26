package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1iSDK extends AFi1mSDK {

    @NotNull
    private String getCurrencyIso4217Code;
    private Network getMonetizationNetwork;

    public static final class AFa1uSDK extends ConnectivityManager.NetworkCallback {
        public AFa1uSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1iSDK.this.getMonetizationNetwork = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1iSDK.this.getMonetizationNetwork = network;
            AFi1iSDK.this.getCurrencyIso4217Code = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1iSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.getCurrencyIso4217Code = "unknown";
        AFa1uSDK aFa1uSDK = new AFa1uSDK();
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1uSDK);
            }
        } catch (Throwable th3) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th3, true, false, false, false, 96, null);
        }
    }

    private static boolean A_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    public final boolean getRevenue() {
        Network network = this.getMonetizationNetwork;
        if (network == null) {
            return false;
        }
        if (!(!Intrinsics.d(this.getCurrencyIso4217Code, "NetworkLost"))) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return A_(networkCapabilities);
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1mSDK
    @NotNull
    public final String AFAdRevenueData() {
        Network network = this.getMonetizationNetwork;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }
}
