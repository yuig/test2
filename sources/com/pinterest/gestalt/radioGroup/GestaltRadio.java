package com.pinterest.gestalt.radioGroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import bn1.d;
import com.google.firebase.messaging.q;
import df.j1;
import fm1.c;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\f\u0003B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/gestalt/radioGroup/GestaltRadio;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "Lgm1/b;", "Lan1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "radiogroup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltRadio extends AppCompatRadioButton implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final c f49479f = c.VISIBLE;

    /* renamed from: e, reason: collision with root package name */
    public final q f49480e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltRadio(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        q qVar = this.f49480e;
    }

    public final GestaltRadio b(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltRadio) this.f49480e.c(eventHandler, new an1.a(this, 1));
    }

    public final void c() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dl2.b.G0(this, eo1.a.comp_radiogroup_button_vertical_padding);
        setLayoutParams(layoutParams);
        setButtonDrawable(bs1.c.f0(this, bn1.a.gestalt_radio_button_drawable, null, null, 6));
        setFocusableInTouchMode(true);
        setFocusable(true);
    }

    public final void d(an1.b bVar, an1.b bVar2) {
        if (bVar2.f15701d != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, an1.c.f15702j, new an1.a(this, 2));
        }
        j1.v(bVar, bVar2, an1.c.f15703k, new an1.a(this, 3));
        j1.v(bVar, bVar2, an1.c.f15704l, new an1.a(this, 4));
        j1.v(bVar, bVar2, an1.c.f15705m, new an1.a(this, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltRadio(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltRadio = d.GestaltRadio;
        Intrinsics.checkNotNullExpressionValue(GestaltRadio, "GestaltRadio");
        q qVar = new q(this, attributeSet, i13, GestaltRadio, new an1.a(this, 0));
        this.f49480e = qVar;
        c();
        d(null, (an1.b) ((o) qVar.f33803a));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltRadio(Context context) {
        super(context, null, 0);
        an1.b initialDisplayState = new an1.b(true, false, f49479f, Integer.MIN_VALUE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49480e = new q(this, initialDisplayState);
        c();
        d(null, initialDisplayState);
    }
}
