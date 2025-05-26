package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29117c;

    public /* synthetic */ l(int i13, Object obj, Object obj2) {
        this.f29115a = i13;
        this.f29116b = obj;
        this.f29117c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29115a;
        Object obj = this.f29117c;
        Object obj2 = this.f29116b;
        switch (i13) {
            case 0:
                AFd1uSDK.AFAdRevenueData((AFd1uSDK) obj2, (AFh1iSDK) obj);
                break;
            case 1:
                ((AFj1hSDK) obj2).I_((SensorEvent) obj);
                break;
            case 2:
                AFj1oSDK.getRevenue((AFj1oSDK) obj2, (Context) obj);
                break;
            case 3:
                ((AFj1qSDK) obj2).getCurrencyIso4217Code((Context) obj);
                break;
            default:
                AFj1sSDK.getRevenue((AFj1sSDK) obj2, (Context) obj);
                break;
        }
    }
}
