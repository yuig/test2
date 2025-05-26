package com.pinterest.feature.board.common.newideas.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tj0.a;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/board/common/newideas/view/MoreIdeasBoardNameTextView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardMoreIdeasLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MoreIdeasBoardNameTextView extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45136a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoreIdeasBoardNameTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MoreIdeasBoardNameTextView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreIdeasBoardNameTextView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(a.f117857q);
        b.y2(gestaltText);
        this.f45136a = gestaltText;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int W = c.W(this, eo1.c.space_400);
        setPadding(W, 0, W, 0);
        if (isLaidOut() && !isLayoutRequested()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = c.W(this, eo1.c.space_400) * (-1);
                marginLayoutParams.bottomMargin = c.W(this, eo1.c.space_500);
            }
        } else {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 11));
        }
        addView(gestaltText);
    }
}
