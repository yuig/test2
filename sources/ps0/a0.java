package ps0;

import android.content.pm.PackageInfo;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f101246a;

    public a0(r0 r0Var) {
        this.f101246a = r0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ny.s homeFeedPWTCompleteEvent) {
        Intrinsics.checkNotNullParameter(homeFeedPWTCompleteEvent, "homeFeedPWTCompleteEvent");
        r0 r0Var = this.f101246a;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(homeFeedPWTCompleteEvent, "homeFeedPWTCompleteEvent");
        r0Var.Q3(homeFeedPWTCompleteEvent);
        r0Var.H.getClass();
        String str = null;
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                str = currentWebViewPackage.versionName;
            }
        } catch (Exception unused) {
        }
        if (str != null) {
            tb0.g.f117075a.b("webview_version", str);
        }
    }
}
