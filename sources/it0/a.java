package it0;

import android.content.Context;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import ht0.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.r1;
import vs0.f;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73667i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f73668j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(0);
        this.f73667i = i13;
        this.f73668j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f73667i;
        c cVar = this.f73668j;
        switch (i13) {
            case 0:
                r1 r1Var = cVar.S0;
                if (r1Var != null) {
                    return Boolean.valueOf(r1Var.a());
                }
                Intrinsics.r("experiments");
                throw null;
            case 1:
                Context requireContext = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                f fVar = cVar.f73670a1;
                if (fVar != null) {
                    return new t(requireContext, new b(0, fVar, vs0.a.class, "navigateToPrivacyAndData", "navigateToPrivacyAndData()V", 0));
                }
                Intrinsics.r("listener");
                throw null;
            default:
                Context requireContext2 = cVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SbaHfTunerActivityPinCellView(requireContext2);
        }
    }
}
