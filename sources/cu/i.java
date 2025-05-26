package cu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kh2.c3;
import kh2.m2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mq.d0;
import pk.a0;
import rq.l2;
import xk2.v;

/* loaded from: classes3.dex */
public abstract class i extends FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f53198p = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f53199a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f53200b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIcon f53201c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f53202d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f53203e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f53204f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f53205g;

    /* renamed from: h, reason: collision with root package name */
    public final View f53206h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f53207i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f53208j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f53209k;

    /* renamed from: l, reason: collision with root package name */
    public ObjectAnimator f53210l;

    /* renamed from: m, reason: collision with root package name */
    public a f53211m;

    /* renamed from: n, reason: collision with root package name */
    public final v f53212n;

    /* renamed from: o, reason: collision with root package name */
    public final v f53213o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, AttributeSet attributeSet, int i13, boolean z13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53199a = z13;
        xk2.m.b(f.f53190k);
        this.f53212n = xk2.m.b(new e(this, 1));
        this.f53213o = xk2.m.b(new h(this, i.class, "peekHeight", "getPeekHeight$ads_release()I", 0));
        View.inflate(context, k(), this);
        View findViewById = findViewById(ps.p.opaque_one_tap_bottomsheet_container_card);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        this.f53200b = frameLayout;
        View findViewById2 = findViewById(ps.p.opaque_one_tap_bottom_sheet_container);
        LinearLayout linearLayout = (LinearLayout) findViewById2;
        if (!dl2.b.T1(context)) {
            Intrinsics.f(linearLayout);
            int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(eo1.c.space_200);
            linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f53208j = linearLayout;
        View findViewById3 = findViewById(ps.p.opaque_one_tap_chevron);
        GestaltIcon gestaltIcon = (GestaltIcon) findViewById3;
        if (!dl2.b.T1(context)) {
            ViewGroup.LayoutParams layoutParams = gestaltIcon.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                com.bumptech.glide.c.b1(marginLayoutParams, 0, gestaltIcon.getResources().getDimensionPixelSize(eo1.c.space_300), 0, 0, 13);
            }
        }
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f53201c = gestaltIcon;
        View findViewById4 = findViewById(ps.p.opaque_bottom_sheet_content);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f53202d = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(ps.p.opaque_one_tap_domain);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById5;
        Intrinsics.checkNotNullParameter(gestaltText, "<set-?>");
        this.f53209k = gestaltText;
        View findViewById6 = findViewById(ps.p.opaque_one_tap_title);
        GestaltText gestaltText2 = (GestaltText) findViewById6;
        if (!dl2.b.T1(context)) {
            gestaltText2.i(c.f53178l);
            ViewGroup.LayoutParams layoutParams2 = gestaltText2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                com.bumptech.glide.c.b1(marginLayoutParams2, 0, gestaltText2.getResources().getDimensionPixelSize(eo1.c.space_400), 0, 0, 13);
            }
        }
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        Intrinsics.checkNotNullParameter(gestaltText2, "<set-?>");
        this.f53203e = gestaltText2;
        View findViewById7 = findViewById(ps.p.opaque_one_tap_description);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        View findViewById8 = findViewById(ps.p.footer_promoted_by);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f53204f = (GestaltText) findViewById8;
        View findViewById9 = findViewById(ps.p.footer_placeholder);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f53206h = findViewById9;
        this.f53207i = (FrameLayout) findViewById(ps.p.opaque_one_tap_bottom_sheet_module_container);
        View findViewById10 = findViewById(ps.p.pharma_disclosure);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f53205g = (GestaltText) findViewById10;
        if (hf0.b.p()) {
            m2.o0(frameLayout);
        }
    }

    public static boolean a0(float f13, ql2.g range) {
        Intrinsics.checkNotNullParameter(range, "range");
        return f13 >= Float.valueOf(range.f104105a).floatValue() && f13 < Float.valueOf(range.f104106b).floatValue();
    }

    public void C(int i13) {
        getF35368t().W(i13 + 40);
    }

    public final void D(int i13) {
        getF35368t().X(i13);
    }

    public void L(Integer num, int i13) {
        a0.k1(this.f53208j, i13);
    }

    public final void X() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
        if (cVar != null) {
            cVar.d(getF35368t());
        }
        Y();
    }

    public void Y() {
        if (!this.f53199a) {
            setOnClickListener(new tq.j(this, 8));
        }
        getF35368t().C((g) this.f53212n.getValue());
    }

    public void Z(float f13) {
        FrameLayout frameLayout = this.f53207i;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setAlpha(f13);
    }

    public final void a(View view, int i13, int i14, Function0 endAnimationListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(endAnimationListener, "endAnimationListener");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<i, Float>) View.TRANSLATION_Y, i14 - i13, 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        c3.i(ofFloat, new d0(6, endAnimationListener));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        ofFloat.start();
    }

    public void b() {
        D(4);
    }

    public void e() {
        D(3);
    }

    /* renamed from: g */
    public abstract BaseAdsBottomSheetBehavior getF35368t();

    public final GestaltText i() {
        GestaltText gestaltText = this.f53209k;
        if (gestaltText != null) {
            return gestaltText;
        }
        Intrinsics.r("bottomSheetDomain");
        throw null;
    }

    public int j() {
        return m();
    }

    public int k() {
        return ps.q.ads_closeup_bottom_sheet;
    }

    public final int l() {
        return getF35368t().L;
    }

    public int m() {
        return this.f53208j.getHeight();
    }

    public final void n() {
        GestaltText gestaltText = this.f53204f;
        if (gestaltText == null) {
            Intrinsics.r("footerPromotedBy");
            throw null;
        }
        gestaltText.i(c.f53179m);
        bs1.c.X0(this.f53206h);
    }

    public void o() {
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.f53210l;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f53210l = null;
        super.onDetachedFromWindow();
    }

    public void q() {
        C(m());
        FrameLayout frameLayout = this.f53200b;
        bs1.c.R1(frameLayout, true);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, j(), 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(...)");
        ofFloat.setDuration(800L);
        c3.i(ofFloat, new e(this, 0));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(i(), (Property<GestaltText, Float>) property, i().getHeight(), 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat2, "ofFloat(...)");
        ofFloat2.setDuration(800L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(i(), (Property<GestaltText, Float>) View.ALPHA, 0.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat3, "ofFloat(...)");
        ofFloat3.setDuration(800L);
        animatorSet.play(ofFloat3).with(ofFloat2).after(ofFloat);
        animatorSet.start();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f53201c, "translationY", -16.0f, 0.0f);
        ofFloat4.setDuration(1000L);
        ofFloat4.setRepeatMode(2);
        ofFloat4.setRepeatCount(-1);
        Intrinsics.checkNotNullExpressionValue(ofFloat4, "apply(...)");
        ofFloat4.setStartDelay(0L);
        ofFloat4.start();
        this.f53210l = ofFloat4;
    }

    public void s(String str, String str2, String str3, boolean z13, boolean z14) {
        x();
        if (!hf0.b.n() && str != null && str.length() != 0) {
            GestaltText gestaltText = this.f53203e;
            if (gestaltText == null) {
                Intrinsics.r("bottomSheetTitle");
                throw null;
            }
            gestaltText.i(new l2(str, 15));
        }
        if (z13) {
            t();
        }
        z();
        if (str3 == null || str3.length() == 0) {
            return;
        }
        l2 l2Var = new l2(str3, 14);
        GestaltText gestaltText2 = this.f53205g;
        pp2.a.k(gestaltText2, l2Var);
        gestaltText2.j(new xo.k(this, 19));
    }

    public void t() {
        dl2.b.z(this.f53201c, c.f53180n);
        GestaltText gestaltText = this.f53203e;
        if (gestaltText == null) {
            Intrinsics.r("bottomSheetTitle");
            throw null;
        }
        gestaltText.i(c.f53181o);
        i().i(c.f53182p);
        GestaltText gestaltText2 = this.f53204f;
        if (gestaltText2 == null) {
            Intrinsics.r("footerPromotedBy");
            throw null;
        }
        gestaltText2.i(c.f53183q);
        this.f53205g.i(c.f53184r);
        this.f53200b.setBackground(bs1.c.f0(this, le0.c.ads_bottom_sheet_background_dark, null, null, 6));
    }

    public abstract void x();

    public void z() {
        GestaltText gestaltText = this.f53204f;
        if (gestaltText == null) {
            Intrinsics.r("footerPromotedBy");
            throw null;
        }
        gestaltText.i(c.f53185s);
        bs1.c.U1(this.f53206h);
    }
}
