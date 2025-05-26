package com.pinterest.feature.todaytab.articlefeed.relatedarticles;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we1.n1;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/todaytab/articlefeed/relatedarticles/RelatedArticlesHeaderView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "todayTab_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RelatedArticlesHeaderView extends LinearLayout implements n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedArticlesHeaderView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText i13 = new GestaltText(6, context2, (AttributeSet) null).i(new n1(this, 14));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.margin);
        setPaddingRelative(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        addView(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedArticlesHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText i13 = new GestaltText(6, context2, (AttributeSet) null).i(new n1(this, 14));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.margin);
        setPaddingRelative(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        addView(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedArticlesHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText i14 = new GestaltText(6, context2, (AttributeSet) null).i(new n1(this, 14));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.margin);
        setPaddingRelative(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        addView(i14);
    }
}
