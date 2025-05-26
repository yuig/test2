package com.modiface.mfemakeupkit.facetracking;

import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.n f34484a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34485b;

    public h(a aVar, a.n nVar) {
        this.f34485b = aVar;
        this.f34484a = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        bVar = this.f34485b.f34458a;
        bVar.f();
        a.n nVar = this.f34484a;
        if (nVar != null) {
            nVar.a();
        }
    }
}
