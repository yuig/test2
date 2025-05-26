package h90;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f68310i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l82.c0 c0Var) {
        super(1);
        this.f68310i = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0 it = (f0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return f0.b(it, null, (o82.j0) this.f68310i.f82213b, 767);
    }
}
