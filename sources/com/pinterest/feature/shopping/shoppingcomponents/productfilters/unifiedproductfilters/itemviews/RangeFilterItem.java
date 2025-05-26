package com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.rangesliders.RangeSliderBar;
import de1.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mz1.e;
import mz1.f;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingcomponents/productfilters/unifiedproductfilters/itemviews/RangeFilterItem;", "Landroid/widget/LinearLayout;", "Lde1/j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "fe1/h", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RangeFilterItem extends LinearLayout implements j {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48488a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48489b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48490c;

    /* renamed from: d, reason: collision with root package name */
    public final RangeSliderBar f48491d;

    /* renamed from: e, reason: collision with root package name */
    public AnimatorSet f48492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterItem(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(f.range_filter_item_view, (ViewGroup) this, true);
        View findViewById = findViewById(e.slider);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48491d = (RangeSliderBar) findViewById;
        View findViewById2 = findViewById(e.min_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48488a = (GestaltText) findViewById2;
        View findViewById3 = findViewById(e.max_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48489b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(e.instruction_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48490c = (GestaltText) findViewById4;
    }

    public final void a(GestaltText gestaltText, float f13) {
        AnimatorSet animatorSet = this.f48492e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(gestaltText, "scaleX", f13), ObjectAnimator.ofFloat(gestaltText, "scaleY", f13));
        animatorSet2.start();
        this.f48492e = animatorSet2;
    }

    public final void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        GestaltText gestaltText = this.f48489b;
        a0.p(gestaltText, text);
        gestaltText.measure(0, 0);
        gestaltText.setPivotX(gestaltText.getMeasuredWidth());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterItem(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(f.range_filter_item_view, (ViewGroup) this, true);
        View findViewById = findViewById(e.slider);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48491d = (RangeSliderBar) findViewById;
        View findViewById2 = findViewById(e.min_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48488a = (GestaltText) findViewById2;
        View findViewById3 = findViewById(e.max_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48489b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(e.instruction_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48490c = (GestaltText) findViewById4;
    }
}
