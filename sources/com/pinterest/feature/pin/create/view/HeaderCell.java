package com.pinterest.feature.pin.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import f02.c;
import f11.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l11.p;
import n.e;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import rq.o2;
import y01.p1;
import yk1.n;
import zx0.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/create/view/HeaderCell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "repinLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HeaderCell extends ConstraintLayout implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47072f = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestaltIconButton f47073a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f47074b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f47075c;

    /* renamed from: d, reason: collision with root package name */
    public h f47076d;

    /* renamed from: e, reason: collision with root package name */
    public final e f47077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderCell(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47077e = new e(this, 10);
        T(context);
    }

    public final void L(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -1);
        LinearLayout linearLayout = this.f47075c;
        if (linearLayout == null) {
            Intrinsics.r("rightActionButtonLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.f47075c;
        if (linearLayout2 != null) {
            linearLayout2.addView(view, layoutParams);
        } else {
            Intrinsics.r("rightActionButtonLayout");
            throw null;
        }
    }

    public final void T(Context context) {
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        View inflate = View.inflate(context, f02.e.lego_list_cell_board_picker_header, this);
        View findViewById = inflate.findViewById(c.icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47073a = (GestaltIconButton) findViewById;
        View findViewById2 = inflate.findViewById(c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47074b = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(c.actions_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = inflate.findViewById(c.right_button_action_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47075c = (LinearLayout) findViewById4;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        GestaltIconButton gestaltIconButton = this.f47073a;
        if (gestaltIconButton == null) {
            Intrinsics.r("cancelIcon");
            throw null;
        }
        gestaltIconButton.u(new p(this, 0));
        GestaltText gestaltText = this.f47074b;
        if (gestaltText == null) {
            Intrinsics.r("titleText");
            throw null;
        }
        gestaltText.i(new p1(this, 7));
        if (b.Q1()) {
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f47077e);
    }

    public final void X(q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        GestaltIconButton gestaltIconButton = this.f47073a;
        if (gestaltIconButton != null) {
            gestaltIconButton.t(new o2(icon, 15));
        } else {
            Intrinsics.r("cancelIcon");
            throw null;
        }
    }

    public final void Z(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47076d = listener;
    }

    public final void a0(int i13) {
        GestaltText gestaltText = this.f47074b;
        if (gestaltText != null) {
            gestaltText.i(new d(i13, 5));
        } else {
            Intrinsics.r("titleText");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f47077e);
        super.onDetachedFromWindow();
    }

    public final void p(String newTitle) {
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        GestaltText gestaltText = this.f47074b;
        if (gestaltText != null) {
            gestaltText.i(new zu0.c(newTitle, 23));
        } else {
            Intrinsics.r("titleText");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47077e = new e(this, 10);
        T(context);
    }
}
