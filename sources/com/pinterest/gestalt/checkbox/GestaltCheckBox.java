package com.pinterest.gestalt.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import em1.d;
import em1.e;
import em1.g;
import em1.h;
import em1.i;
import em1.r;
import fm1.c;
import gm1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.f;
import org.jetbrains.annotations.NotNull;
import u50.h0;
import u50.i0;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\r\u000e\u000f\u0003\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/pinterest/gestalt/checkbox/GestaltCheckBox;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lem1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "em1/b", "em1/c", "al1/n", "em1/e", "checkbox_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltCheckBox extends ConstraintLayout implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final em1.b f49354f = em1.b.UNCHECKED;

    /* renamed from: g, reason: collision with root package name */
    public static final e f49355g = e.ENABLED;

    /* renamed from: h, reason: collision with root package name */
    public static final c f49356h = c.VISIBLE;

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f49357i;

    /* renamed from: j, reason: collision with root package name */
    public static final h0 f49358j;

    /* renamed from: k, reason: collision with root package name */
    public static final rn1.b f49359k;

    /* renamed from: a, reason: collision with root package name */
    public final q f49360a;

    /* renamed from: b, reason: collision with root package name */
    public View.OnClickListener f49361b;

    /* renamed from: c, reason: collision with root package name */
    public final v f49362c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f49363d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f49364e;

    static {
        h0 h0Var = h0.f120562a;
        f49357i = h0Var;
        f49358j = h0Var;
        f49359k = rn1.b.END;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltCheckBox(Context context, d initialDisplayState) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49362c = m.b(new yj1.d(this, 9));
        this.f49360a = new q(this, initialDisplayState);
        d0();
    }

    public final GestaltCheckBox L(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltCheckBox) this.f49360a.d(nextState, new g(this, a0()));
    }

    public final GestaltCheckBox T(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltCheckBox) this.f49360a.c(eventHandler, new em1.a(this, 1));
    }

    public final void X(d dVar, d dVar2) {
        GestaltText gestaltText;
        GestaltText j13;
        j1.v(dVar, dVar2, i.f59617j, new em1.a(this, 5));
        if ((dVar != null ? dVar.f59599b : null) != dVar2.f59599b || dVar.f59598a != dVar2.f59598a) {
            CheckBox Z = Z();
            d a03 = a0();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Z.setButtonDrawable(f.r(context, a03));
        }
        j1.v(dVar, dVar2, i.f59618k, new em1.a(this, 6));
        int i13 = 4;
        if (!Intrinsics.d(dVar != null ? dVar.f59601d : null, dVar2.f59601d) || dVar.f59604g != dVar2.f59604g || dVar.f59605h != dVar2.f59605h || dVar.f59606i != dVar2.f59606i) {
            i0 i0Var = a0().f59601d;
            int i14 = a0().f59604g;
            rn1.b bVar = a0().f59605h;
            boolean z13 = a0().f59606i;
            if (this.f49363d == null && !Intrinsics.d(i0Var, h0.f120562a)) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
                pp2.a.k(gestaltText2, i.f59623p);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.W = true;
                layoutParams.X = true;
                gestaltText2.setLayoutParams(layoutParams);
                addView(gestaltText2);
                a aVar = (a) this.f49360a.f33804b;
                if (aVar != null) {
                    gestaltText2.j(aVar);
                }
                p pVar = new p();
                pVar.j(this);
                pVar.m(gestaltText2.getId(), 6, Z().getId(), 7, ml2.c.c(dl2.b.E0(this, eo1.a.comp_checkbox_horizontal_gap)));
                pVar.m(gestaltText2.getId(), 7, 0, 7, ml2.c.c(dl2.b.E0(this, eo1.a.comp_checkbox_horizontal_gap)));
                pVar.l(gestaltText2.getId(), 3, Z().getId(), 3);
                pVar.l(gestaltText2.getId(), 4, Z().getId(), 4);
                pVar.H(gestaltText2.getId(), 0.0f);
                pVar.b(this);
                gestaltText2.k(this.f49361b);
                this.f49363d = gestaltText2;
            }
            GestaltText gestaltText3 = this.f49363d;
            if (gestaltText3 != null) {
                pp2.a.k(gestaltText3, new h(i0Var, i14, z13, bVar, this));
            }
            if (a0().f59606i && (gestaltText = this.f49363d) != null && (j13 = gestaltText.j(new gh1.e(this, i13))) != null) {
                j13.k(this.f49361b);
            }
        }
        j1.v(dVar, dVar2, i.f59619l, new em1.a(this, 7));
        j1.v(dVar, dVar2, i.f59620m, new g(dVar2, this));
        if (getId() != Integer.MIN_VALUE) {
            j1.v(dVar, dVar2, i.f59621n, new em1.a(this, i13));
        }
    }

    public final CheckBox Z() {
        Object value = this.f49362c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CheckBox) value;
    }

    public final d a0() {
        return (d) ((o) this.f49360a.f33803a);
    }

    public final void d0() {
        View.inflate(getContext(), em1.q.gestalt_checkbox, this);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        int c13 = ml2.c.c(dl2.b.E0(this, eo1.a.space_200));
        setPadding(c13, c13, c13, c13);
        setLayoutParams(layoutParams);
        setFocusableInTouchMode(true);
        setFocusable(true);
        X(null, a0());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltCheckBox(Context context) {
        this(context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltCheckBox(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltCheckBox(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49362c = m.b(new yj1.d(this, 9));
        int[] GestaltCheckbox = r.GestaltCheckbox;
        Intrinsics.checkNotNullExpressionValue(GestaltCheckbox, "GestaltCheckbox");
        this.f49360a = new q(this, attributeSet, i13, GestaltCheckbox, new em1.a(this, 0));
        d0();
    }
}
