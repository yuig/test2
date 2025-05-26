package com.pinterest.feature.gridactions.pingridhide.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import df.l1;
import g70.h;
import h32.f1;
import h32.g0;
import h32.u0;
import hs0.a;
import hs0.b;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import ks0.g;
import lq0.g1;
import ls0.d;
import m60.r0;
import m60.s0;
import m60.x0;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import rm1.f;
import rm1.q;
import so.jb;
import so.s8;
import ye2.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/gridactions/pingridhide/view/PinGridHideView;", "Landroid/widget/RelativeLayout;", "Lhs0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hidePinLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinGridHideView extends RelativeLayout implements b, c {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f45721x = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45722a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45726e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f45727f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f45728g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f45729h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f45730i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f45731j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f45732k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltButton f45733l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltButton f45734m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45735n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f45736o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45737p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f45738q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f45739r;

    /* renamed from: s, reason: collision with root package name */
    public a f45740s;

    /* renamed from: t, reason: collision with root package name */
    public final d f45741t;

    /* renamed from: u, reason: collision with root package name */
    public final k f45742u;

    /* renamed from: v, reason: collision with root package name */
    public final h f45743v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f45744w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinGridHideView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltText a(int i13) {
        View findViewById = findViewById(i13);
        GestaltText gestaltText = (GestaltText) findViewById;
        gestaltText.i(ks0.c.f80782m);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        return gestaltText;
    }

    public final void b() {
        k kVar = this.f45742u;
        if (kVar != null) {
            kVar.i(getResources().getString(x0.generic_error));
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45722a == null) {
            this.f45722a = new o(this);
        }
        return this.f45722a;
    }

    public final void e(boolean z13) {
        this.f45738q = !z13;
        this.f45727f.i(new rn0.d(z13, 11));
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45722a == null) {
            this.f45722a = new o(this);
        }
        return this.f45722a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f45740s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        a aVar;
        super.onMeasure(i13, i14);
        if (View.MeasureSpec.getMode(i14) != 0) {
            int max = Math.max(0, getMeasuredHeight() - (this.f45726e * 2));
            GestaltText gestaltText = this.f45727f;
            int measuredHeight = gestaltText.getMeasuredHeight();
            gestaltText.i(new rn0.d(!this.f45738q && max > measuredHeight, 18));
            GestaltButton gestaltButton = this.f45733l;
            int measuredHeight2 = gestaltButton.getMeasuredHeight() + this.f45724c;
            boolean z13 = this.f45735n && max > measuredHeight + measuredHeight2;
            gestaltButton.d(new rn0.d(z13, 19));
            if (!z13) {
                measuredHeight2 = 0;
            }
            GestaltText gestaltText2 = this.f45728g;
            int measuredHeight3 = gestaltText2.getMeasuredHeight() + this.f45725d;
            f0 f0Var = new f0();
            f0Var.f80424a = max > (measuredHeight3 + measuredHeight) + measuredHeight2;
            GestaltText gestaltText3 = this.f45729h;
            int measuredHeight4 = gestaltText3.getMeasuredHeight();
            GestaltText gestaltText4 = this.f45730i;
            int measuredHeight5 = gestaltText4.getMeasuredHeight();
            GestaltText gestaltText5 = this.f45731j;
            int measuredHeight6 = gestaltText5.getMeasuredHeight() + measuredHeight5;
            GestaltText gestaltText6 = this.f45732k;
            boolean z14 = this.f45736o && max > ((measuredHeight + measuredHeight4) + (gestaltText6.getMeasuredHeight() + measuredHeight6)) + measuredHeight2;
            gestaltText3.i(new rn0.d(z14, 14));
            gestaltText4.i(new rn0.d(z14, 15));
            gestaltText5.i(new rn0.d(z14, 16));
            gestaltText6.i(new rn0.d(z14, 17));
            if (z14 && (aVar = this.f45740s) != null) {
                is0.h hVar = (is0.h) aVar;
                d0 pinalytics = hVar.getPinalytics();
                f1 f1Var = f1.RENDER;
                u0 u0Var = u0.PIN_FEEDBACK_HIDE_PROMPT;
                g0 g0Var = g0.FLOWED_PIN;
                f30 f30Var = hVar.f73566x;
                pinalytics.N(f1Var, u0Var, g0Var, f30Var != null ? f30Var.getId() : null, false);
            }
            if (z14) {
                f0Var.f80424a = false;
            }
            gestaltText2.i(new g1(13, f0Var, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinGridHideView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 1;
        if (!this.f45723b) {
            this.f45723b = true;
            jb jbVar = (jb) ((g) generatedComponent());
            s8 s8Var = jbVar.f113485c;
            this.f45741t = (d) s8Var.N5.get();
            this.f45742u = (k) jbVar.f113483a.f113921t1.get();
            this.f45743v = s8Var.e5();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_three_quarter);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(r0.margin_half);
        this.f45724c = dimensionPixelSize;
        this.f45725d = dimensionPixelSize2;
        this.f45726e = dimensionPixelSize;
        View inflate = LayoutInflater.from(context).inflate(vp1.b.grid_cell_hide, (ViewGroup) this, true);
        inflate.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        View findViewById = findViewById(vp1.a.title);
        GestaltText gestaltText = (GestaltText) findViewById;
        gestaltText.i(ks0.c.f80779j);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45727f = gestaltText;
        this.f45728g = a(vp1.a.hide_reason);
        this.f45729h = a(vp1.a.hide_feedback_prompt);
        GestaltText a13 = a(vp1.a.hide_feedback_low_quality);
        int i15 = 0;
        a13.j(new ks0.b(this, i15));
        this.f45730i = a13;
        GestaltText a14 = a(vp1.a.hide_feedback_not_for_me);
        a14.j(new ks0.b(this, i14));
        this.f45731j = a14;
        GestaltText a15 = a(vp1.a.hide_feedback_offensive_spam);
        int i16 = 2;
        a15.j(new ks0.b(this, i16));
        this.f45732k = a15;
        this.f45734m = ((GestaltButton) findViewById(vp1.a.unfollow_topic_button)).d(ks0.c.f80780k).e(new ks0.b(this, 3));
        this.f45733l = ((GestaltButton) findViewById(vp1.a.undo_button)).d(ks0.c.f80781l).e(new ks0.b(this, 4));
        setBackgroundResource(s0.bg_feedback);
        rm1.d dVar = new rm1.d(new f(q.ARROW_FORWARD), rm1.c.LIGHT, null, 0, null, 28);
        a13.i(new ks0.f(dVar, i15));
        a14.i(new ks0.f(dVar, i14));
        a15.i(new ks0.f(dVar, i16));
        requestLayout();
        setOnTouchListener(new l1(3));
    }

    public /* synthetic */ PinGridHideView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }
}
