package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes2.dex */
public final class l extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public LinkProperties f97448a;

    /* renamed from: b, reason: collision with root package name */
    public NetworkCapabilities f97449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NetworkChangeNotifierAutoDetect f97450c;

    public l(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f97450c = networkChangeNotifierAutoDetect;
    }

    public final NetworkChangeNotifierAutoDetect.NetworkState a(Network network) {
        int i13;
        int i14;
        boolean isPrivateDnsActive;
        String privateDnsServerName;
        int type;
        if (!this.f97449b.hasTransport(1) && !this.f97449b.hasTransport(5)) {
            boolean hasTransport = this.f97449b.hasTransport(0);
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f97450c;
            if (hasTransport) {
                NetworkInfo e13 = networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.e(network);
                i14 = e13 != null ? e13.getSubtype() : -1;
                i13 = 0;
            } else {
                if (this.f97449b.hasTransport(3)) {
                    type = 9;
                } else if (this.f97449b.hasTransport(2)) {
                    type = 7;
                } else if (this.f97449b.hasTransport(4)) {
                    NetworkInfo d2 = networkChangeNotifierAutoDetect.mConnectivityManagerDelegate.d(network);
                    type = d2 != null ? d2.getType() : 17;
                } else {
                    i13 = -1;
                    i14 = -1;
                }
                i13 = type;
            }
            boolean z13 = !this.f97449b.hasCapability(11);
            String valueOf = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
            isPrivateDnsActive = this.f97448a.isPrivateDnsActive();
            privateDnsServerName = this.f97448a.getPrivateDnsServerName();
            return new NetworkChangeNotifierAutoDetect.NetworkState(true, i13, i14, z13, valueOf, isPrivateDnsActive, privateDnsServerName);
        }
        i13 = 1;
        i14 = -1;
        boolean z132 = !this.f97449b.hasCapability(11);
        String valueOf2 = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
        isPrivateDnsActive = this.f97448a.isPrivateDnsActive();
        privateDnsServerName = this.f97448a.getPrivateDnsServerName();
        return new NetworkChangeNotifierAutoDetect.NetworkState(true, i13, i14, z132, valueOf2, isPrivateDnsActive, privateDnsServerName);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f97448a = null;
        this.f97449b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean z13;
        this.f97449b = networkCapabilities;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f97450c;
        z13 = networkChangeNotifierAutoDetect.mRegistered;
        if (!z13 || this.f97448a == null || this.f97449b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        boolean z13;
        this.f97448a = linkProperties;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f97450c;
        z13 = networkChangeNotifierAutoDetect.mRegistered;
        if (!z13 || this.f97448a == null || this.f97449b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        boolean z13;
        this.f97448a = null;
        this.f97449b = null;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f97450c;
        z13 = networkChangeNotifierAutoDetect.mRegistered;
        if (z13) {
            networkChangeNotifierAutoDetect.connectionTypeChangedTo(new NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, false, null, false, ""));
        }
    }
}
