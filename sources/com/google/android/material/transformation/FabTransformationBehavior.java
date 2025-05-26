package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import bh.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import gj.a;
import gj.f;
import gj.g;
import gj.h;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f33377c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f33378d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f33379e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f33380f;

    /* renamed from: g, reason: collision with root package name */
    public float f33381g;

    /* renamed from: h, reason: collision with root package name */
    public float f33382h;

    public FabTransformationBehavior() {
        this.f33377c = new Rect();
        this.f33378d = new RectF();
        this.f33379e = new RectF();
        this.f33380f = new int[2];
    }

    public static Pair E(float f13, float f14, boolean z13, b bVar) {
        g f15;
        g f16;
        if (f13 == 0.0f || f14 == 0.0f) {
            f15 = ((f) bVar.f22798b).f("translationXLinear");
            f16 = ((f) bVar.f22798b).f("translationYLinear");
        } else if ((!z13 || f14 >= 0.0f) && (z13 || f14 <= 0.0f)) {
            f15 = ((f) bVar.f22798b).f("translationXCurveDownwards");
            f16 = ((f) bVar.f22798b).f("translationYCurveDownwards");
        } else {
            f15 = ((f) bVar.f22798b).f("translationXCurveUpwards");
            f16 = ((f) bVar.f22798b).f("translationYCurveUpwards");
        }
        return new Pair(f15, f16);
    }

    public static float H(b bVar, g gVar, float f13) {
        long j13 = gVar.f65179a;
        g f14 = ((f) bVar.f22798b).f("expansion");
        return a.a(f13, 0.0f, gVar.b().getInterpolation((((f14.f65179a + f14.f65180b) + 17) - j13) / gVar.f65180b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03da A[LOOP:0: B:41:0x03d8->B:42:0x03da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet D(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.D(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float F(View view, View view2, h hVar) {
        RectF rectF = this.f33378d;
        RectF rectF2 = this.f33379e;
        I(view, rectF);
        rectF.offset(this.f33381g, this.f33382h);
        I(view2, rectF2);
        hVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float G(View view, View view2, h hVar) {
        RectF rectF = this.f33378d;
        RectF rectF2 = this.f33379e;
        I(view, rectF);
        rectF.offset(this.f33381g, this.f33382h);
        I(view2, rectF2);
        hVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f33380f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b J(Context context, boolean z13);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int i13 = ((FloatingActionButton) view2).f32638l.f16502a;
        return i13 == 0 || i13 == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(c cVar) {
        if (cVar.f17907h == 0) {
            cVar.f17907h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33377c = new Rect();
        this.f33378d = new RectF();
        this.f33379e = new RectF();
        this.f33380f = new int[2];
    }
}
