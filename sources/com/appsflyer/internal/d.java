package com.appsflyer.internal;

import com.appsflyer.internal.AFd1dSDK;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements AFd1dSDK.AFa1zSDK, AFg1tSDK, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f29102a;

    public /* synthetic */ d(Object obj) {
        this.f29102a = obj;
    }

    @Override // com.appsflyer.internal.AFd1dSDK.AFa1zSDK
    public final void onConfigurationChanged(boolean z13) {
        ((AFb1tSDK) this.f29102a).getRevenue(z13);
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void onRemoteConfigUpdateFinished(AFg1sSDK aFg1sSDK) {
        ((AFb1tSDK) this.f29102a).getMediationNetwork(aFg1sSDK);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        AFd1xSDK.getMonetizationNetwork((AFd1xSDK) this.f29102a, (ah.b) obj);
    }
}
