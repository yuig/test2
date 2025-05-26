package ua2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.ui.grid.LegoPinGridCell;
import kh2.c3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s extends b0 {
    public boolean A;
    public final AnimatorSet B;

    /* renamed from: y, reason: collision with root package name */
    public final qc2.a f121600y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f121601z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(com.pinterest.ui.grid.LegoPinGridCellImpl r16, qc2.a r17) {
        /*
            r15 = this;
            r13 = r15
            r1 = r16
            r14 = r17
            java.lang.String r0 = "legoGridCell"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "viewabilityCalculator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = eo1.c.sema_space_200
            int r2 = bs1.c.W(r1, r0)
            int r8 = wy1.b.d2s_indicator_padding
            int r5 = wy1.a.d2s_overlay_background
            rm1.c r6 = rm1.c.LIGHT
            vn1.c r4 = vn1.c.LIGHT
            r10 = 1
            r11 = 0
            r3 = 0
            r7 = 0
            r9 = 0
            r12 = 2884(0xb44, float:4.041E-42)
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f121600y = r14
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r13.B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.s.<init>(com.pinterest.ui.grid.LegoPinGridCellImpl, qc2.a):void");
    }

    public final ValueAnimator G(float f13, float f14) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f13);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addUpdateListener(new androidx.media3.ui.c(this, 22));
        ofFloat.addListener(new androidx.appcompat.widget.d(this, 24));
        ofFloat.setDuration(240L);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float H() {
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
        return ((qc2.d) this.f121600y).c(view2, 0, E().f128840c, E().f128841d, E().f128842e, view);
    }

    public final void l() {
        if (!this.f121601z || H() > 0.0f) {
            return;
        }
        c3.m0(this.B);
        this.f121601z = false;
        E().S = false;
        this.A = false;
        this.f121502f.postInvalidate();
    }

    public final void n() {
        AnimatorSet animatorSet = this.B;
        if (animatorSet.isRunning() || this.A || this.f121601z) {
            return;
        }
        if (H() < 80.0f) {
            l();
            return;
        }
        animatorSet.playSequentially(CollectionsKt.F0(kotlin.collections.f0.l(G(1.0f, 0.0f))));
        animatorSet.setStartDelay(1000L);
        animatorSet.start();
        this.f121601z = true;
    }

    @Override // ua2.b0, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z13 = E().f128846i;
    }

    @Override // ua2.f1
    public final int t() {
        this.B.isRunning();
        return this.f121433t != null ? x() : x();
    }
}
