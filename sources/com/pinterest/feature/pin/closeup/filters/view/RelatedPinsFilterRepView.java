package com.pinterest.feature.pin.closeup.filters.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bk.i;
import bs1.c;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import dx0.d;
import ep.b;
import h32.m2;
import i01.a1;
import i01.b1;
import i01.y0;
import i01.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n80.a;
import nx.v;
import org.jetbrains.annotations.NotNull;
import xk2.k;
import xk2.m;
import xk2.n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/pin/closeup/filters/view/RelatedPinsFilterRepView;", "Landroid/widget/LinearLayout;", "Li01/a1;", "Lnx/v;", "Lt01/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RelatedPinsFilterRepView extends LinearLayout implements a1, v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f46953g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f46954a;

    /* renamed from: b, reason: collision with root package name */
    public final View f46955b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIconButton f46956c;

    /* renamed from: d, reason: collision with root package name */
    public b1 f46957d;

    /* renamed from: e, reason: collision with root package name */
    public m2 f46958e;

    /* renamed from: f, reason: collision with root package name */
    public final k f46959f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RelatedPinsFilterRepView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(z0 filterUIParams, y0 itemClickListener, b1 loggingSpec) {
        Intrinsics.checkNotNullParameter(filterUIParams, "filterUIParams");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        Intrinsics.checkNotNullParameter(loggingSpec, "loggingSpec");
        this.f46957d = loggingSpec;
        setPaddingRelative(c.W(this, eo1.c.space_400), getPaddingTop(), c.W(this, eo1.c.space_400), getPaddingBottom());
        this.f46954a.i(new d(filterUIParams, 25));
        boolean z13 = filterUIParams.f70706a;
        setForeground(z13 ? (i) this.f46959f.getValue() : null);
        int value = m32.c.COLOR.getValue();
        boolean z14 = filterUIParams.f70709d;
        int i13 = filterUIParams.f70708c;
        if (i13 != value) {
            z13 = false;
        } else if (z14) {
            z13 = true;
        }
        View view = this.f46955b;
        c.R1(view, z13);
        if (z13) {
            Drawable background = view.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.mutate();
                String str = filterUIParams.f70710e;
                if (str == null) {
                    c.X0(view);
                } else {
                    gradientDrawable.setColor(Color.parseColor(str));
                }
            }
            setPaddingRelative(c.W(this, eo1.c.space_100), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        }
        boolean z15 = (z14 || i13 == m32.c.ALL.getValue()) ? false : true;
        c.R1(this.f46956c, z15);
        if (z15) {
            setPaddingRelative(getPaddingStart(), getPaddingTop(), c.W(this, a.related_pins_filter_right_icon_padding_end), getPaddingBottom());
        }
        setOnClickListener(new zp.y0(filterUIParams, loggingSpec, itemClickListener, 19));
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        m2 source = this.f46958e;
        if (source == null || this.f46957d == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Long valueOf = Long.valueOf(System.currentTimeMillis() * 1000000);
        b1 b1Var = this.f46957d;
        String valueOf2 = String.valueOf(b1Var != null ? b1Var.f70647a : null);
        b1 b1Var2 = this.f46957d;
        Short valueOf3 = b1Var2 != null ? Short.valueOf((short) b1Var2.f70649c) : null;
        b1 b1Var3 = this.f46957d;
        String valueOf4 = String.valueOf(b1Var3 != null ? b1Var3.f70653g : null);
        b1 b1Var4 = this.f46957d;
        Short valueOf5 = b1Var4 != null ? Short.valueOf((short) b1Var4.f70651e) : null;
        b1 b1Var5 = this.f46957d;
        Short valueOf6 = b1Var5 != null ? Short.valueOf((short) b1Var5.f70652f) : null;
        b1 b1Var6 = this.f46957d;
        return new t01.a(new m2(valueOf2, valueOf4, b1Var6 != null ? b1Var6.f70650d : null, valueOf3, source.f67147e, valueOf, valueOf6, valueOf5), b1Var6 != null ? b1Var6.f70654h : null);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        m2 m2Var = new m2(null, null, null, null, b.f(1000000L), null, null, null);
        this.f46958e = m2Var;
        b1 b1Var = this.f46957d;
        return new t01.a(m2Var, b1Var != null ? b1Var.f70654h : null);
    }

    public /* synthetic */ RelatedPinsFilterRepView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedPinsFilterRepView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46959f = m.a(n.NONE, new au0.a(this, 26));
        View.inflate(context, n80.d.related_pins_filter_item_view, this);
        setOrientation(0);
        View findViewById = findViewById(n80.c.related_pins_filter_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46954a = (GestaltText) findViewById;
        View findViewById2 = findViewById(n80.c.related_pins_filter_color_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46955b = findViewById2;
        View findViewById3 = findViewById(n80.c.dropdown_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f46956c = (GestaltIconButton) findViewById3;
        setLayoutParams(new LinearLayout.LayoutParams(-2, c.W(this, a.related_pins_filter_rep_height)));
        Drawable drawable = context.getDrawable(eo1.d.lego_medium_black_rounded_rect);
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof GradientDrawable) {
            drawable.mutate();
            float W = c.W(this, eo1.c.lego_corner_radius_medium_to_large);
            ((GradientDrawable) drawable).setCornerRadii(new float[]{W, W, W, W, W, W, W, W});
        }
        setBackground(drawable);
    }
}
