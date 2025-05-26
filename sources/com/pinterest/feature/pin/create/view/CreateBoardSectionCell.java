package com.pinterest.feature.pin.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import d5.a;
import eo1.b;
import f02.c;
import f02.e;
import f02.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/pin/create/view/CreateBoardSectionCell;", "Landroid/widget/LinearLayout;", "", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "repinLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreateBoardSectionCell extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f47071a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBoardSectionCell(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context);
    }

    public final void a(Context context) {
        setOrientation(0);
        View.inflate(context, e.lego_add_section_cell, this);
        View findViewById = findViewById(c.board_add_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        int i13 = b.color_themed_background_elevation_floating;
        Object obj = a.f53679a;
        setBackgroundColor(context.getColor(i13));
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 20));
        setContentDescription(context.getString(g.add_board_section));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBoardSectionCell(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBoardSectionCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context);
    }
}
