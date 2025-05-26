package com.pinterest.feature.board.common.filter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import d70.e;
import kj0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/board/common/filter/view/BoardPinsFilter;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardPinsFilter extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45116b = 0;

    /* renamed from: a, reason: collision with root package name */
    public a f45117a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardPinsFilter(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardPinsFilter(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.board_pins_filter_view, this);
        View findViewById = findViewById(t0.board_pins_filter_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((GestaltIconButton) findViewById).v(new lj0.a(this, 0));
    }
}
