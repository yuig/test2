package com.pinterest.feature.search.visual.cropper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f47985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f47986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f47987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RectF f47988d;

    public b(c cVar, float f13, float f14, RectF rectF) {
        this.f47985a = cVar;
        this.f47986b = f13;
        this.f47987c = f14;
        this.f47988d = rectF;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        c cVar = this.f47985a;
        ViewGroup.LayoutParams layoutParams = cVar.f47997h.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = (int) this.f47986b;
        marginLayoutParams.height = (int) this.f47987c;
        RectF rectF = this.f47988d;
        marginLayoutParams.topMargin = (int) rectF.top;
        marginLayoutParams.leftMargin = (int) rectF.left;
        cVar.f47997h.setLayoutParams(marginLayoutParams);
        ib2.d dVar = cVar.f47991b;
        if (dVar != null) {
            RectF rectF2 = cVar.f47997h.f47966n;
            Intrinsics.checkNotNullExpressionValue(rectF2, "getCropperBounds(...)");
            dVar.G2(rectF2);
        }
    }
}
