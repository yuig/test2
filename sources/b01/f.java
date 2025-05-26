package b01;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20735i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f20736j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(l lVar, int i13) {
        super(0);
        this.f20735i = i13;
        this.f20736j = lVar;
    }

    public final o b() {
        int i13 = this.f20735i;
        l lVar = this.f20736j;
        switch (i13) {
            case 3:
                Context requireContext = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new o(requireContext, lVar.s7());
            default:
                Context requireContext2 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new o(requireContext2, lVar.s7());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20735i;
        l lVar = this.f20736j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return Integer.valueOf(bs1.c.X(lVar, iy1.b.pear_style_summary_cover_pin_carousel_height));
                    default:
                        return Integer.valueOf(((Number) lVar.f20754j1.getValue()).intValue() / 2);
                }
            case 1:
                return lVar.X0;
            case 2:
                switch (i13) {
                    case 0:
                        return Integer.valueOf(bs1.c.X(lVar, iy1.b.pear_style_summary_cover_pin_carousel_height));
                    default:
                        return Integer.valueOf(((Number) lVar.f20754j1.getValue()).intValue() / 2);
                }
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                Context requireContext = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new ho0.f(requireContext, 1);
            case 6:
                Context requireContext2 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new h01.e(requireContext2, lVar.s7(), com.bumptech.glide.d.Z(lVar, "com.pinterest.EXTRA_INSIGHT_ID", ""), lVar);
            default:
                Context requireContext3 = lVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new d(requireContext3, lVar, lVar.s7());
        }
    }
}
