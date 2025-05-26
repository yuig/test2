package q5;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f102419a;

    public d1(View view) {
        this.f102419a = new WeakReference(view);
    }

    public final void a(float f13) {
        View view = (View) this.f102419a.get();
        if (view != null) {
            view.animate().alpha(f13);
        }
    }

    public final void b() {
        View view = (View) this.f102419a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j13) {
        View view = (View) this.f102419a.get();
        if (view != null) {
            view.animate().setDuration(j13);
        }
    }

    public final void d(Interpolator interpolator) {
        View view = (View) this.f102419a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void e(e1 e1Var) {
        View view = (View) this.f102419a.get();
        if (view != null) {
            if (e1Var != null) {
                view.animate().setListener(new c1(this, e1Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void f(f1 f1Var) {
        View view = (View) this.f102419a.get();
        if (view != null) {
            view.animate().setUpdateListener(f1Var != null ? new b1(0, f1Var, view) : null);
        }
    }

    public final void g() {
        View view = (View) this.f102419a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void h(float f13) {
        View view = (View) this.f102419a.get();
        if (view != null) {
            view.animate().translationY(f13);
        }
    }
}
