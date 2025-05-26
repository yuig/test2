package com.modiface.mfemakeupkit.facetracking;

/* loaded from: classes7.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f34493a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34494b;

    public m(a aVar, int i13) {
        this.f34494b = aVar;
        this.f34493a = i13;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        bVar = this.f34494b.f34458a;
        bVar.o(this.f34493a);
    }
}
