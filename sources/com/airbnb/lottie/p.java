package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable.Callback f28436b;

    public /* synthetic */ p(Drawable.Callback callback, int i13) {
        this.f28435a = i13;
        this.f28436b = callback;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator anim) {
        int i13 = this.f28435a;
        Drawable.Callback callback = this.f28436b;
        switch (i13) {
            case 0:
                v vVar = (v) callback;
                a aVar = vVar.f28445J;
                if (aVar == null) {
                    aVar = b.f28381a;
                }
                if (aVar != a.ENABLED) {
                    fc.e eVar = vVar.f28461p;
                    if (eVar != null) {
                        eVar.u(vVar.f28447b.h());
                        break;
                    }
                } else {
                    vVar.invalidateSelf();
                    break;
                }
                break;
            default:
                cb2.o this$0 = (cb2.o) callback;
                int i14 = cb2.o.f27340m;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(anim, "anim");
                Object animatedValue = anim.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this$0.a().setAlpha(((Float) animatedValue).floatValue());
                break;
        }
    }
}
