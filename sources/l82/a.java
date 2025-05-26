package l82;

import ao2.j0;
import ao2.m2;
import ao2.v0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f82202a;

    public a() {
        m2 b13 = ue.c.b();
        ko2.f fVar = v0.f20219a;
        CoroutineContext context = kotlin.coroutines.g.d(((bo2.e) ho2.q.f69782a).f23612f, b13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82202a = context;
    }

    @Override // ao2.j0
    public final CoroutineContext getCoroutineContext() {
        return this.f82202a;
    }
}
