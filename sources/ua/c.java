package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f121226a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f121227b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f121228c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f121229d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f121230e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121231f;

    /* renamed from: g, reason: collision with root package name */
    public final int f121232g;

    /* renamed from: h, reason: collision with root package name */
    public final int f121233h;

    /* renamed from: i, reason: collision with root package name */
    public final int f121234i;

    /* renamed from: j, reason: collision with root package name */
    public final int f121235j;

    /* renamed from: k, reason: collision with root package name */
    public final int f121236k;

    /* renamed from: l, reason: collision with root package name */
    public final int f121237l;

    /* renamed from: m, reason: collision with root package name */
    public final int f121238m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f121239n;

    public c(View view, Rect rect, boolean z13, Rect rect2, boolean z14, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        this.f121226a = view;
        this.f121227b = rect;
        this.f121228c = z13;
        this.f121229d = rect2;
        this.f121230e = z14;
        this.f121231f = i13;
        this.f121232g = i14;
        this.f121233h = i15;
        this.f121234i = i16;
        this.f121235j = i17;
        this.f121236k = i18;
        this.f121237l = i19;
        this.f121238m = i23;
    }

    @Override // ua.o0
    public final void a() {
        View view = this.f121226a;
        view.setTag(e0.transition_clip, view.getClipBounds());
        view.setClipBounds(this.f121230e ? null : this.f121229d);
    }

    @Override // ua.o0
    public final void d() {
        int i13 = e0.transition_clip;
        View view = this.f121226a;
        Rect rect = (Rect) view.getTag(i13);
        view.setTag(e0.transition_clip, null);
        view.setClipBounds(rect);
    }

    @Override // ua.o0
    public final void e(Transition transition) {
    }

    @Override // ua.o0
    public final void f(Transition transition) {
    }

    @Override // ua.o0
    public final void g(Transition transition) {
        this.f121239n = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z13) {
        if (this.f121239n) {
            return;
        }
        Rect rect = null;
        if (z13) {
            if (!this.f121228c) {
                rect = this.f121227b;
            }
        } else if (!this.f121230e) {
            rect = this.f121229d;
        }
        View view = this.f121226a;
        view.setClipBounds(rect);
        if (z13) {
            b1.c(view, this.f121231f, this.f121232g, this.f121233h, this.f121234i);
        } else {
            b1.c(view, this.f121235j, this.f121236k, this.f121237l, this.f121238m);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z13) {
        int i13 = this.f121233h;
        int i14 = this.f121231f;
        int i15 = this.f121237l;
        int i16 = this.f121235j;
        int max = Math.max(i13 - i14, i15 - i16);
        int i17 = this.f121234i;
        int i18 = this.f121232g;
        int i19 = this.f121238m;
        int i23 = this.f121236k;
        int max2 = Math.max(i17 - i18, i19 - i23);
        if (z13) {
            i14 = i16;
        }
        if (z13) {
            i18 = i23;
        }
        View view = this.f121226a;
        b1.c(view, i14, i18, max + i14, max2 + i18);
        view.setClipBounds(z13 ? this.f121229d : this.f121227b);
    }
}
