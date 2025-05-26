package lq0;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84339c;

    public /* synthetic */ i0(int i13, Object obj, Object obj2) {
        this.f84337a = i13;
        this.f84338b = obj;
        this.f84339c = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f84337a;
        Object obj = this.f84339c;
        Object obj2 = this.f84338b;
        switch (i13) {
            case 0:
                View view = (View) obj2;
                o0 this$0 = (o0) obj;
                int i14 = o0.R1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int height = view.getRootView().getHeight();
                k3.R1(this$0.g9(), ((((float) (height - rect.bottom)) > (((float) height) * 0.15f) ? 1 : (((float) (height - rect.bottom)) == (((float) height) * 0.15f) ? 0 : -1)) > 0) || df.j1.U0(this$0.f9().t0()) || this$0.f9().k0().f130523j != null);
                break;
            case 1:
                r70.a it = (r70.a) obj2;
                Animator animator = (Animator) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                Intrinsics.checkNotNullParameter(animator, "$animator");
                if (!it.a()) {
                    animator.cancel();
                    break;
                }
                break;
            default:
                yf1.k this$02 = (yf1.k) obj2;
                Context context = (Context) obj;
                int i15 = yf1.k.f138988h;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(context, "$context");
                Rect rect2 = new Rect();
                this$02.getWindowVisibleDisplayFrame(rect2);
                Object systemService = context.getSystemService("input_method");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                if (!((InputMethodManager) systemService).isAcceptingText()) {
                    this$02.scrollTo(0, 0);
                    break;
                } else {
                    this$02.post(new v.k(this$02.f138994f.getBottom() - rect2.bottom, this$02, 16));
                    break;
                }
        }
    }
}
