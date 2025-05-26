package com.pinterest.gestalt.callout;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import dm1.d;
import dm1.e;
import dm1.g;
import dm1.i;
import dm1.p;
import dm1.s;
import fm1.c;
import gm1.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\f\u0003\rB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/callout/GestaltCallout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Ldm1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "dm1/d", "callout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltCallout extends ConstraintLayout implements b {

    /* renamed from: g, reason: collision with root package name */
    public static final d f49346g = d.NEUTRAL;

    /* renamed from: h, reason: collision with root package name */
    public static final c f49347h = c.VISIBLE;

    /* renamed from: a, reason: collision with root package name */
    public final q f49348a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49349b;

    /* renamed from: c, reason: collision with root package name */
    public final v f49350c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltIcon f49351d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltButtonGroup f49352e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltIconButton f49353f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltCallout(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final dm1.c L() {
        return (dm1.c) ((o) this.f49348a.f33803a);
    }

    public final GestaltText T() {
        return (GestaltText) this.f49350c.getValue();
    }

    public final GestaltText X() {
        return (GestaltText) this.f49349b.getValue();
    }

    public final void Z() {
        addView(X());
        addView(T());
        int b03 = bs1.c.b0(this, p.callout_corner_padding);
        setPadding(b03, b03, b03, b03);
        a0(null, L());
    }

    public final void a0(dm1.c cVar, dm1.c cVar2) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        Unit unit5;
        j1.v(cVar, cVar2, i.f55370l, new dm1.b(this, 4));
        j1.v(cVar, cVar2, i.f55371m, new dm1.b(this, 5));
        j1.v(cVar, cVar2, i.f55372n, new dm1.b(this, 6));
        j1.v(cVar, cVar2, i.f55373o, new dm1.b(this, 7));
        j1.v(cVar, cVar2, i.f55374p, new dm1.b(this, 1));
        j1.v(cVar, cVar2, i.f55368j, new dm1.b(this, 2));
        int i13 = 3;
        if (L().f55361g != Integer.MIN_VALUE) {
            j1.v(cVar, cVar2, i.f55369k, new dm1.b(this, i13));
        }
        androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
        pVar.j(this);
        GestaltIcon gestaltIcon = this.f49351d;
        if (gestaltIcon != null) {
            pVar.l(gestaltIcon.getId(), 6, 0, 6);
            if (L().f55355a.f108855m == c.VISIBLE) {
                pVar.l(gestaltIcon.getId(), 3, X().getId(), 3);
            } else {
                pVar.l(gestaltIcon.getId(), 3, T().getId(), 3);
            }
            pVar.l(gestaltIcon.getId(), 4, T().getId(), 4);
        }
        Unit unit6 = null;
        if (L().f55360f == d.NEUTRAL) {
            pVar.l(X().getId(), 3, 0, 3);
        } else {
            GestaltIconButton gestaltIconButton = this.f49353f;
            if (gestaltIconButton != null) {
                pVar.l(X().getId(), 3, gestaltIconButton.getId(), 3);
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                pVar.l(X().getId(), 3, 0, 3);
            }
            pVar.I(X().getId(), 3, bs1.c.b0(this, eo1.c.space_200));
        }
        GestaltIcon gestaltIcon2 = this.f49351d;
        if (gestaltIcon2 != null) {
            pVar.l(X().getId(), 6, gestaltIcon2.getId(), 7);
            pVar.I(X().getId(), 6, bs1.c.b0(this, eo1.c.space_400));
            pVar.E(X().getId(), 6, 0);
            unit2 = Unit.f80348a;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            pVar.l(X().getId(), 6, 0, 6);
        }
        GestaltIconButton gestaltIconButton2 = this.f49353f;
        if (gestaltIconButton2 != null) {
            pVar.l(X().getId(), 7, gestaltIconButton2.getId(), 6);
            unit3 = Unit.f80348a;
        } else {
            unit3 = null;
        }
        if (unit3 == null) {
            pVar.l(X().getId(), 7, 0, 7);
        }
        pVar.I(X().getId(), 7, bs1.c.b0(this, eo1.c.space_200));
        pVar.E(X().getId(), 7, 0);
        pVar.K(X().getId(), L().f55355a.f108855m.getVisibility());
        pVar.q(X().getId());
        pVar.H(X().getId(), 0.0f);
        if (L().f55355a.f108855m == c.GONE) {
            pVar.l(T().getId(), 3, 0, 3);
            pVar.I(T().getId(), 3, 0);
        } else {
            pVar.l(T().getId(), 3, X().getId(), 4);
            pVar.I(T().getId(), 3, bs1.c.b0(this, eo1.c.space_400));
        }
        GestaltIcon gestaltIcon3 = this.f49351d;
        if (gestaltIcon3 != null) {
            pVar.l(T().getId(), 6, gestaltIcon3.getId(), 7);
            pVar.I(T().getId(), 6, bs1.c.b0(this, eo1.c.space_400));
            pVar.E(T().getId(), 6, 0);
            unit4 = Unit.f80348a;
        } else {
            unit4 = null;
        }
        if (unit4 == null) {
            pVar.l(T().getId(), 6, 0, 6);
        }
        GestaltIconButton gestaltIconButton3 = this.f49353f;
        if (gestaltIconButton3 != null) {
            pVar.l(T().getId(), 7, gestaltIconButton3.getId(), 6);
            unit5 = Unit.f80348a;
        } else {
            unit5 = null;
        }
        if (unit5 == null) {
            pVar.l(T().getId(), 7, 0, 7);
        }
        GestaltButtonGroup gestaltButtonGroup = this.f49352e;
        if (gestaltButtonGroup != null) {
            pVar.l(T().getId(), 4, gestaltButtonGroup.getId(), 3);
            unit6 = Unit.f80348a;
        }
        if (unit6 == null) {
            pVar.l(T().getId(), 4, 0, 4);
        }
        pVar.q(T().getId());
        pVar.H(T().getId(), 0.0f);
        pVar.I(T().getId(), 7, bs1.c.b0(this, eo1.c.space_200));
        pVar.E(T().getId(), 7, 0);
        pVar.E(T().getId(), 3, 0);
        pVar.I(T().getId(), 4, bs1.c.b0(this, eo1.c.space_400));
        pVar.E(T().getId(), 4, 0);
        GestaltIconButton gestaltIconButton4 = this.f49353f;
        if (gestaltIconButton4 != null) {
            pVar.l(gestaltIconButton4.getId(), 3, 0, 3);
            pVar.l(gestaltIconButton4.getId(), 7, 0, 7);
            pVar.K(gestaltIconButton4.getId(), L().f55359e.f96642d.getVisibility());
        }
        GestaltButtonGroup gestaltButtonGroup2 = this.f49352e;
        if (gestaltButtonGroup2 != null) {
            pVar.l(gestaltButtonGroup2.getId(), 7, 0, 7);
            pVar.l(gestaltButtonGroup2.getId(), 4, 0, 4);
        }
        pVar.b(this);
        switch (e.f55363a[cVar2.f55360f.ordinal()]) {
            case 1:
                setBackgroundResource(dm1.q.callout_neutral_background);
                break;
            case 2:
                setBackgroundResource(dm1.q.callout_warning_background);
                break;
            case 3:
                setBackgroundResource(dm1.q.callout_info_background);
                break;
            case 4:
                setBackgroundResource(dm1.q.callout_recommendation_background);
                break;
            case 5:
                setBackgroundResource(dm1.q.callout_success_background);
                break;
            case 6:
                setBackgroundResource(dm1.q.callout_error_background);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltCallout(Context context, dm1.c displayState) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f49349b = m.b(new g(this, 1));
        this.f49350c = m.b(new g(this, 0));
        this.f49348a = new q(this, displayState);
        Z();
    }

    public /* synthetic */ GestaltCallout(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltCallout(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49349b = m.b(new g(this, 1));
        int i14 = 0;
        this.f49350c = m.b(new g(this, i14));
        int[] GestaltCallout = s.GestaltCallout;
        Intrinsics.checkNotNullExpressionValue(GestaltCallout, "GestaltCallout");
        this.f49348a = new q(this, attributeSet, i13, GestaltCallout, new dm1.b(this, i14));
        Z();
    }
}
