package com.appsflyer;

import com.appsflyer.internal.AFh1rSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFh1rSDK[] f29078b;

    public /* synthetic */ b(AFh1rSDK[] aFh1rSDKArr, int i13) {
        this.f29077a = i13;
        this.f29078b = aFh1rSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29077a;
        AFh1rSDK[] aFh1rSDKArr = this.f29078b;
        switch (i13) {
            case 0:
                AFLogger.getCurrencyIso4217Code(aFh1rSDKArr);
                break;
            default:
                AFLogger.getMediationNetwork(aFh1rSDKArr);
                break;
        }
    }
}
