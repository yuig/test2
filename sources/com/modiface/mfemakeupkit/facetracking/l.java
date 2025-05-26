package com.modiface.mfemakeupkit.facetracking;

/* loaded from: classes7.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f34491a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34492b;

    public l(a aVar, boolean z13) {
        this.f34492b = aVar;
        this.f34491a = z13;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        bVar = this.f34492b.f34458a;
        bVar.n(this.f34491a);
    }
}
