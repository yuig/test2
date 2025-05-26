package com.pinterest.gestalt.splitButton.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import df.j1;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mn1.f;
import nn1.a;
import nn1.d;
import nn1.e;
import org.jetbrains.annotations.NotNull;
import rm1.q;
import u50.o;
import xk2.m;
import xk2.v;
import yl1.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\f\u0003\rB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/splitButton/view/GestaltSplitButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lnn1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "nn1/c", "splitButton_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltSplitButton extends ConstraintLayout implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final rn1.b f49606d = rn1.b.NONE;

    /* renamed from: e, reason: collision with root package name */
    public static final q f49607e = q.ARROW_DOWN;

    /* renamed from: f, reason: collision with root package name */
    public static final c f49608f = c.SMALL;

    /* renamed from: g, reason: collision with root package name */
    public static final nn1.c f49609g = nn1.c.PRIMARY;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.q f49610a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49611b;

    /* renamed from: c, reason: collision with root package name */
    public final v f49612c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSplitButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L() {
        ButtonWithEllipsize button = X();
        d doOnClick = d.f91544j;
        a makeClickEvent = new a(this, 1);
        com.google.firebase.messaging.q qVar = this.f49610a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(doOnClick, "doOnClick");
        Intrinsics.checkNotNullParameter(makeClickEvent, "makeClickEvent");
        int i13 = 0;
        button.setOnClickListener(new im1.a(doOnClick, qVar, makeClickEvent, i13));
        AppCompatButton button2 = T();
        d doOnClick2 = d.f91545k;
        a makeClickEvent2 = new a(this, 2);
        Intrinsics.checkNotNullParameter(button2, "button");
        Intrinsics.checkNotNullParameter(doOnClick2, "doOnClick");
        Intrinsics.checkNotNullParameter(makeClickEvent2, "makeClickEvent");
        button2.setOnClickListener(new im1.a(doOnClick2, qVar, makeClickEvent2, i13));
    }

    public final AppCompatButton T() {
        Object value = this.f49612c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppCompatButton) value;
    }

    public final ButtonWithEllipsize X() {
        Object value = this.f49611b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ButtonWithEllipsize) value;
    }

    public final void Z(nn1.b bVar, nn1.b bVar2) {
        j1.v(bVar, bVar2, d.f91552r, new a(this, 10));
        j1.v(bVar, bVar2, d.f91554t, new a(this, 11));
        j1.v(bVar, bVar2, d.f91555u, new a(this, 12));
        j1.v(bVar, bVar2, d.f91556v, new a(this, 13));
        j1.v(bVar, bVar2, d.f91557w, new a(this, 4));
        j1.v(bVar, bVar2, d.f91546l, new a(this, 5));
        int i13 = 6;
        if (j1.w(bVar2, bVar, d.f91547m) || j1.w(bVar2, bVar, d.f91548n)) {
            q qVar = bVar2.f91540f;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Drawable f03 = bs1.c.f0(this, qVar.drawableRes(context), null, null, 6);
            int G0 = dl2.b.G0(this, eo1.a.comp_iconbutton_sm_icon_size);
            f03.setBounds(0, 0, G0, G0);
            f03.setTintList(d5.a.b(getContext(), bVar2.f91536b.f91565d));
            T().setCompoundDrawablesRelative(f03, null, null, null);
        }
        j1.v(bVar, bVar2, d.f91549o, new a(this, i13));
        j1.v(bVar, bVar2, d.f91550p, new a(this, 7));
        j1.v(bVar, bVar2, d.f91551q, new a(this, 8));
        j1.v(bVar, bVar2, d.f91553s, new a(this, 9));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (((gm1.a) this.f49610a.f33804b) != null) {
            L();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (((gm1.a) this.f49610a.f33804b) != null) {
            ButtonWithEllipsize button = X();
            Intrinsics.checkNotNullParameter(button, "button");
            button.setOnClickListener(null);
            AppCompatButton button2 = T();
            Intrinsics.checkNotNullParameter(button2, "button");
            button2.setOnClickListener(null);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSplitButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49611b = m.b(new e(this, 1));
        this.f49612c = m.b(new e(this, 0));
        View.inflate(getContext(), mn1.e.split_button, this);
        int[] GestaltSplitButton = f.GestaltSplitButton;
        Intrinsics.checkNotNullExpressionValue(GestaltSplitButton, "GestaltSplitButton");
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(this, attributeSet, i13, GestaltSplitButton, new a(this, 0));
        this.f49610a = qVar;
        Z(null, (nn1.b) ((o) qVar.f33803a));
    }
}
