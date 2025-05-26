package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfemakeupkit.rendering.a;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.modiface.mfemakeupkit.utils.d f34601a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34602b;

    public q(a aVar, com.modiface.mfemakeupkit.utils.d dVar) {
        this.f34602b = aVar;
        this.f34601a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference;
        weakReference = this.f34602b.f34554a;
        a.q qVar = (a.q) weakReference.get();
        if (qVar != null) {
            qVar.onApplyMakeupWithTrackingDataDone(false, this.f34601a);
            this.f34601a.f34672a.getImage().close();
        }
    }
}
