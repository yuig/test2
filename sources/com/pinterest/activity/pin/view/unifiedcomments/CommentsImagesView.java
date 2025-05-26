package com.pinterest.activity.pin.view.unifiedcomments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.design.widget.RoundedCornersLayout;
import eo1.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import ob2.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/pin/view/unifiedcomments/CommentsImagesView;", "Lcom/pinterest/design/widget/RoundedCornersLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CommentsImagesView extends RoundedCornersLayout {

    /* renamed from: f, reason: collision with root package name */
    public final List f35112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentsImagesView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.pin_closeup_unified_comments_images, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.lego_image_corner_radius);
        g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f35112f = f0.j(findViewById(ob2.c.top_row_image_1), findViewById(ob2.c.top_row_image_2), findViewById(ob2.c.top_row_image_3), findViewById(ob2.c.bottom_row_image_1), findViewById(ob2.c.bottom_row_image_2), findViewById(ob2.c.bottom_row_image_3));
        Intrinsics.checkNotNullExpressionValue(getResources().getString(x0.add_comment), "getString(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentsImagesView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.pin_closeup_unified_comments_images, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.lego_image_corner_radius);
        g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f35112f = f0.j(findViewById(ob2.c.top_row_image_1), findViewById(ob2.c.top_row_image_2), findViewById(ob2.c.top_row_image_3), findViewById(ob2.c.bottom_row_image_1), findViewById(ob2.c.bottom_row_image_2), findViewById(ob2.c.bottom_row_image_3));
        Intrinsics.checkNotNullExpressionValue(getResources().getString(x0.add_comment), "getString(...)");
    }
}
