package ads_mobile_sdk;

import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class qg1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f10071a;

    public qg1(rg1 rg1Var) {
        this.f10071a = rg1Var.f10610e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10071a.destroy();
    }
}
