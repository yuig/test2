package com.pinterest.gestalt.selectList;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import eo1.a;
import fm1.c;
import fn1.f;
import fn1.h;
import fn1.i;
import fn1.j;
import fn1.k;
import fn1.r;
import fn1.s;
import gm1.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import q5.v0;
import rm1.d;
import rm1.e;
import rm1.n;
import u50.i0;
import u50.o;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0006\r\u0003\u000e\u000f\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/pinterest/gestalt/selectList/GestaltSelectList;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lfn1/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "fn1/c", "fn1/d", "fn1/e", "fn1/f", "selectList_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes5.dex */
public final class GestaltSelectList extends ConstraintLayout implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final f f49556m = f.DEFAULT;

    /* renamed from: n, reason: collision with root package name */
    public static final c f49557n = c.VISIBLE;

    /* renamed from: o, reason: collision with root package name */
    public static final e f49558o = new e(n.CHEVRON_DOWN);

    /* renamed from: a, reason: collision with root package name */
    public final q f49559a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f49560b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f49561c;

    /* renamed from: d, reason: collision with root package name */
    public final v f49562d;

    /* renamed from: e, reason: collision with root package name */
    public final v f49563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f49564f;

    /* renamed from: g, reason: collision with root package name */
    public final int f49565g;

    /* renamed from: h, reason: collision with root package name */
    public final int f49566h;

    /* renamed from: i, reason: collision with root package name */
    public final int f49567i;

    /* renamed from: j, reason: collision with root package name */
    public final fn1.c f49568j;

    /* renamed from: k, reason: collision with root package name */
    public final fn1.e f49569k;

    /* renamed from: l, reason: collision with root package name */
    public final p f49570l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSelectList(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void o0(GestaltSelectList gestaltSelectList, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i13) {
        gestaltSelectList.k0(num, num2, num3, (i13 & 8) != 0 ? null : num4, num5, num6, a.comp_selectlist_default_field_text_color, null);
    }

    public final GestaltSelectList L(gm1.a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltSelectList) this.f49559a.c(eventHandler, new fn1.a(this, 1));
    }

    public final TextInputLayout T() {
        Object value = this.f49563e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextInputLayout) value;
    }

    public final AutoCompleteTextView X() {
        Object value = this.f49562d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AutoCompleteTextView) value;
    }

    public final String Z() {
        return X().getText().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public final void a0(fn1.b bVar, fn1.b bVar2) {
        ?? r53;
        AutoCompleteTextView X = X();
        Context context = getContext();
        int i13 = r.gestalt_select_list_item;
        List list = bVar2.f62677b;
        if (list != null) {
            List<i0> list2 = list;
            r53 = new ArrayList(g0.q(list2, 10));
            for (i0 i0Var : list2) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                r53.add(i0Var.a(context2).toString());
            }
        } else {
            r53 = q0.f80391a;
        }
        X.setAdapter(new ArrayAdapter(context, i13, (List) r53));
        j1.v(bVar, bVar2, j.f62700p, new h(bVar2, this));
        j1.v(bVar, bVar2, j.f62701q, new h(this, bVar2, 7));
        j1.v(bVar, bVar2, j.f62702r, new h(this, bVar2, 8));
        j1.v(bVar, bVar2, j.f62703s, new h(this, bVar2, 9));
        j1.v(bVar, bVar2, j.f62695k, new h(this, bVar2, 1));
        j1.v(bVar, bVar2, j.f62696l, new h(this, bVar2, 2));
        if (bVar2.f62683h) {
            j1.v(bVar, bVar2, j.f62697m, new h(this, bVar2, 3));
        }
        if (bVar2.f62686k != Integer.MIN_VALUE) {
            j1.v(bVar, bVar2, j.f62698n, new h(this, bVar2, 4));
        }
        j1.v(bVar, bVar2, j.f62699o, new h(this, bVar2, 5));
        TextInputLayout T = T();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        gn1.a aVar = new gn1.a(context3, T(), bVar2);
        EditText editText = T.f33167d;
        if (editText != null) {
            v0.o(editText, aVar);
        }
    }

    public final void d0() {
        int i13 = fn1.p.select_list_box_stroke_color;
        int i14 = a.comp_selectlist_default_border_weight;
        int i15 = a.comp_selectlist_default_field_icon_color;
        int i16 = a.comp_selectlist_default_background_color;
        int i17 = a.comp_selectlist_selected_field_text_color;
        n nVar = f49558o.f108700a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        o0(this, Integer.valueOf(i16), Integer.valueOf(i13), Integer.valueOf(nVar.drawableRes(context)), Integer.valueOf(i15), Integer.valueOf(i17), Integer.valueOf(i14), RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
    }

    public final void g0(vn1.c cVar, rm1.c cVar2, e eVar) {
        d dVar = eVar != null ? new d(eVar, cVar2, null, 0, null, 28) : null;
        GestaltText gestaltText = this.f49561c;
        if (gestaltText != null) {
            gestaltText.i(new k(this, cVar, dVar, 0));
        }
    }

    public final void k0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i13, Integer num7) {
        GestaltText gestaltText;
        BitmapDrawable bitmapDrawable;
        int y03;
        TextInputLayout T = T();
        if (num2 != null) {
            T.C(d5.a.b(T.getContext(), num2.intValue()));
        }
        if (num6 != null) {
            T.R = dl2.b.G0(T, num6.intValue());
            T.e0();
        }
        if (num != null && T.U != (y03 = dl2.b.y0(T, num.intValue()))) {
            T.U = y03;
            T.f33188n0 = y03;
            T.f33192p0 = y03;
            T.f33194q0 = y03;
            T.d();
        }
        if (num5 != null) {
            X().setTextColor(dl2.b.y0(T, num5.intValue()));
        }
        EditText editText = T.f33167d;
        if (editText != null) {
            editText.setHintTextColor(dl2.b.y0(T, i13));
        }
        if (num3 != null) {
            int intValue = num3.intValue();
            int G0 = dl2.b.G0(this, this.f49564f);
            Drawable I = com.bumptech.glide.c.I(getContext(), intValue);
            if (I != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                bitmapDrawable = d7.b.p0(I, resources, G0, G0);
            } else {
                bitmapDrawable = null;
            }
            com.google.android.material.textfield.n nVar = T.f33165c;
            CheckableImageButton checkableImageButton = nVar.f33256f;
            checkableImageButton.setImageDrawable(bitmapDrawable);
            if (bitmapDrawable != null) {
                ColorStateList colorStateList = nVar.f33260j;
                PorterDuff.Mode mode = nVar.f33261k;
                TextInputLayout textInputLayout = nVar.f33251a;
                l0.v(textInputLayout, checkableImageButton, colorStateList, mode);
                l0.W0(textInputLayout, checkableImageButton, nVar.f33260j);
            }
        }
        if (num4 != null) {
            int intValue2 = num4.intValue();
            TextInputLayout T2 = T();
            ColorStateList z03 = dl2.b.z0(T, intValue2);
            com.google.android.material.textfield.n nVar2 = T2.f33165c;
            if (nVar2.f33260j != z03) {
                nVar2.f33260j = z03;
                l0.v(nVar2.f33251a, nVar2.f33256f, z03, nVar2.f33261k);
            }
        }
        if (num7 == null || (gestaltText = this.f49561c) == null) {
            return;
        }
        gestaltText.setTextColor(dl2.b.y0(T, num7.intValue()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSelectList(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSelectList(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49562d = m.b(new i(this, 1));
        int i14 = 0;
        this.f49563e = m.b(new i(this, i14));
        this.f49564f = a.comp_selectlist_field_icon_size;
        this.f49565g = dl2.b.G0(this, a.comp_selectlist_vertical_gap);
        this.f49566h = dl2.b.G0(this, a.comp_selectlist_vertical_padding);
        this.f49567i = dl2.b.G0(this, a.comp_selectlist_padding_start);
        this.f49570l = new p();
        int[] GestaltSelectList = s.GestaltSelectList;
        Intrinsics.checkNotNullExpressionValue(GestaltSelectList, "GestaltSelectList");
        q qVar = new q(this, attributeSet, i13, GestaltSelectList, new fn1.a(this, i14));
        this.f49559a = qVar;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f49568j = fn1.c.values()[dl2.b.O0(context2, a.comp_selectlist_label_position)];
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f49569k = fn1.e.values()[dl2.b.O0(context3, a.comp_selectlist_label_variant)];
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        fn1.d dVar = fn1.d.values()[dl2.b.O0(context4, a.comp_selectlist_helper_text_icon_size)];
        fn1.c cVar = this.f49568j;
        if (cVar != null) {
            if (cVar == fn1.c.INSIDE) {
                View.inflate(getContext(), r.vr_gestalt_select_list, this);
            } else {
                View.inflate(getContext(), r.gestalt_select_list, this);
            }
            a0(null, (fn1.b) ((o) qVar.f33803a));
            return;
        }
        Intrinsics.r("labelPosition");
        throw null;
    }
}
