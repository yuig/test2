package b11;

import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.view.UnifiedPinActionBarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21079i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UnifiedPinActionBarView f21080j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(UnifiedPinActionBarView unifiedPinActionBarView, int i13) {
        super(0);
        this.f21079i = i13;
        this.f21080j = unifiedPinActionBarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        nx.d0 d0Var;
        nx.d0 d0Var2;
        nx.d0 d0Var3;
        nx.d0 d0Var4;
        UnifiedPinActionBarView unifiedPinActionBarView = this.f21080j;
        int i13 = this.f21079i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        f30 f30Var = unifiedPinActionBarView.f47049p;
                        if (f30Var != null && (d0Var = unifiedPinActionBarView.f47037d) != null) {
                            np0.g gVar = unifiedPinActionBarView.B;
                            if (gVar == null) {
                                Intrinsics.r("closeupActionController");
                                throw null;
                            }
                            np0.g.c(gVar, f30Var, d0Var, unifiedPinActionBarView.f47038e, unifiedPinActionBarView.f47057x, 48);
                            break;
                        }
                        break;
                    default:
                        f30 f30Var2 = unifiedPinActionBarView.f47049p;
                        if (f30Var2 != null && (d0Var2 = unifiedPinActionBarView.f47037d) != null) {
                            np0.g gVar2 = unifiedPinActionBarView.B;
                            if (gVar2 == null) {
                                Intrinsics.r("closeupActionController");
                                throw null;
                            }
                            np0.g.c(gVar2, f30Var2, d0Var2, unifiedPinActionBarView.f47038e, unifiedPinActionBarView.f47057x, 48);
                            break;
                        }
                        break;
                }
                return Unit.f80348a;
            case 1:
                lh0.z zVar = unifiedPinActionBarView.F;
                if (zVar == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) zVar.f83517a;
                return Boolean.valueOf(g1Var.o("closeup_secondary_action_bar_android", "enabled", z3Var) || g1Var.l("closeup_secondary_action_bar_android"));
            default:
                switch (i13) {
                    case 0:
                        f30 f30Var3 = unifiedPinActionBarView.f47049p;
                        if (f30Var3 != null && (d0Var3 = unifiedPinActionBarView.f47037d) != null) {
                            np0.g gVar3 = unifiedPinActionBarView.B;
                            if (gVar3 == null) {
                                Intrinsics.r("closeupActionController");
                                throw null;
                            }
                            np0.g.c(gVar3, f30Var3, d0Var3, unifiedPinActionBarView.f47038e, unifiedPinActionBarView.f47057x, 48);
                            break;
                        }
                        break;
                    default:
                        f30 f30Var4 = unifiedPinActionBarView.f47049p;
                        if (f30Var4 != null && (d0Var4 = unifiedPinActionBarView.f47037d) != null) {
                            np0.g gVar4 = unifiedPinActionBarView.B;
                            if (gVar4 == null) {
                                Intrinsics.r("closeupActionController");
                                throw null;
                            }
                            np0.g.c(gVar4, f30Var4, d0Var4, unifiedPinActionBarView.f47038e, unifiedPinActionBarView.f47057x, 48);
                            break;
                        }
                        break;
                }
                return Unit.f80348a;
        }
    }
}
