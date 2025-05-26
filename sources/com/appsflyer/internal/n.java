package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1jSDK f29121b;

    public /* synthetic */ n(AFj1jSDK aFj1jSDK, int i13) {
        this.f29120a = i13;
        this.f29121b = aFj1jSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29120a;
        AFj1jSDK aFj1jSDK = this.f29121b;
        switch (i13) {
            case 0:
                aFj1jSDK.component1();
                break;
            case 1:
                aFj1jSDK.component3();
                break;
            case 2:
                aFj1jSDK.component3();
                break;
            default:
                aFj1jSDK.component4();
                break;
        }
    }
}
