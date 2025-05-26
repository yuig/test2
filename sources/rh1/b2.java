package rh1;

import com.pinterest.feature.unifiedcomments.view.PinTitleHeaderView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.j4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class b2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108121i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinTitleHeaderView f108122j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(PinTitleHeaderView pinTitleHeaderView, int i13) {
        super(0);
        this.f108121i = i13;
        this.f108122j = pinTitleHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = true;
        int i13 = this.f108121i;
        PinTitleHeaderView pinTitleHeaderView = this.f108122j;
        switch (i13) {
            case 0:
                j4 j4Var = pinTitleHeaderView.f48958d;
                if (j4Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) j4Var.f83399a;
                if (!g1Var.o("ce_android_community_insights_v2", "enabled", z3Var) && !g1Var.l("ce_android_community_insights_v2")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 1:
                j4 j4Var2 = pinTitleHeaderView.f48958d;
                if (j4Var2 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var2 = a4.f83297a;
                lh0.g1 g1Var2 = (lh0.g1) j4Var2.f83399a;
                if (!g1Var2.o("ce_android_style_decoder", "enabled", z3Var2) && !g1Var2.l("ce_android_style_decoder")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                j4 j4Var3 = pinTitleHeaderView.f48958d;
                if (j4Var3 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var3 = a4.f83297a;
                lh0.g1 g1Var3 = (lh0.g1) j4Var3.f83399a;
                if (!g1Var3.o("ce_android_timely_insight_v2", "enabled", z3Var3) && !g1Var3.l("ce_android_timely_insight_v2")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f108121i) {
        }
        return invoke();
    }
}
