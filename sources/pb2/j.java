package pb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f99504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99505b;

    public j(int i13, int i14) {
        this.f99504a = i13;
        this.f99505b = i14;
    }

    @Override // dl1.s
    public final String b() {
        String simpleName = j.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // pb2.f
    public final int r() {
        return 20;
    }
}
