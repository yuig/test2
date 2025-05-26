package com.modiface.mfemakeupkit.video;

/* loaded from: classes7.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f34718a;

    public k(e eVar) {
        this.f34718a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.p pVar;
        com.modiface.mfecommon.utils.p pVar2;
        pVar = this.f34718a.f34693a;
        pVar.b().removeMessages(52);
        pVar2 = this.f34718a.f34693a;
        pVar2.b().removeMessages(51);
        this.f34718a.j();
        this.f34718a.b();
        this.f34718a.f34701i = Long.valueOf(System.nanoTime());
    }
}
