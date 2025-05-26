package ua2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.ui.grid.LegoPinGridCell;
import java.util.ArrayList;
import kh2.c3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 extends b0 {
    public boolean A;
    public boolean B;
    public final int C;
    public final AnimatorSet D;

    /* renamed from: y, reason: collision with root package name */
    public final qc2.a f121606y;

    /* renamed from: z, reason: collision with root package name */
    public final wj1.e f121607z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t0(com.pinterest.ui.grid.LegoPinGridCellImpl r16, qc2.a r17) {
        /*
            r15 = this;
            r13 = r15
            r1 = r16
            r14 = r17
            java.lang.String r0 = "legoGridCell"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "viewabilityCalculator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = eo1.c.margin_half
            int r2 = bs1.c.W(r1, r0)
            int r5 = wy1.a.background_90
            int r8 = wy1.b.d2s_indicator_padding
            r10 = 0
            r11 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r9 = 0
            r12 = 3884(0xf2c, float:5.443E-42)
            r0 = r15
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f121606y = r14
            wj1.e r0 = wj1.e.VARIATION_A
            r13.f121607z = r0
            r0 = 230(0xe6, float:3.22E-43)
            r13.C = r0
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r13.D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.t0.<init>(com.pinterest.ui.grid.LegoPinGridCellImpl, qc2.a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float G() {
        LegoPinGridCell legoPinGridCell = this.f121502f;
        ViewParent viewParent = legoPinGridCell.getParent();
        while (viewParent != 0 && !(viewParent instanceof RecyclerView)) {
            viewParent = viewParent.getParent();
        }
        View view = viewParent instanceof View ? (View) viewParent : null;
        if (view == null) {
            return 0.0f;
        }
        Intrinsics.g(legoPinGridCell, "null cannot be cast to non-null type android.view.View");
        View view2 = legoPinGridCell;
        while (!(view2.getParent() instanceof RecyclerView)) {
            Object parent = view2.getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            view2 = (View) parent;
        }
        return ((qc2.d) this.f121606y).c(view2, 0, E().f128840c, E().f128841d, E().f128842e, view);
    }

    public final void H() {
        this.f121502f.postInvalidate();
    }

    public final void l() {
        if (!this.A || G() > 0.0f) {
            return;
        }
        c3.m0(this.D);
        this.A = false;
        E().f125388s.setAlpha(255);
        va2.j E = E();
        int i13 = this.C;
        E.f125389t.setAlpha(i13);
        E.H = Integer.valueOf(i13);
        E().S = false;
        E().U = false;
        this.B = false;
        H();
    }

    public final void n() {
        AnimatorSet animatorSet = this.D;
        if (animatorSet.isRunning() || this.B || this.A) {
            return;
        }
        if (G() < 80.0f) {
            l();
            return;
        }
        ArrayList arrayList = new ArrayList();
        wj1.e eVar = wj1.e.VARIATION_A;
        wj1.e eVar2 = this.f121607z;
        final int i13 = 0;
        final int i14 = 1;
        if (eVar2 == eVar) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.setDuration(400L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ua2.q0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t0 f121596b;

                {
                    this.f121596b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    int i15 = i14;
                    t0 this$0 = this.f121596b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            this$0.getClass();
                            this$0.H();
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue2 = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            this$0.getClass();
                            this$0.H();
                            break;
                    }
                }
            });
            ofFloat.addListener(new r0(this, 1));
            Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
            ofFloat.setStartDelay(1000L);
            c3.i(ofFloat, new s0(this, 0));
            arrayList.add(ofFloat);
        } else if (eVar2 == wj1.e.VARIATION_B) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            ofFloat2.setDuration(400L);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ua2.q0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t0 f121596b;

                {
                    this.f121596b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    int i15 = i13;
                    t0 this$0 = this.f121596b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            this$0.getClass();
                            this$0.H();
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            Object animatedValue2 = animation.getAnimatedValue();
                            Intrinsics.g(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            this$0.getClass();
                            this$0.H();
                            break;
                    }
                }
            });
            ofFloat2.addListener(new r0(this, 0));
            Intrinsics.checkNotNullExpressionValue(ofFloat2, "apply(...)");
            ofFloat2.setStartDelay(1000L);
            c3.i(ofFloat2, new s0(this, 1));
            arrayList.add(ofFloat2);
        }
        animatorSet.playSequentially(CollectionsKt.F0(arrayList));
        animatorSet.setStartDelay(1000L);
        animatorSet.start();
        this.A = true;
    }

    @Override // ua2.b0, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z13 = E().f128846i;
    }

    @Override // ua2.f1
    public final int t() {
        this.D.isRunning();
        return x();
    }
}
