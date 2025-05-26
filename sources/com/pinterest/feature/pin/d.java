package com.pinterest.feature.pin;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import com.pinterest.ui.imageview.WebImageView;
import cp.b0;
import df.j1;
import h32.u0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.t0;
import nx.d0;
import org.chromium.net.NetError;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47144a;

    /* renamed from: b, reason: collision with root package name */
    public final View f47145b;

    /* renamed from: c, reason: collision with root package name */
    public final r70.f f47146c;

    /* renamed from: d, reason: collision with root package name */
    public final r70.a f47147d;

    /* renamed from: e, reason: collision with root package name */
    public final ku1.j f47148e;

    /* renamed from: f, reason: collision with root package name */
    public final WebImageView f47149f;

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f47150g;

    /* renamed from: h, reason: collision with root package name */
    public final PathInterpolator f47151h;

    public d(MainActivity context, View rootView, r70.a aVar, r70.f bottomNavConfiguration, ku1.j navigationManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(bottomNavConfiguration, "bottomNavConfiguration");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        this.f47144a = context;
        this.f47145b = rootView;
        this.f47146c = bottomNavConfiguration;
        this.f47147d = aVar;
        this.f47148e = navigationManager;
        this.f47149f = (WebImageView) rootView.findViewById(t0.repin_profile_image);
        this.f47150g = (RelativeLayout) rootView.findViewById(t0.repin_card_animation_container);
        PathInterpolator pathInterpolator = new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(...)");
        this.f47151h = pathInterpolator;
    }

    public static AnimatorSet d(d dVar, View pinProfileTab, float f13, float f14, float f15, float f16, long j13, int i13) {
        if ((i13 & 64) != 0) {
            j13 = 200;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pinProfileTab, "pinProfileTab");
        AnimatorSet A = kg.a.A(f13, f14, 200L, pinProfileTab);
        AnimatorSet E = kg.a.E(f15, f16, j13, pinProfileTab);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(E, A);
        return animatorSet;
    }

    public static View g(View view) {
        View findViewById = view != null ? view.findViewById(t0.tab_icon) : null;
        if (findViewById != null && findViewById.isShown()) {
            return findViewById;
        }
        if (view != null) {
            return view.findViewById(t0.tab_avatar);
        }
        return null;
    }

    public static boolean i(Set mostRecentPinUrls, View view) {
        Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
        return mostRecentPinUrls.size() == 5 && view != null;
    }

    public final void a(f30 pin, Set mostRecentPinUrls, View view, AnimatorSet animator, Function1 getAnimationListener) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(getAnimationListener, "getAnimationListener");
        animator.addListener((Animator.AnimatorListener) getAnimationListener.invoke(g(bs1.c.k0(this.f47144a).findViewById(this.f47146c.f().f106384e))));
        ku1.j jVar = this.f47148e;
        nl1.d b13 = jVar.b();
        d0 d0Var = null;
        MvpViewPagerFragment mvpViewPagerFragment = b13 instanceof MvpViewPagerFragment ? (MvpViewPagerFragment) b13 : null;
        if (mvpViewPagerFragment != null) {
            nl1.d Z7 = mvpViewPagerFragment.Z7();
            if (Z7 != null) {
                d0Var = Z7.s7();
            }
        } else {
            nl1.d b14 = jVar.b();
            if (b14 != null) {
                d0Var = b14.s7();
            }
        }
        d0 d0Var2 = d0Var;
        if (d0Var2 == null) {
            return;
        }
        animator.addListener(new a(d0Var2, this, mostRecentPinUrls, view, pin));
    }

    public final AnimatorSet b(f30 f30Var, View view, long j13) {
        AnimatorSet animatorSet;
        WebImageView webImageView = this.f47149f;
        if (webImageView == null) {
            return new AnimatorSet();
        }
        Context context = this.f47144a;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(eo1.c.bottom_nav_icon_size_small);
        ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
        layoutParams.width = dimensionPixelOffset;
        layoutParams.height = dimensionPixelOffset;
        webImageView.setLayoutParams(layoutParams);
        webImageView.loadUrl(bs1.c.p0(f30Var));
        View g13 = view != null ? g(view) : null;
        if (g13 != null) {
            Rect rect = new Rect();
            g13.getDrawingRect(rect);
            View findViewById = bs1.c.k0(context).findViewById(R.id.content);
            Intrinsics.g(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) findViewById).offsetDescendantRectToMyCoords(g13, rect);
            webImageView.setX(rect.left);
            webImageView.setY(rect.top);
        }
        AnimatorSet d2 = d(this, this.f47149f, 0.0f, 1.0f, 0.5f, 1.0f, 450L, 32);
        float y13 = webImageView.getY();
        float f13 = 5;
        float y14 = webImageView.getY() + f13;
        Property property = View.ROTATION;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(webImageView, (Property<WebImageView, Float>) property, 0.0f, -5.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(webImageView, (Property<WebImageView, Float>) property2, y13, y14);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.setDuration(450L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet animatorSet4 = new AnimatorSet();
        if (view != null) {
            View g14 = g(view);
            AnimatorSet A = kg.a.A(1.0f, 0.0f, 450L, g14);
            animatorSet = kg.a.A(0.0f, 1.0f, 200L, g14);
            animatorSet3 = A;
        } else {
            animatorSet = animatorSet4;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setInterpolator(new OvershootInterpolator(5.0f));
        animatorSet5.playTogether(d2, animatorSet2, animatorSet3);
        float y15 = webImageView.getY() + f13;
        float y16 = webImageView.getY();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(webImageView, (Property<WebImageView, Float>) property, -5.0f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(webImageView, (Property<WebImageView, Float>) property2, y15, y16);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playTogether(ofFloat3, ofFloat4);
        animatorSet6.setInterpolator(new OvershootInterpolator(5.0f));
        AnimatorSet d13 = d(this, this.f47149f, 1.0f, 0.0f, 1.0f, 0.5f, 0L, 96);
        d13.addListener(new b(this, 0));
        AnimatorSet animatorSet7 = new AnimatorSet();
        animatorSet7.setStartDelay(j13);
        animatorSet7.playTogether(d13, animatorSet);
        animatorSet7.setInterpolator(this.f47151h);
        AnimatorSet animatorSet8 = new AnimatorSet();
        animatorSet8.playSequentially(animatorSet5, animatorSet6, animatorSet7);
        return animatorSet8;
    }

    public final AnimatorSet c(f30 pin, Set mostRecentPinUrls, View view) {
        int i13;
        AnimatorSet animatorSet;
        AnimatorSet b13;
        AnimatorSet b14;
        AnimatorSet b15;
        AnimatorSet b16;
        AnimatorSet b17;
        int i14 = 5;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
        if (i(mostRecentPinUrls, view)) {
            Intrinsics.f(view);
            ky0.b getStartX = new ky0.b(i14, this, view);
            Context context = this.f47144a;
            Intrinsics.checkNotNullParameter(context, "context");
            View rootView = this.f47145b;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
            Intrinsics.checkNotNullParameter(getStartX, "getStartX");
            vh.d dVar = new vh.d();
            dVar.f125820a = context;
            dVar.f125821b = rootView;
            dVar.f125822c = this.f47147d;
            dVar.f125823d = this.f47150g;
            dVar.f125824e = mostRecentPinUrls;
            dVar.f125825f = getStartX;
            FrameLayout frameLayout = new FrameLayout((Context) dVar.f125820a);
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            dVar.f125826g = frameLayout;
            RelativeLayout relativeLayout = (RelativeLayout) dVar.f125823d;
            if (relativeLayout != null) {
                relativeLayout.addView(frameLayout);
            }
            PathInterpolator pathInterpolator = new PathInterpolator(0.16f, 1.0f, 0.3f, 1.0f);
            Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(...)");
            dVar.f125827h = pathInterpolator;
            PathInterpolator pathInterpolator2 = new PathInterpolator(0.34f, 1.56f, 0.64f, 1.0f);
            Intrinsics.checkNotNullExpressionValue(pathInterpolator2, "create(...)");
            dVar.f125828i = pathInterpolator2;
            PathInterpolator pathInterpolator3 = new PathInterpolator(0.32f, 0.0f, 0.647f, 0.0f);
            Intrinsics.checkNotNullExpressionValue(pathInterpolator3, "create(...)");
            dVar.f125829j = pathInterpolator3;
            AnimatorSet animatorSet2 = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            animatorArr[0] = b(pin, view, 610L);
            RelativeLayout relativeLayout2 = (RelativeLayout) dVar.f125823d;
            if (relativeLayout2 != null) {
                ViewGroup.LayoutParams layoutParams = relativeLayout2.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = (int) r70.b.f106349i.k0().a();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            Animator[] animatorArr2 = new Animator[2];
            b13 = dVar.b(dVar.a(eo1.b.color_blue_skycicle_300), (int) dVar.e(-30), -420, 2.0f, (Interpolator) dVar.f125827h, (r15 & 32) != 0 ? 0L : 0L);
            b14 = dVar.b(dVar.a(eo1.b.color_red_pushpin_400), (int) dVar.e(65), -290, 1.5f, (Interpolator) dVar.f125827h, (r15 & 32) != 0 ? 0L : 0L);
            AnimatorSet b18 = dVar.b(dVar.a(eo1.b.color_purple_mysticool_450), (int) dVar.e(NetError.ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN), -280, 1.6f, (Interpolator) dVar.f125828i, 50L);
            float f13 = 10;
            AnimatorSet b19 = dVar.b(dVar.a(eo1.b.color_yellow_caramellow_100), (int) dVar.e(f13), NetError.ERR_RESPONSE_HEADERS_MULTIPLE_LOCATION, 1.6f, (Interpolator) dVar.f125828i, 90L);
            float f14 = -50;
            AnimatorSet b23 = dVar.b(dVar.a(eo1.b.color_orange_firetini_100), (int) dVar.e(f14), NetError.ERR_INVALID_URL, 2.0f, (Interpolator) dVar.f125828i, 100L);
            AnimatorSet b24 = dVar.b(dVar.a(eo1.b.color_purple_mysticool_300), (int) dVar.e(f14), -175, 1.25f, (Interpolator) dVar.f125828i, 110L);
            b15 = dVar.b(dVar.a(eo1.b.color_green_matchacado_100), (int) dVar.e(f13), -220, 1.4f, (Interpolator) dVar.f125827h, (r15 & 32) != 0 ? 0L : 115L);
            AnimatorSet b25 = dVar.b(dVar.a(eo1.b.color_pink_flaminglow_300), (int) dVar.e(-100), -220, 1.1f, (Interpolator) dVar.f125828i, 120L);
            b16 = dVar.b(dVar.a(eo1.b.color_yellow_caramellow_100), (int) dVar.e(NetError.ERR_SOCKS_CONNECTION_FAILED), NetError.ERR_HTTPS_PROXY_TUNNEL_RESPONSE_REDIRECT, 1.25f, (Interpolator) dVar.f125827h, (r15 & 32) != 0 ? 0L : 125L);
            b17 = dVar.b(dVar.a(eo1.b.color_teal_spabattical_100), (int) dVar.e(50), NetError.ERR_SOCKS_CONNECTION_FAILED, 1.25f, (Interpolator) dVar.f125827h, (r15 & 32) != 0 ? 0L : 130L);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(b13, b14, b18, b19, b23, b24, b15, b25, b16, b17);
            animatorArr2[0] = animatorSet4;
            Set<String> set = (Set) dVar.f125824e;
            ArrayList arrayList = new ArrayList(g0.q(set, 10));
            for (String str : set) {
                WebImageView webImageView = new WebImageView((Context) dVar.f125820a);
                float dimensionPixelOffset = ((Context) dVar.f125820a).getResources().getDimensionPixelOffset(r0.corner_radius_small);
                webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                webImageView.M1(((Context) dVar.f125820a).getResources().getDimensionPixelOffset(eo1.c.lego_border_width_small));
                webImageView.o0(dl2.b.x0((Context) dVar.f125820a, eo1.a.sema_color_background_default));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(((Context) dVar.f125820a).getResources().getDimensionPixelOffset(eo1.c.space_500), -2);
                if (j1.Y0((Context) dVar.f125820a)) {
                    layoutParams2.gravity = 8388613;
                } else {
                    layoutParams2.gravity = 8388611;
                }
                layoutParams2.topMargin = 0;
                webImageView.setLayoutParams(layoutParams2);
                webImageView.setX(((Number) ((Function1) dVar.f125825f).invoke(Integer.valueOf(layoutParams2.width))).floatValue());
                webImageView.loadUrl(str);
                webImageView.setAdjustViewBounds(true);
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                webImageView.setVisibility(4);
                ((FrameLayout) dVar.f125826g).addView(webImageView);
                arrayList.add(webImageView);
            }
            AnimatorSet f15 = dVar.f((View) arrayList.get(0), (int) dVar.e(15), -290, dVar.e(10.0f), 1.5f, 0L);
            AnimatorSet f16 = dVar.f((View) arrayList.get(1), (int) dVar.e(-80), NetError.ERR_RESPONSE_HEADERS_MULTIPLE_LOCATION, dVar.e(-17.0f), 1.6f, 60L);
            AnimatorSet f17 = dVar.f((View) arrayList.get(2), (int) dVar.e(-70), -240, dVar.e(-20.0f), 1.6f, 200L);
            AnimatorSet f18 = dVar.f((View) arrayList.get(3), (int) dVar.e(60), -230, dVar.e(20.0f), 1.4f, 200L);
            AnimatorSet f19 = dVar.f((View) arrayList.get(4), (int) dVar.e(0), NetError.ERR_SSL_CLIENT_AUTH_CERT_NEEDED, dVar.e(0.0f), 1.25f, 210L);
            AnimatorSet animatorSet5 = new AnimatorSet();
            i13 = 1;
            animatorSet5.playTogether(f15, f16, f17, f18, f19);
            animatorArr2[1] = animatorSet5;
            animatorSet3.playTogether(animatorArr2);
            animatorArr[1] = animatorSet3;
            animatorSet2.playTogether(animatorArr);
            animatorSet = animatorSet2;
        } else {
            i13 = 1;
            animatorSet = b(pin, view, 0L);
        }
        animatorSet.addListener(new b(this, i13));
        return animatorSet;
    }

    public abstract u0 e(Set set, View view);

    public final float f(View view, float f13) {
        View g13 = g(view);
        Rect rect = new Rect();
        if (g13 != null) {
            g13.getDrawingRect(rect);
        }
        View findViewById = bs1.c.k0(this.f47144a).findViewById(R.id.content);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) findViewById).offsetDescendantRectToMyCoords(g13, rect);
        return (rect.left + (rect.width() / 2)) - (f13 / 2);
    }

    public final void h() {
        new fk2.g(new b0(this, 25), 1).l(tk2.e.f118017c).i(new xo.b(29), new hx0.a(29, c.f46922j));
    }

    public abstract void j(f30 f30Var, Set set, ky0.b bVar, RepinAnimationData repinAnimationData, boolean z13);
}
