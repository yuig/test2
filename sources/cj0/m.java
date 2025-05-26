package cj0;

import android.content.Context;
import android.view.View;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27843i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f27844j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i13) {
        super(0);
        this.f27843i = i13;
        this.f27844j = pVar;
    }

    public final View b() {
        int i13 = this.f27843i;
        p pVar = this.f27844j;
        switch (i13) {
            case 1:
                qa2.j0 j0Var = pVar.O0;
                if (j0Var == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                Context requireContext = pVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return (View) ((qa2.d) j0Var).a(requireContext, true);
            default:
                Context requireContext2 = pVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new tj0.z(requireContext2, pVar.s7(), (wa2.m) pVar.V0.getValue(), bf.b.S(pVar));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27843i) {
            case 0:
                p pVar = this.f27844j;
                if (pVar.L0 == null) {
                    Intrinsics.r("educationHelper");
                    throw null;
                }
                boolean h10 = zf0.f.h();
                lh0.r rVar = pVar.M0;
                if (rVar == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) rVar.f83466a;
                if (!g1Var.o("android_curation_automagical_board_shopping_metadata", "enabled", z3Var) && !g1Var.l("android_curation_automagical_board_shopping_metadata")) {
                    lh0.r rVar2 = pVar.M0;
                    if (rVar2 == null) {
                        Intrinsics.r("experiments");
                        throw null;
                    }
                    g1 g1Var2 = (g1) rVar2.f83466a;
                    if (!g1Var2.o("android_curation_automagical_board_shopping_metadata_quick_save", "enabled", z3Var) && !g1Var2.l("android_curation_automagical_board_shopping_metadata_quick_save")) {
                        return k3.P(h10, true);
                    }
                }
                return wa2.m.a(k3.P(h10, true), false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, new wa2.g0(false, false, false, false, false, false, null, null, null, false, true, true, false, 0, true, true, false, false, false, true, true, false, 22868967), null, null, false, null, null, false, false, null, null, false, -1025, -2097153, 1023);
            case 1:
                return b();
            default:
                return b();
        }
    }
}
