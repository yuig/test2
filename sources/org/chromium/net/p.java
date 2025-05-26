package org.chromium.net;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes4.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f97459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f97460b;

    public p(t tVar, long j13) {
        this.f97460b = tVar;
        this.f97459a = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.f97460b.f97466b.mObserver;
        observer.onNetworkSoonToDisconnect(this.f97459a);
    }
}
