package l11;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.r0;
import xk2.v;

/* loaded from: classes5.dex */
public final class m extends RecyclerView implements yk1.n, f11.e {
    public static final /* synthetic */ int K0 = 0;
    public final v I0;
    public List J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i13, Context context, String str) {
        super(context, null, 0);
        str = (i13 & 2) != 0 ? "small" : str;
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r0.margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(r0.margin);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(r0.margin_quarter);
        Intrinsics.checkNotNullParameter(context, "context");
        this.I0 = xk2.m.b(h.f81418k);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(f02.a.carousel_pin_cell_item_height);
        int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(f02.a.carousel_pin_cell_item_height_large);
        int dimensionPixelSize6 = context.getResources().getDimensionPixelSize(r0.margin);
        List emptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(emptyList, "emptyList(...)");
        this.J0 = emptyList;
        H2(new dk0.b(this, str));
        setVisibility(8);
        R2(new PinterestLinearLayoutManager(new cp.b(this, 29), 0, false));
        this.f19254t = true;
        setLayoutParams(new RecyclerView.LayoutParams(-1, (z.i(str, "large", false) ? dimensionPixelSize5 : dimensionPixelSize4) + dimensionPixelSize6));
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize2, dimensionPixelSize6);
        setClipToPadding(false);
        int i14 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i14));
        m(new ko0.b(dimensionPixelSize3, 3));
    }

    public final void j3(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        setVisibility(items.isEmpty() ? 8 : 0);
        Intrinsics.checkNotNullParameter(items, "<set-?>");
        this.J0 = items;
        b2 b2Var = this.f19240m;
        Intrinsics.f(b2Var);
        b2Var.h();
        d3(items.size());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i13) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i13);
        Intrinsics.d(changedView, this);
    }
}
