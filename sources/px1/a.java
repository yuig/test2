package px1;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.partnerAnalytics.feature.filter.FilterDateRangeView;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f101624b;

    public /* synthetic */ a(f fVar, int i13) {
        this.f101623a = i13;
        this.f101624b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f101623a;
        f this$0 = this.f101624b;
        switch (i13) {
            case 0:
                int i14 = f.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                rm1.q qVar = rm1.q.ARROW_BACK;
                Context requireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                Context requireContext2 = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
                ConstraintLayout constraintLayout = this$0.f101654p0;
                if (constraintLayout == null) {
                    Intrinsics.r("filtersContainer");
                    throw null;
                }
                constraintLayout.setVisibility(8);
                GestaltButton.SmallPrimaryButton smallPrimaryButton = this$0.f101660v0;
                if (smallPrimaryButton == null) {
                    Intrinsics.r("doneButton");
                    throw null;
                }
                a0.l0(smallPrimaryButton);
                FilterDateRangeView filterDateRangeView = this$0.f101653o0;
                if (filterDateRangeView == null) {
                    Intrinsics.r("dateRangeSelection");
                    throw null;
                }
                filterDateRangeView.d(true);
                fo1.a aVar = this$0.f101652n0;
                if (aVar == null) {
                    Intrinsics.r("toolbar");
                    throw null;
                }
                ((GestaltToolbarImpl) aVar).Q(drawableRes, eo1.b.color_themed_text_default, 0);
                fo1.a aVar2 = this$0.f101652n0;
                if (aVar2 == null) {
                    Intrinsics.r("toolbar");
                    throw null;
                }
                ((GestaltToolbarImpl) aVar2).Y(com.pinterest.partnerAnalytics.g.title_date_range_filter);
                fo1.a aVar3 = this$0.f101652n0;
                if (aVar3 == null) {
                    Intrinsics.r("toolbar");
                    throw null;
                }
                ((GestaltToolbarImpl) aVar3).m();
                fo1.a aVar4 = this$0.f101652n0;
                if (aVar4 == null) {
                    Intrinsics.r("toolbar");
                    throw null;
                }
                ((GestaltToolbarImpl) aVar4).f49713m = new a(this$0, 2);
                j jVar = this$0.C0;
                if (jVar != null) {
                    ((i) jVar).r3();
                    return;
                } else {
                    Intrinsics.r("listener");
                    throw null;
                }
            case 1:
                int i15 = f.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                j jVar2 = this$0.C0;
                if (jVar2 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                ((i) jVar2).s3();
                ((ku1.j) this$0.o7()).f();
                return;
            default:
                int i16 = f.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FilterDateRangeView filterDateRangeView2 = this$0.f101653o0;
                if (filterDateRangeView2 == null) {
                    Intrinsics.r("dateRangeSelection");
                    throw null;
                }
                filterDateRangeView2.d(false);
                this$0.c8();
                return;
        }
    }
}
