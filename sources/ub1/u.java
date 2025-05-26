package ub1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l82.e f121744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l82.e eVar) {
        super(1);
        this.f121744i = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a it = (a) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return a.e(it, wy0.a.ENABLED == ((z) this.f121744i.f82219b).f121748a, false, false, 4);
    }
}
