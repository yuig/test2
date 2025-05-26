package org.chromium.net;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes4.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f97464b;

    public s(t tVar, int i13) {
        this.f97464b = tVar;
        this.f97463a = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.f97464b.f97466b.mObserver;
        observer.onConnectionTypeChanged(this.f97463a);
    }
}
