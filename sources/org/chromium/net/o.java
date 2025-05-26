package org.chromium.net;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes2.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f97456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f97458c;

    public o(t tVar, long j13, int i13) {
        this.f97458c = tVar;
        this.f97456a = j13;
        this.f97457b = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.f97458c.f97466b.mObserver;
        observer.onNetworkConnect(this.f97456a, this.f97457b);
    }
}
