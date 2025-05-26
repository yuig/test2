package cb2;

import com.pinterest.api.model.f30;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.o0;
import lh0.z3;
import nx.d0;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27373i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f27374j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(x xVar, int i13) {
        super(0);
        this.f27373i = i13;
        this.f27374j = xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27373i) {
            case 0:
                m85invoke();
                return Unit.f80348a;
            case 1:
                m85invoke();
                return Unit.f80348a;
            case 2:
                m85invoke();
                return Unit.f80348a;
            case 3:
                m85invoke();
                return Unit.f80348a;
            default:
                o0 o0Var = this.f27374j.f27388k;
                o0Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) o0Var.f83446a;
                return Boolean.valueOf(g1Var.o("visual_search_in_long_press_android", "enabled", z3Var) || g1Var.l("visual_search_in_long_press_android"));
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m85invoke() {
        int i13 = this.f27373i;
        x xVar = this.f27374j;
        switch (i13) {
            case 0:
                d0 d0Var = xVar.f27377J;
                if (d0Var != null) {
                    xVar.l(d0Var, u0.PIN_EDIT_BUTTON);
                    f30 f30Var = xVar.I;
                    if (f30Var != null) {
                        xVar.f27396s.a(f30Var, false);
                        return;
                    } else {
                        Intrinsics.r("pin");
                        throw null;
                    }
                }
                Intrinsics.r("fragmentPinalytics");
                throw null;
            case 1:
                xVar.getClass();
                xVar.h(u0.PIN_UNFAVORITE_BUTTON, false);
                return;
            case 2:
                xVar.getClass();
                xVar.h(u0.PIN_FAVORITE_BUTTON, true);
                return;
            default:
                d0 d0Var2 = xVar.f27377J;
                if (d0Var2 != null) {
                    xVar.l(d0Var2, u0.PIN_REORDER_ENTRY_BUTTON);
                    xVar.f27379b.f(com.pinterest.feature.board.organize.d.f45283a);
                    return;
                }
                Intrinsics.r("fragmentPinalytics");
                throw null;
        }
    }
}
