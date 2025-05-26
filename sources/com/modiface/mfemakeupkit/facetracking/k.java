package com.modiface.mfemakeupkit.facetracking;

/* loaded from: classes7.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f34489a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34490b;

    public k(a aVar, int i13) {
        this.f34490b = aVar;
        this.f34489a = i13;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        bVar = this.f34490b.f34458a;
        bVar.l(this.f34489a);
    }
}
