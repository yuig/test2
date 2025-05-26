package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public final class l0 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f19474a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19475b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19476c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19477d;

    /* renamed from: e, reason: collision with root package name */
    public final y2 f19478e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19479f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f19480g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19481h;

    /* renamed from: i, reason: collision with root package name */
    public float f19482i;

    /* renamed from: j, reason: collision with root package name */
    public float f19483j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19484k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19485l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f19486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f19487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2 f19488o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q0 f19489p;

    public l0(q0 q0Var, y2 y2Var, int i13, float f13, float f14, float f15, float f16, int i14, y2 y2Var2) {
        this.f19489p = q0Var;
        this.f19487n = i14;
        this.f19488o = y2Var2;
        this.f19479f = i13;
        this.f19478e = y2Var;
        this.f19474a = f13;
        this.f19475b = f14;
        this.f19476c = f15;
        this.f19477d = f16;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19480g = ofFloat;
        ofFloat.addUpdateListener(new e0(this, 1));
        ofFloat.setTarget(y2Var.f19717a);
        ofFloat.addListener(this);
        this.f19486m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f19485l) {
            this.f19478e.a0(true);
        }
        this.f19485l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f19486m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.f19484k) {
            return;
        }
        int i13 = this.f19487n;
        y2 y2Var = this.f19488o;
        q0 q0Var = this.f19489p;
        if (i13 <= 0) {
            q0Var.f19581m.a(q0Var.f19585q, y2Var);
        } else {
            q0Var.f19569a.add(y2Var.f19717a);
            this.f19481h = true;
            int i14 = this.f19487n;
            if (i14 > 0) {
                q0Var.f19585q.post(new d.d(q0Var, this, i14, 7, 0));
            }
        }
        View view = q0Var.f19590v;
        View view2 = y2Var.f19717a;
        if (view == view2) {
            q0Var.q(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationStart(Animator animator) {
    }
}
