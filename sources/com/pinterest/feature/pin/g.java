package com.pinterest.feature.pin;

import a.cb;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.k3;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ua.m0;

/* loaded from: classes5.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f47207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f47208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f47209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f47210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f47211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f47212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Animator f47213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Set f47214h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f47215i;

    public g(View view, h hVar, f30 f30Var, View view2, boolean z13, FrameLayout frameLayout, AnimatorSet animatorSet, Set set, ky0.b bVar) {
        this.f47207a = view;
        this.f47208b = hVar;
        this.f47209c = f30Var;
        this.f47210d = view2;
        this.f47211e = z13;
        this.f47212f = frameLayout;
        this.f47213g = animatorSet;
        this.f47214h = set;
        this.f47215i = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f13;
        long j13;
        LinearLayout view;
        View view2 = this.f47207a;
        if (view2.getMeasuredHeight() > 0) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            h hVar = this.f47208b;
            hVar.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            Resources resources = view2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNullParameter(resources, "<this>");
            AnimatorSet E = kg.a.E(1.0f, 1.2f, resources.getInteger(R.integer.config_shortAnimTime), view2);
            Rect rect = new Rect();
            hVar.f47217j.getGlobalVisibleRect(rect);
            float f14 = 2;
            float height = (view2.getHeight() - (view2.getHeight() * 1.2f)) / f14;
            Rect rect2 = new Rect();
            r70.a aVar = hVar.f47218k;
            if (aVar != null && (view = aVar.getView()) != null) {
                view.getGlobalVisibleRect(rect2);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", (((((view2.getY() + ((float) hVar.k())) + ((float) view2.getHeight())) > ((float) rect2.top) ? 1 : (((view2.getY() + ((float) hVar.k())) + ((float) view2.getHeight())) == ((float) rect2.top) ? 0 : -1)) > 0) || ((((((float) view2.getHeight()) * 1.2f) + (view2.getY() + ((float) hVar.k()))) > ((float) rect2.top) ? 1 : (((((float) view2.getHeight()) * 1.2f) + (view2.getY() + ((float) hVar.k()))) == ((float) rect2.top) ? 0 : -1)) > 0)) ? ((view2.getHeight() - ((rect2.top - view2.getY()) - hVar.k())) * (-1)) + kh2.d.p(-40) + height : kh2.d.p(-40) - height);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationX", (rect.exactCenterX() - view2.getX()) - (view2.getWidth() / 2));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(E, ofFloat, ofFloat2);
            animatorSet2.setInterpolator(hVar.f47223p);
            animatorSet2.setDuration(300L);
            animatorArr[0] = animatorSet2;
            AnimatorSet E2 = kg.a.E(1.2f, 0.09f, 820L, view2);
            if (aVar != null) {
                aVar.getView().getGlobalVisibleRect(new Rect());
                f13 = ((r7.top - view2.getY()) - hVar.k()) - cb.a(view2.getHeight(), 0.09f, view2.getHeight(), f14);
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "translationY", f13);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "translationX", (hVar.f(this.f47210d, view2.getWidth() * 0.09f) - view2.getX()) - cb.a(view2.getWidth(), 0.09f, view2.getWidth(), f14));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setInterpolator(hVar.f47224q);
            animatorSet3.setDuration(820L);
            animatorSet3.playTogether(ofFloat3, ofFloat4, E2);
            animatorArr[1] = animatorSet3;
            animatorSet.playSequentially(animatorArr);
            animatorSet.addListener(new m0(this.f47212f, hVar, 10));
            animatorSet.addListener(new hk.c(hVar, this.f47209c, this.f47211e));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playSequentially(animatorSet, this.f47213g);
            View view3 = this.f47210d;
            Function1 function1 = this.f47215i;
            h hVar2 = this.f47208b;
            hVar2.a(this.f47209c, this.f47214h, view3, animatorSet4, function1);
            if (!hVar2.l()) {
                com.pinterest.framework.screens.s sVar = hVar2.f47219l.f80914l;
                com.pinterest.framework.screens.m j14 = sVar != null ? sVar.j() : null;
                nl1.d dVar = j14 instanceof nl1.d ? (nl1.d) j14 : null;
                if (!Intrinsics.d(dVar != null ? dVar.getClass() : null, ((ScreenLocation) k3.f51029d.getValue()).getF45521a())) {
                    j13 = 0;
                    animatorSet4.setStartDelay(j13);
                    animatorSet4.start();
                }
            }
            j13 = 250;
            animatorSet4.setStartDelay(j13);
            animatorSet4.start();
        }
    }
}
