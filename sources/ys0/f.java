package ys0;

import android.content.Context;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import ht0.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140114i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f140115j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(0);
        this.f140114i = i13;
        this.f140115j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f140114i;
        h hVar = this.f140115j;
        switch (i13) {
            case 0:
                r1 r1Var = hVar.F0;
                if (r1Var != null) {
                    return Boolean.valueOf(r1Var.a());
                }
                Intrinsics.r("experiments");
                throw null;
            case 1:
                Context requireContext = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new SbaHfBoardToggleSettingCellView(requireContext);
            case 2:
                int i14 = h.L0;
                ((s) hVar.H0.getValue()).f140130f.e().a(c.f140112a);
                return Unit.f80348a;
            default:
                Context requireContext2 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new t(requireContext2, new f(hVar, 2));
        }
    }
}
