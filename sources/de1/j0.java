package de1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews.RangeFilterItem;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews.SortFilter;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54583i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f54584j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(l0 l0Var, int i13) {
        super(0);
        this.f54583i = i13;
        this.f54584j = l0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f54583i;
        l0 l0Var = this.f54584j;
        switch (i13) {
            case 0:
                Context context = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new ce1.c(context);
            case 1:
                Context context2 = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new RangeFilterItem(context2);
            case 2:
                Context context3 = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                yk1.h hVar = new yk1.h(context3);
                GestaltText gestaltComponent = new GestaltText(6, context3, (AttributeSet) null);
                dl2.b.y2(gestaltComponent);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                gestaltComponent.setPaddingRelative(0, gestaltComponent.getResources().getDimensionPixelOffset(m60.r0.margin_one_and_a_half), 0, gestaltComponent.getResources().getDimensionPixelOffset(m60.r0.margin_half));
                gestaltComponent.i(p.f54629q);
                gestaltComponent.setLayoutParams(layoutParams);
                Intrinsics.checkNotNullParameter(gestaltComponent, "gestaltComponent");
                hVar.removeAllViews();
                hVar.addView(gestaltComponent);
                return hVar;
            case 3:
                Context context4 = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return new ae1.f(context4);
            case 4:
                Context context5 = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                return new fe1.c(context5);
            case 5:
                Context context6 = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                return new SortFilter(context6);
            case 6:
                Context context7 = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                return new fe1.m(context7);
            default:
                Context context8 = l0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                Intrinsics.checkNotNullParameter(context8, "context");
                fe1.d dVar = new fe1.d(context8);
                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, (int) dVar.getResources().getDimension(mz1.c.filter_divider_height));
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = dVar.getResources().getDimensionPixelOffset(m60.r0.margin_one_and_a_half);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = dVar.getResources().getDimensionPixelOffset(m60.r0.margin_three_quarter);
                dVar.setLayoutParams(layoutParams2);
                int i14 = eo1.b.color_border_default;
                Object obj = d5.a.f53679a;
                dVar.setBackgroundColor(context8.getColor(i14));
                return dVar;
        }
    }
}
