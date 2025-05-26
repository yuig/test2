package org.chromium.net;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes2.dex */
public final class k implements NetworkChangeNotifierAutoDetect.Observer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetworkChangeNotifier f97447a;

    public k(NetworkChangeNotifier networkChangeNotifier) {
        this.f97447a = networkChangeNotifier;
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionCostChanged(int i13) {
        this.f97447a.notifyObserversOfConnectionCostChange(i13);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionSubtypeChanged(int i13) {
        this.f97447a.notifyObserversOfConnectionSubtypeChange(i13);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionTypeChanged(int i13) {
        this.f97447a.updateCurrentConnectionType(i13);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkConnect(long j13, int i13) {
        this.f97447a.notifyObserversOfNetworkConnect(j13, i13);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkDisconnect(long j13) {
        this.f97447a.notifyObserversOfNetworkDisconnect(j13);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkSoonToDisconnect(long j13) {
        this.f97447a.notifyObserversOfNetworkSoonToDisconnect(j13);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void purgeActiveNetworkList(long[] jArr) {
        this.f97447a.notifyObserversToPurgeActiveNetworkList(jArr);
    }
}
