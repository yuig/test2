package org.chromium.net;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes4.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Network f97461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f97462b;

    public q(t tVar, Network network) {
        this.f97462b = tVar;
        this.f97461a = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.f97462b.f97466b.mObserver;
        observer.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(this.f97461a));
    }
}
