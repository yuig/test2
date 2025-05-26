package kx0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import com.pinterest.component.board.view.LegoBoardRep;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f81063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar) {
        super(0);
        this.f81063i = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o oVar = this.f81063i;
        Context requireContext = oVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoBoardRep w13 = ph.a.w(requireContext, oVar.f7());
        oVar.j9();
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams = new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = w13.getResources().getDimensionPixelSize(eo1.c.margin_one_and_a_half);
        w13.setLayoutParams(layoutParams);
        return w13;
    }
}
