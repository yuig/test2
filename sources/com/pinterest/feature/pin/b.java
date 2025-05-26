package com.pinterest.feature.pin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f46921b;

    public /* synthetic */ b(d dVar, int i13) {
        this.f46920a = i13;
        this.f46921b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f46920a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                d dVar = this.f46921b;
                dVar.f47149f.setAlpha(1.0f);
                dVar.f47149f.setVisibility(4);
                break;
            default:
                super.onAnimationEnd(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f46920a) {
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f46921b.h();
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
