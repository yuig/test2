package qa2;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z2;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a1 extends gg0.n0 {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public x0 B;
    public gb2.k C;
    public wa2.z D;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d0 f103209d;

    /* renamed from: e, reason: collision with root package name */
    public final h32.g0 f103210e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f103211f;

    /* renamed from: g, reason: collision with root package name */
    public final int f103212g;

    /* renamed from: h, reason: collision with root package name */
    public final int f103213h;

    /* renamed from: i, reason: collision with root package name */
    public final int f103214i;

    /* renamed from: j, reason: collision with root package name */
    public final int f103215j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f103216k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f103217l;

    /* renamed from: m, reason: collision with root package name */
    public final xj2.b f103218m;

    /* renamed from: n, reason: collision with root package name */
    public dl1.t f103219n;

    /* renamed from: o, reason: collision with root package name */
    public dl1.t f103220o;

    /* renamed from: p, reason: collision with root package name */
    public dl1.t f103221p;

    /* renamed from: q, reason: collision with root package name */
    public g70.h f103222q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltText f103223r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltText f103224s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltIcon f103225t;

    /* renamed from: u, reason: collision with root package name */
    public final View f103226u;

    /* renamed from: v, reason: collision with root package name */
    public GradientDrawable f103227v;

    /* renamed from: w, reason: collision with root package name */
    public f30 f103228w;

    /* renamed from: x, reason: collision with root package name */
    public int f103229x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f103230y;

    /* renamed from: z, reason: collision with root package name */
    public float f103231z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, nx.d0 pinalytics, h32.g0 g0Var, HashMap hashMap) {
        super(context, 6);
        final int i13 = 0;
        final int i14 = 1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f103209d = pinalytics;
        this.f103210e = g0Var;
        this.f103211f = hashMap;
        int y03 = dl2.b.y0(this, eo1.a.color_background_dark_opacity_300);
        this.f103212g = y03;
        int y04 = dl2.b.y0(this, eo1.a.color_background_dark_opacity_400);
        this.f103213h = y04;
        int y05 = dl2.b.y0(this, eo1.a.color_background_dark_opacity_200);
        this.f103214i = y05;
        int y06 = dl2.b.y0(this, eo1.a.color_background_dark_opacity_300);
        this.f103215j = y06;
        xk2.v b13 = xk2.m.b(y0.f103371j);
        this.f103216k = b13;
        this.f103217l = xk2.m.b(y0.f103372k);
        this.f103218m = new xj2.b();
        this.f103229x = -1;
        this.f103231z = getResources().getDimension(eo1.c.lego_corner_radius_small);
        this.A = true;
        View inflate = LayoutInflater.from(context).inflate(wy1.e.layout_pin_saved_view, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(wy1.d.saved_action_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f103223r = gestaltText;
        View findViewById2 = inflate.findViewById(wy1.d.saved_board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById2;
        this.f103224s = gestaltText2;
        View findViewById3 = inflate.findViewById(wy1.d.saved_board_cta_arrow);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f103225t = (GestaltIcon) findViewById3;
        View findViewById4 = inflate.findViewById(wy1.d.saved_board_cta_touch);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f103226u = findViewById4;
        j();
        ObjectAnimator d03 = kg.a.d0(gestaltText, "translationY", 300.0f, 0.0f, 0.75f, 0.25f);
        ObjectAnimator d04 = kg.a.d0(gestaltText2, "translationY", 300.0f, 0.0f, 0.75f, 0.25f);
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("cta_alpha", 0.0f, 1.0f);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(ofFloat, TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? PropertyValuesHolder.ofFloat("translation_x", 20.0f, 0.0f) : PropertyValuesHolder.ofFloat("translation_x", -20.0f, 0.0f));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setStartDelay(1000L);
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qa2.u0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f103357b;

            {
                this.f103357b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                int i15 = i14;
                a1 this$0 = this.f103357b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        Object animatedValue = animator.getAnimatedValue("gradient_Start");
                        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue).intValue();
                        Object animatedValue2 = animator.getAnimatedValue("gradient_end");
                        Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) animatedValue2).intValue();
                        GradientDrawable gradientDrawable = this$0.f103227v;
                        if (gradientDrawable != null) {
                            gradientDrawable.setColors(new int[]{intValue, intValue2});
                            return;
                        } else {
                            Intrinsics.r("overlayBg");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        Object animatedValue3 = animator.getAnimatedValue("cta_alpha");
                        Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue3).floatValue();
                        this$0.f103225t.setAlpha(floatValue);
                        Object animatedValue4 = animator.getAnimatedValue("translation_x");
                        Intrinsics.g(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f103225t.setTranslationX(((Float) animatedValue4).floatValue());
                        this$0.f103223r.setAlpha(1.0f - floatValue);
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
        ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofObject("gradient_Start", new ArgbEvaluator(), Integer.valueOf(y03), Integer.valueOf(y05)), PropertyValuesHolder.ofObject("gradient_end", new ArgbEvaluator(), Integer.valueOf(y04), Integer.valueOf(y06)));
        ofPropertyValuesHolder2.setDuration(1000L);
        ofPropertyValuesHolder2.setStartDelay(1000L);
        ofPropertyValuesHolder2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: qa2.u0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f103357b;

            {
                this.f103357b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                int i15 = i13;
                a1 this$0 = this.f103357b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        Object animatedValue = animator.getAnimatedValue("gradient_Start");
                        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) animatedValue).intValue();
                        Object animatedValue2 = animator.getAnimatedValue("gradient_end");
                        Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) animatedValue2).intValue();
                        GradientDrawable gradientDrawable = this$0.f103227v;
                        if (gradientDrawable != null) {
                            gradientDrawable.setColors(new int[]{intValue, intValue2});
                            return;
                        } else {
                            Intrinsics.r("overlayBg");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(animator, "animator");
                        Object animatedValue3 = animator.getAnimatedValue("cta_alpha");
                        Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue3).floatValue();
                        this$0.f103225t.setAlpha(floatValue);
                        Object animatedValue4 = animator.getAnimatedValue("translation_x");
                        Intrinsics.g(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f103225t.setTranslationX(((Float) animatedValue4).floatValue());
                        this$0.f103223r.setAlpha(1.0f - floatValue);
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder2, "apply(...)");
        ((AnimatorSet) b13.getValue()).playTogether(d03, d04, ofPropertyValuesHolder, ofPropertyValuesHolder2);
        ((AnimatorSet) b13.getValue()).addListener(new ir.b(this, 11));
        int W = bs1.c.W(this, m60.r0.stroke);
        setPadding(W, W, W, W);
    }

    public static void k(a1 a1Var, String str, String str2, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        HashMap hashMap = a1Var.f103211f;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        h32.u0 u0Var = h32.u0.PIN_REP_BOARD_PAGE_LINK;
        if (str != null) {
        }
        if (str2 != null) {
        }
        hashMap.put("grid_index", String.valueOf(a1Var.f103229x));
        Unit unit = Unit.f80348a;
        a1Var.f103209d.h(a1Var.f103210e, u0Var, hashMap);
    }

    public final int i(f30 f30Var) {
        if (b40.X0(f30Var)) {
            return Integer.MAX_VALUE;
        }
        boolean z13 = this.f103230y || b40.B0(f30Var);
        int i13 = wa2.s.f128899l0;
        Boolean d53 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        return bk.f.R(z13, d53.booleanValue());
    }

    public final void j() {
        Context context = getContext();
        int i13 = m60.s0.bg_grid_save_overlay;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i13);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.f103227v = (GradientDrawable) drawable;
        setBackground(drawable);
    }

    public final void l() {
        if (this.E) {
            this.E = false;
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            View findViewById = viewGroup != null ? viewGroup.findViewById(wy1.d.lego_pin_grid_cell_id) : null;
            if (findViewById != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(kg.a.A(0.0f, 1.0f, 800L, findViewById));
                animatorSet.start();
            }
        }
    }

    public final void m(gb2.k kVar) {
        this.C = kVar;
        wa2.a0 a0Var = kVar.f64759b;
        wa2.a0 a0Var2 = wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION;
        GestaltIcon gestaltIcon = this.f103225t;
        GestaltText gestaltText = this.f103223r;
        xk2.v vVar = this.f103216k;
        if (a0Var == a0Var2) {
            l();
            n(kVar);
            j();
            gestaltText.setAlpha(1.0f);
            gestaltIcon.setAlpha(0.0f);
            GradientDrawable gradientDrawable = this.f103227v;
            if (gradientDrawable == null) {
                Intrinsics.r("overlayBg");
                throw null;
            }
            gradientDrawable.setColors(new int[]{this.f103212g, this.f103213h});
            ((AnimatorSet) vVar.getValue()).start();
            return;
        }
        if (a0Var == wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_VISIBLE) {
            l();
            n(kVar);
            o();
            return;
        }
        if (a0Var == wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION) {
            this.E = true;
            ((AnimatorSet) vVar.getValue()).cancel();
            gestaltText.setAlpha(0.0f);
            gestaltIcon.setAlpha(0.0f);
            this.f103224s.i(l.f103309s);
            Context context = getContext();
            int i13 = eo1.b.color_themed_background_default;
            Object obj = d5.a.f53679a;
            setBackgroundColor(context.getColor(i13));
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            View findViewById = viewGroup != null ? viewGroup.findViewById(wy1.d.lego_pin_grid_cell_id) : null;
            if (findViewById != null) {
                findViewById.setAlpha(0.0f);
            }
        }
    }

    public final void n(gb2.k kVar) {
        String str = kVar.f64760c;
        this.f103224s.i(new kw1.c(str, 16));
        wa2.z zVar = this.D;
        final int i13 = 1;
        View view = this.f103226u;
        if (zVar != null) {
            view.setOnClickListener(new v0(this, zVar, i13));
            return;
        }
        final gb2.d dVar = kVar.f64761d;
        if (dVar instanceof gb2.c) {
            view.setContentDescription(getResources().getString(wy1.f.accessibility_saved_to_profile));
            final int i14 = 0;
            view.setOnClickListener(new View.OnClickListener(this) { // from class: qa2.w0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a1 f103364b;

                {
                    this.f103364b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i14;
                    gb2.d savedLocationUid = dVar;
                    a1 this$0 = this.f103364b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, null, savedLocationUid.f64745a, 1);
                            NavigationImpl c13 = r41.k.c(r41.k.f106176a, savedLocationUid.f64745a, r41.b.PinSavedOverlayView, r41.g.Pin, null, 24);
                            Object value = this$0.f103217l.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((m60.w) value).d(c13);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, savedLocationUid.f64745a, null, 2);
                            g70.h hVar = this$0.f103222q;
                            if (hVar == null) {
                                Intrinsics.r("boardNavigator");
                                throw null;
                            }
                            g70.h.g(hVar, savedLocationUid.f64745a, null, l.f103308r, 2);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, ((gb2.b) savedLocationUid).f64744b, null, 2);
                            Object value2 = this$0.f103217l.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            NavigationImpl z03 = Navigation.z0((ScreenLocation) z2.f51671a.getValue(), savedLocationUid.f64745a);
                            z03.m0("com.pinterest.EXTRA_BOARD_ID", ((gb2.b) savedLocationUid).f64744b);
                            ((m60.w) value2).d(z03);
                            return;
                    }
                }
            });
        } else if (dVar instanceof gb2.a) {
            view.setContentDescription(getResources().getString(wy1.f.accessibility_saved_to_board, str));
            view.setOnClickListener(new View.OnClickListener(this) { // from class: qa2.w0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a1 f103364b;

                {
                    this.f103364b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i13;
                    gb2.d savedLocationUid = dVar;
                    a1 this$0 = this.f103364b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, null, savedLocationUid.f64745a, 1);
                            NavigationImpl c13 = r41.k.c(r41.k.f106176a, savedLocationUid.f64745a, r41.b.PinSavedOverlayView, r41.g.Pin, null, 24);
                            Object value = this$0.f103217l.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((m60.w) value).d(c13);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, savedLocationUid.f64745a, null, 2);
                            g70.h hVar = this$0.f103222q;
                            if (hVar == null) {
                                Intrinsics.r("boardNavigator");
                                throw null;
                            }
                            g70.h.g(hVar, savedLocationUid.f64745a, null, l.f103308r, 2);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, ((gb2.b) savedLocationUid).f64744b, null, 2);
                            Object value2 = this$0.f103217l.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            NavigationImpl z03 = Navigation.z0((ScreenLocation) z2.f51671a.getValue(), savedLocationUid.f64745a);
                            z03.m0("com.pinterest.EXTRA_BOARD_ID", ((gb2.b) savedLocationUid).f64744b);
                            ((m60.w) value2).d(z03);
                            return;
                    }
                }
            });
        } else if (dVar instanceof gb2.b) {
            view.setContentDescription(getResources().getString(wy1.f.accessibility_saved_to_board_section, str));
            final int i15 = 2;
            view.setOnClickListener(new View.OnClickListener(this) { // from class: qa2.w0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a1 f103364b;

                {
                    this.f103364b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i152 = i15;
                    gb2.d savedLocationUid = dVar;
                    a1 this$0 = this.f103364b;
                    switch (i152) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, null, savedLocationUid.f64745a, 1);
                            NavigationImpl c13 = r41.k.c(r41.k.f106176a, savedLocationUid.f64745a, r41.b.PinSavedOverlayView, r41.g.Pin, null, 24);
                            Object value = this$0.f103217l.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            ((m60.w) value).d(c13);
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, savedLocationUid.f64745a, null, 2);
                            g70.h hVar = this$0.f103222q;
                            if (hVar == null) {
                                Intrinsics.r("boardNavigator");
                                throw null;
                            }
                            g70.h.g(hVar, savedLocationUid.f64745a, null, l.f103308r, 2);
                            return;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(savedLocationUid, "$savedLocationUid");
                            a1.k(this$0, ((gb2.b) savedLocationUid).f64744b, null, 2);
                            Object value2 = this$0.f103217l.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            NavigationImpl z03 = Navigation.z0((ScreenLocation) z2.f51671a.getValue(), savedLocationUid.f64745a);
                            z03.m0("com.pinterest.EXTRA_BOARD_ID", ((gb2.b) savedLocationUid).f64744b);
                            ((m60.w) value2).d(z03);
                            return;
                    }
                }
            });
        }
    }

    public final void o() {
        j();
        this.f103223r.setAlpha(0.0f);
        this.f103225t.setAlpha(1.0f);
        GradientDrawable gradientDrawable = this.f103227v;
        if (gradientDrawable != null) {
            gradientDrawable.setColors(new int[]{this.f103214i, this.f103215j});
        } else {
            Intrinsics.r("overlayBg");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xj2.b bVar = this.f103218m;
        xj2.c[] cVarArr = new xj2.c[4];
        dl1.w wVar = this.f103219n;
        if (wVar == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        uj2.q z13 = ((dl1.q0) wVar).z();
        b22.f fVar = new b22.f(18, l.f103305o);
        int i13 = 0;
        jk2.j1 j1Var = new jk2.j1(z13, fVar, i13);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        cVarArr[0] = nl.b.m(j1Var, "Board Deletion Stream", new z0(this, i13));
        dl1.w wVar2 = this.f103220o;
        if (wVar2 == null) {
            Intrinsics.r("boardSectionRepository");
            throw null;
        }
        jk2.j1 j1Var2 = new jk2.j1(((dl1.q0) wVar2).z(), new b22.f(19, l.f103306p), i13);
        Intrinsics.checkNotNullExpressionValue(j1Var2, "map(...)");
        cVarArr[1] = nl.b.m(j1Var2, "Board Section Deletion Stream", new z0(this, 1));
        dl1.w wVar3 = this.f103221p;
        if (wVar3 == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        jk2.l1 A = ((dl1.q0) wVar3).z().A(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(A, "observeOn(...)");
        int i14 = 2;
        cVarArr[2] = nl.b.m(A, "Pin Deletion Stream", new z0(this, i14));
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(21, l.f103303m);
        dVar.getClass();
        jk2.x xVar = new jk2.x(new jk2.u0(pk2.f.j(new jk2.j1(dVar, aVar, i13), new qt.b(21, l.f103304n), 2, "filter(...)"), new b22.f(20, l.f103307q), i13), new b22.f(12, new z0(this, 3)), i14);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        cVarArr[3] = nl.b.m(xVar, "UI Update Stream", new u(this, 2));
        bVar.getClass();
        if (!bVar.f135163b) {
            synchronized (bVar) {
                try {
                    if (!bVar.f135163b) {
                        pk2.m mVar = bVar.f135162a;
                        if (mVar == null) {
                            mVar = new pk2.m(5);
                            bVar.f135162a = mVar;
                        }
                        while (i13 < 4) {
                            xj2.c cVar = cVarArr[i13];
                            ck2.i.b(cVar, "A Disposable in the disposables array is null");
                            mVar.a(cVar);
                            i13++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        while (i13 < 4) {
            cVarArr[i13].dispose();
            i13++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f103218m.d();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        if (!this.A) {
            super.onMeasure(i13, i14);
            return;
        }
        f30 f30Var = this.f103228w;
        if (f30Var == null) {
            throw new IllegalStateException("setPin() wasn't called, therefore we can't measure");
        }
        int size = View.MeasureSpec.getSize(i13);
        x0 x0Var = this.B;
        if (x0Var != null) {
            androidx.appcompat.widget.q qVar = (androidx.appcompat.widget.q) x0Var;
            int i17 = qVar.f16668a;
            Object obj = qVar.f16669b;
            switch (i17) {
                case 0:
                    i15 = ((we1.u0) obj).f129593j.getPinDrawableHeight();
                    break;
                default:
                    ti1.f fVar = (ti1.f) obj;
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    i15 = fVar.getPinDrawableHeight();
                    break;
            }
        } else {
            i15 = 0;
        }
        if (i15 > 0) {
            i16 = Math.min(i15, i(f30Var));
        } else {
            float f13 = size;
            as1.b a13 = as1.b.a();
            Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
            sr a14 = bs1.b.a(f30Var, a13);
            if (a14 == null) {
                as1.b a15 = as1.b.a();
                Intrinsics.checkNotNullExpressionValue(a15, "get(...)");
                a14 = bs1.b.b(f30Var, a15);
            }
            int w03 = (int) (f13 * ((a14 == null || bs1.c.E0(a14) <= 0) ? 0.0f : (bs1.c.w0(a14) * 1.0f) / bs1.c.E0(a14)));
            i16 = i(f30Var);
            if (w03 <= i16) {
                i16 = w03;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
        setMeasuredDimension(size, i16);
    }

    public final void q(int i13) {
        float f13 = i13;
        this.f103231z = f13;
        GradientDrawable gradientDrawable = this.f103227v;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(f13);
        } else {
            Intrinsics.r("overlayBg");
            throw null;
        }
    }

    public final void s(wa2.z actionOverride) {
        Intrinsics.checkNotNullParameter(actionOverride, "actionOverride");
        this.f103226u.setOnClickListener(new v0(this, actionOverride, 0));
        Unit unit = Unit.f80348a;
        this.D = actionOverride;
    }

    public final void t(f30 newPin, int i13) {
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        this.f103228w = newPin;
        this.f103229x = i13;
        requestLayout();
    }

    public final void x() {
        setVisibility(8);
        gb2.k kVar = this.C;
        if (kVar != null) {
            gb2.f fVar = gb2.f.f64747a;
            gb2.f.c(new gb2.k(kVar.f64758a, wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN, kVar.f64760c, kVar.f64761d));
        }
        f30 f30Var = this.f103228w;
        if (f30Var != null) {
            e30 R6 = f30Var.R6();
            R6.C1(null);
            R6.x1(null);
            this.f103228w = R6.a();
        }
    }

    public final void z() {
        this.f103230y = false;
        GradientDrawable gradientDrawable = this.f103227v;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(this.f103231z);
        } else {
            Intrinsics.r("overlayBg");
            throw null;
        }
    }
}
