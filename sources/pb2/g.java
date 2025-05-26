package pb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f99503a;

    public g(int i13) {
        this.f99503a = i13;
    }

    @Override // dl1.s
    public final String b() {
        String simpleName = g.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // pb2.f
    public final int r() {
        return this.f99503a;
    }
}
