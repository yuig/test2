package com.pinterest.gestalt.iconbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import fm1.a;
import fm1.c;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om1.d;
import om1.e;
import om1.f;
import om1.g;
import om1.h;
import om1.i;
import om1.j;
import om1.k;
import om1.s;
import om1.t;
import om1.w;
import om1.x;
import org.jetbrains.annotations.NotNull;
import ps0.m;
import rm1.n;
import rm1.q;
import u50.o;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\f\u0003\r\u000e\u000fB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/pinterest/gestalt/iconbutton/GestaltIconButton;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lgm1/b;", "Lom1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/m", "om1/d", "om1/e", "om1/f", "iconbutton_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes2.dex */
public final class GestaltIconButton extends s implements b {
    public static final m A = new m(22, 0);
    public static final e B = e.LG;
    public static final f C = f.DEFAULT_DARK_GRAY;
    public static final c D = c.VISIBLE;
    public static final q E = q.FILL_TRANSPARENT;
    public static final a F;

    /* renamed from: r, reason: collision with root package name */
    public View.OnClickListener f49386r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.firebase.messaging.q f49387s;

    /* renamed from: t, reason: collision with root package name */
    public final v f49388t;

    /* renamed from: u, reason: collision with root package name */
    public final v f49389u;

    /* renamed from: v, reason: collision with root package name */
    public GestaltText f49390v;

    /* renamed from: w, reason: collision with root package name */
    public GestaltIndicator f49391w;

    /* renamed from: x, reason: collision with root package name */
    public d f49392x;

    /* renamed from: y, reason: collision with root package name */
    public final k f49393y;

    /* renamed from: z, reason: collision with root package name */
    public Function0 f49394z;

    static {
        n nVar = n.ADD;
        F = a.AUTO;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltIconButton(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void A() {
        om1.b bVar = new om1.b(this, 8);
        om1.b bVar2 = new om1.b(this, 9);
        com.google.firebase.messaging.q qVar = this.f49387s;
        qVar.F(bVar, bVar2);
        qVar.I(new om1.b(this, 10), new om1.b(this, 11));
        com.google.firebase.messaging.q.K(qVar, false, new j(this, 0), new j(this, 1), 1);
    }

    public final boolean B() {
        return (w().f96641c == f.DEFAULT_RED || w().f96641c == f.DEFAULT_GRAY || w().f96641c == f.WASH_WHITE || w().f96641c == f.WASH_DARK_GRAY || !w().f96644f) ? false : true;
    }

    public final boolean C() {
        d dVar = this.f49392x;
        if (dVar != null) {
            return dVar == d.VISIBLE && w().f96640b == e.XL;
        }
        Intrinsics.r("labelVisibility");
        throw null;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (C()) {
            super.onMeasure(i13, i14);
            return;
        }
        int G0 = dl2.b.G0(this, w().f96640b.getBackgroundSize());
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingEnd() + getPaddingStart() + G0, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + G0, 1073741824));
    }

    public final GestaltIconButton t(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltIconButton) this.f49387s.d(nextState, new g(this, w(), 0));
    }

    public final GestaltIconButton u(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltIconButton) this.f49387s.c(eventHandler, new om1.b(this, 1));
    }

    public final void v(View.OnClickListener onClickListener) {
        this.f49386r = onClickListener;
        A();
    }

    public final om1.c w() {
        return (om1.c) ((o) this.f49387s.f33803a);
    }

    public final AppCompatButton x() {
        Object value = this.f49388t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppCompatButton) value;
    }

    public final void y() {
        el2.a entries = d.getEntries();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f49392x = (d) entries.get(dl2.b.O0(context, eo1.a.comp_iconbutton_label_visibility));
        s(1);
        r(1);
        View.inflate(getContext(), w.gestalt_icon_button_layout, this);
    }

    public final void z(om1.c cVar, om1.c cVar2) {
        x().setElevation(getResources().getDimension(t.elevation_normal));
        x().setClickable(false);
        x().setDuplicateParentStateEnabled(true);
        AppCompatButton x13 = x();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        x13.setBackground(pm1.a.a(context, cVar2));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable e13 = pm1.a.e(context2, cVar2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Intrinsics.checkNotNullParameter(cVar2, "<this>");
        Intrinsics.checkNotNullParameter(context3, "context");
        int F0 = dl2.b.F0(context3, cVar2.f96640b.getIconSize$iconbutton_release());
        e13.setBounds(0, 0, F0, F0);
        x().setCompoundDrawablesRelative(e13, null, null, null);
        j1.v(cVar, cVar2, i.f96659o, new g(cVar2, this));
        j1.v(cVar, cVar2, i.f96660p, new om1.b(this, 5));
        j1.v(cVar, cVar2, i.f96661q, new om1.b(this, 6));
        j1.v(cVar, cVar2, i.f96662r, new om1.b(this, 7));
        int i13 = 2;
        j1.v(cVar, cVar2, i.f96663s, new om1.b(this, i13));
        j1.v(cVar, cVar2, i.f96655k, new g(this, cVar2, 1));
        j1.v(cVar, cVar2, i.f96656l, new om1.b(this, 3));
        if (cVar2.f96647i != Integer.MIN_VALUE) {
            j1.v(cVar, cVar2, i.f96657m, new g(this, cVar2, i13));
        }
        j1.v(cVar, cVar2, i.f96658n, new om1.b(this, 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltIconButton(Context context, om1.c initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49388t = xk2.m.b(new h(this, 0));
        this.f49389u = xk2.m.b(new h(this, 1));
        this.f49393y = k.f96668k;
        this.f49394z = k.f96667j;
        this.f49387s = new com.google.firebase.messaging.q(this, initialDisplayState);
        y();
        z(null, initialDisplayState);
    }

    public /* synthetic */ GestaltIconButton(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltIconButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 0;
        this.f49388t = xk2.m.b(new h(this, i14));
        this.f49389u = xk2.m.b(new h(this, 1));
        this.f49393y = k.f96668k;
        this.f49394z = k.f96667j;
        int[] GestaltIconButton = x.GestaltIconButton;
        Intrinsics.checkNotNullExpressionValue(GestaltIconButton, "GestaltIconButton");
        this.f49387s = new com.google.firebase.messaging.q(this, attributeSet, i13, GestaltIconButton, new om1.b(this, i14));
        y();
        z(null, w());
    }
}
