package com.pinterest.component.board.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import bs1.c;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.ui.imageview.WebImageView;
import ec0.a;
import ga2.d;
import ga2.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oq.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/component/board/view/BoardRepPreviewImages;", "Lcom/pinterest/design/widget/RoundedCornersLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardRepPreviewImages extends RoundedCornersLayout {

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f44715f;

    /* renamed from: g, reason: collision with root package name */
    public final WebImageView f44716g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f44717h;

    /* renamed from: i, reason: collision with root package name */
    public final View f44718i;

    /* renamed from: j, reason: collision with root package name */
    public Function0 f44719j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardRepPreviewImages(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardRepPreviewImages(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.lego_board_rep_preview_images_stack_in_frame, this);
        View findViewById = findViewById(d.board_cover_primary);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f44715f = webImageView;
        View findViewById2 = findViewById(d.board_cover_secondary);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        WebImageView webImageView2 = (WebImageView) findViewById2;
        this.f44716g = webImageView2;
        View findViewById3 = findViewById(d.board_cover_tertiary);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        WebImageView webImageView3 = (WebImageView) findViewById3;
        this.f44717h = webImageView3;
        View findViewById4 = findViewById(d.board_cover_dark_wash);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44718i = findViewById4;
        i iVar = new i(this, 1);
        webImageView.Y(iVar);
        webImageView2.Y(iVar);
        webImageView3.Y(iVar);
        webImageView2.setElevation(c.W(this, eo1.c.space_200));
        webImageView.setElevation(c.W(this, eo1.c.space_300));
        webImageView3.setElevation(c.W(this, eo1.c.space_400));
        float W = c.W(this, eo1.c.sema_rounding_300);
        webImageView.g2(W, W, 0.0f, 0.0f);
        webImageView3.g2(c.l1(this) ? 0.0f : W, c.l1(this) ? W : 0.0f, 0.0f, 0.0f);
        a aVar = new a(W);
        webImageView.setOutlineProvider(aVar);
        webImageView2.setOutlineProvider(aVar);
        webImageView3.setOutlineProvider(aVar);
    }
}
