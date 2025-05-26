package com.pinterest.gestalt.switchComponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import fm1.c;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import on1.e;
import on1.j;
import on1.k;
import on1.l;
import on1.n;
import on1.w;
import on1.x;
import org.jetbrains.annotations.NotNull;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.o;
import vn1.g;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\r\u0003\u000e\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/pinterest/gestalt/switchComponent/GestaltSwitchWithLabel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lon1/k;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "on1/l", "on1/n", "switchComponent_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltSwitchWithLabel extends ConstraintLayout implements b {

    /* renamed from: g, reason: collision with root package name */
    public static final c f49614g = c.VISIBLE;

    /* renamed from: h, reason: collision with root package name */
    public static final h0 f49615h = h0.f120562a;

    /* renamed from: i, reason: collision with root package name */
    public static final n f49616i = n.START;

    /* renamed from: j, reason: collision with root package name */
    public static final l f49617j = l.LEFT;

    /* renamed from: a, reason: collision with root package name */
    public final q f49618a;

    /* renamed from: b, reason: collision with root package name */
    public final v f49619b;

    /* renamed from: c, reason: collision with root package name */
    public final v f49620c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f49621d;

    /* renamed from: e, reason: collision with root package name */
    public final v f49622e;

    /* renamed from: f, reason: collision with root package name */
    public final p f49623f;

    static {
        g gVar = g.HEADING_XL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSwitchWithLabel(Context context, k initialDisplayState) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49619b = m.b(new on1.q(this, 0));
        this.f49620c = m.b(new on1.q(this, 1));
        this.f49622e = m.b(new on1.q(this, 2));
        this.f49623f = new p();
        this.f49618a = new q(this, initialDisplayState);
        View.inflate(getContext(), w.gestalt_switch_with_label, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        g0(null, Z());
    }

    public final void L(l lVar, GestaltText gestaltText) {
        int id3 = gestaltText.getId();
        p pVar = this.f49623f;
        pVar.h(id3, 6);
        pVar.h(gestaltText.getId(), 7);
        l lVar2 = l.LEFT;
        v vVar = this.f49622e;
        if (lVar == lVar2) {
            pVar.l(gestaltText.getId(), 6, 0, 6);
            this.f49623f.m(gestaltText.getId(), 7, a0().getId(), 6, ((Number) vVar.getValue()).intValue());
        } else {
            this.f49623f.m(gestaltText.getId(), 6, a0().getId(), 7, ((Number) vVar.getValue()).intValue());
            pVar.l(gestaltText.getId(), 7, 0, 7);
        }
        pVar.o(gestaltText.getId(), 0);
        pVar.n(gestaltText.getId(), -2);
    }

    public final GestaltSwitchWithLabel T(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltSwitchWithLabel) this.f49618a.d(nextState, new on1.p(this, Z()));
    }

    public final GestaltSwitchWithLabel X(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltSwitchWithLabel) this.f49618a.c(eventHandler, new j(this, 2));
    }

    public final k Z() {
        return (k) ((o) this.f49618a.f33803a);
    }

    public final GestaltSwitch a0() {
        Object value = this.f49619b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltSwitch) value;
    }

    public final GestaltText d0() {
        Object value = this.f49620c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GestaltText) value;
    }

    public final void g0(k kVar, k kVar2) {
        j1.v(kVar, kVar2, e.f96728v, new j(this, 5));
        j1.v(kVar, kVar2, e.f96729w, new j(this, 6));
        if (j1.w(kVar2, kVar, e.f96730x) || j1.w(kVar2, kVar, e.f96731y)) {
            i0 i0Var = kVar2.f96741b;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String string = i0Var.a(context).toString();
            Intrinsics.checkNotNullParameter(string, "string");
            d0().i(new xm1.k(11, kVar2, new f0(string)));
        }
        if ((j1.w(kVar2, kVar, e.f96732z) || j1.w(kVar2, kVar, e.A)) && kVar2.f96742c != null) {
            if (this.f49621d == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
                pp2.a.k(gestaltText, e.f96725s);
                this.f49623f.m(gestaltText.getId(), 3, d0().getId(), 4, bs1.c.W(gestaltText, eo1.c.space_200));
                L(Z().f96745f, gestaltText);
                addView(gestaltText);
                this.f49623f.b(this);
                this.f49621d = gestaltText;
            }
            GestaltText gestaltText2 = this.f49621d;
            if (gestaltText2 != null) {
                gestaltText2.i(new on1.p(kVar2, this));
            }
        }
        j1.v(kVar, kVar2, e.f96726t, new j(this, 3));
        if (kVar2.f96746g != Integer.MIN_VALUE) {
            j1.v(kVar, kVar2, e.f96727u, new j(this, 4));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSwitchWithLabel(Context context) {
        this(context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSwitchWithLabel(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSwitchWithLabel(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 0;
        this.f49619b = m.b(new on1.q(this, i14));
        this.f49620c = m.b(new on1.q(this, 1));
        this.f49622e = m.b(new on1.q(this, 2));
        this.f49623f = new p();
        int[] GestaltSwitch = x.GestaltSwitch;
        Intrinsics.checkNotNullExpressionValue(GestaltSwitch, "GestaltSwitch");
        this.f49618a = new q(this, attributeSet, i13, GestaltSwitch, new j(this, i14));
        View.inflate(getContext(), w.gestalt_switch_with_label, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        g0(null, Z());
    }
}
