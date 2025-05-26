package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1uSDK f29114b;

    public /* synthetic */ k(AFd1uSDK aFd1uSDK, int i13) {
        this.f29113a = i13;
        this.f29114b = aFd1uSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29113a;
        AFd1uSDK aFd1uSDK = this.f29114b;
        switch (i13) {
            case 0:
                AFd1uSDK.AFAdRevenueData(aFd1uSDK);
                break;
            default:
                AFd1uSDK.getMediationNetwork(aFd1uSDK);
                break;
        }
    }
}
