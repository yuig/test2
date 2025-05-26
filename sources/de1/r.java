package de1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews.RangeFilterItem;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews.SortFilter;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f54639j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, int i13) {
        super(0);
        this.f54638i = i13;
        this.f54639j = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f54638i;
        s sVar = this.f54639j;
        switch (i13) {
            case 0:
                Context context = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new ce1.c(context);
            case 1:
                Context context2 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new RangeFilterItem(context2);
            case 2:
                Context context3 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                yk1.h hVar = new yk1.h(context3);
                GestaltText gestaltComponent = new GestaltText(6, context3, (AttributeSet) null);
                dl2.b.y2(gestaltComponent);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                gestaltComponent.setPaddingRelative(0, gestaltComponent.getResources().getDimensionPixelOffset(m60.r0.margin_one_and_a_half), 0, gestaltComponent.getResources().getDimensionPixelOffset(m60.r0.margin_half));
                gestaltComponent.i(p.f54622j);
                gestaltComponent.setLayoutParams(layoutParams);
                Intrinsics.checkNotNullParameter(gestaltComponent, "gestaltComponent");
                hVar.removeAllViews();
                hVar.addView(gestaltComponent);
                return hVar;
            case 3:
                Context context4 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return new ae1.f(context4);
            case 4:
                Context context5 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                return new fe1.c(context5);
            case 5:
                Context context6 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                return new SortFilter(context6);
            default:
                Context context7 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                return new fe1.m(context7);
        }
    }
}
