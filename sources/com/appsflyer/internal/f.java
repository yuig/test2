package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1bSDK f29106b;

    public /* synthetic */ f(AFd1bSDK aFd1bSDK, int i13) {
        this.f29105a = i13;
        this.f29106b = aFd1bSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29105a;
        AFd1bSDK aFd1bSDK = this.f29106b;
        switch (i13) {
            case 0:
                AFd1bSDK.getRevenue(aFd1bSDK);
                break;
            case 1:
                AFd1bSDK.getMediationNetwork(aFd1bSDK);
                break;
            default:
                AFd1bSDK.getCurrencyIso4217Code(aFd1bSDK);
                break;
        }
    }
}
