package com.pinterest.activity.pin.view.unifiedcomments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import ob2.c;
import ob2.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/activity/pin/view/unifiedcomments/CommentsImageTile;", "Landroid/widget/FrameLayout;", "Lnx/v;", "Lh32/c0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unifiedcommentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CommentsImageTile extends FrameLayout implements v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsImageTile(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.pin_closeup_unified_comments_image, this);
        View findViewById = findViewById(c.image_view);
        ((WebImageView) findViewById).g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = findViewById(c.overlay_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsImageTile(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.pin_closeup_unified_comments_image, this);
        View findViewById = findViewById(c.image_view);
        ((WebImageView) findViewById).g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = findViewById(c.overlay_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
    }
}
