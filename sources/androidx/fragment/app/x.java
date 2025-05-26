package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.a f18476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f18478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g.a f18479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f18480e;

    public x(Fragment fragment, q.a aVar, AtomicReference atomicReference, h.a aVar2, g.a aVar3) {
        this.f18480e = fragment;
        this.f18476a = aVar;
        this.f18477b = atomicReference;
        this.f18478c = aVar2;
        this.f18479d = aVar3;
    }

    @Override // androidx.fragment.app.z
    public final void a() {
        Fragment fragment = this.f18480e;
        this.f18477b.set(((g.g) this.f18476a.apply(null)).d(fragment.generateActivityResultKey(), fragment, this.f18478c, this.f18479d));
    }
}
