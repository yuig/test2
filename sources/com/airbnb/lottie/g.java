package com.airbnb.lottie;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28394a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f28395b;

    public g(LottieAnimationView lottieAnimationView, int i13) {
        this.f28394a = i13;
        if (i13 != 1) {
            this.f28395b = new WeakReference(lottieAnimationView);
        } else {
            this.f28395b = new WeakReference(lottieAnimationView);
        }
    }

    @Override // com.airbnb.lottie.x
    public final void onResult(Object obj) {
        WeakReference weakReference = this.f28395b;
        switch (this.f28394a) {
            case 0:
                Throwable th3 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i13 = lottieAnimationView.f28363c;
                    if (i13 != 0) {
                        lottieAnimationView.setImageResource(i13);
                    }
                    LottieAnimationView.f28360m.onResult(th3);
                    break;
                }
                break;
            default:
                h hVar = (h) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.A2(hVar);
                    break;
                }
                break;
        }
    }
}
