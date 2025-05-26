package ub1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wy0 f121747i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wy0 wy0Var) {
        super(1);
        this.f121747i = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z it = (z) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        wy0.a p23 = this.f121747i.p2();
        if (p23 == null) {
            p23 = wy0.a.DISABLED;
        }
        Intrinsics.f(p23);
        return z.b(it, p23, false, 2);
    }
}
