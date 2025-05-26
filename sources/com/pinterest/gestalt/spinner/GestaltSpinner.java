package com.pinterest.gestalt.spinner;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.v;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.text.GestaltText;
import fm1.c;
import gm1.b;
import jc0.w;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.j1;
import lh0.z3;
import ln1.d;
import ln1.e;
import ln1.f;
import ln1.g;
import ln1.h;
import ln1.j;
import ln1.k;
import ln1.n;
import ln1.p;
import ln1.r;
import org.jetbrains.annotations.NotNull;
import pl1.a;
import ps0.y;
import se0.o;
import u50.h0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0005\f\r\u0003\u000e\u000fB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/pinterest/gestalt/spinner/GestaltSpinner;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lgm1/b;", "Lln1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrRes", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ln1/c", "ps0/y", "ln1/e", "ln1/f", "spinner_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"GestaltComponentUnsafeSetterCall"})
/* loaded from: classes2.dex */
public final class GestaltSpinner extends n implements b {
    public static final y B = new y(23, 0);
    public static final e C = e.NONE;
    public static final h0 D = h0.f120562a;
    public static final c E = c.VISIBLE;
    public static final f F = f.SM;
    public static final ln1.c G = ln1.c.COLORFUL;
    public final q A;

    /* renamed from: r, reason: collision with root package name */
    public j1 f49597r;

    /* renamed from: s, reason: collision with root package name */
    public final AppCompatImageView f49598s;

    /* renamed from: t, reason: collision with root package name */
    public GestaltText f49599t;

    /* renamed from: u, reason: collision with root package name */
    public final v f49600u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f49601v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f49602w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f49603x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f49604y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f49605z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSpinner(Context context) {
        this(6, context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final AnimatorSet t() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(a.f100561c);
        animatorSet.addListener(new w(this, 1));
        return animatorSet;
    }

    public final void u(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        q qVar = this.A;
    }

    public final j1 v() {
        j1 j1Var = this.f49597r;
        if (j1Var != null) {
            return j1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final void w(d dVar, d dVar2) {
        int i13 = 1;
        df.j1.v(dVar, dVar2, j.f84014k, new h(this, dVar2, i13));
        Drawable drawable = this.f49601v;
        if (drawable == null) {
            Intrinsics.r("spinnerDrawable");
            throw null;
        }
        AppCompatImageView appCompatImageView = this.f49598s;
        appCompatImageView.setImageDrawable(drawable);
        if (df.j1.w(dVar2, dVar, j.f84015l) || df.j1.w(dVar2, dVar, j.f84016m) || df.j1.w(dVar2, dVar, j.f84017n)) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams.width = dl2.b.F0(context, dVar2.f83999a.getDimenAttrRes());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams.height = dl2.b.F0(context2, dVar2.f83999a.getDimenAttrRes());
            appCompatImageView.setLayoutParams(layoutParams);
            appCompatImageView.setVisibility(dVar2.f84003e.getVisibility());
            appCompatImageView.setId(dVar2.f84004f);
        }
        df.j1.v(dVar, dVar2, j.f84018o, new ln1.b(this, 2));
        int i14 = 3;
        if (dVar2.f84004f != Integer.MIN_VALUE) {
            df.j1.v(dVar, dVar2, j.f84019p, new ln1.b(this, i14));
        }
        df.j1.v(dVar, dVar2, j.f84013j, new ln1.b(this, i13));
        boolean z13 = this.f49603x;
        e eVar = dVar2.f84001c;
        if (z13) {
            x(dVar != null ? dVar.f84001c : null, eVar);
            return;
        }
        Drawable drawable2 = this.f49601v;
        if (drawable2 == null) {
            Intrinsics.r("spinnerDrawable");
            throw null;
        }
        o oVar = (o) drawable2;
        int i15 = g.f84005a[eVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            oVar.stop();
            appCompatImageView.setVisibility(8);
        } else {
            if (i15 != 3) {
                return;
            }
            appCompatImageView.setVisibility(0);
            oVar.start();
        }
    }

    public final void x(e eVar, e eVar2) {
        AppCompatImageView appCompatImageView = this.f49598s;
        int i13 = 3;
        if (!this.f49605z) {
            if (this.f49604y) {
                Drawable drawable = this.f49601v;
                if (drawable == null) {
                    Intrinsics.r("spinnerDrawable");
                    throw null;
                }
                k kVar = (k) drawable;
                int i14 = g.f84005a[eVar2.ordinal()];
                if (i14 != 1 && i14 != 2) {
                    if (i14 != 3) {
                        return;
                    }
                    appCompatImageView.setVisibility(0);
                    kVar.start();
                    return;
                }
                if (eVar == e.LOADING) {
                    t().start();
                    return;
                } else {
                    appCompatImageView.setVisibility(8);
                    kVar.stop();
                    return;
                }
            }
            return;
        }
        Drawable drawable2 = this.f49601v;
        if (drawable2 == null) {
            Intrinsics.r("spinnerDrawable");
            throw null;
        }
        v vVar = (v) drawable2;
        int i15 = g.f84005a[eVar2.ordinal()];
        if (i15 == 1 || i15 == 2) {
            if (this.f49602w) {
                t().start();
                return;
            } else {
                appCompatImageView.setVisibility(8);
                vVar.d();
                return;
            }
        }
        if (i15 != 3) {
            return;
        }
        appCompatImageView.setVisibility(0);
        this.f49602w = true;
        v vVar2 = this.f49600u;
        appCompatImageView.setImageDrawable(vVar2);
        vVar2.q();
        vVar2.f28447b.addListener(new sa.c(this, vVar, i13));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSpinner(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSpinner(Context context, d initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        int i13 = 0;
        this.f49600u = new v();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean w03 = dl2.b.w0(context2, eo1.a.comp_spinner_is_vr);
        this.f49603x = w03;
        boolean z13 = w03 && v().a(z3.ACTIVATE_EXPERIMENT);
        this.f49604y = z13;
        boolean z14 = w03 && !z13;
        this.f49605z = z14;
        View.inflate(getContext(), p.gestalt_spinner, this);
        r(17);
        s(1);
        setBackgroundColor(dl2.b.y0(this, eo1.a.sema_color_background_transparent));
        View findViewById = findViewById(ln1.o.gestalt_spinner_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49598s = (AppCompatImageView) findViewById;
        if (z14) {
            com.airbnb.lottie.n.f(getContext(), ln1.q.entry_spinner_animation).b(new ln1.a(this, i13));
        }
        this.A = new q(this, initialDisplayState);
        w(null, initialDisplayState);
    }

    public /* synthetic */ GestaltSpinner(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltSpinner(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49600u = new v();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        boolean w03 = dl2.b.w0(context2, eo1.a.comp_spinner_is_vr);
        this.f49603x = w03;
        int i14 = 0;
        boolean z13 = w03 && v().a(z3.ACTIVATE_EXPERIMENT);
        this.f49604y = z13;
        boolean z14 = w03 && !z13;
        this.f49605z = z14;
        View.inflate(getContext(), p.gestalt_spinner, this);
        r(17);
        s(1);
        setBackgroundColor(dl2.b.y0(this, eo1.a.sema_color_background_transparent));
        View findViewById = findViewById(ln1.o.gestalt_spinner_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49598s = (AppCompatImageView) findViewById;
        if (z14) {
            com.airbnb.lottie.n.f(getContext(), ln1.q.entry_spinner_animation).b(new ln1.a(this, 2));
        }
        int[] GestaltSpinner = r.GestaltSpinner;
        Intrinsics.checkNotNullExpressionValue(GestaltSpinner, "GestaltSpinner");
        q qVar = new q(this, attributeSet, i13, GestaltSpinner, new ln1.b(this, i14));
        this.A = qVar;
        w(null, (d) ((u50.o) qVar.f33803a));
    }
}
