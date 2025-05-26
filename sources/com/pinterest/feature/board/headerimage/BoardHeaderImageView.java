package com.pinterest.feature.board.headerimage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import eo1.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.i;
import vl0.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/board/headerimage/BoardHeaderImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "pe/i", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardHeaderImageView extends ConstraintLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f45270e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45271a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45272b;

    /* renamed from: c, reason: collision with root package name */
    public final WashedWebImageView f45273c;

    /* renamed from: d, reason: collision with root package name */
    public final WashedWebImageView f45274d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BoardHeaderImageView(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r1 = this;
            r0 = r3 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto Lb
            r2 = r0
        Lb:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1.<init>(r4, r5, r2, r0)
            int r2 = d70.e.view_board_header_image
            android.view.View r2 = android.view.View.inflate(r4, r2, r1)
            int r3 = d70.d.board_title_on_header_image
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r5 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r1.f45271a = r3
            int r3 = d70.d.board_subtitle_on_header_image
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r1.f45272b = r3
            r1.setClipChildren(r0)
            int r3 = d70.d.board_header_image
            android.view.View r3 = r2.findViewById(r3)
            r5 = r3
            com.pinterest.feature.board.headerimage.WashedWebImageView r5 = (com.pinterest.feature.board.headerimage.WashedWebImageView) r5
            android.graphics.drawable.GradientDrawable r0 = pe.i.y1(r4)
            r5.j(r0)
            java.lang.String r0 = "apply(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.f45273c = r5
            int r3 = d70.d.board_header_image_blur
            android.view.View r2 = r2.findViewById(r3)
            r3 = r2
            com.pinterest.feature.board.headerimage.WashedWebImageView r3 = (com.pinterest.feature.board.headerimage.WashedWebImageView) r3
            android.graphics.drawable.GradientDrawable r4 = pe.i.y1(r4)
            r3.j(r4)
            ml0.t r4 = new ml0.t
            r5 = 1
            r4.<init>(r3, r5)
            java.lang.String r5 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r3.f45276d = r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.f45274d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.board.headerimage.BoardHeaderImageView.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public static void L(BoardHeaderImageView boardHeaderImageView, String str, String str2, String str3, boolean z13, int i13) {
        Unit unit = null;
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        boolean z14 = (i13 & 8) != 0;
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        boolean z15 = (i13 & 32) != 0;
        boardHeaderImageView.getClass();
        boolean Z0 = i.Z0();
        WashedWebImageView washedWebImageView = boardHeaderImageView.f45273c;
        if (Z0) {
            ViewGroup.LayoutParams layoutParams = washedWebImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = (j1.U0(str) && z14) ? 0 : -1;
            washedWebImageView.setLayoutParams(layoutParams);
        }
        GestaltText gestaltText = boardHeaderImageView.f45271a;
        if (z13) {
            ViewGroup.LayoutParams layoutParams2 = washedWebImageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
            washedWebImageView.setLayoutParams(layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = gestaltText.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams.setMargins(boardHeaderImageView.getResources().getDimensionPixelSize(c.space_400), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, boardHeaderImageView.getResources().getDimensionPixelSize(c.space_400));
            gestaltText.setLayoutParams(marginLayoutParams);
            gestaltText.i(a.f126104i);
        }
        WashedWebImageView washedWebImageView2 = boardHeaderImageView.f45274d;
        if (str != null) {
            washedWebImageView.loadUrl(str);
            if (i.Z0()) {
                washedWebImageView2.loadUrl(str);
            }
            unit = Unit.f80348a;
        }
        if (unit == null) {
            washedWebImageView.clear();
            washedWebImageView2.clear();
            if (z15) {
                bs1.c.U1(washedWebImageView);
            }
        }
        if (str2 != null) {
            gestaltText.i(new kl0.c(str2, 2));
        }
        boardHeaderImageView.f45272b.i(new kl0.c(str3, 3));
    }

    public final float T() {
        WashedWebImageView washedWebImageView = this.f45273c;
        return washedWebImageView.z1() / washedWebImageView.getWidth();
    }

    public final float X() {
        WashedWebImageView washedWebImageView = this.f45273c;
        return washedWebImageView.k0() / washedWebImageView.getHeight();
    }

    public final void Z(int i13) {
        WashedWebImageView washedWebImageView = this.f45273c;
        ViewGroup.LayoutParams layoutParams = washedWebImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        setMaxHeight(i13);
        washedWebImageView.setLayoutParams((ConstraintLayout.LayoutParams) layoutParams);
    }

    public final void a0(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        WashedWebImageView washedWebImageView = this.f45273c;
        washedWebImageView.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        washedWebImageView.f45276d = action;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardHeaderImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardHeaderImageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
