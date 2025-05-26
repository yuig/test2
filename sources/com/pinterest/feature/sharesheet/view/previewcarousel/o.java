package com.pinterest.feature.sharesheet.view.previewcarousel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import ni1.s1;
import nx.a0;
import so.jb;
import x02.i2;

/* loaded from: classes5.dex */
public final class o extends RelativeLayout implements ti1.r, af2.c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f48448i = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f48449a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48451c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48452d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f48453e;

    /* renamed from: f, reason: collision with root package name */
    public final wa2.m f48454f;

    /* renamed from: g, reason: collision with root package name */
    public final ti1.o f48455g;

    /* renamed from: h, reason: collision with root package name */
    public final View f48456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, j0 scope, int i13, int i14) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (!this.f48450b) {
            this.f48450b = true;
            this.f48453e = (i2) ((jb) ((p) generatedComponent())).f113483a.F3.get();
        }
        this.f48451c = i13;
        this.f48452d = i14;
        ti1.o oVar = new ti1.o(context, new a0(), scope, null, this, null, null, 488);
        this.f48455g = oVar;
        this.f48454f = new wa2.m(-1411645442, -33554433, 991, null, null, null, qa2.a.ONTO_BOARD, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, true, true, false, false, false, false, false, false, false, false, true);
        setLongClickable(false);
        setClickable(false);
        oVar.b();
        ti1.e a13 = oVar.a();
        Intrinsics.checkNotNullParameter(this, "parent");
        if (a13 instanceof ti1.c) {
            ((ti1.c) a13).f117707a.addToView(this);
        } else if (a13 instanceof ti1.d) {
            ((ti1.d) a13).f117708a.addToView(this);
        }
        ti1.e a14 = oVar.a();
        if (a14 instanceof ti1.c) {
            ((ti1.c) a14).f117707a.I0 = true;
        } else if (a14 instanceof ti1.d) {
            ((ti1.d) a14).f117709b.c().a(new s1());
        }
        View inflate = LayoutInflater.from(context).inflate(b62.c.view_pin_preview_link_overlay, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        Intrinsics.checkNotNullParameter(inflate, "<set-?>");
        this.f48456h = inflate;
        addView(b());
    }

    public final void a(f30 pin, boolean z13, boolean z14) {
        int cornerRadius;
        Intrinsics.checkNotNullParameter(pin, "pin");
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        sr a14 = bs1.b.a(pin, a13);
        int E0 = bs1.c.E0(a14);
        int w03 = bs1.c.w0(a14);
        int i13 = this.f48451c;
        if (z13) {
            i13 /= 2;
        }
        float f13 = w03 != 0 ? i13 / w03 : 1.0f;
        if (E0 != 0) {
            float f14 = E0;
            float f15 = f13 * f14;
            float f16 = this.f48452d;
            if (f15 > f16) {
                f13 = f16 / f14;
            }
        }
        int c13 = ml2.c.c(E0 * f13);
        int c14 = ml2.c.c(w03 * f13);
        ti1.o oVar = this.f48455g;
        ViewGroup.LayoutParams layoutParams = oVar.a().getView().getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.width = c13;
        layoutParams2.height = c14;
        layoutParams2.addRule(13, -1);
        i2 i2Var = this.f48453e;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        i2Var.Z(pin);
        oVar.d(pin, 0, this.f48454f, n.f48447i);
        int id3 = oVar.a().getView().getId();
        ti1.e a15 = oVar.a();
        if (a15 instanceof ti1.c) {
            cornerRadius = ((ti1.c) a15).f117707a.S0();
        } else {
            if (!(a15 instanceof ti1.d)) {
                throw new NoWhenBranchMatchedException();
            }
            cornerRadius = ((ti1.d) a15).f117708a.getCornerRadius();
        }
        float f17 = cornerRadius;
        bs1.c.R1(b(), z14);
        if (z14) {
            Context context = getContext();
            int i14 = s0.gradient_transparent_to_black_45;
            Object obj = d5.a.f53679a;
            Drawable drawable = context.getDrawable(i14);
            Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f17, f17, f17, f17});
            b().setBackground(gradientDrawable);
            View b13 = b();
            ViewGroup.LayoutParams layoutParams3 = b().getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.addRule(8, id3);
            layoutParams4.addRule(18, id3);
            layoutParams4.addRule(19, id3);
            b13.setLayoutParams(layoutParams4);
        }
    }

    public final View b() {
        View view = this.f48456h;
        if (view != null) {
            return view;
        }
        Intrinsics.r("linkOverlayView");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f48449a == null) {
            this.f48449a = new ye2.o(this);
        }
        return this.f48449a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48449a == null) {
            this.f48449a = new ye2.o(this);
        }
        return this.f48449a.generatedComponent();
    }

    @Override // ti1.r
    public final boolean o() {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
