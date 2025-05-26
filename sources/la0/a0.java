package la0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82365i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f82366j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(f0 f0Var, int i13) {
        super(0);
        this.f82365i = i13;
        this.f82366j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m mVar = m.f82425a;
        AttributeSet attributeSet = null;
        int i13 = this.f82365i;
        f0 f0Var = this.f82366j;
        switch (i13) {
            case 0:
                Context requireContext = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                EmptyStateBannerView emptyStateBannerView = new EmptyStateBannerView(6, requireContext, attributeSet);
                int W = bs1.c.W(emptyStateBannerView, eo1.c.space_600);
                emptyStateBannerView.setPaddingRelative(W, bs1.c.W(emptyStateBannerView, eo1.c.space_1400), W, emptyStateBannerView.getPaddingBottom());
                return emptyStateBannerView;
            case 1:
                int i14 = f0.V0;
                f0Var.getClass();
                Context requireContext2 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                qa2.j0 j0Var = f0Var.L0;
                if (j0Var == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                t2 t2Var = f0Var.M0;
                if (t2Var == null) {
                    Intrinsics.r("pgcViewModelFactory");
                    throw null;
                }
                ni1.d0 d0Var = f0Var.N0;
                if (d0Var != null) {
                    return new x1(requireContext2, j0Var, t2Var, d0Var);
                }
                Intrinsics.r("pinModelToVMStateConverterFactory");
                throw null;
            case 2:
                Context requireContext3 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                a82.b bVar = f0Var.O0;
                if (bVar != null) {
                    return new xa0.p(requireContext3, bVar);
                }
                Intrinsics.r("offscreenRenderer");
                throw null;
            case 3:
                Context context = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                hz0.d dVar = new hz0.d(context);
                View.inflate(context, qa0.e.collage_create_new_item, dVar);
                int i15 = 1;
                e0 onClickListener = new e0(f0Var, i15);
                Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
                dVar.setOnClickListener(new w80.e0(i15, onClickListener));
                return dVar;
            case 4:
                switch (i13) {
                    case 4:
                        int i16 = f0.V0;
                        kh2.j.x2(f0Var.l9(), mVar);
                        break;
                    default:
                        int i17 = f0.V0;
                        kh2.j.x2(f0Var.l9(), mVar);
                        break;
                }
                return Unit.f80348a;
            case 5:
                switch (i13) {
                    case 4:
                        int i18 = f0.V0;
                        kh2.j.x2(f0Var.l9(), mVar);
                        break;
                    default:
                        int i19 = f0.V0;
                        kh2.j.x2(f0Var.l9(), mVar);
                        break;
                }
                return Unit.f80348a;
            default:
                return com.bumptech.glide.d.Z(f0Var, "com.pinterest.EXTRA_USER_ID", "");
        }
    }
}
