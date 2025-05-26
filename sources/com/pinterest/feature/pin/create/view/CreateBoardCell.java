package com.pinterest.feature.pin.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import d5.a;
import eo1.b;
import f02.e;
import f02.g;
import f11.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/create/view/CreateBoardCell;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "repinLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreateBoardCell extends LinearLayout implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47068c = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f47069a;

    /* renamed from: b, reason: collision with root package name */
    public c f47070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBoardCell(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        b(context);
    }

    public final GestaltText a() {
        GestaltText gestaltText = this.f47069a;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("createButton");
        throw null;
    }

    public final void b(Context context) {
        View.inflate(context, e.lego_create_board_cell, this);
        int i13 = b.color_themed_background_elevation_floating;
        Object obj = a.f53679a;
        setBackgroundColor(context.getColor(i13));
        View findViewById = findViewById(f02.c.board_add_iv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(f02.c.create_board_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f47069a = gestaltText;
        setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(f02.a.lego_create_board_cell_height));
        layoutParams.gravity = 81;
        setLayoutParams(layoutParams);
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 19));
        setContentDescription(context.getString(g.create_board));
    }

    public final void e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        a().i(new zu0.c(text, 21));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBoardCell(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        b(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBoardCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        b(context);
    }
}
