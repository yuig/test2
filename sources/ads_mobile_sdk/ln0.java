package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ln0 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ym0 f7894a;

    /* renamed from: b, reason: collision with root package name */
    public a.og f7895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln0(ym0 gmaWebView) {
        super(gmaWebView.getContext());
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        this.f7894a = gmaWebView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(gmaWebView);
        setBackgroundColor(0);
    }

    public final ym0 a() {
        return this.f7894a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        a.og ogVar = this.f7895b;
        if (ogVar == null) {
            return false;
        }
        ((y60) ogVar).a(ev2);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        gk0.c("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        gk0.c("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i13) {
        gk0.c("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeViewAt(i13);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i13, int i14) {
        gk0.c("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeViews(i13, i14);
    }
}
