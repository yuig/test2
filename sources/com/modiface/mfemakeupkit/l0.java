package com.modiface.mfemakeupkit;

/* loaded from: classes7.dex */
public final class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f34525a;

    public l0(c cVar) {
        this.f34525a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z13;
        com.modiface.mfecommon.utils.g gVar;
        z13 = this.f34525a.f34418i;
        if (z13) {
            gVar = this.f34525a.f34415f;
            gVar.e();
            this.f34525a.f34418i = false;
        }
    }
}
