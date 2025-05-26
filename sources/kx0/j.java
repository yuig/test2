package kx0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import com.pinterest.ui.grid.TopicGridCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f81068i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar) {
        super(0);
        this.f81068i = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o oVar = this.f81068i;
        Context requireContext = oVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        TopicGridCell topicGridCell = new TopicGridCell(requireContext);
        oVar.j9();
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams = new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = topicGridCell.getResources().getDimensionPixelSize(eo1.c.margin_half);
        topicGridCell.setLayoutParams(layoutParams);
        return topicGridCell;
    }
}
