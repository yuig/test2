package j51;

import a41.q0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74787i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f74788j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(d0 d0Var, int i13) {
        super(1);
        this.f74787i = i13;
        this.f74788j = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f74787i;
        d0 d0Var = this.f74788j;
        switch (i13) {
            case 0:
                ((Number) obj).intValue();
                int i14 = d0.f74720s1;
                d0Var.m9().f71578e.e().a(i51.n.f71599a);
                break;
            default:
                q0 selectedOption = (q0) obj;
                Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
                if (z.f74790a[selectedOption.ordinal()] == 1) {
                    int i15 = d0.f74720s1;
                    d0Var.m9().f71578e.e().a(new i51.m(d0Var.l9(), d0Var.k9() ? zp.b.Hidden : zp.b.VisibleToYouAndOthers));
                }
                break;
        }
        return Unit.f80348a;
    }
}
