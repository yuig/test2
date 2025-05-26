package com.modiface.mfemakeupkit.rendering;

/* loaded from: classes7.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f34593a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34594b;

    public m(a aVar, String str) {
        this.f34594b = aVar;
        this.f34593a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.c cVar;
        com.modiface.mfemakeupkit.mfea.c cVar2;
        cVar = this.f34594b.f34558e;
        if (cVar.j()) {
            cVar2 = this.f34594b.f34558e;
            cVar2.m(this.f34593a);
        }
    }
}
