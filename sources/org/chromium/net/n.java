package org.chromium.net;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes2.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f97452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97454c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f97455d;

    public n(t tVar, long j13, int i13, boolean z13) {
        this.f97455d = tVar;
        this.f97452a = j13;
        this.f97453b = i13;
        this.f97454c = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        NetworkChangeNotifierAutoDetect.Observer observer2;
        NetworkChangeNotifierAutoDetect.Observer observer3;
        t tVar = this.f97455d;
        observer = tVar.f97466b.mObserver;
        long j13 = this.f97452a;
        int i13 = this.f97453b;
        observer.onNetworkConnect(j13, i13);
        if (this.f97454c) {
            observer2 = tVar.f97466b.mObserver;
            observer2.onConnectionTypeChanged(i13);
            observer3 = tVar.f97466b.mObserver;
            observer3.purgeActiveNetworkList(new long[]{j13});
        }
    }
}
