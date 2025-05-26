package mg;

import android.content.Context;

/* loaded from: classes.dex */
public final class f implements ng.b {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f87146a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f87147b;

    public f(ng.c cVar, d dVar) {
        this.f87146a = cVar;
        this.f87147b = dVar;
    }

    @Override // wk2.a
    public final Object get() {
        return new e((Context) this.f87146a.get(), (c) this.f87147b.get());
    }
}
