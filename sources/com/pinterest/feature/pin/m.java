package com.pinterest.feature.pin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import com.pinterest.ui.imageview.WebImageView;
import g4.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import m60.t0;
import rg0.i0;

/* loaded from: classes5.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f47235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f47236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f47237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f47238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MvpViewPagerFragment f47239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f47240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f30 f47241g;

    public m(j0 j0Var, o oVar, j0 j0Var2, j0 j0Var3, MvpViewPagerFragment mvpViewPagerFragment, View view, f30 f30Var) {
        this.f47235a = j0Var;
        this.f47236b = oVar;
        this.f47237c = j0Var2;
        this.f47238d = j0Var3;
        this.f47239e = mvpViewPagerFragment;
        this.f47240f = view;
        this.f47241g = f30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        MvpViewPagerFragment mvpViewPagerFragment;
        r70.a a13;
        LinearLayout view;
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(animation, "animation");
        j0 j0Var = this.f47235a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) j0Var.f80434a;
        j0 j0Var2 = this.f47237c;
        m60.t tVar = (m60.t) j0Var2.f80434a;
        j0 j0Var3 = this.f47238d;
        xa.i listener = (xa.i) j0Var3.f80434a;
        o oVar = this.f47236b;
        oVar.f47255h = false;
        if (tVar != null) {
            oVar.f47253f.j(tVar);
        }
        if (onGlobalLayoutListener != null && (a13 = oVar.a()) != null && (view = a13.getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        if (listener != null && (mvpViewPagerFragment = this.f47239e) != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            MvpViewPagerFragment.d8();
            mvpViewPagerFragment.f45643j0.remove(listener);
        }
        RelativeLayout relativeLayout = (RelativeLayout) bs1.c.k0(oVar.f47248a).findViewById(t0.repin_card_animation_container);
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        WebImageView webImageView = oVar.f47256i;
        if (webImageView != null) {
            webImageView.setVisibility(4);
        }
        View view2 = this.f47240f;
        if (view2 != null) {
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
        }
        j0Var.f80434a = null;
        j0Var2.f80434a = null;
        j0Var3.f80434a = null;
        u uVar = i0.f108029b;
        String uid = this.f47241g.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        u.v0(uVar, uid, null, 6);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        lq0.i0 i0Var;
        Intrinsics.checkNotNullParameter(animation, "animation");
        o oVar = this.f47236b;
        r70.a a13 = oVar.a();
        th0.b bVar = null;
        int i13 = 1;
        if (a13 != null) {
            i0Var = new lq0.i0(i13, a13, animation);
            a13.getView().getViewTreeObserver().addOnGlobalLayoutListener(i0Var);
        } else {
            i0Var = null;
        }
        this.f47235a.f80434a = i0Var;
        l lVar = new l(animation);
        oVar.f47253f.h(lVar);
        this.f47237c.f80434a = lVar;
        MvpViewPagerFragment mvpViewPagerFragment = this.f47239e;
        if (mvpViewPagerFragment != null) {
            bVar = new th0.b(animation, i13);
            mvpViewPagerFragment.Y7(bVar);
        }
        this.f47238d.f80434a = bVar;
    }
}
