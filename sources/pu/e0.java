package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0 implements li0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f101341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f101342b;

    public e0(boolean z13, j0 j0Var) {
        this.f101341a = z13;
        this.f101342b = j0Var;
    }

    @Override // li0.b
    public final void Z0(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f101342b.f8().a(new q(new tu.p(url)));
    }

    @Override // li0.b
    public final void g3(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // li0.b
    public final boolean q0() {
        return this.f101341a;
    }
}
