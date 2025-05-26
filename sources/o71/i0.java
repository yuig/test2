package o71;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f93306j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, int i13) {
        super(1);
        this.f93305i = i13;
        this.f93306j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f93305i;
        j0 j0Var = this.f93306j;
        switch (i13) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ek2.f i14 = j0Var.f93312p.J(j22.l.YOURS, it).i(new fp.a(25, j0Var, it), new u51.b(28, new i0(j0Var, 1)));
                Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
                j0Var.addDisposable(i14);
                break;
            default:
                j0Var.f93310n.i(((yk1.a) j0Var.f93316t).f139224a.getString(x0.generic_error));
                break;
        }
        return Unit.f80348a;
    }
}
