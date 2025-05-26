package com.pinterest.gestalt.toast;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import c2.m4;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import do1.a0;
import do1.c0;
import do1.d;
import do1.d0;
import do1.f;
import do1.g;
import do1.j;
import do1.l;
import do1.m;
import do1.n;
import do1.p;
import do1.s;
import do1.y;
import do1.z;
import e0.t;
import el2.a;
import eo1.c;
import gm1.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import rl1.k0;
import rm1.e;
import rm1.h;
import rm1.i;
import se0.o;
import u50.i0;
import xk2.v;
import xm1.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0006\f\r\u000e\u0003\u000f\u0010B'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/pinterest/gestalt/toast/GestaltToast;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lgm1/b;", "Ldo1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "do1/b", "do1/c", "org/chromium/net/y", "do1/m", "do1/n", "toast_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltToast extends LinearLayoutCompat implements b {
    public static final i E = i.MD;
    public static final n F = n.DEFAULT;
    public static final int G = c.space_400;
    public final v A;
    public final v B;
    public final v C;
    public GestaltButton D;

    /* renamed from: p */
    public final q f49689p;

    /* renamed from: q */
    public WebImageView f49690q;

    /* renamed from: r */
    public GestaltAvatar f49691r;

    /* renamed from: s */
    public GestaltIcon f49692s;

    /* renamed from: t */
    public AppCompatImageView f49693t;

    /* renamed from: u */
    public GestaltText f49694u;

    /* renamed from: v */
    public do1.c f49695v;

    /* renamed from: w */
    public final v f49696w;

    /* renamed from: x */
    public final v f49697x;

    /* renamed from: y */
    public final v f49698y;

    /* renamed from: z */
    public final v f49699z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltToast(Context context) {
        this(6, context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int A() {
        return ((Number) this.A.getValue()).intValue();
    }

    public final void B() {
        View.inflate(getContext(), a0.gestalt_toast, this);
        a entries = do1.c.getEntries();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f49695v = (do1.c) entries.get(dl2.b.O0(context, eo1.a.comp_toast_button_variant));
        C(null, z());
    }

    public final void C(d dVar, d dVar2) {
        int i13;
        j1.v(dVar, dVar2, s.f55693j, new p(dVar2, this));
        n nVar = dVar2.f55668d;
        n nVar2 = n.ERROR;
        int i14 = 6;
        AttributeSet attributeSet = null;
        boolean z13 = dVar2.f55673i;
        u50.n nVar3 = dVar2.f55672h;
        int i15 = dVar2.f55671g;
        i0 i0Var = dVar2.f55665a;
        if (nVar == nVar2) {
            l lVar = new l(new e(rm1.n.WORKFLOW_STATUS_PROBLEM, h.LG));
            if (this.f49692s == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.f49692s = new GestaltIcon(context);
            }
            if (this.f49694u == null) {
                this.f49694u = new GestaltText(6, new ContextThemeWrapper(getContext(), c0.GestaltToastTextView), (AttributeSet) null);
            }
            w(lVar);
            x(i15, i0Var);
            u(getContext().getDrawable(y.gestalt_toast_background_error), nVar3, z13);
            t(Integer.valueOf(eo1.a.comp_toast_right_large_padding), Integer.valueOf(eo1.a.comp_toast_left_large_padding));
            return;
        }
        m mVar = dVar2.f55666b;
        boolean z14 = mVar instanceof j;
        v vVar = this.B;
        if (z14) {
            if (this.f49690q == null) {
                this.f49690q = new WebImageView(new ContextThemeWrapper(getContext(), c0.GestaltToastWebImageView));
            }
            j jVar = (j) mVar;
            WebImageView webImageView = this.f49690q;
            if (webImageView != null) {
                do1.i iVar = jVar.f55680a;
                if (iVar instanceof g) {
                    webImageView.loadUrl(((g) iVar).f55678a);
                } else if (iVar instanceof f) {
                    webImageView.setImageDrawable(((f) iVar).f55677a);
                } else {
                    if (!(iVar instanceof do1.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    webImageView.w2(((do1.h) iVar).f55679a);
                }
            }
            if (y().findViewById(z.thumbnail) == null) {
                WebImageView webImageView2 = this.f49690q;
                if (webImageView2 != null) {
                    webImageView2.setId(z.thumbnail);
                    v vVar2 = this.f49697x;
                    webImageView2.setMinimumWidth(((Number) vVar2.getValue()).intValue());
                    webImageView2.setMaxWidth(((Number) vVar2.getValue()).intValue());
                    webImageView2.setMinimumHeight(((Number) vVar2.getValue()).intValue());
                    webImageView2.setMaxHeight(((Number) vVar2.getValue()).intValue());
                    webImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    float floatValue = ((Number) this.f49698y.getValue()).floatValue();
                    webImageView2.g2(floatValue, floatValue, floatValue, floatValue);
                    v vVar3 = this.f49699z;
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(((Number) vVar3.getValue()).intValue(), ((Number) vVar3.getValue()).intValue());
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = A();
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = A();
                    ((LinearLayout.LayoutParams) layoutParams).rightMargin = ((Number) vVar.getValue()).intValue();
                    webImageView2.setLayoutParams(layoutParams);
                }
                y().addView(this.f49690q);
            }
            i13 = eo1.a.comp_toast_left_small_padding;
        } else if (mVar instanceof do1.e) {
            if (this.f49691r == null) {
                this.f49691r = new GestaltAvatar(i14, new ContextThemeWrapper(getContext(), k0.GestaltAvatar_SizeMedium), attributeSet);
            }
            do1.e eVar = (do1.e) mVar;
            GestaltAvatar gestaltAvatar = this.f49691r;
            if (gestaltAvatar != null) {
                t.g(gestaltAvatar, new k(14, eVar, this));
            }
            if (y().findViewById(z.avatar) == null) {
                GestaltAvatar gestaltAvatar2 = this.f49691r;
                if (gestaltAvatar2 != null) {
                    LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-2, -2);
                    ((LinearLayout.LayoutParams) layoutParams2).topMargin = A();
                    ((LinearLayout.LayoutParams) layoutParams2).bottomMargin = A();
                    ((LinearLayout.LayoutParams) layoutParams2).rightMargin = ((Number) vVar.getValue()).intValue();
                    gestaltAvatar2.setLayoutParams(layoutParams2);
                }
                y().addView(this.f49691r);
            }
            i13 = eo1.a.comp_toast_left_small_padding;
        } else if (mVar instanceof l) {
            if (this.f49692s == null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.f49692s = new GestaltIcon(context2);
            }
            w((l) mVar);
            i13 = eo1.a.comp_toast_left_large_padding;
        } else if (mVar instanceof do1.k) {
            if (this.f49693t == null) {
                this.f49693t = new AppCompatImageView(new ContextThemeWrapper(getContext(), c0.GestaltToastSpinner), null);
            }
            do1.k kVar = (do1.k) mVar;
            if (this.f49693t != null) {
                Resources resources = getResources();
                kVar.getClass();
                o oVar = new o(getContext(), resources.getDimensionPixelSize(do1.k.f55682b));
                oVar.f112405c = dl2.b.y0(this, eo1.a.comp_toast_color_background_default);
                oVar.f112404b = dl2.b.y0(this, eo1.a.comp_toast_spinner_color);
                AppCompatImageView appCompatImageView = this.f49693t;
                if (appCompatImageView != null) {
                    appCompatImageView.setImageDrawable(oVar);
                }
                oVar.start();
                kotlin.jvm.internal.j.z(dl2.b.e(), null, null, new do1.q(dVar2.f55670f, oVar, null), 3);
            }
            if (y().findViewById(z.spinner_image) == null) {
                AppCompatImageView appCompatImageView2 = this.f49693t;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setId(z.spinner_image);
                    v vVar4 = this.C;
                    LinearLayoutCompat.LayoutParams layoutParams3 = new LinearLayoutCompat.LayoutParams(((Number) vVar4.getValue()).intValue(), ((Number) vVar4.getValue()).intValue());
                    ((LinearLayout.LayoutParams) layoutParams3).topMargin = A();
                    ((LinearLayout.LayoutParams) layoutParams3).bottomMargin = A();
                    ((LinearLayout.LayoutParams) layoutParams3).rightMargin = ((Number) vVar.getValue()).intValue();
                    appCompatImageView2.setLayoutParams(layoutParams3);
                }
                y().addView(this.f49693t);
            }
            i13 = eo1.a.comp_toast_left_large_padding;
        } else {
            if (mVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = eo1.a.comp_toast_left_large_padding;
        }
        if (!Intrinsics.d(dVar != null ? dVar.f55665a : null, i0Var) || dVar.f55671g != i15) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            if (bs1.c.i1(i0Var, context3)) {
                if (this.f49694u == null) {
                    this.f49694u = new GestaltText(6, new ContextThemeWrapper(getContext(), c0.GestaltToastTextView), (AttributeSet) null);
                }
                x(i15, i0Var);
            }
        }
        h0 h0Var = new h0();
        h0Var.f80426a = eo1.a.comp_toast_right_large_padding;
        j1.v(dVar, dVar2, s.f55695l, new fn1.k(this, dVar2, h0Var, 3));
        int i16 = dVar2.f55669e;
        if (i16 != Integer.MIN_VALUE) {
            setId(i16);
        }
        u(getContext().getDrawable(y.gestalt_toast_background), nVar3, z13);
        t(Integer.valueOf(h0Var.f80426a), Integer.valueOf(i13));
    }

    public final void t(Integer num, Integer num2) {
        LinearLayoutCompat y13 = y();
        ViewGroup.LayoutParams layoutParams = y13.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        y13.setPaddingRelative(dl2.b.G0(y13, num2.intValue()), y13.getPaddingTop(), dl2.b.G0(y13, num.intValue()), y13.getPaddingBottom());
        y13.setLayoutParams(layoutParams);
    }

    public final void u(Drawable drawable, u50.n nVar, boolean z13) {
        int dimensionPixelSize;
        LinearLayoutCompat y13 = y();
        ViewGroup.LayoutParams layoutParams = y13.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i13 = 0;
        if (z13) {
            ViewGroup.LayoutParams layoutParams2 = y13.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            dimensionPixelSize = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        } else if (nVar != null) {
            Context context = y13.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            dimensionPixelSize = nVar.a(context).intValue();
        } else {
            dimensionPixelSize = y13.getResources().getDimensionPixelSize(G);
        }
        if (!z13 || nVar == null) {
            ViewGroup.LayoutParams layoutParams3 = y13.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                i13 = marginLayoutParams3.bottomMargin;
            }
        } else {
            Context context2 = y13.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i13 = nVar.a(context2).intValue();
        }
        pp2.a.P0(marginLayoutParams, marginLayoutParams.getMarginStart(), dimensionPixelSize, marginLayoutParams.getMarginEnd(), i13);
        y13.setLayoutParams(marginLayoutParams);
        if (drawable != null) {
            y13.setBackground(drawable);
        }
    }

    public final GestaltToast v(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltToast) this.f49689p.d(nextState, new p(this, z()));
    }

    public final void w(l lVar) {
        GestaltIcon gestaltIcon = this.f49692s;
        if (gestaltIcon != null) {
            dl2.b.z(gestaltIcon, new an1.i(lVar, 20));
        }
        if (y().findViewById(z.icon) != null) {
            return;
        }
        GestaltIcon gestaltIcon2 = this.f49692s;
        if (gestaltIcon2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams) layoutParams).topMargin = A();
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = A();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = ((Number) this.B.getValue()).intValue();
            gestaltIcon2.setLayoutParams(layoutParams);
        }
        y().addView(this.f49692s);
    }

    public final void x(int i13, i0 i0Var) {
        GestaltText gestaltText = this.f49694u;
        if (gestaltText != null) {
            gestaltText.i(new m4(i0Var, i13, 24));
        }
        if (y().findViewById(z.gestalt_text) != null) {
            return;
        }
        GestaltText gestaltText2 = this.f49694u;
        if (gestaltText2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2, 1.0f);
            ((LinearLayout.LayoutParams) layoutParams).topMargin = A();
            ((LinearLayout.LayoutParams) layoutParams).bottomMargin = A();
            gestaltText2.setLayoutParams(layoutParams);
        }
        y().addView(this.f49694u);
    }

    public final LinearLayoutCompat y() {
        Object value = this.f49696w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayoutCompat) value;
    }

    public final d z() {
        return (d) ((u50.o) this.f49689p.f33803a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltToast(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltToast(Context context, d initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49696w = xk2.m.b(new do1.o(this, 0));
        this.f49697x = xk2.m.b(new do1.o(this, 4));
        this.f49698y = xk2.m.b(new do1.o(this, 3));
        this.f49699z = xk2.m.b(new do1.o(this, 5));
        this.A = xk2.m.b(new do1.o(this, 6));
        this.B = xk2.m.b(new do1.o(this, 1));
        this.C = xk2.m.b(new do1.o(this, 2));
        this.f49689p = new q(this, initialDisplayState);
        B();
    }

    public /* synthetic */ GestaltToast(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltToast(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 0;
        this.f49696w = xk2.m.b(new do1.o(this, i14));
        this.f49697x = xk2.m.b(new do1.o(this, 4));
        this.f49698y = xk2.m.b(new do1.o(this, 3));
        this.f49699z = xk2.m.b(new do1.o(this, 5));
        this.A = xk2.m.b(new do1.o(this, 6));
        this.B = xk2.m.b(new do1.o(this, 1));
        this.C = xk2.m.b(new do1.o(this, 2));
        int[] GestaltToast = d0.GestaltToast;
        Intrinsics.checkNotNullExpressionValue(GestaltToast, "GestaltToast");
        this.f49689p = new q(this, attributeSet, i13, GestaltToast, new do1.a(this, i14));
        B();
    }
}
