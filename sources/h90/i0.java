package h90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.o6;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0 f68261i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var) {
        super(1);
        this.f68261i = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l82.n start = (l82.n) obj;
        Intrinsics.checkNotNullParameter(start, "$this$start");
        j0 j0Var = this.f68261i;
        mb0.a aVar = (mb0.a) j0Var.f68266e.f63225b;
        start.a(aVar, new o6(12), aVar.a());
        zy.d0 d0Var = j0Var.f68264c;
        start.a(d0Var, new o6(13), d0Var.a());
        w60.d dVar = j0Var.f68265d;
        start.a(dVar, new o6(14), dVar.a());
        return Unit.f80348a;
    }
}
