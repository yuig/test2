package com.bugsnag.android;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f29638a;

    /* renamed from: b, reason: collision with root package name */
    public final pb.e f29639b;

    public t(ConnectivityManager connectivityManager, n nVar) {
        this.f29638a = connectivityManager;
        this.f29639b = new pb.e(nVar);
    }

    @Override // com.bugsnag.android.s
    public final void e() {
        this.f29638a.registerDefaultNetworkCallback(this.f29639b);
    }

    @Override // com.bugsnag.android.s
    public final boolean j() {
        return this.f29638a.getActiveNetwork() != null;
    }

    @Override // com.bugsnag.android.s
    public final String k() {
        ConnectivityManager connectivityManager = this.f29638a;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
    }
}
