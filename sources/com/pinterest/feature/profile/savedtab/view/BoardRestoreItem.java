package com.pinterest.feature.profile.savedtab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.makeramen.RoundedImageView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.radioGroup.GestaltRadio;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nz1.d;
import org.jetbrains.annotations.NotNull;
import uq.w;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/profile/savedtab/view/BoardRestoreItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardRestoreItem extends w implements n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f47568j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f47569d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltIconButton f47570e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltRadio f47571f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f47572g;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f47573h;

    /* renamed from: i, reason: collision with root package name */
    public final RoundedImageView f47574i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardRestoreItem(Context context) {
        super(context, 23);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_400);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.space_300);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelOffset;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelOffset;
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.soft_deletion_board_list_cell, this);
        View findViewById = findViewById(nz1.c.boards_radio);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47571f = (GestaltRadio) findViewById;
        View findViewById2 = findViewById(nz1.c.board_name_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47569d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.soft_deletion_board_secret_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47570e = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(nz1.c.soft_deletion_board_secret_cover);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47574i = (RoundedImageView) findViewById4;
        View findViewById5 = findViewById(nz1.c.board_pin_count_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47572g = (GestaltText) findViewById5;
        View findViewById6 = findViewById(nz1.c.boards_restore_list_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47573h = (WebImageView) findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardRestoreItem(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 23);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_400);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.space_300);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelOffset;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelOffset;
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.soft_deletion_board_list_cell, this);
        View findViewById = findViewById(nz1.c.boards_radio);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47571f = (GestaltRadio) findViewById;
        View findViewById2 = findViewById(nz1.c.board_name_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47569d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.soft_deletion_board_secret_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47570e = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(nz1.c.soft_deletion_board_secret_cover);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47574i = (RoundedImageView) findViewById4;
        View findViewById5 = findViewById(nz1.c.board_pin_count_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47572g = (GestaltText) findViewById5;
        View findViewById6 = findViewById(nz1.c.boards_restore_list_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47573h = (WebImageView) findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardRestoreItem(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 23, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_400);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(c.space_300);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelOffset;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelOffset;
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.soft_deletion_board_list_cell, this);
        View findViewById = findViewById(nz1.c.boards_radio);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47571f = (GestaltRadio) findViewById;
        View findViewById2 = findViewById(nz1.c.board_name_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47569d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.soft_deletion_board_secret_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47570e = (GestaltIconButton) findViewById3;
        View findViewById4 = findViewById(nz1.c.soft_deletion_board_secret_cover);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47574i = (RoundedImageView) findViewById4;
        View findViewById5 = findViewById(nz1.c.board_pin_count_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47572g = (GestaltText) findViewById5;
        View findViewById6 = findViewById(nz1.c.boards_restore_list_thumbnail);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47573h = (WebImageView) findViewById6;
    }
}
