package com.pinterest.gestalt.searchField;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import cn1.e0;
import cn1.f0;
import cn1.j;
import cn1.j0;
import cn1.l;
import cn1.t;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import dm1.h;
import dn1.e;
import eo1.a;
import fm1.c;
import gm1.b;
import kh2.g0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import la1.k;
import om1.f;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rm1.i;
import u50.i0;
import u50.o;
import xk2.m;
import xk2.v;
import yl1.d;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0006\f\r\u0003\u000e\u000f\u0010B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/pinterest/gestalt/searchField/GestaltSearchField;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lcn1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cn1/c", "al1/n", "cn1/e", "cn1/f", "cn1/g", "searchField_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
public final class GestaltSearchField extends ConstraintLayout implements b {

    /* renamed from: a, reason: collision with root package name */
    public final q f49506a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49507b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49508c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49509d;

    /* renamed from: e, reason: collision with root package name */
    public final v f49510e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltIconButton f49511f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltButton f49512g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltIconButton f49513h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltIconButton f49514i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltText f49515j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltText f49516k;

    /* renamed from: l, reason: collision with root package name */
    public final v f49517l;

    /* renamed from: m, reason: collision with root package name */
    public final v f49518m;

    /* renamed from: n, reason: collision with root package name */
    public final v f49519n;

    /* renamed from: o, reason: collision with root package name */
    public final v f49520o;

    /* renamed from: p, reason: collision with root package name */
    public final v f49521p;

    /* renamed from: q, reason: collision with root package name */
    public GestaltIconButton f49522q;

    /* renamed from: r, reason: collision with root package name */
    public GestaltIconButton f49523r;

    /* renamed from: s, reason: collision with root package name */
    public LottieAnimationView f49524s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f49499t = i.SM;

    /* renamed from: u, reason: collision with root package name */
    public static final rm1.q f49500u = rm1.q.SEARCH;

    /* renamed from: v, reason: collision with root package name */
    public static final rm1.q f49501v = rm1.q.CLEAR;

    /* renamed from: w, reason: collision with root package name */
    public static final e f49502w = e.DEFAULT;

    /* renamed from: x, reason: collision with root package name */
    public static final c f49503x = c.VISIBLE;

    /* renamed from: y, reason: collision with root package name */
    public static final f f49504y = f.DEFAULT_WHITE;

    /* renamed from: z, reason: collision with root package name */
    public static final om1.e f49505z = om1.e.LG;
    public static final d A = d.TERTIARY;
    public static final dn1.d B = dn1.d.DEFAULT;
    public static final rm1.q C = rm1.q.ARROW_BACK;
    public static final rm1.q D = rm1.q.FILTER;
    public static final rm1.q E = rm1.q.ADD;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSearchField(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void T(GestaltSearchField gestaltSearchField, boolean z13, boolean z14, boolean z15, boolean z16, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        if ((i13 & 2) != 0) {
            z14 = false;
        }
        if ((i13 & 4) != 0) {
            z15 = false;
        }
        if ((i13 & 8) != 0) {
            z16 = false;
        }
        if (z13) {
            GestaltIconButton gestaltIconButton = gestaltSearchField.f49511f;
            if (gestaltIconButton != null) {
                com.bumptech.glide.c.u1(gestaltIconButton);
            }
        } else {
            GestaltIconButton gestaltIconButton2 = gestaltSearchField.f49511f;
            if (gestaltIconButton2 != null) {
                com.bumptech.glide.c.d0(gestaltIconButton2);
            }
        }
        GestaltButton gestaltButton = gestaltSearchField.f49512g;
        if (z14) {
            if (gestaltButton != null) {
                a0.v1(gestaltButton);
            }
        } else if (gestaltButton != null) {
            a0.l0(gestaltButton);
        }
        GestaltIconButton gestaltIconButton3 = gestaltSearchField.f49513h;
        if (z15) {
            if (gestaltIconButton3 != null) {
                com.bumptech.glide.c.u1(gestaltIconButton3);
            }
        } else if (gestaltIconButton3 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton3);
        }
        GestaltIconButton gestaltIconButton4 = gestaltSearchField.f49514i;
        if (z16) {
            if (gestaltIconButton4 != null) {
                com.bumptech.glide.c.u1(gestaltIconButton4);
            }
        } else if (gestaltIconButton4 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton4);
        }
    }

    public final void B0() {
        SearchView S0 = S0();
        S0.A(false);
        SearchView.SearchAutoComplete searchAutoComplete = S0.f16425p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.a(true);
        S0.requestFocus();
        bs1.c.V1(S0);
        if (S0.hasWindowFocus()) {
            return;
        }
        bs1.c.W1(S0);
    }

    public final ImageView F0() {
        Object value = this.f49518m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final cn1.d G0() {
        return (cn1.d) ((o) this.f49506a.f33803a);
    }

    public final ImageView H0() {
        Object value = this.f49517l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final String I0() {
        return S0().f16425p.getText().toString();
    }

    public final BitmapDrawable K0(int i13, int i14) {
        Drawable f03 = bs1.c.f0(this, i13, null, null, 6);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d7.b.A0(f03, dl2.b.x0(context, i14));
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        i iVar = f49499t;
        return d7.b.p0(f03, resources, dl2.b.G0(this, iVar.getDimenAttrRes()), dl2.b.G0(this, iVar.getDimenAttrRes()));
    }

    public final void L(GestaltText gestaltText) {
        om1.e eVar;
        om1.c w13;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean v03 = dl2.b.v0(a.comp_searchfield_label_has_leading_space, context);
        GestaltIconButton gestaltIconButton = this.f49511f;
        if (gestaltIconButton == null || (w13 = gestaltIconButton.w()) == null || (eVar = w13.f96640b) == null) {
            eVar = f49505z;
        }
        gestaltText.setPaddingRelative((v03 && G0().f28162k == e.LEADING_ICON_BUTTON) ? dl2.b.G0(this, eVar.getBackgroundSize()) + (dl2.b.G0(this, a.comp_searchfield_horizontal_gap) * 2) : dl2.b.G0(this, a.comp_searchfield_horizontal_gap), gestaltText.getPaddingTop(), gestaltText.getPaddingEnd(), gestaltText.getPaddingBottom());
    }

    public final LinearLayout L0() {
        Object value = this.f49519n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final SearchView.SearchAutoComplete P0() {
        Object value = this.f49521p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SearchView.SearchAutoComplete) value;
    }

    public final SearchView S0() {
        Object value = this.f49510e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SearchView) value;
    }

    public final void T0(boolean z13) {
        if (this.f49524s != null) {
            gm1.a aVar = (gm1.a) this.f49506a.f33804b;
            if (aVar != null) {
                aVar.h3(new t(getId()));
            }
            z0(z13);
            c0.d.j(this, cn1.a.f28116n);
        }
    }

    public final void X() {
        int G0 = dl2.b.G0(this, a.space_0);
        int G02 = dl2.b.G0(this, a.comp_searchfield_horizontal_padding);
        int G03 = dl2.b.G0(this, a.space_0);
        if (G0().f28162k != e.LEADING_ICON_BUTTON && H0().getDrawable() != null && !bs1.c.o1(F0())) {
            i0 i0Var = G0().f28152a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (i0Var.a(context).toString().length() <= 0) {
                G02 = G0;
            }
        }
        v vVar = this.f49520o;
        Object value = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) value).getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            pp2.a.P0(layoutParams2, G0, layoutParams2.topMargin, G0, layoutParams2.bottomMargin);
            Object value2 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((LinearLayout) value2).setPaddingRelative(G02, getPaddingTop(), G0, getPaddingBottom());
        }
        ViewGroup.LayoutParams layoutParams3 = H0().getLayoutParams();
        if (layoutParams3 != null) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            pp2.a.P0(layoutParams4, layoutParams4.getMarginStart(), layoutParams4.topMargin, G03, layoutParams4.bottomMargin);
        }
        P0().setPaddingRelative(G0, P0().getPaddingTop(), G0, P0().getPaddingBottom());
        F0().setPaddingRelative(dl2.b.G0(this, a.space_200), getPaddingTop(), dl2.b.G0(this, a.space_400), getPaddingBottom());
    }

    public final void Y0(cn1.d dVar, cn1.d dVar2) {
        int i13 = 2;
        if (this.f49507b) {
            j1.v(dVar, dVar2, cn1.a.f28117o, new cn1.i(this, dVar2, i13));
            Z();
            return;
        }
        if (dVar2.f28156e == null) {
            o0(f49500u, S0().hasFocus());
        } else {
            j1.v(dVar, dVar2, cn1.a.f28123u, new cn1.i(this, dVar2, 11));
        }
        j1.v(dVar, dVar2, cn1.a.f28128z, new cn1.i(this, dVar2, 12));
        j1.v(dVar, dVar2, cn1.a.A, new cn1.i(this, dVar2, 13));
        j1.v(dVar, dVar2, cn1.a.B, new cn1.i(this, dVar2, 14));
        j1.v(dVar, dVar2, cn1.a.C, new cn1.b(this, i13));
        int i14 = 3;
        j1.v(dVar, dVar2, cn1.a.f28118p, new cn1.b(this, i14));
        j1.v(dVar, dVar2, cn1.a.f28119q, new cn1.i(this, dVar2, i14));
        j1.v(dVar, dVar2, cn1.a.f28120r, new cn1.i(this, dVar2, 4));
        j1.v(dVar, dVar2, cn1.a.f28121s, new cn1.i(this, dVar2, 5));
        if (dVar2.f28169r != Integer.MIN_VALUE) {
            j1.v(dVar, dVar2, cn1.a.f28122t, new cn1.i(this, dVar2, 6));
        }
        j1.v(dVar, dVar2, cn1.a.f28124v, new cn1.i(this, dVar2, 7));
        j1.v(dVar, dVar2, cn1.a.f28125w, new cn1.i(this, dVar2, 8));
        j1.v(dVar, dVar2, cn1.a.f28126x, new cn1.i(this, dVar2, 9));
        j1.v(dVar, dVar2, cn1.a.f28127y, new cn1.i(this, dVar2, 10));
        if (this.f49508c) {
            j1.v(dVar, dVar2, cn1.a.f28115m, new cn1.i(dVar2, this));
        }
        if (((gm1.a) this.f49506a.f33804b) == null) {
            g0(new k(19, this, cn1.a.f28114l));
        }
    }

    public final void Z() {
        GestaltIconButton gestaltIconButton = G0().f28157f != null ? (GestaltIconButton) findViewById(f0.gestalt_search_trailing_icon_button) : null;
        GestaltIconButton gestaltIconButton2 = G0().f28158g != null ? (GestaltIconButton) findViewById(f0.gestalt_search_left_trailing_icon_button) : null;
        int i13 = (this.f49508c && G0().f28170s) ? a.comp_searchfield_error_helper_icon_color : a.comp_searchfield_clear_icon_color;
        i0 i0Var = G0().f28152a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (i0Var.a(context).toString().length() <= 0) {
            bs1.c.X0(F0());
            rm1.q qVar = G0().f28156e;
            if (qVar == null) {
                qVar = f49500u;
            }
            o0(qVar, S0().hasFocus());
            if (gestaltIconButton != null) {
                bs1.c.U1(gestaltIconButton);
            }
            if (gestaltIconButton2 != null) {
                bs1.c.U1(gestaltIconButton2);
                return;
            }
            return;
        }
        ImageView F0 = F0();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        F0.setImageDrawable(K0(f49501v.drawableRes(context2), i13));
        Unit unit = Unit.f80348a;
        bs1.c.U1(this);
        bs1.c.X0(H0());
        if (gestaltIconButton != null) {
            bs1.c.X0(gestaltIconButton);
        }
        if (gestaltIconButton2 != null) {
            bs1.c.X0(gestaltIconButton2);
        }
        T0(false);
    }

    public final GestaltSearchField a0(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltSearchField) this.f49506a.d(nextState, new cn1.i(this, G0(), 0));
    }

    public final void b1() {
        S0().setBackgroundResource(e0.searchfield_bg_default);
        i0 i0Var = G0().f28154c;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        k0(i0Var.a(context).toString(), vn1.c.SUBTLE, null);
    }

    public final void d0(cn1.c cVar, cn1.c cVar2) {
        GestaltIconButton gestaltIconButton;
        GestaltIconButton gestaltIconButton2;
        q qVar = this.f49506a;
        if (cVar != null) {
            om1.c s03 = g0.s0(cVar);
            if (this.f49513h == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltIconButton gestaltIconButton3 = new GestaltIconButton(context, s03);
                this.f49513h = gestaltIconButton3;
                addView(gestaltIconButton3);
                gm1.a aVar = (gm1.a) qVar.f33804b;
                if (aVar != null && (gestaltIconButton2 = this.f49513h) != null) {
                    gestaltIconButton2.u(aVar);
                }
            }
            GestaltIconButton gestaltIconButton4 = this.f49513h;
            if (gestaltIconButton4 != null) {
                gestaltIconButton4.t(new h(s03, 2));
            }
        }
        if (cVar2 != null) {
            om1.c s04 = g0.s0(cVar2);
            if (this.f49514i == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                GestaltIconButton gestaltIconButton5 = new GestaltIconButton(context2, s04);
                this.f49514i = gestaltIconButton5;
                addView(gestaltIconButton5);
                gm1.a aVar2 = (gm1.a) qVar.f33804b;
                if (aVar2 != null && (gestaltIconButton = this.f49514i) != null) {
                    gestaltIconButton.u(aVar2);
                }
            }
            GestaltIconButton gestaltIconButton6 = this.f49514i;
            if (gestaltIconButton6 != null) {
                gestaltIconButton6.t(new h(s04, 3));
            }
        }
    }

    public final GestaltSearchField g0(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltSearchField) this.f49506a.c(eventHandler, new cn1.b(this, 1));
    }

    public final void k0(String str, vn1.c cVar, rm1.d dVar) {
        if (this.f49516k == null && str.length() > 0) {
            int i13 = f0.gestalt_searchfield_helper_text;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            pp2.a.k(gestaltText, new zx0.d(i13, 28));
            this.f49516k = gestaltText;
            addView(gestaltText);
            p pVar = new p();
            pVar.j(this);
            pVar.m(i13, 3, f0.gestalt_search_field, 4, this.f49509d);
            pVar.l(i13, 6, getId(), 6);
            pVar.b(this);
        }
        GestaltText gestaltText2 = this.f49516k;
        if (gestaltText2 != null) {
            L(gestaltText2.i(new j(str, cVar, dVar, 0)));
        }
    }

    public final void o0(rm1.q qVar, boolean z13) {
        if (!z13 && G0().f28162k != e.LEADING_ICON_BUTTON) {
            i0 i0Var = G0().f28152a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (i0Var.a(context).toString().length() == 0) {
                ImageView H0 = H0();
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                H0.setImageDrawable(K0(qVar.drawableRes(context2), a.comp_searchfield_search_icon_color));
                X();
            }
        }
        H0().setImageDrawable(null);
        X();
    }

    public final void r0(String str) {
        this.f49507b = true;
        cn1.d G0 = G0();
        if (str == null) {
            str = "";
        }
        a0(new an1.i(cn1.d.e(G0, bs1.c.h2(str), null, null, null, null, null, null, null, null, null, null, 524286), 2));
        X();
        this.f49507b = false;
    }

    public final void t0() {
        SearchView S0 = S0();
        S0.clearFocus();
        hf0.b.k(S0);
    }

    public final void z0(boolean z13) {
        LottieAnimationView lottieAnimationView = this.f49524s;
        if (lottieAnimationView != null) {
            ViewParent parent = lottieAnimationView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(lottieAnimationView);
            }
            this.f49524s = null;
            if (z13) {
                GestaltIconButton gestaltIconButton = this.f49522q;
                if (gestaltIconButton != null) {
                    bs1.c.U1(gestaltIconButton);
                }
                GestaltIconButton gestaltIconButton2 = this.f49523r;
                if (gestaltIconButton2 != null) {
                    bs1.c.U1(gestaltIconButton2);
                }
            }
        }
    }

    public /* synthetic */ GestaltSearchField(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSearchField(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f49508c = dl2.b.v0(a.comp_searchfield_hasErrorState, context2);
        this.f49509d = dl2.b.G0(this, a.comp_searchfield_vertical_gap);
        this.f49510e = m.b(new l(this, 4));
        this.f49517l = m.b(new l(this, 1));
        int i14 = 0;
        this.f49518m = m.b(new l(this, i14));
        this.f49519n = m.b(new l(this, 3));
        this.f49520o = m.b(new l(this, 2));
        this.f49521p = m.b(new cn1.m(this));
        int[] GestaltSearchField = j0.GestaltSearchField;
        Intrinsics.checkNotNullExpressionValue(GestaltSearchField, "GestaltSearchField");
        this.f49506a = new q(this, attributeSet, i13, GestaltSearchField, new cn1.b(this, i14));
        View.inflate(getContext(), cn1.g0.gestalt_searchfield, this);
        setMinHeight(dl2.b.G0(this, a.comp_searchfield_minimum_height));
        Y0(null, G0());
        X();
    }
}
