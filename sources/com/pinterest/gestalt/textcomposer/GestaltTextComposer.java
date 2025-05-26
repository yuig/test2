package com.pinterest.gestalt.textcomposer;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d5.a;
import df.j1;
import dm1.h;
import eo1.c;
import gm1.b;
import java.io.File;
import kh2.g3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import la1.k;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import qf1.f0;
import rh1.d1;
import rm1.r;
import u50.i0;
import u50.o;
import uq.j;
import wn1.b0;
import wn1.c0;
import wn1.d;
import wn1.e;
import wn1.e0;
import wn1.f;
import wn1.g;
import wn1.i;
import wn1.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0004\u0004\u0003\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/gestalt/textcomposer/GestaltTextComposer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lwn1/d;", "org/chromium/net/y", "wn1/e", "wn1/f", "textcomposer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltTextComposer extends d1 implements b {

    /* renamed from: u, reason: collision with root package name */
    public static final ImageView.ScaleType f49648u = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: v, reason: collision with root package name */
    public static final int f49649v = c.space_400;

    /* renamed from: w, reason: collision with root package name */
    public static final f f49650w = f.DEFAULT;

    /* renamed from: x, reason: collision with root package name */
    public static final fm1.c f49651x = fm1.c.VISIBLE;

    /* renamed from: d, reason: collision with root package name */
    public final q f49652d;

    /* renamed from: e, reason: collision with root package name */
    public final v f49653e;

    /* renamed from: f, reason: collision with root package name */
    public final v f49654f;

    /* renamed from: g, reason: collision with root package name */
    public final v f49655g;

    /* renamed from: h, reason: collision with root package name */
    public final v f49656h;

    /* renamed from: i, reason: collision with root package name */
    public final v f49657i;

    /* renamed from: j, reason: collision with root package name */
    public final v f49658j;

    /* renamed from: k, reason: collision with root package name */
    public final v f49659k;

    /* renamed from: l, reason: collision with root package name */
    public final v f49660l;

    /* renamed from: m, reason: collision with root package name */
    public final v f49661m;

    /* renamed from: n, reason: collision with root package name */
    public final v f49662n;

    /* renamed from: o, reason: collision with root package name */
    public final v f49663o;

    /* renamed from: p, reason: collision with root package name */
    public final v f49664p;

    /* renamed from: q, reason: collision with root package name */
    public final e f49665q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f49666r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f49667s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f49668t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltTextComposer(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void I0(GestaltTextComposer gestaltTextComposer, Integer num, Integer num2, Integer num3, int i13) {
        if ((i13 & 1) != 0) {
            num = null;
        }
        if ((i13 & 4) != 0) {
            num3 = null;
        }
        if (num != null) {
            gestaltTextComposer.setBackgroundTintList(a.b(gestaltTextComposer.getContext(), num.intValue()));
        }
        TextInputEditText o03 = gestaltTextComposer.o0();
        o03.setTextColor(dl2.b.y0(o03, num2.intValue()));
        if (num3 != null) {
            o03.setHintTextColor(dl2.b.y0(o03, eo1.a.comp_textfield_hint_text_color));
        }
    }

    public static final void L(GestaltTextComposer gestaltTextComposer, GestaltIcon gestaltIcon, om1.c cVar) {
        ViewParent parent = gestaltIcon.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        int i13 = 8;
        ((FrameLayout) parent).setVisibility(cVar.f96642d == fm1.c.VISIBLE ? 0 : 8);
        gestaltIcon.g2(new h(cVar, i13));
    }

    public static final void T(GestaltTextComposer gestaltTextComposer, f fVar) {
        gestaltTextComposer.getClass();
        int i13 = g.f130537a[fVar.ordinal()];
        if (i13 == 1) {
            gestaltTextComposer.G0();
        } else if (i13 == 2) {
            I0(gestaltTextComposer, Integer.valueOf(eo1.b.comp_textfield_success_border_color), Integer.valueOf(eo1.a.comp_textfield_success_field_text_color), null, 4);
        } else {
            if (i13 != 3) {
                return;
            }
            I0(gestaltTextComposer, Integer.valueOf(eo1.b.comp_textfield_error_border_color), Integer.valueOf(eo1.a.comp_textfield_error_field_text_color), null, 4);
        }
    }

    public static void a0(GestaltTextComposer gestaltTextComposer, String str, String str2, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        gestaltTextComposer.getClass();
        boolean z13 = j1.U0(str) || j1.U0(str2);
        Object value = gestaltTextComposer.f49654f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        WebImageView webImageView = (WebImageView) value;
        if (z13) {
            if (str != null) {
                webImageView.t2(new File(str));
            }
            if (str2 != null) {
                webImageView.loadUrl(str2);
            }
            float W = bs1.c.W(webImageView, gestaltTextComposer.k0().f130526m);
            webImageView.g2(W, W, W, W);
            webImageView.setScaleType(gestaltTextComposer.k0().f130525l);
            bs1.c.U1(webImageView);
            gestaltTextComposer.g0();
        } else {
            bs1.c.X0(webImageView);
        }
        Object value2 = gestaltTextComposer.f49655g.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltIconButton) value2).t(new f0(z13, gestaltTextComposer, 9));
    }

    public static om1.c r0(TypedArray typedArray, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        rm1.q a13 = r.a(typedArray, i13, GestaltIcon.f49401c);
        om1.e eVar = om1.e.LG;
        int i23 = typedArray.getInt(i14, -1);
        if (i23 >= 0) {
            eVar = om1.e.values()[i23];
        }
        om1.f fVar = GestaltIconButton.C;
        int i24 = typedArray.getInt(i15, -1);
        om1.f fVar2 = i24 >= 0 ? om1.f.values()[i24] : fVar;
        fm1.c Y = d7.b.Y(typedArray, i16, fm1.c.GONE);
        String string = typedArray.getString(i17);
        if (string == null) {
            string = "";
        }
        return new om1.c(a13, eVar, fVar2, Y, bs1.c.h2(string), typedArray.getBoolean(i18, true), i19, 704);
    }

    public final void B0() {
        Editable text = o0().getText();
        v vVar = this.f49659k;
        v vVar2 = this.f49653e;
        if (text == null || text.length() == 0) {
            Object value = vVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            NestedScrollView nestedScrollView = (NestedScrollView) value;
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.f17675k = -1;
            layoutParams2.f17692u = c0.button_container;
            layoutParams2.f17693v = -1;
            nestedScrollView.setLayoutParams(layoutParams2);
            Object value2 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ConstraintLayout constraintLayout = (ConstraintLayout) value2;
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.f17671i = 0;
            constraintLayout.setLayoutParams(layoutParams4);
        } else if (o0().getLayout().getLineCount() >= 2) {
            Object value3 = vVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            NestedScrollView nestedScrollView2 = (NestedScrollView) value3;
            ViewGroup.LayoutParams layoutParams5 = nestedScrollView2.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.f17675k = c0.scroll_bottom_constraint;
            layoutParams6.f17692u = -1;
            layoutParams6.f17693v = 0;
            nestedScrollView2.setLayoutParams(layoutParams6);
            Object value4 = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ConstraintLayout constraintLayout2 = (ConstraintLayout) value4;
            ViewGroup.LayoutParams layoutParams7 = constraintLayout2.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            layoutParams8.f17671i = -1;
            constraintLayout2.setLayoutParams(layoutParams8);
            boolean z13 = this.f49668t;
            v vVar3 = this.f49658j;
            if (z13) {
                Object value5 = vVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                Space space = (Space) value5;
                ViewGroup.LayoutParams layoutParams9 = space.getLayoutParams();
                if (layoutParams9 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ((ViewGroup.MarginLayoutParams) layoutParams10).height = dl2.b.T1(context) ? bs1.c.W(this, c.space_1000) : bs1.c.W(this, c.space_900);
                space.setLayoutParams(layoutParams10);
            } else {
                Object value6 = vVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                Space space2 = (Space) value6;
                ViewGroup.LayoutParams layoutParams11 = space2.getLayoutParams();
                if (layoutParams11 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
                ((ViewGroup.MarginLayoutParams) layoutParams12).height = bs1.c.W(this, c.space_800);
                space2.setLayoutParams(layoutParams12);
            }
        }
        Editable text2 = o0().getText();
        if ((text2 == null || text2.length() == 0) && !g3.q0(this)) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setBackground(dl2.b.T1(context2) ? bs1.c.f0(this, b0.gestalt_text_composer_background_single_line_vr_enabled, null, null, 6) : bs1.c.f0(this, b0.gestalt_text_composer_background_single_line, null, null, 6));
        } else if (o0().getLayout().getLineCount() == 2 || g3.q0(this)) {
            setBackground(bs1.c.f0(this, b0.gestalt_text_composer_background_multi_line, null, null, 6));
        }
    }

    public final void F0(d dVar, d dVar2) {
        CharSequence charSequence;
        if (this.f49666r) {
            return;
        }
        G0();
        B0();
        j1.v(dVar, dVar2, wn1.h.f130544p, new i(dVar2, this));
        j1.v(dVar, dVar2, wn1.h.f130553y, new i(this, dVar2, 13));
        j1.v(dVar, dVar2, wn1.h.f130554z, new i(this, dVar2, 14));
        i0 i0Var = dVar2.f130515b;
        if (i0Var != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            charSequence = i0Var.a(context);
        } else {
            charSequence = null;
        }
        setContentDescription(charSequence);
        int i13 = 2;
        if (!dVar2.f130517d) {
            j1.v(dVar, dVar2, wn1.h.A, new i(this, dVar2, 15));
            j1.v(dVar, dVar2, wn1.h.B, new i(this, dVar2, 1));
            j1.v(dVar, dVar2, wn1.h.f130539k, new i(this, dVar2, i13));
        }
        int i14 = 3;
        j1.v(dVar, dVar2, wn1.h.f130540l, new i(this, dVar2, i14));
        int i15 = 4;
        if (dVar2.f130527n) {
            j1.v(dVar, dVar2, wn1.h.f130541m, new i(this, dVar2, i15));
        }
        if (dVar2.f130536w != Integer.MIN_VALUE) {
            j1.v(dVar, dVar2, wn1.h.f130542n, new i(this, dVar2, 5));
        }
        j1.v(dVar, dVar2, wn1.h.f130543o, new i(this, dVar2, 6));
        String str = dVar2.f130522i;
        if (str == null || str.length() == 0) {
            j1.v(dVar, dVar2, wn1.h.f130545q, new i(this, dVar2, 7));
        }
        j1.v(dVar, dVar2, wn1.h.f130546r, new i(this, dVar2, 8));
        j1.v(dVar, dVar2, wn1.h.f130547s, new wn1.c(i13, this));
        j1.v(dVar, dVar2, wn1.h.f130548t, new i(this, dVar2, 9));
        j1.v(dVar, dVar2, wn1.h.f130549u, new i(this, dVar2, 11));
        j1.v(dVar, dVar2, wn1.h.f130550v, new i(this, dVar, 12));
        j1.v(dVar, dVar2, wn1.h.f130551w, new wn1.c(i14, this));
        j1.v(dVar, dVar2, wn1.h.f130552x, new wn1.c(i15, this));
        if (dVar2.f130532s) {
            o0().setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (((gm1.a) this.f49652d.f33804b) == null) {
            Z(new k(21, this, wn1.h.f130538j));
        }
    }

    public final void G0() {
        I0(this, null, Integer.valueOf(eo1.a.comp_textfield_text_input_field_text_color), Integer.valueOf(this.f49668t ? eo1.a.sema_color_text_disabled : eo1.a.comp_textfield_hint_text_color), 1);
    }

    public final void H0(rm1.c cVar, rm1.q qVar, vn1.c cVar2) {
        if (k0().f130517d) {
            return;
        }
        rm1.d dVar = null;
        if (qVar != null) {
            e eVar = this.f49665q;
            if (eVar == null) {
                Intrinsics.r("counterIconSize");
                throw null;
            }
            dVar = new rm1.d(new rm1.f(qVar, eVar == e.XS ? rm1.i.XS : rm1.i.SM), cVar, null, 0, null, 28);
        }
        Object value = this.f49656h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((GestaltText) value).i(new m(cVar2, dVar, 0));
    }

    public final void K0() {
        boolean z13 = k0().f130517d;
        v vVar = this.f49656h;
        if (z13 || k0().f130520g <= 0) {
            Object value = vVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            a0.k0((GestaltText) value);
            return;
        }
        String str = z0() + "/" + k0().f130520g;
        String quantityString = getResources().getQuantityString(e0.content_description_edit_text_counter, z0(), Integer.valueOf(z0()), Integer.valueOf(k0().f130520g));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        Object value2 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((GestaltText) value2).i(new j(str, quantityString, 9));
        int rint = (int) Math.rint(k0().f130520g * 0.8d);
        int i13 = k0().f130521h ? k0().f130520g - 1 : k0().f130520g;
        if (z0() < rint) {
            H0(rm1.c.DEFAULT, null, vn1.c.SUBTLE);
            return;
        }
        int z03 = z0();
        if (rint <= z03 && z03 <= i13) {
            H0(rm1.c.WARNING, rm1.q.WORKFLOW_STATUS_WARNING, vn1.c.WARNING);
        } else if (z0() > i13) {
            H0(rm1.c.ERROR, rm1.q.WORKFLOW_STATUS_PROBLEM, vn1.c.ERROR);
        }
    }

    public final void X(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    public final GestaltTextComposer Z(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltTextComposer) this.f49652d.c(eventHandler, new wn1.c(1, this));
    }

    public final void d0(int i13, int i14, String str) {
        this.f49666r = true;
        X(new an1.i(d.e(k0(), bs1.c.h2(str), null, null, null, false, Integer.valueOf(i13 + i14), null, null, null, 8355838), 16));
        this.f49666r = false;
    }

    public final void g0() {
        TextInputEditText o03 = o0();
        Editable text = o03.getText();
        o03.setSelection(text != null ? text.length() : 0);
        o03.requestFocus();
        hf0.b.t(o03.getContext());
        bs1.c.V1(o03);
        if (o03.hasWindowFocus()) {
            return;
        }
        bs1.c.W1(o0());
    }

    public final d k0() {
        return (d) ((o) this.f49652d.f33803a);
    }

    public final TextInputEditText o0() {
        Object value = this.f49657i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextInputEditText) value;
    }

    public final Editable t0() {
        return o0().getText();
    }

    public final int z0() {
        return g3.m0(this).length();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltTextComposer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GestaltTextComposer(int r9, int r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            r0 = 4
            r10 = r10 & r0
            r1 = 0
            if (r10 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r9
        L8:
            int r9 = wn1.f0.GestaltTextComposerInputLayout
            java.lang.String r10 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r10)
            m.e r10 = new m.e
            r10.<init>(r11, r9)
            r11 = 2
            r8.<init>(r10, r12, r5, r11)
            wn1.j r10 = new wn1.j
            r2 = 6
            r10.<init>(r2, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49653e = r10
            wn1.j r10 = new wn1.j
            r2 = 3
            r10.<init>(r2, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49654f = r10
            wn1.j r10 = new wn1.j
            r10.<init>(r0, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49655g = r10
            wn1.j r10 = new wn1.j
            r0 = 1
            r10.<init>(r0, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49656h = r10
            wn1.j r10 = new wn1.j
            r10.<init>(r11, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49657i = r10
            wn1.j r10 = new wn1.j
            r11 = 7
            r10.<init>(r11, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49658j = r10
            wn1.j r10 = new wn1.j
            r10.<init>(r1, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49659k = r10
            wn1.j r10 = new wn1.j
            r11 = 5
            r10.<init>(r11, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49660l = r10
            wn1.j r10 = new wn1.j
            r11 = 9
            r10.<init>(r11, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49661m = r10
            wn1.j r10 = new wn1.j
            r11 = 8
            r10.<init>(r11, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49662n = r10
            wn1.j r10 = new wn1.j
            r11 = 11
            r10.<init>(r11, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49663o = r10
            wn1.j r10 = new wn1.j
            r11 = 10
            r10.<init>(r11, r8)
            xk2.v r10 = xk2.m.b(r10)
            r8.f49664p = r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.f49667s = r9
            com.google.firebase.messaging.q r9 = new com.google.firebase.messaging.q
            int[] r6 = wn1.g0.GestaltTextComposer
            java.lang.String r10 = "GestaltTextComposer"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
            wn1.c r7 = new wn1.c
            r7.<init>(r1, r8)
            r2 = r9
            r3 = r8
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f49652d = r9
            el2.a r9 = wn1.e.getEntries()
            android.content.Context r10 = r8.getContext()
            java.lang.String r11 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            int r11 = eo1.a.comp_textarea_max_length_icon_size
            int r10 = dl2.b.O0(r10, r11)
            java.lang.Object r9 = r9.get(r10)
            wn1.e r9 = (wn1.e) r9
            r8.f49665q = r9
            android.content.Context r9 = r8.getContext()
            int r10 = wn1.d0.text_composer_layout_gestalt
            android.view.View.inflate(r9, r10, r8)
            wn1.d r9 = r8.k0()
            r10 = 0
            r8.F0(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.textcomposer.GestaltTextComposer.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }
}
