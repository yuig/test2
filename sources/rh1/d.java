package rh1;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.j4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f108127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(k kVar, int i13) {
        super(0);
        this.f108126i = i13;
        this.f108127j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z13 = true;
        int i13 = this.f108126i;
        k kVar = this.f108127j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(kVar.c9().b());
            case 1:
            case 2:
            default:
                j4 c93 = kVar.c9();
                z3 z3Var = a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) c93.f83399a;
                if (!g1Var.o("ce_android_timely_insight_v2", "enabled", z3Var) && !g1Var.l("ce_android_timely_insight_v2")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 3:
                j4 c94 = kVar.c9();
                z3 z3Var2 = a4.f83297a;
                lh0.g1 g1Var2 = (lh0.g1) c94.f83399a;
                if (!g1Var2.o("ce_android_community_insights_v2", "enabled", z3Var2) && !g1Var2.l("ce_android_community_insights_v2")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 4:
                j4 c95 = kVar.c9();
                z3 z3Var3 = a4.f83297a;
                lh0.g1 g1Var3 = (lh0.g1) c95.f83399a;
                if (!g1Var3.o("ce_android_style_decoder", "enabled", z3Var3) && !g1Var3.l("ce_android_style_decoder")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f108126i;
        k kVar = this.f108127j;
        switch (i13) {
            case 1:
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                break;
            case 2:
                Context requireContext2 = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                break;
        }
        return invoke();
    }
}
