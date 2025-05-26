package com.pinterest.gestalt.radioGroup;

import an1.d;
import an1.e;
import an1.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import bn1.c;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import eo1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/gestalt/radioGroup/GestaltRadioButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lan1/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "radiogroup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltRadioButton extends ConstraintLayout implements b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f49481g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f49482a;

    /* renamed from: b, reason: collision with root package name */
    public WebImageView f49483b;

    /* renamed from: c, reason: collision with root package name */
    public final v f49484c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f49485d;

    /* renamed from: e, reason: collision with root package name */
    public final p f49486e;

    /* renamed from: f, reason: collision with root package name */
    public final q f49487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltRadioButton(Context context, e initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49482a = m.b(new f(this, 1));
        this.f49484c = m.b(new f(this, 0));
        this.f49486e = new p();
        this.f49487f = new q(this, initialDisplayState);
        X();
        Z(null, initialDisplayState);
    }

    public final GestaltText L() {
        Object value = this.f49484c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltText) value;
    }

    public final GestaltRadio T() {
        Object value = this.f49482a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltRadio) value;
    }

    public final void X() {
        View.inflate(getContext(), c.gestalt_radio_button_layout, this);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dl2.b.G0(this, a.comp_radiogroup_button_vertical_padding);
        setLayoutParams(layoutParams);
        setFocusableInTouchMode(true);
        setFocusable(true);
    }

    public final void Z(e eVar, e eVar2) {
        if (eVar2.f15727f != Integer.MIN_VALUE) {
            j1.v(eVar, eVar2, an1.c.f15708p, new d(this, 4));
        }
        j1.v(eVar, eVar2, an1.c.f15709q, new d(this, 5));
        j1.v(eVar, eVar2, an1.c.f15710r, new d(this, 6));
        j1.v(eVar, eVar2, an1.c.f15711s, new d(this, 7));
        j1.v(eVar, eVar2, an1.c.f15712t, new d(this, 2));
        j1.v(eVar, eVar2, an1.c.f15707o, new d(this, 3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltRadioButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltRadioButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49482a = m.b(new f(this, 1));
        int i14 = 0;
        this.f49484c = m.b(new f(this, i14));
        this.f49486e = new p();
        int[] GestaltRadioButton = bn1.d.GestaltRadioButton;
        Intrinsics.checkNotNullExpressionValue(GestaltRadioButton, "GestaltRadioButton");
        q qVar = new q(this, attributeSet, i13, GestaltRadioButton, new d(this, i14));
        this.f49487f = qVar;
        X();
        Z(null, (e) ((o) qVar.f33803a));
    }
}
