package com.pinterest.feature.board.detail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import kl0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/board/detail/view/BoardExpandedSectionHeaderView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardExpandedSectionHeaderView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45242a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45243b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardExpandedSectionHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BoardExpandedSectionHeaderView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardExpandedSectionHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_400);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_200);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(c.space_400);
        setPaddingRelative(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize2);
        setLayoutParams(layoutParams);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(b.f80061j);
        addView(gestaltText);
        this.f45242a = gestaltText;
        View space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(-1, space.getResources().getDimensionPixelSize(c.space_100)));
        addView(space);
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(b.f80062k);
        addView(gestaltText2);
        this.f45243b = gestaltText2;
    }
}
