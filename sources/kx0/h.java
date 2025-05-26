package kx0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import qa2.j0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f81066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar) {
        super(0);
        this.f81066i = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o oVar = this.f81066i;
        oVar.j9();
        PinterestStaggeredGridLayoutManagerImpl.LayoutParams layoutParams = new PinterestStaggeredGridLayoutManagerImpl.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = oVar.getResources().getDimensionPixelSize(r0.margin_extra_small);
        j0 j0Var = oVar.f114986u0;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        Context context = oVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        KeyEvent.Callback a13 = ((qa2.d) j0Var).a(context, true);
        ((View) a13).setLayoutParams(layoutParams);
        return a13;
    }
}
