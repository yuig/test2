package b01;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20741i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar) {
        super(0);
        this.f20741i = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l lVar = this.f20741i;
        c0.d.u2(lVar.s7(), f1.VIEW, g0.PEAR_MORE_IDEAS_SECTION, null, null, 12);
        Context requireContext = lVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        yk1.h hVar = new yk1.h(requireContext);
        Context context = hVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltComponent = new GestaltText(6, context, (AttributeSet) null);
        gestaltComponent.i(h.f20738j);
        Intrinsics.checkNotNullParameter(gestaltComponent, "gestaltComponent");
        hVar.removeAllViews();
        hVar.addView(gestaltComponent);
        if (lVar.W0 == null) {
            Intrinsics.r("layoutParamsFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams = new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-2, -2);
        com.bumptech.glide.c.a1(layoutParams, bs1.c.W(hVar, eo1.c.space_400), bs1.c.W(hVar, eo1.c.space_400), bs1.c.W(hVar, eo1.c.space_400), bs1.c.W(hVar, eo1.c.space_200));
        hVar.setLayoutParams(layoutParams);
        return hVar;
    }
}
