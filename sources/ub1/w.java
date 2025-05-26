package ub1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wy0 f121746i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(wy0 wy0Var) {
        super(1);
        this.f121746i = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a it = (a) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return a.e(it, wy0.a.ENABLED == this.f121746i.p2(), false, false, 6);
    }
}
