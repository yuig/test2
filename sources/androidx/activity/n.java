package androidx.activity;

import a.ig;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class n implements m, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f15919b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f15921d;

    /* renamed from: a, reason: collision with root package name */
    public final long f15918a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15920c = false;

    public n(o oVar) {
        this.f15921d = oVar;
    }

    @Override // androidx.activity.m
    public final void e(View view) {
        if (this.f15920c) {
            return;
        }
        this.f15920c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15919b = runnable;
        View decorView = this.f15921d.getWindow().getDecorView();
        if (!this.f15920c) {
            decorView.postOnAnimation(new ig(this, 2));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z13;
        Runnable runnable = this.f15919b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f15918a) {
                this.f15920c = false;
                this.f15921d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f15919b = null;
        v vVar = this.f15921d.mFullyDrawnReporter;
        synchronized (vVar.f15938b) {
            z13 = vVar.f15939c;
        }
        if (z13) {
            this.f15920c = false;
            this.f15921d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15921d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
