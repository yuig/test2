package dx1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ln1.l;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final d f56488i = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l bind = (l) obj;
        Intrinsics.checkNotNullParameter(bind, "$this$bind");
        bind.a(ln1.e.LOADING);
        bind.d(fm1.c.VISIBLE);
        return Unit.f80348a;
    }
}
