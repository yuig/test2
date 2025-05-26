package com.pinterest.feature.pin;

import a.cb;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import m60.r0;
import ua.m0;

/* loaded from: classes5.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f47152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f47153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f47154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f47155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f47156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f47157f;

    public e(WebImageView webImageView, f fVar, f30 f30Var, Set set, View view, ky0.b bVar) {
        this.f47152a = webImageView;
        this.f47153b = fVar;
        this.f47154c = f30Var;
        this.f47155d = set;
        this.f47156e = view;
        this.f47157f = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f47152a;
        if (view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            f fVar = this.f47153b;
            fVar.getClass();
            float f13 = 2;
            view.setPivotX(view.getMeasuredWidth() / f13);
            view.setPivotY(view.getMeasuredHeight());
            AnimatorSet d2 = d.d(fVar, view, 0.0f, 1.0f, 0.0f, 1.0f, 0L, 96);
            d2.setInterpolator(fVar.f47206j);
            d2.addListener(new gq.e(view, 2));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (fVar.f47205i.getResources().getDimensionPixelOffset(r0.margin) + view.getHeight()) - cb.a(view.getHeight(), 0.5f, view.getHeight(), f13));
            AnimatorSet E = kg.a.E(1.0f, 0.5f, 420L, view);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, E);
            animatorSet.addListener(new m0(view, fVar, 10));
            animatorSet.setDuration(420L);
            animatorSet.setStartDelay(500L);
            animatorSet.setInterpolator(fVar.f47151h);
            AnimatorSet c13 = fVar.f47149f != null ? fVar.c(this.f47154c, this.f47155d, this.f47156e) : null;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(d2, animatorSet, c13);
            this.f47153b.a(this.f47154c, this.f47155d, this.f47156e, animatorSet2, this.f47157f);
            animatorSet2.start();
        }
    }
}
