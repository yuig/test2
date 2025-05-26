package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30899c;

    public /* synthetic */ x(Object obj, int i13, int i14) {
        this.f30897a = i14;
        this.f30899c = obj;
        this.f30898b = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f30897a;
        int i14 = this.f30898b;
        Object obj = this.f30899c;
        switch (i13) {
            case 0:
                ((z) obj).g(i14);
                break;
            default:
                int[] iArr = com.google.android.material.navigation.f.F;
                ((com.google.android.material.navigation.f) obj).p(i14);
                break;
        }
    }
}
