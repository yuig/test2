package com.modiface.mfemakeupkit.rendering;

/* loaded from: classes7.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f34591a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34592b;

    public l(a aVar, float f13) {
        this.f34592b = aVar;
        this.f34591a = f13;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.n nVar;
        this.f34592b.a(this.f34591a);
        nVar = this.f34592b.f34557d;
        nVar.d(new k(this));
    }
}
