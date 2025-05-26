package dt0;

import android.content.Context;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56240i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f56241j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(n nVar, int i13) {
        super(0);
        this.f56240i = i13;
        this.f56241j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f56240i;
        n nVar = this.f56241j;
        switch (i13) {
            case 0:
                r1 r1Var = nVar.L0;
                if (r1Var != null) {
                    return Boolean.valueOf(r1Var.a());
                }
                Intrinsics.r("experiments");
                throw null;
            case 1:
                Context requireContext = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SbaHfTunerActivityPinCellView(requireContext);
            case 2:
                int i14 = n.S0;
                nVar.k9().f56235h.e().a(e.f56237a);
                return Unit.f80348a;
            default:
                Context requireContext2 = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new ht0.t(requireContext2, new i(nVar, 2));
        }
    }
}
