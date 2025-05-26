package df;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookDialogException;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.imageview.WebImageView;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n1 extends WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f54810c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54812b;

    public n1(t1 this$0) {
        this.f54811a = 0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f54812b = this$0;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView view, String url) {
        oq.c0 c0Var;
        GestaltSpinner gestaltSpinner;
        switch (this.f54811a) {
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                oq.e0 e0Var = ((oq.j) this.f54812b).f97072r;
                if (e0Var != null && (gestaltSpinner = (c0Var = (oq.c0) e0Var).F) != null) {
                    c0Var.removeView(gestaltSpinner);
                    c0Var.F = null;
                    break;
                }
                break;
            default:
                super.onLoadResource(view, url);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        ProgressDialog progressDialog;
        oq.c0 c0Var;
        GestaltSpinner gestaltSpinner;
        int i13 = this.f54811a;
        Object obj = this.f54812b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                super.onPageFinished(view, url);
                t1 t1Var = (t1) obj;
                if (!t1Var.f54856j && (progressDialog = t1Var.f54851e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = t1Var.f54853g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                s1 s1Var = t1Var.f54850d;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                }
                ImageView imageView = t1Var.f54852f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                t1Var.f54857k = true;
                break;
            case 1:
            default:
                super.onPageFinished(view, url);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                oq.j jVar = (oq.j) obj;
                oq.e0 e0Var = jVar.f97072r;
                if (e0Var != null && (gestaltSpinner = (c0Var = (oq.c0) e0Var).F) != null) {
                    c0Var.removeView(gestaltSpinner);
                    c0Var.F = null;
                }
                if (!jVar.b()) {
                    WebImageView webImageView = jVar.f97065k;
                    if (webImageView != null) {
                        webImageView.post(new com.airbnb.lottie.k(jVar, 25));
                    }
                    jVar.e(true);
                    break;
                }
                break;
            case 3:
                p11.c.Y7((p11.c) obj, view);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String url, Bitmap bitmap) {
        ProgressDialog progressDialog;
        int i13 = this.f54811a;
        Object obj = this.f54812b;
        switch (i13) {
            case 0:
                WebViewClientSwazzledHooks._preOnPageStarted(view, url, bitmap);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.n(url, "Webview loading URL: ");
                le.v vVar = le.v.f83104a;
                super.onPageStarted(view, url, bitmap);
                t1 t1Var = (t1) obj;
                if (!t1Var.f54856j && (progressDialog = t1Var.f54851e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            case 1:
                WebViewClientSwazzledHooks._preOnPageStarted(view, url, bitmap);
                super.onPageStarted(view, url, bitmap);
                break;
            case 2:
                WebViewClientSwazzledHooks._preOnPageStarted(view, url, bitmap);
                super.onPageStarted(view, url, bitmap);
                break;
            default:
                WebViewClientSwazzledHooks._preOnPageStarted(view, url, bitmap);
                p11.c.Y7((p11.c) obj, view);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i13, String description, String failingUrl) {
        switch (this.f54811a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
                super.onReceivedError(view, i13, description, failingUrl);
                ((t1) this.f54812b).e(new FacebookDialogException(description, i13, failingUrl));
                break;
            default:
                super.onReceivedError(view, i13, description, failingUrl);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        switch (this.f54811a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(handler, "handler");
                Intrinsics.checkNotNullParameter(error, "error");
                super.onReceivedSslError(view, handler, error);
                handler.cancel();
                ((t1) this.f54812b).e(new FacebookDialogException(null, -11, null));
                break;
            default:
                super.onReceivedSslError(view, handler, error);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f54811a) {
            case 1:
                Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
                jn.d dVar = (jn.d) this.f54812b;
                if (dVar.j() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    dVar.f77070b = new nn.a(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.n1.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public /* synthetic */ n1(Object obj, int i13) {
        this.f54811a = i13;
        this.f54812b = obj;
    }
}
