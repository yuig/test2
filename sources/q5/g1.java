package q5;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class g1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f102436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f102437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f102438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f102439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f102440e;

    public g1(o1 o1Var, a2 a2Var, a2 a2Var2, int i13, View view) {
        this.f102436a = o1Var;
        this.f102437b = a2Var;
        this.f102438c = a2Var2;
        this.f102439d = i13;
        this.f102440e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        o1 o1Var = this.f102436a;
        o1Var.f102491a.d(animatedFraction);
        float b13 = o1Var.f102491a.b();
        PathInterpolator pathInterpolator = j1.f102468e;
        int i13 = Build.VERSION.SDK_INT;
        a2 a2Var = this.f102437b;
        s1 r1Var = i13 >= 30 ? new r1(a2Var) : i13 >= 29 ? new q1(a2Var) : new p1(a2Var);
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((this.f102439d & i14) == 0) {
                r1Var.c(i14, a2Var.f102400a.f(i14));
            } else {
                f5.e f13 = a2Var.f102400a.f(i14);
                f5.e f14 = this.f102438c.f102400a.f(i14);
                float f15 = 1.0f - b13;
                r1Var.c(i14, a2.f(f13, (int) (((f13.f61081a - f14.f61081a) * f15) + 0.5d), (int) (((f13.f61082b - f14.f61082b) * f15) + 0.5d), (int) (((f13.f61083c - f14.f61083c) * f15) + 0.5d), (int) (((f13.f61084d - f14.f61084d) * f15) + 0.5d)));
            }
        }
        j1.g(this.f102440e, r1Var.b(), Collections.singletonList(o1Var));
    }
}
