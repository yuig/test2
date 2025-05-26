package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class z1 implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public final p5.a f17015a;

    public z1(y.a aVar) {
        this.f17015a = aVar;
    }

    @Override // androidx.camera.core.impl.t1
    public final void a(Object obj) {
        this.f17015a.accept(obj);
    }

    @Override // androidx.camera.core.impl.t1
    public final void onError(Throwable th3) {
        kh2.m0.t("ObserverToConsumerAdapter", "Unexpected error in Observable", th3);
    }
}
