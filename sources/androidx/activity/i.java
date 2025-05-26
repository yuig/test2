package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f15901b;

    public /* synthetic */ i(o oVar, int i13) {
        this.f15900a = i13;
        this.f15901b = oVar;
    }

    @Override // androidx.lifecycle.x
    public final void c(androidx.lifecycle.z zVar, androidx.lifecycle.q qVar) {
        i0 i0Var;
        switch (this.f15900a) {
            case 0:
                if (qVar == androidx.lifecycle.q.ON_DESTROY) {
                    this.f15901b.mContextAwareHelper.f60720b = null;
                    if (!this.f15901b.isChangingConfigurations()) {
                        this.f15901b.getViewModelStore().a();
                    }
                    n nVar = (n) this.f15901b.mReportFullyDrawnExecutor;
                    o oVar = nVar.f15921d;
                    oVar.getWindow().getDecorView().removeCallbacks(nVar);
                    oVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nVar);
                    break;
                }
                break;
            case 1:
                if (qVar == androidx.lifecycle.q.ON_STOP) {
                    Window window = this.f15901b.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 2:
                o oVar2 = this.f15901b;
                oVar2.ensureViewModelStore();
                oVar2.getLifecycle().b(this);
                break;
            default:
                if (qVar == androidx.lifecycle.q.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    i0Var = this.f15901b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher invoker = k.a((o) zVar);
                    i0Var.getClass();
                    Intrinsics.checkNotNullParameter(invoker, "invoker");
                    i0Var.f15906e = invoker;
                    i0Var.c(i0Var.f15908g);
                    break;
                }
                break;
        }
    }
}
