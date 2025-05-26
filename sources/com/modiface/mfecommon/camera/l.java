package com.modiface.mfecommon.camera;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f34236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34237b;

    public l(a aVar, AtomicReference atomicReference) {
        this.f34237b = aVar;
        this.f34236a = atomicReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.n nVar;
        r rVar;
        nVar = this.f34237b.f34170e;
        Handler b13 = nVar.b();
        if (b13 != null) {
            b13.removeMessages(11);
            b13.removeMessages(12);
            b13.removeMessages(13);
        }
        AtomicReference atomicReference = this.f34236a;
        rVar = this.f34237b.f34175j;
        atomicReference.set(rVar.e());
    }
}
