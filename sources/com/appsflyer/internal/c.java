package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFb1tSDK f29101b;

    public /* synthetic */ c(AFb1tSDK aFb1tSDK, int i13) {
        this.f29100a = i13;
        this.f29101b = aFb1tSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f29100a;
        AFb1tSDK aFb1tSDK = this.f29101b;
        switch (i13) {
            case 0:
                aFb1tSDK.copy();
                break;
            default:
                aFb1tSDK.copydefault();
                break;
        }
    }
}
