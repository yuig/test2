package sr;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements q {

    /* renamed from: a, reason: collision with root package name */
    public final us1.a f115075a;

    /* renamed from: b, reason: collision with root package name */
    public final lu1.b f115076b;

    public k(us1.a activity, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f115075a = activity;
        this.f115076b = baseActivityHelper;
    }

    @Override // sr.q
    public final void g(String url, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(url, "url");
        ((lu1.c) this.f115076b).t(this.f115075a.getContext(), url, z13, z14);
    }
}
