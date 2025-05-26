package com.pinterest.feature.board.edit.view;

import a70.a;
import a70.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.feature.board.headerimage.BoardHeaderImageView;
import com.pinterest.feature.board.headerimage.WashedWebImageView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ol0.d;
import ol0.j;
import ol0.k;
import ol0.l;
import ol0.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/board/edit/view/BoardHeaderImagePreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "edit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardHeaderImagePreview extends ConstraintLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f45248g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final BoardHeaderImageView f45249a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45250b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIcon f45251c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f45252d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltIconButton f45253e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f45254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardHeaderImagePreview(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f45254f = l.f96398j;
        View inflate = View.inflate(context, b.view_board_header_preview, this);
        View findViewById = inflate.findViewById(a.board_header_image_container);
        BoardHeaderImageView boardHeaderImageView = (BoardHeaderImageView) findViewById;
        boardHeaderImageView.getClass();
        Intrinsics.checkNotNullParameter("9:5", "aspectRatio");
        WashedWebImageView washedWebImageView = boardHeaderImageView.f45273c;
        ViewGroup.LayoutParams layoutParams = washedWebImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.G = "9:5";
        washedWebImageView.setLayoutParams(layoutParams2);
        boardHeaderImageView.Z(c.W(boardHeaderImageView, d70.b.board_header_image_preview_height));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45249a = boardHeaderImageView;
        View findViewById2 = inflate.findViewById(a.overlay_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45250b = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(a.overlay_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45251c = (GestaltIcon) findViewById3;
        View findViewById4 = inflate.findViewById(a.edit_header_image_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45252d = (GestaltIconButton) findViewById4;
        View findViewById5 = inflate.findViewById(a.delete_header_image_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45253e = (GestaltIconButton) findViewById5;
    }

    public final void L(d deleteListener) {
        Intrinsics.checkNotNullParameter(deleteListener, "deleteListener");
        this.f45253e.u(new defpackage.a(11, deleteListener));
    }

    public final void T(m displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        String str = displayState.f96404a;
        BoardHeaderImageView boardHeaderImageView = this.f45249a;
        BoardHeaderImageView.L(boardHeaderImageView, str, null, null, false, 62);
        boardHeaderImageView.getLayoutParams().height = c.W(boardHeaderImageView, d70.b.board_header_image_preview_height);
        boardHeaderImageView.setOnClickListener(new xa0.m(8, displayState, this));
        this.f45250b.i(new j(this, displayState, 0));
        dl2.b.z(this.f45251c, new j(displayState, this));
        this.f45253e.t(new k(displayState, 0));
        this.f45252d.t(new k(displayState, 1));
    }

    public final void X(d editListener) {
        Intrinsics.checkNotNullParameter(editListener, "editListener");
        this.f45254f = editListener;
        this.f45252d.u(new defpackage.a(10, editListener));
    }
}
