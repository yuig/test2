package com.pinterest.shuffles.scene.composer;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f52103a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f52104b;

    public n(Function0 onAnimationEnd, Function1 shouldAnimate) {
        Intrinsics.checkNotNullParameter(shouldAnimate, "shouldAnimate");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        this.f52103a = shouldAnimate;
        this.f52104b = onAnimationEnd;
    }

    @Override // com.pinterest.shuffles.scene.composer.p0
    public final void D(Collection items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (((Boolean) this.f52103a.invoke(items)).booleanValue()) {
            AnimatorSet animatorSet = new AnimatorSet();
            List x03 = CollectionsKt.x0(items, new sw0.u(14));
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(x03, 10));
            int i13 = 0;
            for (Object obj : x03) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setStartDelay(i13 * 10);
                ofFloat.addUpdateListener(new k((ke2.d) obj, 0));
                arrayList.add(ofFloat);
                i13 = i14;
            }
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new ir.b(this, 9));
            animatorSet.start();
        }
    }
}
