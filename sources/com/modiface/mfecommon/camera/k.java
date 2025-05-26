package com.modiface.mfecommon.camera;

/* loaded from: classes7.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f34235a;

    public k(a aVar) {
        this.f34235a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.n nVar;
        nVar = this.f34235a.f34170e;
        nVar.c(new j(this));
    }
}
