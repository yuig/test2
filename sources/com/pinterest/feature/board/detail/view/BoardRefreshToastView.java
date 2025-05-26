package com.pinterest.feature.board.detail.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import d5.a;
import d70.c;
import d70.d;
import d70.e;
import eo1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/board/detail/view/BoardRefreshToastView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardRefreshToastView extends ConstraintLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardRefreshToastView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(context, e.layout_board_refresh_prompt, this);
        View findViewById = findViewById(d.refresh_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(d.refresh_toast_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        setBackground(getResources().getDrawable(c.board_refresh_prompt_background));
        Drawable background = getBackground();
        int i13 = b.color_themed_background_default;
        Object obj = a.f53679a;
        background.setTint(context.getColor(i13));
        int W = bs1.c.W(this, eo1.c.space_300);
        setPadding(W, W, W, W);
        setElevation(bs1.c.W(this, eo1.c.space_200));
    }
}
