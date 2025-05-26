package com.modiface.mfemakeupkit.video;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f34719a;

    public l(e eVar) {
        this.f34719a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicBoolean atomicBoolean;
        Long l13;
        b bVar;
        com.modiface.mfecommon.utils.p pVar;
        com.modiface.mfecommon.utils.p pVar2;
        o oVar;
        Long l14;
        atomicBoolean = this.f34719a.f34699g;
        if (atomicBoolean.getAndSet(false)) {
            l13 = this.f34719a.f34701i;
            if (l13 != null) {
                e eVar = this.f34719a;
                long nanoTime = System.nanoTime();
                l14 = this.f34719a.f34701i;
                e.a(eVar, Math.max(0L, nanoTime - l14.longValue()));
                this.f34719a.f34701i = null;
            }
            this.f34719a.a();
            bVar = this.f34719a.f34696d;
            if (!bVar.e()) {
                oVar = this.f34719a.f34698f;
                oVar.a(false);
            }
            pVar = this.f34719a.f34693a;
            if (pVar.b().hasMessages(51)) {
                return;
            }
            pVar2 = this.f34719a.f34693a;
            pVar2.b().sendEmptyMessage(51);
        }
    }
}
