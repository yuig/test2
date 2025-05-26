package ak0;

import bm1.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f15462i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v bind = (v) obj;
        Intrinsics.checkNotNullParameter(bind, "$this$bind");
        bm1.b buttonType = new bm1.b(bs1.c.j2(new String[0], x0.add));
        bind.getClass();
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        bind.f23526c = buttonType;
        return Unit.f80348a;
    }
}
