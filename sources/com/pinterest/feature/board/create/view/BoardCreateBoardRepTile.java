package com.pinterest.feature.board.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.ui.imageview.WebImageView;
import d70.a;
import df.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x60.c;
import x60.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/board/create/view/BoardCreateBoardRepTile;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "create_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardCreateBoardRepTile extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f45164a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardCreateBoardRepTile(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(String str) {
        if (str != null) {
            this.f45164a.loadUrl(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardCreateBoardRepTile(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        View inflate = from.inflate(d.board_rep_tiles, this);
        View findViewById = inflate.findViewById(c.pin_iv_1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f45164a = webImageView;
        View findViewById2 = inflate.findViewById(c.pin_iv_2);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById2;
        View findViewById3 = inflate.findViewById(c.pin_iv_3);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById3;
        int i14 = a.empty_lego_board_rep;
        Object obj = d5.a.f53679a;
        int color = context.getColor(i14);
        webImageView.setBackgroundColor(color);
        webImageView2.setBackgroundColor(color);
        webImageView3.setBackgroundColor(color);
        int b03 = bs1.c.b0(this, eo1.c.rounding_400);
        if (j1.Y0(context)) {
            float f13 = b03;
            webImageView.g2(0.0f, f13, 0.0f, f13);
            webImageView2.g2(f13, 0.0f, 0.0f, 0.0f);
            webImageView3.g2(0.0f, 0.0f, f13, 0.0f);
            return;
        }
        float f14 = b03;
        webImageView.g2(f14, 0.0f, f14, 0.0f);
        webImageView2.g2(0.0f, f14, 0.0f, 0.0f);
        webImageView3.g2(0.0f, 0.0f, 0.0f, f14);
    }
}
