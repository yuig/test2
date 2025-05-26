package com.pinterest.settings;

import a52.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import bs1.c;
import c52.d;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rm1.q;
import rq.o2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/settings/SettingsRoundHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SettingsRoundHeaderView extends ConstraintLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f51775f = 0;

    /* renamed from: a, reason: collision with root package name */
    public View f51776a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltIconButton f51777b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f51778c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayout f51779d;

    /* renamed from: e, reason: collision with root package name */
    public View.OnClickListener f51780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRoundHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a0(context);
    }

    public static final void L(SettingsRoundHeaderView settingsRoundHeaderView) {
        int i13;
        int i14;
        GestaltIconButton gestaltIconButton = settingsRoundHeaderView.f51777b;
        if (gestaltIconButton == null) {
            Intrinsics.r("cancelIcon");
            throw null;
        }
        int I0 = c.I0(gestaltIconButton);
        LinearLayout linearLayout = settingsRoundHeaderView.f51779d;
        if (linearLayout == null) {
            Intrinsics.r("rightActionButtonLayout");
            throw null;
        }
        int I02 = c.I0(linearLayout);
        if (I0 > I02) {
            i14 = I0 - I02;
            i13 = 0;
        } else {
            i13 = I02 - I0;
            i14 = 0;
        }
        View view = settingsRoundHeaderView.f51776a;
        if (view == null) {
            Intrinsics.r("containerView");
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        p pVar = new p();
        pVar.j(constraintLayout);
        pVar.m(c52.c.title, 7, c52.c.right_button_action_layout, 6, i14);
        pVar.m(c52.c.title, 6, c52.c.icon, 7, i13);
        pVar.b(constraintLayout);
    }

    public final void T(View view) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -1);
        LinearLayout linearLayout = this.f51779d;
        if (linearLayout == null) {
            Intrinsics.r("rightActionButtonLayout");
            throw null;
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.f51779d;
        if (linearLayout2 != null) {
            linearLayout2.addView(view, layoutParams);
        } else {
            Intrinsics.r("rightActionButtonLayout");
            throw null;
        }
    }

    public final void X() {
        GestaltText gestaltText = this.f51778c;
        if (gestaltText != null) {
            gestaltText.i(b.f785i);
        } else {
            Intrinsics.r("title");
            throw null;
        }
    }

    public final GestaltIconButton Z() {
        GestaltIconButton gestaltIconButton = this.f51777b;
        if (gestaltIconButton != null) {
            return gestaltIconButton;
        }
        Intrinsics.r("cancelIcon");
        throw null;
    }

    public final void a0(Context context) {
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        View inflate = View.inflate(context, d.layout_settings_round_header_view, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.f51776a = inflate;
        if (inflate == null) {
            Intrinsics.r("containerView");
            throw null;
        }
        View findViewById = inflate.findViewById(c52.c.icon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f51777b = (GestaltIconButton) findViewById;
        View view = this.f51776a;
        if (view == null) {
            Intrinsics.r("containerView");
            throw null;
        }
        View findViewById2 = view.findViewById(c52.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f51778c = a0.v((GestaltText) findViewById2);
        View view2 = this.f51776a;
        if (view2 == null) {
            Intrinsics.r("containerView");
            throw null;
        }
        View findViewById3 = view2.findViewById(c52.c.right_button_action_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f51779d = (LinearLayout) findViewById3;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        GestaltIconButton gestaltIconButton = this.f51777b;
        if (gestaltIconButton == null) {
            Intrinsics.r("cancelIcon");
            throw null;
        }
        gestaltIconButton.u(new v02.d(this, 1));
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 27));
        } else {
            L(this);
        }
    }

    public final void d0(q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        GestaltIconButton gestaltIconButton = this.f51777b;
        if (gestaltIconButton != null) {
            gestaltIconButton.t(new o2(icon, 29));
        } else {
            Intrinsics.r("cancelIcon");
            throw null;
        }
    }

    public final void g0(View.OnClickListener onClickListener) {
        this.f51780e = onClickListener;
    }

    public final void k0(int i13) {
        GestaltText gestaltText = this.f51778c;
        if (gestaltText != null) {
            a0.o(gestaltText, i13, new Object[0]);
        } else {
            Intrinsics.r("title");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRoundHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a0(context);
    }
}
