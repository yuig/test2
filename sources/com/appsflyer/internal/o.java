package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1lSDK f29123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f29124c;

    public /* synthetic */ o(AFj1lSDK aFj1lSDK, Runnable runnable, int i13) {
        this.f29122a = i13;
        this.f29123b = aFj1lSDK;
        this.f29124c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29122a;
        Runnable runnable = this.f29124c;
        AFj1lSDK aFj1lSDK = this.f29123b;
        switch (i13) {
            case 0:
                aFj1lSDK.getCurrencyIso4217Code(runnable);
                break;
            case 1:
                aFj1lSDK.component2(runnable);
                break;
            case 2:
                aFj1lSDK.AFAdRevenueData(runnable);
                break;
            default:
                aFj1lSDK.getMonetizationNetwork(runnable);
                break;
        }
    }
}
