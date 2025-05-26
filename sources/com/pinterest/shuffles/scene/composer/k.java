package com.pinterest.shuffles.scene.composer;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ke2.d f52073b;

    public /* synthetic */ k(ke2.d dVar, int i13) {
        this.f52072a = i13;
        this.f52073b = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        int i13 = this.f52072a;
        ke2.d item = this.f52073b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(it, "it");
                ke2.b bVar = item.f79320b;
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                bVar.f79308e = ((Float) animatedValue).floatValue();
                break;
            case 1:
                rl2.u[] uVarArr = a82.g.f1536i;
                Intrinsics.checkNotNullParameter(item, "$target");
                Intrinsics.checkNotNullParameter(it, "it");
                ke2.b bVar2 = item.f79320b;
                Object animatedValue2 = it.getAnimatedValue();
                Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                bVar2.f79308e = ((Float) animatedValue2).floatValue();
                break;
            case 2:
                rl2.u[] uVarArr2 = a82.g.f1536i;
                Intrinsics.checkNotNullParameter(item, "$target");
                Intrinsics.checkNotNullParameter(it, "it");
                ke2.b bVar3 = item.f79320b;
                Object animatedValue3 = it.getAnimatedValue();
                Intrinsics.g(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                bVar3.f79308e = ((Float) animatedValue3).floatValue();
                break;
            default:
                rl2.u[] uVarArr3 = a82.g.f1536i;
                Intrinsics.checkNotNullParameter(item, "$target");
                Intrinsics.checkNotNullParameter(it, "it");
                ke2.b bVar4 = item.f79320b;
                Object animatedValue4 = it.getAnimatedValue();
                Intrinsics.g(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                bVar4.f79308e = ((Float) animatedValue4).floatValue();
                break;
        }
    }
}
