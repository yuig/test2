package b01;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.pear.ui.PearStyleHeaderDisplayView;
import h32.f1;
import h32.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20737i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar) {
        super(0);
        this.f20737i = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l lVar = this.f20737i;
        c0.d.u2(lVar.s7(), f1.VIEW, g0.PEAR_INSIGHT_HERO_SECTION, null, null, 12);
        Context requireContext = lVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        PearStyleHeaderDisplayView pearStyleHeaderDisplayView = new PearStyleHeaderDisplayView(6, requireContext, (AttributeSet) null);
        pearStyleHeaderDisplayView.f24432i = lVar.s7();
        pearStyleHeaderDisplayView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        int W = bs1.c.W(pearStyleHeaderDisplayView, eo1.c.space_100);
        pearStyleHeaderDisplayView.setPaddingRelative(W, ((Number) lVar.f20754j1.getValue()).intValue(), W, pearStyleHeaderDisplayView.getPaddingBottom());
        return pearStyleHeaderDisplayView;
    }
}
