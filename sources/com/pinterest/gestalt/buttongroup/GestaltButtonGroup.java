package com.pinterest.gestalt.buttongroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import cm1.e;
import cm1.f;
import cm1.h;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import df.j1;
import eo1.a;
import g92.d;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u50.f0;
import u50.i0;
import u50.o;
import xk2.m;
import xk2.v;
import yl1.c;
import yl1.g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\f\u0003\rB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/buttongroup/GestaltButtonGroup;", "Landroid/widget/LinearLayout;", "Lgm1/b;", "Lcm1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "cm1/e", "buttonGroup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltButtonGroup extends LinearLayout implements b {

    /* renamed from: j, reason: collision with root package name */
    public static final e f49332j = e.HORIZONTAL;

    /* renamed from: k, reason: collision with root package name */
    public static final c f49333k = c.SMALL;

    /* renamed from: l, reason: collision with root package name */
    public static final int f49334l = a.comp_buttongroup_lg_horizontal_gap;

    /* renamed from: m, reason: collision with root package name */
    public static final int f49335m = a.comp_buttongroup_lg_vertical_gap;

    /* renamed from: n, reason: collision with root package name */
    public static final fm1.c f49336n = fm1.c.VISIBLE;

    /* renamed from: a, reason: collision with root package name */
    public final q f49337a;

    /* renamed from: b, reason: collision with root package name */
    public d f49338b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltButton f49339c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltButton f49340d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltButton f49341e;

    /* renamed from: f, reason: collision with root package name */
    public final v f49342f;

    /* renamed from: g, reason: collision with root package name */
    public final v f49343g;

    /* renamed from: h, reason: collision with root package name */
    public final v f49344h;

    /* renamed from: i, reason: collision with root package name */
    public final v f49345i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltButtonGroup(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static yl1.b c(TypedArray typedArray, int i13, int i14, int i15, int i16, int i17, int i18) {
        String string = typedArray.getString(i13);
        if (string == null) {
            string = "";
        }
        f0 h23 = bs1.c.h2(string);
        yl1.d dVar = yl1.d.PRIMARY;
        int i19 = typedArray.getInt(i17, -1);
        if (i19 >= 0) {
            dVar = yl1.d.values()[i19];
        }
        g colorPalette = dVar.getColorPalette();
        boolean z13 = typedArray.getBoolean(i15, true);
        String string2 = typedArray.getString(i14);
        if (string2 != null) {
            string = string2;
        }
        return new yl1.b(h23, z13, d7.b.Y(typedArray, i16, fm1.c.VISIBLE), bs1.c.h2(string), colorPalette, null, null, null, i18, null, 736);
    }

    public static void i(GestaltButton gestaltButton) {
        ViewGroup.LayoutParams layoutParams;
        if (gestaltButton == null || (layoutParams = gestaltButton.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = 0;
        ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
    }

    public final GestaltButtonGroup a(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltButtonGroup) this.f49337a.d(nextState, new com.pinterest.framework.screens.q(10, this, d()));
    }

    public final GestaltButtonGroup b(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltButtonGroup) this.f49337a.c(eventHandler, new com.pinterest.framework.screens.q(11, this, eventHandler));
    }

    public final cm1.d d() {
        return (cm1.d) ((o) this.f49337a.f33803a);
    }

    public final void e() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d R1 = b.R1(context, a.comp_buttongroup_theme);
        this.f49338b = R1;
        if (R1 == null) {
            Intrinsics.r("theme");
            throw null;
        }
        if (R1 == d.VR) {
            View.inflate(getContext(), zl1.b.gestalt_button_group_vr, this);
        } else {
            View.inflate(getContext(), zl1.b.gestalt_button_group, this);
        }
        setBaselineAligned(false);
        View findViewById = findViewById(zl1.a.primary_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49339c = (GestaltButton) findViewById;
        View findViewById2 = findViewById(zl1.a.secondary_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49340d = (GestaltButton) findViewById2;
        h(null, d());
    }

    public final boolean f() {
        yl1.b h10;
        yl1.e eVar = null;
        if (g(d())) {
            GestaltButton gestaltButton = this.f49339c;
            if (gestaltButton == null) {
                Intrinsics.r("primaryButton");
                throw null;
            }
            yl1.e eVar2 = gestaltButton.h().f139309j;
            yl1.e eVar3 = yl1.e.FULL_WIDTH;
            if (eVar2 != eVar3) {
                return false;
            }
            GestaltButton gestaltButton2 = this.f49340d;
            if (gestaltButton2 == null) {
                Intrinsics.r("secondaryButton");
                throw null;
            }
            if (gestaltButton2.h().f139309j != eVar3) {
                return false;
            }
            GestaltButton gestaltButton3 = this.f49341e;
            if (gestaltButton3 != null && (h10 = gestaltButton3.h()) != null) {
                eVar = h10.f139309j;
            }
            if (eVar != eVar3) {
                return false;
            }
        } else {
            GestaltButton gestaltButton4 = this.f49339c;
            if (gestaltButton4 == null) {
                Intrinsics.r("primaryButton");
                throw null;
            }
            yl1.e eVar4 = gestaltButton4.h().f139309j;
            yl1.e eVar5 = yl1.e.FULL_WIDTH;
            if (eVar4 != eVar5) {
                return false;
            }
            GestaltButton gestaltButton5 = this.f49340d;
            if (gestaltButton5 == null) {
                Intrinsics.r("secondaryButton");
                throw null;
            }
            if (gestaltButton5.h().f139309j != eVar5) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(cm1.d dVar) {
        i0 i0Var;
        yl1.b bVar = dVar.f28014c;
        if (bVar == null || (i0Var = bVar.f139300a) == null) {
            return false;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence a13 = i0Var.a(context);
        return a13 != null && a13.length() > 0;
    }

    public final void h(cm1.d dVar, cm1.d dVar2) {
        int i13 = 1;
        j1.v(dVar, dVar2, cm1.b.f28008l, new cm1.c(this, i13));
        GestaltButton gestaltButton = this.f49339c;
        if (gestaltButton == null) {
            Intrinsics.r("primaryButton");
            throw null;
        }
        gestaltButton.d(new h(dVar2, 0));
        GestaltButton gestaltButton2 = this.f49340d;
        if (gestaltButton2 == null) {
            Intrinsics.r("secondaryButton");
            throw null;
        }
        gestaltButton2.d(new h(dVar2, i13));
        yl1.b bVar = dVar2.f28014c;
        if (bVar != null && g(dVar2)) {
            if (this.f49341e == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltButton gestaltButton3 = new GestaltButton(0, 14, context, (AttributeSet) null);
                bs1.c.s(gestaltButton3, cm1.b.f28007k);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.weight = 0.5f;
                gestaltButton3.setLayoutParams(layoutParams);
                addView(gestaltButton3, 0);
                this.f49341e = gestaltButton3;
            }
            GestaltButton gestaltButton4 = this.f49341e;
            if (gestaltButton4 != null) {
                gestaltButton4.d(new com.pinterest.framework.screens.q(12, bVar, dVar2));
            }
        }
        boolean f13 = f();
        e eVar = dVar2.f28016e;
        if (f13 && eVar != e.VERTICAL) {
            GestaltButton gestaltButton5 = this.f49339c;
            if (gestaltButton5 == null) {
                Intrinsics.r("primaryButton");
                throw null;
            }
            i(gestaltButton5);
            GestaltButton gestaltButton6 = this.f49340d;
            if (gestaltButton6 == null) {
                Intrinsics.r("secondaryButton");
                throw null;
            }
            i(gestaltButton6);
            if (g(dVar2)) {
                i(this.f49341e);
            }
        }
        if (eVar != (dVar != null ? dVar.f28016e : null) || g(dVar2) != g(dVar)) {
            int i14 = f.f28019a[eVar.ordinal()];
            v vVar = this.f49345i;
            v vVar2 = this.f49344h;
            if (i14 == 1) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vVar2.getValue();
                layoutParams2.setMarginStart(0);
                layoutParams2.leftMargin = 0;
                v vVar3 = this.f49343g;
                layoutParams2.bottomMargin = ((Number) vVar3.getValue()).intValue();
                if (g(dVar2)) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) vVar.getValue();
                    layoutParams3.setMarginStart(0);
                    layoutParams3.leftMargin = 0;
                    layoutParams3.bottomMargin = ((Number) vVar3.getValue()).intValue();
                }
                d dVar3 = this.f49338b;
                if (dVar3 == null) {
                    Intrinsics.r("theme");
                    throw null;
                }
                if (dVar3 == d.VR && f()) {
                    ((LinearLayout.LayoutParams) vVar2.getValue()).width = -1;
                    ((LinearLayout.LayoutParams) vVar.getValue()).width = -1;
                    GestaltButton gestaltButton7 = this.f49341e;
                    ViewGroup.LayoutParams layoutParams4 = gestaltButton7 != null ? gestaltButton7.getLayoutParams() : null;
                    if (layoutParams4 != null) {
                        layoutParams4.width = -1;
                    }
                }
                setOrientation(1);
                setGravity(1);
                View view = this.f49340d;
                if (view == null) {
                    Intrinsics.r("secondaryButton");
                    throw null;
                }
                removeView(view);
                View view2 = this.f49340d;
                if (view2 == null) {
                    Intrinsics.r("secondaryButton");
                    throw null;
                }
                addView(view2);
                View view3 = this.f49341e;
                if (view3 != null) {
                    removeView(view3);
                    addView(view3);
                }
            } else if (i14 == 2) {
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) vVar2.getValue();
                v vVar4 = this.f49342f;
                layoutParams5.setMarginStart(((Number) vVar4.getValue()).intValue());
                ((LinearLayout.LayoutParams) vVar2.getValue()).bottomMargin = 0;
                if (!f()) {
                    ((LinearLayout.LayoutParams) vVar2.getValue()).width = -2;
                    ((LinearLayout.LayoutParams) vVar.getValue()).width = -2;
                    GestaltButton gestaltButton8 = this.f49341e;
                    ViewGroup.LayoutParams layoutParams6 = gestaltButton8 != null ? gestaltButton8.getLayoutParams() : null;
                    if (layoutParams6 != null) {
                        layoutParams6.width = -2;
                    }
                }
                if (g(dVar2)) {
                    ((LinearLayout.LayoutParams) vVar.getValue()).setMarginStart(((Number) vVar4.getValue()).intValue());
                    ((LinearLayout.LayoutParams) vVar2.getValue()).bottomMargin = 0;
                }
                setOrientation(0);
                setGravity(1);
                View view4 = this.f49340d;
                if (view4 == null) {
                    Intrinsics.r("secondaryButton");
                    throw null;
                }
                removeView(view4);
                View view5 = this.f49340d;
                if (view5 == null) {
                    Intrinsics.r("secondaryButton");
                    throw null;
                }
                addView(view5);
                View view6 = this.f49339c;
                if (view6 == null) {
                    Intrinsics.r("primaryButton");
                    throw null;
                }
                removeView(view6);
                View view7 = this.f49339c;
                if (view7 == null) {
                    Intrinsics.r("primaryButton");
                    throw null;
                }
                addView(view7);
            }
        }
        int i15 = dVar2.f28018g;
        if (i15 != Integer.MIN_VALUE) {
            setId(i15);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltButtonGroup(Context context, cm1.d initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49342f = m.b(new cm1.g(this, 0));
        this.f49343g = m.b(new cm1.g(this, 3));
        this.f49344h = m.b(new cm1.g(this, 1));
        this.f49345i = m.b(new cm1.g(this, 2));
        this.f49337a = new q(this, initialDisplayState);
        e();
    }

    public /* synthetic */ GestaltButtonGroup(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltButtonGroup(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 0;
        this.f49342f = m.b(new cm1.g(this, i14));
        this.f49343g = m.b(new cm1.g(this, 3));
        this.f49344h = m.b(new cm1.g(this, 1));
        this.f49345i = m.b(new cm1.g(this, 2));
        int[] GestaltButtonGroup = zl1.c.GestaltButtonGroup;
        Intrinsics.checkNotNullExpressionValue(GestaltButtonGroup, "GestaltButtonGroup");
        this.f49337a = new q(this, attributeSet, i13, GestaltButtonGroup, new cm1.c(this, i14));
        e();
    }
}
