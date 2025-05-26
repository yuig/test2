package ij;

import android.view.View;
import android.view.ViewParent;
import bp1.h;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public int f72335a;

    /* renamed from: b, reason: collision with root package name */
    public int f72336b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f72337c;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f72337c = swipeDismissBehavior;
    }

    @Override // bp1.h
    public final void A(View view, int i13) {
        this.f72336b = i13;
        this.f72335a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f72337c;
            swipeDismissBehavior.f32242c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f32242c = false;
        }
    }

    @Override // bp1.h
    public final void B(int i13) {
        this.f72337c.getClass();
    }

    @Override // bp1.h
    public final void C(View view, int i13, int i14) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f72337c;
        float f13 = width * swipeDismissBehavior.f32245f;
        float width2 = view.getWidth() * swipeDismissBehavior.f32246g;
        float abs = Math.abs(i13 - this.f72335a);
        if (abs <= f13) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f13) / (width2 - f13))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f72335a) >= java.lang.Math.round(r9.getWidth() * r3.f32244e)) goto L27;
     */
    @Override // bp1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f72336b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f72337c
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = q5.v0.f102521a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f32243d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r2) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f72335a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f32244e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f72335a
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f72335a
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f72335a
            r2 = r4
        L69:
            y5.d r10 = r3.f32240a
            int r11 = r9.getTop()
            boolean r10 = r10.s(r0, r11)
            if (r10 == 0) goto L7f
            v.b0 r10 = new v.b0
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = q5.v0.f102521a
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.a.D(android.view.View, float, float):void");
    }

    @Override // bp1.h
    public final boolean I(View view, int i13) {
        int i14 = this.f72336b;
        return (i14 == -1 || i14 == i13) && this.f72337c.C(view);
    }

    @Override // bp1.h
    public final int f(View view, int i13) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = v0.f102521a;
        boolean z13 = view.getLayoutDirection() == 1;
        int i14 = this.f72337c.f32243d;
        if (i14 == 0) {
            if (z13) {
                width = this.f72335a - view.getWidth();
                width2 = this.f72335a;
            } else {
                width = this.f72335a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i14 != 1) {
            width = this.f72335a - view.getWidth();
            width2 = view.getWidth() + this.f72335a;
        } else if (z13) {
            width = this.f72335a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f72335a - view.getWidth();
            width2 = this.f72335a;
        }
        return Math.min(Math.max(width, i13), width2);
    }

    @Override // bp1.h
    public final int g(View view, int i13) {
        return view.getTop();
    }

    @Override // bp1.h
    public final int r(View view) {
        return view.getWidth();
    }
}
