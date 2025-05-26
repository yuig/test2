package q5;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f102533a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f102534b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f102535c;

    public x(View view, Runnable runnable) {
        this.f102533a = view;
        this.f102534b = view.getViewTreeObserver();
        this.f102535c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f102534b.isAlive();
        View view = this.f102533a;
        if (isAlive) {
            this.f102534b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f102535c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f102534b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f102534b.isAlive();
        View view2 = this.f102533a;
        if (isAlive) {
            this.f102534b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
