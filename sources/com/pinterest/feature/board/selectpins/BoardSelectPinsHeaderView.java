package com.pinterest.feature.board.selectpins;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import d70.d;
import d70.e;
import eo1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m1.e0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pp2.a;
import u50.i0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/feature/board/selectpins/BoardSelectPinsHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardSelectPinsHeaderView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIconButton f45316a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45317b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f45318c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f45319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardSelectPinsHeaderView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View inflate = View.inflate(context, e.board_select_pins_header_view, this);
        View findViewById = inflate.findViewById(d.board_select_pins_cancel);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45316a = (GestaltIconButton) findViewById;
        View findViewById2 = inflate.findViewById(d.board_select_pins_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45317b = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(d.board_select_pins_description);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45318c = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(d.board_select_pins_select_all_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45319d = (GestaltButton) findViewById4;
        inflate.setBackgroundColor(c.B(inflate, b.color_background_default));
    }

    public final void L(xm0.d state) {
        Intrinsics.checkNotNullParameter(state, "state");
        i0 i0Var = state.f135355a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        a.k(this.f45317b, new ip.d(15, i0Var.a(context)));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        a.k(this.f45318c, new ip.d(16, state.f135356b.a(context2)));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        c.s(this.f45319d, new ip.d(17, state.f135357c.a(context3)));
    }

    public final void T(Function0 onCancelAction, Function0 onSelectAllAction) {
        Intrinsics.checkNotNullParameter(onCancelAction, "onCancelAction");
        Intrinsics.checkNotNullParameter(onSelectAllAction, "onSelectAllAction");
        com.bumptech.glide.c.m(this.f45316a, new e0(27, onCancelAction));
        a0.m(this.f45319d, new e0(28, onSelectAllAction));
    }
}
