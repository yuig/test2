package kx0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xo0.x;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f81067i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar) {
        super(0);
        this.f81067i = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context requireContext = this.f81067i.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        x xVar = new x(requireContext);
        GridLayoutManager.LayoutParams layoutParams = new GridLayoutManager.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = xVar.getResources().getDimensionPixelSize(eo1.c.margin_half);
        xVar.setPaddingRelative(0, 0, 0, xVar.getResources().getDimensionPixelOffset(eo1.c.margin_half));
        xVar.setLayoutParams(layoutParams);
        return xVar;
    }
}
