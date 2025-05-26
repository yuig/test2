package o71;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93271i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f93272j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i13) {
        super(1);
        this.f93271i = i13;
        this.f93272j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f93271i;
        f0 f0Var = this.f93272j;
        switch (i13) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f0Var.addDisposable(f0Var.f93280q.J(j22.l.TOP, it).i(new b(f0Var.B3(), it, 1), new u51.b(27, new e0(f0Var, 1))));
                break;
            default:
                f0Var.f93277n.i(((yk1.a) f0Var.f93285v).f139224a.getString(x0.generic_error));
                break;
        }
        return Unit.f80348a;
    }
}
