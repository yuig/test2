package kb;

import ao2.s2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends ao2.f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f78999c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final ko2.f f79000d = ao2.v0.f20219a;

    @Override // ao2.f0
    public final void g(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        f79000d.g(context, block);
    }

    @Override // ao2.f0
    public final boolean k(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f79000d.getClass();
        return !(r2 instanceof s2);
    }
}
