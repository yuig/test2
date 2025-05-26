package com.pinterest.gestalt.textfield.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.p;
import ao1.d;
import ao1.g;
import ao1.h;
import ao1.k;
import bk.i;
import bk.m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.n;
import com.google.firebase.messaging.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import eo1.a;
import fm1.c;
import gm1.b;
import i1.a1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;
import u5.x;
import u50.i0;
import u50.o;
import xk2.v;
import xn1.j;
import yn1.e;
import yn1.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/gestalt/textfield/view/GestaltTextField;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lao1/b;", "ps0/y", "textfield_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes2.dex */
public final class GestaltTextField extends k implements b {

    /* renamed from: t, reason: collision with root package name */
    public static final f f49669t = f.DEFAULT;

    /* renamed from: u, reason: collision with root package name */
    public static final int f49670u = a.comp_textfield_default_border_weight;

    /* renamed from: v, reason: collision with root package name */
    public static final c f49671v = c.VISIBLE;

    /* renamed from: c, reason: collision with root package name */
    public final q f49672c;

    /* renamed from: d, reason: collision with root package name */
    public final x f49673d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f49674e;

    /* renamed from: f, reason: collision with root package name */
    public GestaltText f49675f;

    /* renamed from: g, reason: collision with root package name */
    public GestaltText f49676g;

    /* renamed from: h, reason: collision with root package name */
    public final v f49677h;

    /* renamed from: i, reason: collision with root package name */
    public final v f49678i;

    /* renamed from: j, reason: collision with root package name */
    public final p f49679j;

    /* renamed from: k, reason: collision with root package name */
    public final yn1.c f49680k;

    /* renamed from: l, reason: collision with root package name */
    public final e f49681l;

    /* renamed from: m, reason: collision with root package name */
    public final yn1.a f49682m;

    /* renamed from: n, reason: collision with root package name */
    public final yn1.b f49683n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f49684o;

    /* renamed from: p, reason: collision with root package name */
    public final int f49685p;

    /* renamed from: q, reason: collision with root package name */
    public final int f49686q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f49687r;

    /* renamed from: s, reason: collision with root package name */
    public final v f49688s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltTextField(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void S0(GestaltTextField gestaltTextField, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i13, int i14) {
        GestaltText gestaltText;
        GestaltText gestaltText2;
        if ((i14 & 1) != 0) {
            num = null;
        }
        if ((i14 & 4) != 0) {
            num3 = null;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            num6 = null;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            num7 = null;
        }
        if ((i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
            num8 = null;
        }
        if ((i14 & 1024) != 0) {
            i13 = a.comp_textfield_hint_text_color;
        }
        TextInputLayout r03 = gestaltTextField.r0();
        r03.C(d5.a.b(r03.getContext(), num2.intValue()));
        if (num6 != null) {
            r03.R = dl2.b.G0(r03, num6.intValue());
            r03.e0();
        }
        int i15 = gestaltTextField.f49686q;
        if (i15 != r03.O) {
            r03.O = i15;
            if (r03.f33167d != null) {
                r03.x();
            }
        }
        if (num != null) {
            Context context = r03.getContext();
            int intValue = num.intValue();
            Object obj = d5.a.f53679a;
            int color = context.getColor(intValue);
            if (r03.U != color) {
                r03.U = color;
                r03.f33188n0 = color;
                r03.f33192p0 = color;
                r03.f33194q0 = color;
                r03.d();
            }
        }
        EditText editText = r03.f33167d;
        if (editText != null) {
            editText.setTextColor(dl2.b.y0(r03, num5.intValue()));
        }
        EditText editText2 = r03.f33167d;
        if (editText2 != null) {
            editText2.setHintTextColor(dl2.b.y0(r03, i13));
        }
        if (num3 != null) {
            BitmapDrawable t03 = gestaltTextField.t0(num3.intValue());
            n nVar = r03.f33165c;
            CheckableImageButton checkableImageButton = nVar.f33256f;
            checkableImageButton.setImageDrawable(t03);
            if (t03 != null) {
                ColorStateList colorStateList = nVar.f33260j;
                PorterDuff.Mode mode = nVar.f33261k;
                TextInputLayout textInputLayout = nVar.f33251a;
                l0.v(textInputLayout, checkableImageButton, colorStateList, mode);
                l0.W0(textInputLayout, checkableImageButton, nVar.f33260j);
            }
        }
        int intValue2 = num4.intValue();
        TextInputLayout r04 = gestaltTextField.r0();
        ColorStateList z03 = dl2.b.z0(r03, intValue2);
        n nVar2 = r04.f33165c;
        if (nVar2.f33260j != z03) {
            nVar2.f33260j = z03;
            l0.v(nVar2.f33251a, nVar2.f33256f, z03, nVar2.f33261k);
        }
        if (num7 != null && (gestaltText2 = gestaltTextField.f49675f) != null) {
            gestaltText2.setTextColor(dl2.b.y0(r03, num7.intValue()));
        }
        if (num8 == null || (gestaltText = gestaltTextField.f49676g) == null) {
            return;
        }
        gestaltText.setTextColor(dl2.b.y0(r03, num8.intValue()));
    }

    public final String B0() {
        Editable z03 = z0();
        String obj = z03 != null ? z03.toString() : null;
        return obj == null ? "" : obj;
    }

    public final int F0() {
        return B0().length();
    }

    public final void G0(ao1.b bVar) {
        TextInputEditText o03 = o0();
        o03.setSingleLine(false);
        o03.setMinLines(bVar.f20037h);
        o03.setImeOptions(1073741824);
        o03.setInputType(131073);
        o03.setGravity(8388659);
    }

    public final void H0() {
        if (this.f49676g == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            this.f49676g = gestaltText;
            gestaltText.i(g.f20076j);
            int G0 = dl2.b.G0(this, a.comp_textfield_vertical_gap);
            gestaltText.setPaddingRelative(bs1.c.W(this, eo1.c.space_300), G0, 0, G0);
            int id3 = gestaltText.getId();
            p pVar = this.f49679j;
            pVar.l(id3, 7, 0, 7);
            pVar.l(gestaltText.getId(), 3, r0().getId(), 4);
            GestaltText gestaltText2 = this.f49675f;
            if (gestaltText2 != null) {
                pVar.l(gestaltText2.getId(), 7, gestaltText.getId(), 6);
            }
            pVar.n(gestaltText.getId(), -2);
            pVar.o(gestaltText.getId(), -2);
            addView(gestaltText);
            pVar.b(this);
        }
    }

    public final void I0(ao1.b bVar, ao1.b bVar2) {
        if (this.f49673d.f120536b) {
            return;
        }
        TextInputLayout r03 = r0();
        int i13 = this.f49686q;
        if (i13 != r03.O) {
            r03.O = i13;
            if (r03.f33167d != null) {
                r03.x();
            }
        }
        float E0 = dl2.b.E0(this, a.comp_textfield_field_rounding);
        TextInputLayout r04 = r0();
        r04.getClass();
        r04.M = l0.H0(r04);
        i iVar = r04.F;
        if (iVar == null || iVar.l() != E0 || r04.F.m() != E0 || r04.F.h() != E0 || r04.F.i() != E0) {
            m h10 = r04.L.h();
            h10.g(E0);
            h10.h(E0);
            h10.e(E0);
            h10.f(E0);
            r04.L = h10.a();
            r04.d();
        }
        TextInputLayout r05 = r0();
        r05.R = dl2.b.G0(this, f49670u);
        r05.e0();
        j1.v(bVar, bVar2, d.f20057n, new h(bVar2, this, 8));
        j1.v(bVar, bVar2, d.f20066w, new h(bVar2, this, 13));
        j1.v(bVar, bVar2, d.f20067x, new a1(bVar2, this, bVar2, 15));
        j1.v(bVar, bVar2, d.f20068y, new h(this, bVar2, 14));
        j1.v(bVar, bVar2, d.f20069z, new h(this, bVar2, 0));
        i0 i0Var = bVar2.f20034e;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setContentDescription(i0Var.a(context));
        int i14 = 2;
        int i15 = 1;
        if (!bVar2.f20036g) {
            j1.v(bVar, bVar2, g.f20078l, new ao1.e(this, bVar2, i15));
            j1.v(bVar, bVar2, g.f20079m, new ao1.e(this, bVar2, i14));
        }
        j1.v(bVar, bVar2, d.f20054k, new h(this, bVar2, i15));
        j1.v(bVar, bVar2, d.f20055l, new h(this, bVar2, i14));
        j1.v(bVar, bVar2, d.f20056m, new h(bVar2, this, 3));
        if (bVar2.f20041l) {
            j1.v(bVar, bVar2, d.f20058o, new h(this, bVar2, 4));
        }
        if (bVar2.f20051v != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, d.f20059p, new h(this, bVar2, 5));
        }
        j1.v(bVar, bVar2, d.f20060q, new h(this, bVar2, 6));
        j1.v(bVar, bVar2, d.f20061r, new h(this, bVar2, 7));
        Integer num = k0().f20045p;
        if (num != null) {
            o0().setSelection(num.intValue());
        }
        j1.v(bVar, bVar2, d.f20062s, new h(this, bVar2, 9));
        j1.v(bVar, bVar2, d.f20063t, new h(this, bVar2, 10));
        j1.v(bVar, bVar2, d.f20064u, new h(this, bVar2, 11));
        j1.v(bVar, bVar2, d.f20065v, new h(this, bVar2, 12));
        if (bVar2.f20050u) {
            o0().setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (((gm1.a) this.f49672c.f33804b) == null) {
            L(d.f20053j);
        }
    }

    public final void K0() {
        int i13 = xn1.k.text_field_box_stroke_color;
        int i14 = a.comp_textfield_default_field_icon_color;
        S0(this, Integer.valueOf(xn1.k.text_field_box_background_color), Integer.valueOf(i13), null, Integer.valueOf(i14), Integer.valueOf(a.comp_textfield_text_input_field_text_color), null, null, null, 0, 1972);
    }

    public final GestaltTextField L(final Function1 invokeAfterStateMutation) {
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        final x xVar = this.f49673d;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        return ((GestaltTextField) xVar.f120537c).Z(new gm1.a() { // from class: zn1.b
            @Override // gm1.a
            public final void h3(gm1.c event) {
                x this$0 = x.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 invokeAfterStateMutation2 = invokeAfterStateMutation;
                Intrinsics.checkNotNullParameter(invokeAfterStateMutation2, "$invokeAfterStateMutation");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.i) {
                    xn1.i iVar = (xn1.i) event;
                    this$0.d(iVar.f135455d, iVar.f135457f, iVar.f135454c);
                }
                invokeAfterStateMutation2.invoke((j) event);
            }
        });
    }

    public final void L0(vn1.c cVar, rm1.c cVar2, rm1.n nVar) {
        rm1.d dVar = nVar != null ? new rm1.d(new rm1.e(nVar), cVar2, null, 0, null, 28) : null;
        GestaltText gestaltText = this.f49676g;
        if (gestaltText != null) {
            gestaltText.i(new wn1.m(cVar, dVar, 1));
        }
    }

    public final void P0(vn1.c cVar, rm1.c cVar2, rm1.e eVar) {
        rm1.d dVar = eVar != null ? new rm1.d(eVar, cVar2, null, 0, null, 28) : null;
        GestaltText gestaltText = this.f49675f;
        if (gestaltText != null) {
            gestaltText.i(new fn1.k(this, cVar, dVar, 2));
        }
    }

    public final void T0() {
        if (k0().f20039j > 0) {
            H0();
            String str = F0() + "/" + k0().f20039j;
            String quantityString = getResources().getQuantityString(xn1.n.content_description_edit_text_counter, F0(), Integer.valueOf(F0()), Integer.valueOf(k0().f20039j));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            GestaltText gestaltText = this.f49676g;
            if (gestaltText != null) {
                gestaltText.i(new uq.j(str, quantityString, 10));
            }
            int rint = (int) Math.rint(k0().f20039j * 0.8d);
            int i13 = k0().f20040k ? k0().f20039j - 1 : k0().f20039j;
            if (F0() < rint) {
                L0(vn1.c.SUBTLE, rm1.c.DEFAULT, null);
                return;
            }
            int F0 = F0();
            if (rint <= F0 && F0 <= i13) {
                L0(vn1.c.WARNING, rm1.c.WARNING, rm1.n.WORKFLOW_STATUS_WARNING);
            } else if (F0() > i13) {
                L0(vn1.c.ERROR, rm1.c.ERROR, rm1.n.WORKFLOW_STATUS_PROBLEM);
            }
        }
    }

    public final GestaltTextField X(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltTextField) this.f49672c.d(nextState, new ao1.e(this, k0(), 0));
    }

    public final GestaltTextField Z(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltTextField) this.f49672c.c(eventHandler, new ao1.a(1, this));
    }

    public final void a0() {
        r0().f33165c.j(-1);
        int i13 = xn1.k.status_state_list_success;
        int i14 = a.comp_textfield_success_field_text_color;
        rm1.n nVar = rm1.n.CHECK_CIRCLE_FILL;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        S0(this, null, Integer.valueOf(i13), Integer.valueOf(nVar.drawableRes(context)), Integer.valueOf(a.comp_textfield_success_field_icon_color), Integer.valueOf(i14), Integer.valueOf(a.comp_textfield_success_border_weight), null, null, 0, 1841);
        yn1.a aVar = this.f49682m;
        if (aVar == null) {
            Intrinsics.r("helperSuccessColor");
            throw null;
        }
        vn1.c cVar = aVar == yn1.a.SUCCESS ? vn1.c.SUCCESS : vn1.c.SUBTLE;
        yn1.b bVar = this.f49683n;
        if (bVar == null) {
            Intrinsics.r("helperSuccessIcon");
            throw null;
        }
        yn1.b bVar2 = yn1.b.CIRCLE_CHECK;
        rm1.e eVar = bVar == bVar2 ? new rm1.e(nVar) : null;
        yn1.b bVar3 = this.f49683n;
        if (bVar3 != null) {
            P0(cVar, bVar3 == bVar2 ? rm1.c.SUCCESS : rm1.c.DEFAULT, eVar);
        } else {
            Intrinsics.r("helperSuccessIcon");
            throw null;
        }
    }

    public final void d0() {
        TextInputEditText o03 = o0();
        o03.requestFocus();
        bs1.c.V1(o03);
        if (o03.hasWindowFocus()) {
            return;
        }
        bs1.c.W1(o03);
    }

    public final void g0() {
        TextInputEditText o03 = o0();
        o03.requestFocus();
        o03.selectAll();
        if (o03.hasWindowFocus()) {
            bs1.c.V1(o03);
        } else {
            bs1.c.W1(o03);
        }
    }

    public final ao1.b k0() {
        return (ao1.b) ((o) this.f49672c.f33803a);
    }

    public final TextInputEditText o0() {
        Object value = this.f49677h.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextInputEditText) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        zn1.c cVar = (zn1.c) this.f49673d.f120539e;
        if (cVar != null) {
            if (!cVar.f142298h) {
                o0().addTextChangedListener(cVar.f142291a);
                cVar.f142298h = true;
            }
            o0().setOnFocusChangeListener(cVar.f142294d);
            o0().setOnClickListener(cVar.f142295e);
            o0().setOnEditorActionListener(cVar.f142296f);
            o0().setOnKeyListener(cVar.f142297g);
            com.google.android.material.textfield.v vVar = r0().f33163b;
            View.OnLongClickListener onLongClickListener = vVar.f33322h;
            CheckableImageButton checkableImageButton = vVar.f33318d;
            checkableImageButton.setOnClickListener(cVar.f142292b);
            l0.k1(checkableImageButton, onLongClickListener);
            if (r0().f33165c.f33258h == -1) {
                r0().F(cVar.a());
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zn1.c cVar = (zn1.c) this.f49673d.f120539e;
        if (cVar != null) {
            if (cVar.f142298h) {
                o0().removeTextChangedListener(cVar.f142291a);
                cVar.f142298h = false;
            }
            o0().setOnFocusChangeListener(null);
            o0().setOnClickListener(null);
            o0().setOnEditorActionListener(null);
            o0().setOnKeyListener(null);
            com.google.android.material.textfield.v vVar = r0().f33163b;
            View.OnLongClickListener onLongClickListener = vVar.f33322h;
            CheckableImageButton checkableImageButton = vVar.f33318d;
            checkableImageButton.setOnClickListener(null);
            l0.k1(checkableImageButton, onLongClickListener);
            r0().F(null);
        }
        super.onDetachedFromWindow();
    }

    public final TextInputLayout r0() {
        Object value = this.f49678i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextInputLayout) value;
    }

    public final BitmapDrawable t0(int i13) {
        Drawable I = com.bumptech.glide.c.I(getContext(), i13);
        if (I == null) {
            return null;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int i14 = this.f49685p;
        return d7.b.p0(I, resources, dl2.b.G0(this, i14), dl2.b.G0(this, i14));
    }

    public final Editable z0() {
        return o0().getText();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltTextField(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GestaltTextField(int r9, int r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.gestalt.textfield.view.GestaltTextField.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }
}
