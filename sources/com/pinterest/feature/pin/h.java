package com.pinterest.feature.pin;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.k3;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.u0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import wa2.a0;

/* loaded from: classes5.dex */
public final class h extends d {

    /* renamed from: i, reason: collision with root package name */
    public final Context f47216i;

    /* renamed from: j, reason: collision with root package name */
    public final View f47217j;

    /* renamed from: k, reason: collision with root package name */
    public final r70.a f47218k;

    /* renamed from: l, reason: collision with root package name */
    public final ku1.j f47219l;

    /* renamed from: m, reason: collision with root package name */
    public final jo1.c f47220m;

    /* renamed from: n, reason: collision with root package name */
    public final b60.b f47221n;

    /* renamed from: o, reason: collision with root package name */
    public final es.a f47222o;

    /* renamed from: p, reason: collision with root package name */
    public final PathInterpolator f47223p;

    /* renamed from: q, reason: collision with root package name */
    public final PathInterpolator f47224q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MainActivity context, View rootView, r70.a aVar, ku1.j navigationManager, jo1.c baseGridActionUtils, b60.b activeUserManager, r70.f bottomNavConfiguration, es.a adFormats) {
        super(context, rootView, aVar, bottomNavConfiguration, navigationManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(baseGridActionUtils, "baseGridActionUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(bottomNavConfiguration, "bottomNavConfiguration");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f47216i = context;
        this.f47217j = rootView;
        this.f47218k = aVar;
        this.f47219l = navigationManager;
        this.f47220m = baseGridActionUtils;
        this.f47221n = activeUserManager;
        this.f47222o = adFormats;
        PathInterpolator pathInterpolator = new PathInterpolator(0.22f, 1.0f, 0.36f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(...)");
        this.f47223p = pathInterpolator;
        PathInterpolator pathInterpolator2 = new PathInterpolator(0.64f, 0.0f, 0.78f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator2, "create(...)");
        this.f47224q = pathInterpolator2;
    }

    @Override // com.pinterest.feature.pin.d
    public final u0 e(Set mostRecentPinUrls, View view) {
        Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
        return d.i(mostRecentPinUrls, view) ? u0.REPIN_ANIMATION_EXAGGERATED_WITH_CONFETTI : u0.REPIN_ANIMATION_EXAGGERATED;
    }

    @Override // com.pinterest.feature.pin.d
    public final void j(f30 pin, Set mostRecentPinUrls, ky0.b getAnimationListener, RepinAnimationData repinAnimationData, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(mostRecentPinUrls, "mostRecentPinUrls");
        Intrinsics.checkNotNullParameter(getAnimationListener, "getAnimationListener");
        if (repinAnimationData == null) {
            return;
        }
        m(pin, a0.PIN_GRID_SAVED_OVERLAY_STATE_TRANSITION_FOR_REPIN_ANIMATION, z13);
        RelativeLayout relativeLayout = this.f47150g;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = (int) r70.b.f106349i.k0().b();
        }
        View findViewById = bs1.c.k0(this.f47144a).findViewById(this.f47146c.f().f106384e);
        AnimatorSet c13 = this.f47149f != null ? c(pin, mostRecentPinUrls, findViewById) : null;
        Context context = this.f47216i;
        WebImageView webImageView = new WebImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(repinAnimationData.f46896a, repinAnimationData.f46897b);
        if (j1.Y0(context)) {
            layoutParams2.gravity = 8388613;
        } else {
            layoutParams2.gravity = 8388611;
        }
        layoutParams2.leftMargin = repinAnimationData.f46899d;
        layoutParams2.topMargin = repinAnimationData.f46898c - k();
        webImageView.setLayoutParams(layoutParams2);
        float f13 = repinAnimationData.f46900e;
        webImageView.g2(f13, f13, f13, f13);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.loadUrl(bs1.c.p0(pin));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webImageView);
        webImageView.getViewTreeObserver().addOnGlobalLayoutListener(new g(webImageView, this, pin, findViewById, z13, frameLayout, c13, mostRecentPinUrls, getAnimationListener));
        if (relativeLayout != null) {
            relativeLayout.addView(frameLayout);
        }
    }

    public final int k() {
        int[] iArr = new int[2];
        this.f47217j.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public final boolean l() {
        com.pinterest.framework.screens.s sVar = this.f47219l.f80914l;
        com.pinterest.framework.screens.m j13 = sVar != null ? sVar.j() : null;
        nl1.d dVar = j13 instanceof nl1.d ? (nl1.d) j13 : null;
        this.f47220m.getClass();
        jo1.a a13 = jo1.c.a(dVar);
        MvpViewPagerFragment mvpViewPagerFragment = dVar instanceof MvpViewPagerFragment ? (MvpViewPagerFragment) dVar : null;
        nl1.d Z7 = mvpViewPagerFragment != null ? mvpViewPagerFragment.Z7() : null;
        if (a13 != jo1.a.MORE_IDEAS) {
            if (!Intrinsics.d(Z7 != null ? Z7.getClass() : null, ((ScreenLocation) k3.f51026a.getValue()).getF48906a())) {
                return false;
            }
        }
        return true;
    }

    public final void m(f30 f30Var, a0 a0Var, boolean z13) {
        String boardUid;
        String str;
        gb2.k kVar;
        gb2.k kVar2 = null;
        if (z13) {
            wy0 f13 = ((b60.d) this.f47221n).f();
            if (f13 != null) {
                String string = this.f47216i.getString(x0.profile);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String uid = f13.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                gb2.c cVar = new gb2.c(uid);
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                kVar = new gb2.k(uid2, a0Var, string, cVar);
                kVar2 = kVar;
            }
        } else {
            v7 G5 = f30Var.G5();
            if (G5 != null && (boardUid = G5.getUid()) != null) {
                v7 G52 = f30Var.G5();
                if (G52 == null || (str = G52.j1()) == null) {
                    str = "";
                }
                Intrinsics.checkNotNullParameter(boardUid, "boardUid");
                gb2.a aVar = new gb2.a(boardUid);
                String uid3 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                kVar = new gb2.k(uid3, a0Var, str, aVar);
                kVar2 = kVar;
            }
        }
        if (kVar2 != null) {
            gb2.f fVar = gb2.f.f64747a;
            gb2.f.c(kVar2);
        }
    }
}
