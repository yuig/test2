package ao1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.p;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.n;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import df.j1;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s;
import lb.l0;
import rm1.q;
import u50.i0;
import xn1.l;

/* loaded from: classes2.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20081i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextField f20082j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f20083k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(b bVar, GestaltTextField gestaltTextField, int i13) {
        super(1);
        this.f20081i = i13;
        this.f20083k = bVar;
        this.f20082j = gestaltTextField;
    }

    public final void b(int i13) {
        int i14 = this.f20081i;
        GestaltTextField gestaltTextField = this.f20082j;
        b bVar = this.f20083k;
        switch (i14) {
            case 1:
                gestaltTextField.T0();
                if (bVar.f20039j > 0 && bVar.f20040k) {
                    TextInputEditText o03 = gestaltTextField.o0();
                    int i15 = bVar.f20039j;
                    o03.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i15)});
                    if (gestaltTextField.F0() > i15) {
                        TextInputEditText o04 = gestaltTextField.o0();
                        String substring = gestaltTextField.B0().substring(0, i15);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        o04.setText(substring);
                        gestaltTextField.o0().setSelection(i15);
                        break;
                    }
                }
                break;
            default:
                gestaltTextField.setId(bVar.f20051v);
                break;
        }
    }

    public final void e(List list) {
        int i13 = this.f20081i;
        GestaltTextField gestaltTextField = this.f20082j;
        b bVar = this.f20083k;
        switch (i13) {
            case 9:
                List list2 = bVar.f20046q;
                yn1.f fVar = GestaltTextField.f49669t;
                gestaltTextField.getClass();
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    int i14 = 0;
                    while (it.hasNext()) {
                        i14 |= ((Number) it.next()).intValue();
                    }
                    gestaltTextField.o0().setImeOptions(i14);
                    break;
                }
                break;
            case 10:
                List list3 = bVar.f20047r;
                yn1.f fVar2 = GestaltTextField.f49669t;
                if (list3 == null) {
                    gestaltTextField.getClass();
                    break;
                } else {
                    gestaltTextField.o0().setInputType(dl2.b.A(list3));
                    Integer num = gestaltTextField.f49687r;
                    if (num != null) {
                        gestaltTextField.o0().setTextAppearance(num.intValue());
                        break;
                    }
                }
                break;
            case 11:
                List list4 = bVar.f20048s;
                yn1.f fVar3 = GestaltTextField.f49669t;
                if (list4 == null) {
                    gestaltTextField.getClass();
                    break;
                } else {
                    gestaltTextField.o0().setRawInputType(dl2.b.A(list4));
                    break;
                }
            default:
                List list5 = bVar.f20049t;
                yn1.f fVar4 = GestaltTextField.f49669t;
                gestaltTextField.getClass();
                if (list5 != null) {
                    gestaltTextField.o0().setAutofillHints(list5.size() > 1 ? CollectionsKt.Z(list5, ",", null, null, 0, null, null, 62) : (String) CollectionsKt.firstOrNull(list5));
                    break;
                }
                break;
        }
    }

    public final void f(i0 it) {
        int i13 = this.f20081i;
        b bVar = this.f20083k;
        GestaltTextField gestaltTextField = this.f20082j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                i0 i0Var = bVar.f20030a;
                Context context = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.d(i0Var.a(context), bs1.c.h2(String.valueOf(gestaltTextField.o0().getText())).f120559a)) {
                    return;
                }
                TextInputEditText o03 = gestaltTextField.o0();
                Context context2 = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                o03.setText(bVar.f20030a.a(context2));
                return;
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                i0 i0Var2 = bVar.f20031b;
                Context context3 = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                if (bs1.c.i1(i0Var2, context3) && gestaltTextField.f49674e == null) {
                    Context context4 = gestaltTextField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    GestaltText gestaltText = new GestaltText(6, context4, (AttributeSet) null);
                    gestaltTextField.f49674e = gestaltText;
                    gestaltText.i(new an1.i(gestaltTextField, 18));
                    int id3 = gestaltText.getId();
                    p pVar = gestaltTextField.f49679j;
                    pVar.l(id3, 6, 0, 6);
                    pVar.l(gestaltText.getId(), 7, 0, 7);
                    pVar.n(gestaltText.getId(), -2);
                    pVar.o(gestaltText.getId(), 0);
                    yn1.c cVar = gestaltTextField.f49680k;
                    if (cVar == null) {
                        Intrinsics.r("labelPosition");
                        throw null;
                    }
                    if (cVar == yn1.c.INSIDE) {
                        gestaltText.setPaddingRelative(dl2.b.G0(gestaltTextField, eo1.a.comp_textfield_horizontal_padding), dl2.b.G0(gestaltTextField, eo1.a.comp_textfield_vertical_padding), dl2.b.G0(gestaltTextField, eo1.a.comp_textfield_horizontal_padding), dl2.b.G0(gestaltTextField, eo1.a.comp_textfield_vertical_gap));
                        pVar.l(gestaltText.getId(), 3, l.text_input_layout, 3);
                    } else {
                        int G0 = dl2.b.G0(gestaltTextField, eo1.a.comp_textfield_vertical_gap);
                        gestaltText.setPaddingRelative(0, G0, 0, G0);
                        pVar.l(gestaltText.getId(), 3, 0, 3);
                    }
                    gestaltTextField.addView(gestaltText);
                    pVar.b(gestaltTextField);
                }
                Context context5 = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                String obj = bVar.f20031b.a(context5).toString();
                h0 h0Var = new h0();
                h0Var.f80426a = 2;
                yn1.c cVar2 = gestaltTextField.f49680k;
                if (cVar2 == null) {
                    Intrinsics.r("labelPosition");
                    throw null;
                }
                int i14 = 1;
                if (cVar2 == yn1.c.INSIDE) {
                    if (obj.length() == 0) {
                        int i15 = eo1.a.comp_textfield_min_height_no_label;
                        int i16 = eo1.a.comp_textfield_vertical_padding;
                        TextInputEditText o04 = gestaltTextField.o0();
                        o04.setPaddingRelative(o04.getPaddingStart(), dl2.b.G0(o04, i16), o04.getPaddingEnd(), o04.getPaddingBottom());
                        o04.setMinimumHeight(dl2.b.G0(o04, i15));
                    } else {
                        int i17 = eo1.a.comp_textfield_min_height;
                        int i18 = eo1.a.comp_textfield_edittext_top_padding;
                        TextInputEditText o05 = gestaltTextField.o0();
                        o05.setPaddingRelative(o05.getPaddingStart(), dl2.b.G0(o05, i18), o05.getPaddingEnd(), o05.getPaddingBottom());
                        o05.setMinimumHeight(dl2.b.G0(o05, i17));
                    }
                    h0Var.f80426a = 1;
                }
                GestaltText gestaltText2 = gestaltTextField.f49674e;
                if (gestaltText2 != null) {
                    gestaltText2.i(new fn1.k(obj, gestaltTextField, h0Var, i14));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar = GestaltTextField.f49669t;
                TextInputEditText o06 = gestaltTextField.o0();
                i0 i0Var3 = bVar.f20034e;
                Context context6 = gestaltTextField.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                o06.setHint(i0Var3.a(context6));
                return;
        }
    }

    public final void h(boolean z13) {
        int i13 = this.f20081i;
        GestaltTextField gestaltTextField = this.f20082j;
        b bVar = this.f20083k;
        switch (i13) {
            case 0:
                yn1.f fVar = GestaltTextField.f49669t;
                gestaltTextField.getClass();
                if (bVar.f20036g) {
                    gestaltTextField.o0().setSingleLine(true);
                    gestaltTextField.o0().setMaxLines(1);
                } else {
                    gestaltTextField.G0(bVar);
                }
                gestaltTextField.T0();
                break;
            case 1:
            default:
                boolean z14 = bVar.f20044o;
                yn1.f fVar2 = GestaltTextField.f49669t;
                if (gestaltTextField.r0().f33165c.f33258h == 0 && gestaltTextField.r0().f33165c.f33256f.getDrawable() == null && z14) {
                    gestaltTextField.r0().f33165c.j(2);
                    TextInputLayout r03 = gestaltTextField.r0();
                    q qVar = q.CLEAR;
                    Context context = gestaltTextField.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Resources.Theme theme = gestaltTextField.getContext().getTheme();
                    Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
                    BitmapDrawable t03 = gestaltTextField.t0(qVar.drawableRes(context, j1.x0(theme)));
                    n nVar = r03.f33165c;
                    CheckableImageButton checkableImageButton = nVar.f33256f;
                    checkableImageButton.setImageDrawable(t03);
                    if (t03 != null) {
                        ColorStateList colorStateList = nVar.f33260j;
                        PorterDuff.Mode mode = nVar.f33261k;
                        TextInputLayout textInputLayout = nVar.f33251a;
                        l0.v(textInputLayout, checkableImageButton, colorStateList, mode);
                        l0.W0(textInputLayout, checkableImageButton, nVar.f33260j);
                        break;
                    }
                }
                break;
            case 2:
                boolean z15 = bVar.f20041l;
                yn1.f fVar3 = GestaltTextField.f49669t;
                boolean isEnabled = gestaltTextField.r0().isEnabled();
                gestaltTextField.r0().setEnabled(z15);
                if (!z15) {
                    int i14 = xn1.k.text_field_box_stroke_color;
                    int i15 = eo1.a.comp_textfield_disabled_field_icon_color;
                    int i16 = eo1.a.comp_textfield_disabled_field_text_color;
                    GestaltTextField.S0(gestaltTextField, Integer.valueOf(xn1.k.text_field_box_disabled_background_color), Integer.valueOf(i14), null, Integer.valueOf(i15), Integer.valueOf(i16), null, Integer.valueOf(i16), Integer.valueOf(i16), i16, RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP);
                    gestaltTextField.L0(vn1.c.SUBTLE, rm1.c.DEFAULT, null);
                    break;
                } else if (!isEnabled) {
                    gestaltTextField.K0();
                    break;
                }
                break;
            case 3:
                if (bVar.f20042m) {
                    yn1.f fVar4 = GestaltTextField.f49669t;
                    if (gestaltTextField.r0().f33165c.f33258h != 1) {
                        gestaltTextField.r0().f33165c.j(1);
                        TextInputLayout r04 = gestaltTextField.r0();
                        Drawable drawable = (Drawable) gestaltTextField.f49688s.getValue();
                        n nVar2 = r04.f33165c;
                        CheckableImageButton checkableImageButton2 = nVar2.f33256f;
                        checkableImageButton2.setImageDrawable(drawable);
                        if (drawable != null) {
                            ColorStateList colorStateList2 = nVar2.f33260j;
                            PorterDuff.Mode mode2 = nVar2.f33261k;
                            TextInputLayout textInputLayout2 = nVar2.f33251a;
                            l0.v(textInputLayout2, checkableImageButton2, colorStateList2, mode2);
                            l0.W0(textInputLayout2, checkableImageButton2, nVar2.f33260j);
                        }
                        gestaltTextField.o0().setTransformationMethod(PasswordTransformationMethod.getInstance());
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20081i;
        GestaltTextField gestaltTextField = this.f20082j;
        b bVar = this.f20083k;
        switch (i13) {
            case 0:
                h(((Boolean) obj).booleanValue());
                break;
            case 1:
                b(((Number) obj).intValue());
                break;
            case 2:
                h(((Boolean) obj).booleanValue());
                break;
            case 3:
                h(((Boolean) obj).booleanValue());
                break;
            case 4:
                yn1.f it = (yn1.f) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar = GestaltTextField.f49669t;
                gestaltTextField.getClass();
                int i14 = c.f20052a[bVar.f20035f.ordinal()];
                if (i14 == 1) {
                    gestaltTextField.K0();
                    gestaltTextField.P0(vn1.c.SUBTLE, rm1.c.DEFAULT, null);
                } else if (i14 == 2) {
                    gestaltTextField.a0();
                } else if (i14 == 3) {
                    GestaltTextField.S0(gestaltTextField, null, Integer.valueOf(xn1.k.status_state_list_error), null, Integer.valueOf(eo1.a.comp_textfield_error_field_icon_color), Integer.valueOf(eo1.a.comp_textfield_error_field_text_color), Integer.valueOf(eo1.a.comp_textfield_error_border_weight), null, null, 0, 1845);
                    gestaltTextField.P0(vn1.c.ERROR, rm1.c.ERROR, new rm1.e(rm1.n.WORKFLOW_STATUS_PROBLEM));
                }
                break;
            case 5:
                b(((Number) obj).intValue());
                break;
            case 6:
                h(((Boolean) obj).booleanValue());
                break;
            case 7:
                fm1.c it2 = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                gestaltTextField.setVisibility(bVar.f20043n.getVisibility());
                break;
            case 8:
                f((i0) obj);
                break;
            case 9:
                e((List) obj);
                break;
            case 10:
                e((List) obj);
                break;
            case 11:
                e((List) obj);
                break;
            case 12:
                e((List) obj);
                break;
            case 13:
                f((i0) obj);
                break;
            default:
                f((i0) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(GestaltTextField gestaltTextField, b bVar, int i13) {
        super(1);
        this.f20081i = i13;
        this.f20082j = gestaltTextField;
        this.f20083k = bVar;
    }
}
