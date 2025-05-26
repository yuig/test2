package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class s implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16681b;

    public /* synthetic */ s(Object obj, int i13) {
        this.f16680a = i13;
        this.f16681b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i13 = this.f16680a;
        Object obj = this.f16681b;
        switch (i13) {
            case 0:
                ActivityChooserView activityChooserView = (ActivityChooserView) obj;
                if (activityChooserView.b().f16397z.isShowing()) {
                    if (!activityChooserView.isShown()) {
                        activityChooserView.b().dismiss();
                        break;
                    } else {
                        activityChooserView.b().k();
                        break;
                    }
                }
                break;
            case 1:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
                if (!appCompatSpinner.f16324f.a()) {
                    appCompatSpinner.f16324f.h(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                h0 h0Var = (h0) obj;
                AppCompatSpinner appCompatSpinner2 = h0Var.G;
                if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(h0Var.E)) {
                    h0Var.dismiss();
                    break;
                } else {
                    h0Var.o();
                    h0Var.k();
                    break;
                }
        }
    }
}
