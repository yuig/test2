package com.modiface.mfemakeupkit.rendering;

/* loaded from: classes7.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f34596a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34597b;

    public o(a aVar, float f13) {
        this.f34597b = aVar;
        this.f34596a = f13;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f34597b.a(this.f34596a);
    }
}
