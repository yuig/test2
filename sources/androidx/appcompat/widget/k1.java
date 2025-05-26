package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public final class k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f16622b;

    public /* synthetic */ k1(l1 l1Var, int i13) {
        this.f16621a = i13;
        this.f16622b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f16621a;
        l1 l1Var = this.f16622b;
        switch (i13) {
            case 0:
                ViewParent parent = l1Var.f16632d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                l1Var.a();
                View view = l1Var.f16632d;
                if (view.isEnabled() && !view.isLongClickable() && l1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    l1Var.f16635g = true;
                    break;
                }
                break;
        }
    }
}
