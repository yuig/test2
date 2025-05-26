package vo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f126355i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ln1.l bind = (ln1.l) obj;
        Intrinsics.checkNotNullParameter(bind, "$this$bind");
        bind.a(ln1.e.LOADING);
        return Unit.f80348a;
    }
}
