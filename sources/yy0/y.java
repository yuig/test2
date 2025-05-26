package yy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f140488j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f140489k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Function1 function1, f0 f0Var, int i13) {
        super(1);
        this.f140487i = i13;
        this.f140488j = function1;
        this.f140489k = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140487i;
        Function1 function1 = this.f140488j;
        f0 f0Var = this.f140489k;
        switch (i13) {
            case 0:
                nl1.k event = (nl1.k) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof nl1.j) {
                    function1.invoke(new j(f0Var.f140450a));
                }
                break;
            default:
                ((Boolean) obj).getClass();
                function1.invoke(new i(f0Var.f140450a));
                break;
        }
        return Unit.f80348a;
    }
}
