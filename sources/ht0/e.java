package ht0;

import android.content.Context;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f70112j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i13) {
        super(0);
        this.f70111i = i13;
        this.f70112j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f70111i;
        g gVar = this.f70112j;
        switch (i13) {
            case 0:
                r1 r1Var = gVar.A0;
                if (r1Var != null) {
                    return Boolean.valueOf(r1Var.a());
                }
                Intrinsics.r("experiments");
                throw null;
            case 1:
                Context requireContext = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ws0.a aVar = gVar.D0;
                if (aVar != null) {
                    return new t(requireContext, new f(0, aVar, ws0.a.class, "navigateToPrivacyAndData", "navigateToPrivacyAndData()V", 0));
                }
                Intrinsics.r("listener");
                throw null;
            default:
                Context requireContext2 = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new SbaHfBoardToggleSettingCellView(requireContext2);
        }
    }
}
