package ua2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends b0 {
    public final Function0 A;
    public boolean B;
    public final int C;
    public final int D;
    public final Rect E;
    public final xk2.v F;

    /* renamed from: y, reason: collision with root package name */
    public final es.a f121633y;

    /* renamed from: z, reason: collision with root package name */
    public final Function1 f121634z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(es.a r19, com.pinterest.ui.grid.LegoPinGridCellImpl r20, qa2.u r21, qa2.w r22) {
        /*
            r18 = this;
            r13 = r18
            r14 = r19
            r15 = r20
            r12 = r21
            r11 = r22
            java.lang.String r0 = "adFormats"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "legoGridCell"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "navigateToCloseupDirectly"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "navigateToAdsCloseupDirectly"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            rm1.c r6 = rm1.c.LIGHT
            ua2.a0 r3 = ua2.a0.END
            int r0 = eo1.c.margin_half
            int r2 = bs1.c.W(r15, r0)
            r10 = 0
            r16 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r17 = 4056(0xfd8, float:5.684E-42)
            r0 = r18
            r1 = r20
            r11 = r16
            r15 = r12
            r12 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f121633y = r14
            r13.f121634z = r15
            r0 = r22
            r13.A = r0
            int r0 = wy1.b.grid_cell_expand_tappable_size
            int r0 = bs1.c.W(r1, r0)
            r13.C = r0
            int r0 = wy1.b.grid_cell_indicator_shadow_size
            int r0 = bs1.c.W(r1, r0)
            int r0 = r0 / 2
            r13.D = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r13.E = r0
            ua2.t r0 = new ua2.t
            r2 = 1
            r0.<init>(r1, r2)
            xk2.v r0 = xk2.m.b(r0)
            r13.F = r0
            int r0 = eo1.b.color_themed_transparent
            r13.f121424k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.y.<init>(es.a, com.pinterest.ui.grid.LegoPinGridCellImpl, qa2.u, qa2.w):void");
    }

    @Override // ua2.h0
    public final boolean B() {
        f30 S = com.bumptech.glide.d.S(this.f121502f);
        if (S != null) {
            return ((es.c) this.f121633y).U(S) ? ((Boolean) this.f121634z.invoke(S)).booleanValue() : ((Boolean) this.A.invoke()).booleanValue();
        }
        return false;
    }

    @Override // ua2.b0, ua2.h0
    public final boolean C(int i13, int i14) {
        return this.E.contains(i13, i14);
    }

    public final void G() {
        va2.j E = E();
        E.D = (Drawable) this.F.getValue();
        E.F = true;
        E.f125389t.setAlpha(0);
        E.H = 0;
    }

    public final void H(boolean z13) {
        this.B = z13;
    }

    @Override // ua2.b0, ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i18 = this.f121437x;
        boolean z13 = this.B;
        int i19 = this.C;
        if (z13) {
            i18 += i19;
            i17 = i19;
        } else {
            i17 = 0;
        }
        boolean z14 = this.f121494c;
        a0 a0Var = this.f121422i;
        int i23 = (!(z14 && a0Var == a0.START) && (z14 || a0Var != a0.END)) ? i13 : i15 - i19;
        int i24 = (!(z14 && a0Var == a0.START) && (z14 || a0Var != a0.END)) ? i13 + i19 : i15;
        Rect rect = this.E;
        rect.set(i23, i18, i24, i19 + i18);
        Rect rect2 = E().E;
        int centerX = rect.centerX();
        int i25 = this.D;
        rect2.set(centerX - i25, rect.centerY() - i25, rect.centerX() + i25, rect.centerY() + i25);
        super.r(canvas, i13, i17, i15, i16);
    }
}
