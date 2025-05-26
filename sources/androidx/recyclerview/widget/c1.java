package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class c1 extends v2 {

    /* renamed from: k, reason: collision with root package name */
    public PointF f19344k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f19345l;

    /* renamed from: n, reason: collision with root package name */
    public float f19347n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f19342i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f19343j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f19346m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f19348o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f19349p = 0;

    public c1(Context context) {
        this.f19345l = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(android.view.View r3, androidx.recyclerview.widget.w2 r4, androidx.recyclerview.widget.t2 r5) {
        /*
            r2 = this;
            android.graphics.PointF r4 = r2.f19344k
            if (r4 == 0) goto L12
            float r4 = r4.x
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto Lc
            goto L12
        Lc:
            if (r4 <= 0) goto L10
            r4 = 1
            goto L13
        L10:
            r4 = -1
            goto L13
        L12:
            r4 = 0
        L13:
            int r4 = r2.l(r3, r4)
            int r0 = r2.q()
            int r3 = r2.m(r3, r0)
            int r0 = r4 * r4
            int r1 = r3 * r3
            int r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            int r0 = (int) r0
            int r0 = r2.o(r0)
            if (r0 <= 0) goto L37
            int r4 = -r4
            int r3 = -r3
            android.view.animation.DecelerateInterpolator r1 = r2.f19343j
            r5.b(r4, r3, r0, r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c1.g(android.view.View, androidx.recyclerview.widget.w2, androidx.recyclerview.widget.t2):void");
    }

    public int k(int i13, int i14, int i15, int i16, int i17) {
        if (i17 == -1) {
            return i15 - i13;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                return i16 - i14;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i18 = i15 - i13;
        if (i18 > 0) {
            return i18;
        }
        int i19 = i16 - i14;
        if (i19 < 0) {
            return i19;
        }
        return 0;
    }

    public int l(View view, int i13) {
        l2 l2Var = this.f19653c;
        if (l2Var == null || !l2Var.k()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return k(l2.K(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, l2.N(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, l2Var.V(), l2Var.f19506n - l2Var.W(), i13);
    }

    public int m(View view, int i13) {
        l2 l2Var = this.f19653c;
        if (l2Var == null || !l2Var.l()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return k(l2.O(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, l2.I(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, l2Var.Y(), l2Var.f19507o - l2Var.T(), i13);
    }

    public float n(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int o(int i13) {
        return (int) Math.ceil(p(i13) / 0.3356d);
    }

    public int p(int i13) {
        float abs = Math.abs(i13);
        if (!this.f19346m) {
            this.f19347n = n(this.f19345l);
            this.f19346m = true;
        }
        return (int) Math.ceil(abs * this.f19347n);
    }

    public int q() {
        PointF pointF = this.f19344k;
        if (pointF != null) {
            float f13 = pointF.y;
            if (f13 != 0.0f) {
                return f13 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
