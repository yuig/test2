package e21;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import dl1.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import pg0.c0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56975i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinReactionIconButton f56976j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PinReactionIconButton pinReactionIconButton, int i13) {
        super(1);
        this.f56975i = i13;
        this.f56976j = pinReactionIconButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56975i;
        boolean z13 = false;
        PinReactionIconButton pinReactionIconButton = this.f56976j;
        switch (i13) {
            case 0:
                v32.c reactionType = (v32.c) obj;
                Intrinsics.checkNotNullParameter(reactionType, "reactionType");
                m60.w wVar = m60.u.f85943a;
                n1 n1Var = pinReactionIconButton.f47264q;
                if (n1Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) n1Var.f83439a;
                if (!g1Var.o("closeup_redesign_letterboxing_and_visit_cta_android", "enabled", z3Var) && !g1Var.l("closeup_redesign_letterboxing_and_visit_cta_android") && hf0.b.q()) {
                    z13 = true;
                }
                wVar.d(new c0(reactionType, z13, pinReactionIconButton.f47270w));
                return Unit.f80348a;
            case 1:
                f30 f30Var = (f30) obj;
                Intrinsics.f(f30Var);
                boolean Q0 = b40.Q0(f30Var);
                pinReactionIconButton.f47287f = Q0;
                if (Q0 && kh2.r.m1(f30Var)) {
                    z13 = true;
                }
                pinReactionIconButton.f47288g = z13;
                z11.a.b1(pinReactionIconButton, b40.O(f30Var), null, 6);
                return Unit.f80348a;
            case 2:
                v0 updatedModel = (v0) obj;
                Intrinsics.checkNotNullParameter(updatedModel, "updatedModel");
                return Boolean.valueOf(Intrinsics.d(((f30) updatedModel.f55290b).getUid(), pinReactionIconButton.f47270w));
            default:
                v32.c O = b40.O((f30) ((v0) obj).f55290b);
                if (O != pinReactionIconButton.f47289h) {
                    z11.a.b1(pinReactionIconButton, O, null, 6);
                }
                return Unit.f80348a;
        }
    }
}
