package jt0;

import android.content.Context;
import com.pinterest.feature.home.model.HomeFeedTunerLocation;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import com.pinterest.navigation.Navigation;
import d7.g;
import ht0.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.r1;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77575i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f77576j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(0);
        this.f77575i = i13;
        this.f77576j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f77575i;
        d dVar = this.f77576j;
        switch (i13) {
            case 0:
                g.s(Navigation.w1(HomeFeedTunerLocation.GESTALT_SHEET_HOMEFEED_TUNER_DEMO), dVar.f7());
                return Unit.f80348a;
            case 1:
                r1 r1Var = dVar.X0;
                if (r1Var != null) {
                    return Boolean.valueOf(r1Var.a());
                }
                Intrinsics.r("experiments");
                throw null;
            case 2:
                Context requireContext = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                vs0.f fVar = dVar.f77581d1;
                if (fVar != null) {
                    return new t(requireContext, new c(0, fVar, vs0.a.class, "navigateToPrivacyAndData", "navigateToPrivacyAndData()V", 0));
                }
                Intrinsics.r("listener");
                throw null;
            default:
                Context requireContext2 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SbaHfTunerActivityPinCellView(requireContext2);
        }
    }
}
