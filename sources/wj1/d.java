package wj1;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;
import pj1.i;
import pj1.k;

/* loaded from: classes5.dex */
public final class d extends pj1.e implements k {

    /* renamed from: n, reason: collision with root package name */
    public final qc2.a f130025n;

    /* renamed from: o, reason: collision with root package name */
    public final View f130026o;

    /* renamed from: p, reason: collision with root package name */
    public final int f130027p;

    /* renamed from: q, reason: collision with root package name */
    public final e f130028q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f130029r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f130030s;

    /* renamed from: t, reason: collision with root package name */
    public final AnimatorSet f130031t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View pinRepView, qc2.a viewabilityCalculator, View parentCell) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(viewabilityCalculator, "viewabilityCalculator");
        Intrinsics.checkNotNullParameter(parentCell, "parentCell");
        this.f130025n = viewabilityCalculator;
        this.f130026o = parentCell;
        this.f130027p = RecyclerViewTypes.VIEW_TYPE_AFFILIATE_LINK_IMAGE;
        this.f130028q = e.VARIATION_A;
        this.f130031t = new AnimatorSet();
    }

    public final void G() {
        if (this.f130030s) {
            AnimatorSet animatorSet = this.f130031t;
            if (animatorSet.isRunning() || this.f130029r) {
                return;
            }
            c3.m0(animatorSet);
            i iVar = this.f100282f;
            iVar.f100303o.setAlpha(255);
            int i13 = this.f130027p;
            iVar.f100304p.setAlpha(i13);
            iVar.T = Integer.valueOf(i13);
            iVar.L = false;
            iVar.N = false;
            this.f130030s = false;
            this.f130029r = false;
        }
    }

    @Override // pj1.k
    public final boolean a() {
        return this.f130030s;
    }

    @Override // pj1.k
    public final boolean e() {
        return false;
    }

    @Override // pj1.k
    public final boolean f() {
        return this.f130029r;
    }

    @Override // pj1.k
    public final View g() {
        return this.f130026o;
    }

    @Override // pj1.k
    public final AnimatorSet h() {
        return this.f130031t;
    }

    @Override // pj1.k
    public final void j(List animations) {
        Intrinsics.checkNotNullParameter(animations, "animations");
        e eVar = e.VARIATION_A;
        final int i13 = 1;
        final int i14 = 0;
        e eVar2 = this.f130028q;
        if (eVar2 == eVar) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wj1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f130020b;

                {
                    this.f130020b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    int i15 = i14;
                    d this$0 = this.f130020b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            ((Float) animatedValue).floatValue();
                            this$0.getClass();
                            this$0.c();
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue2 = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            ((Float) animatedValue2).floatValue();
                            this$0.getClass();
                            this$0.c();
                            break;
                    }
                }
            });
            ofFloat.addListener(new c(this, 1));
            Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
            ofFloat.setStartDelay(1000L);
            c3.i(ofFloat, new b(this, 0));
            animations.add(ofFloat);
            return;
        }
        if (eVar2 == e.VARIATION_B) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            ofFloat2.setDuration(400L);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wj1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f130020b;

                {
                    this.f130020b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    int i15 = i13;
                    d this$0 = this.f130020b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            ((Float) animatedValue).floatValue();
                            this$0.getClass();
                            this$0.c();
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue2 = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            ((Float) animatedValue2).floatValue();
                            this$0.getClass();
                            this$0.c();
                            break;
                    }
                }
            });
            ofFloat2.addListener(new c(this, 0));
            Intrinsics.checkNotNullExpressionValue(ofFloat2, "apply(...)");
            ofFloat2.setStartDelay(1000L);
            c3.i(ofFloat2, new b(this, 1));
            animations.add(ofFloat2);
        }
    }

    @Override // pj1.k
    public final void l() {
        if (!this.f130030s || i() > 0.0f) {
            return;
        }
        c3.m0(this.f130031t);
        this.f130030s = false;
        i iVar = this.f100282f;
        iVar.f100303o.setAlpha(255);
        int i13 = this.f130027p;
        iVar.f100304p.setAlpha(i13);
        iVar.T = Integer.valueOf(i13);
        iVar.L = false;
        iVar.N = false;
        this.f130029r = false;
        c();
    }

    @Override // pj1.k
    public final void m() {
        this.f130030s = true;
    }

    @Override // pj1.k
    public final ArrayList o() {
        return new ArrayList();
    }

    @Override // pj1.k
    public final qc2.a p() {
        return this.f130025n;
    }

    @Override // pj1.e, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z13 = this.f100282f.f128846i;
    }

    @Override // ua2.f1
    public final int t() {
        this.f130031t.isRunning();
        return x();
    }
}
