package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public final class g0 implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f16566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f16567b;

    public g0(h0 h0Var, s sVar) {
        this.f16567b = h0Var;
        this.f16566a = sVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f16567b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f16566a);
        }
    }
}
