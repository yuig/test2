package com.pinterest.feature.following.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import yk1.n;
import yr0.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/following/feed/view/FollowingFeedHeaderMessageView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "followingLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FollowingFeedHeaderMessageView extends LinearLayout implements n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowingFeedHeaderMessageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(a.f140104k);
        GestaltText a13 = a();
        setOrientation(1);
        addView(gestaltText);
        addView(a13);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.following_feed_view_horizontal_spacing);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
    }

    public final GestaltText a() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        GestaltText i13 = gestaltText.i(a.f140103j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, 0, i13.getResources().getDimensionPixelOffset(r0.margin_half), 0, 0);
        i13.setLayoutParams(layoutParams);
        b.y2(gestaltText);
        return gestaltText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowingFeedHeaderMessageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(a.f140104k);
        GestaltText a13 = a();
        setOrientation(1);
        addView(gestaltText);
        addView(a13);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.following_feed_view_horizontal_spacing);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
    }
}
