package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes3.dex */
public final class k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30840b;

    public /* synthetic */ k0(Object obj, int i13) {
        this.f30839a = i13;
        this.f30840b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f30839a;
        Object obj = this.f30840b;
        switch (i13) {
            case 0:
                ((l0) obj).f30851h.e(new ConnectionResult(4));
                break;
            case 1:
                ((z) obj).f();
                break;
            default:
                com.google.android.gms.common.api.c cVar = ((y) obj).f30900a.f30902b;
                cVar.disconnect(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                break;
        }
    }
}
