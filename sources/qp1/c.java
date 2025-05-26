package qp1;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.pinterest.handshake.ui.webview.HandshakeWebView;
import com.pinterest.targethandshake.ui.webview.TargetHandshakeWebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f104755b;

    public /* synthetic */ c(FrameLayout frameLayout, int i13) {
        this.f104754a = i13;
        this.f104755b = frameLayout;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i13) {
        int i14 = this.f104754a;
        FrameLayout frameLayout = this.f104755b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(webView, "webView");
                ((HandshakeWebView) frameLayout).f49730d.setProgress(i13);
                break;
            default:
                Intrinsics.checkNotNullParameter(webView, "webView");
                ((TargetHandshakeWebView) frameLayout).f52191d.setProgress(i13);
                break;
        }
    }
}
