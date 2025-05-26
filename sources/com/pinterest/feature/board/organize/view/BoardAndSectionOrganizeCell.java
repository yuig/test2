package com.pinterest.feature.board.organize.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ar0.b;
import ar0.d;
import bs1.c;
import com.pinterest.feature.board.organize.a;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/board/organize/view/BoardAndSectionOrganizeCell;", "Landroid/widget/LinearLayout;", "Lcom/pinterest/feature/board/organize/a;", "Lar0/d;", "Lar0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "organize_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardAndSectionOrganizeCell extends LinearLayout implements a, d, b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f45295i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ProportionalImageView f45296a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45297b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f45298c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f45299d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltIcon f45300e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIcon f45301f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIcon f45302g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45303h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardAndSectionOrganizeCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ar0.b
    public final boolean b() {
        return true;
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem, reason: from getter */
    public final boolean getF45303h() {
        return this.f45303h;
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
    }

    @Override // ar0.d
    public final void onItemDragStart() {
    }

    public /* synthetic */ BoardAndSectionOrganizeCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardAndSectionOrganizeCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i14 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        setBackgroundColor(context.getColor(i14));
        View.inflate(context, h70.b.board_reorder_cell_view, this);
        View findViewById = findViewById(h70.a.boardThumbnailIv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById;
        this.f45296a = proportionalImageView;
        View findViewById2 = findViewById(h70.a.boardNameTv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45297b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(h70.a.pinCountTv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45298c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(h70.a.boardCellGrabber);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45299d = (GestaltIconButton) findViewById4;
        View findViewById5 = findViewById(h70.a.boardSecretIv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45300e = (GestaltIcon) findViewById5;
        View findViewById6 = findViewById(h70.a.boardCollabIv);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f45301f = (GestaltIcon) findViewById6;
        View findViewById7 = findViewById(h70.a.boardArchiveIv);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f45302g = (GestaltIcon) findViewById7;
        float Z = c.Z(this, eo1.c.rounding_300);
        proportionalImageView.g2(Z, Z, Z, Z);
    }
}
