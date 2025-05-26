package to0;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.handshake.ui.webview.HandshakeWebView;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import com.pinterest.targethandshake.ui.webview.TargetHandshakeWebView;
import com.pinterest.unauth.controller.SSOActivity;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class u extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118691a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f118692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f118693c;

    public /* synthetic */ u(int i13, FrameLayout frameLayout, Object obj) {
        this.f118691a = i13;
        this.f118692b = frameLayout;
        this.f118693c = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z13) {
        switch (this.f118691a) {
            case 0:
                super.doUpdateVisitedHistory(webView, str, z13);
                InAppBrowserView inAppBrowserView = (InAppBrowserView) this.f118692b;
                if (inAppBrowserView.f45408u) {
                    inAppBrowserView.f45408u = false;
                    inAppBrowserView.f45394g.clearHistory();
                    InAppBrowserView.g(inAppBrowserView);
                    break;
                }
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z13);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String url) {
        int i13 = this.f118691a;
        String str = "";
        Object obj = this.f118693c;
        Object obj2 = this.f118692b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(webView, "webView");
                Intrinsics.checkNotNullParameter(url, "url");
                ((li0.b) obj).g3(url);
                InAppBrowserView inAppBrowserView = (InAppBrowserView) obj2;
                bs1.c.X0(inAppBrowserView.f45403p);
                if (inAppBrowserView.f45407t) {
                    return;
                }
                bs1.c.U1(inAppBrowserView.f45394g);
                if (((Boolean) inAppBrowserView.f45406s.c(inAppBrowserView, InAppBrowserView.f45390w[0])).booleanValue()) {
                    LegoFloatingBottomActionBar legoFloatingBottomActionBar = inAppBrowserView.f45404q;
                    if (legoFloatingBottomActionBar == null) {
                        Intrinsics.r("floatingBottomActionBar");
                        throw null;
                    }
                    bs1.c.U1(legoFloatingBottomActionBar);
                }
                bs1.c.X0(inAppBrowserView.f45395h);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(webView, "webView");
                Intrinsics.checkNotNullParameter(url, "url");
                HandshakeWebView handshakeWebView = (HandshakeWebView) obj2;
                bs1.c.X0(handshakeWebView.f49730d);
                ((GestaltToolbarImpl) handshakeWebView.f49728b).b0(handshakeWebView.f49732f);
                fo1.a aVar = handshakeWebView.f49728b;
                try {
                    String host = Uri.parse(url).getHost();
                    if (host != null) {
                        str = host;
                    }
                } catch (Exception unused) {
                }
                ((GestaltToolbarImpl) aVar).W(str);
                if (handshakeWebView.f49731e) {
                    return;
                }
                handshakeWebView.f49731e = true;
                ((u50.r) obj).a(new qp1.y(System.currentTimeMillis() * 1000000));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(webView, "webView");
                Intrinsics.checkNotNullParameter(url, "url");
                TargetHandshakeWebView targetHandshakeWebView = (TargetHandshakeWebView) obj2;
                bs1.c.X0(targetHandshakeWebView.f52191d);
                ((GestaltToolbarImpl) targetHandshakeWebView.f52189b).b0(targetHandshakeWebView.f52193f);
                fo1.a aVar2 = targetHandshakeWebView.f52189b;
                try {
                    String host2 = Uri.parse(url).getHost();
                    if (host2 != null) {
                        str = host2;
                    }
                } catch (Exception unused2) {
                }
                ((GestaltToolbarImpl) aVar2).W(str);
                if (targetHandshakeWebView.f52192e) {
                    return;
                }
                targetHandshakeWebView.f52192e = true;
                ((u50.r) obj).a(new d92.v(System.currentTimeMillis() * 1000000));
                return;
            default:
                super.onPageFinished(webView, url);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String url, Bitmap bitmap) {
        int i13 = this.f118691a;
        Object obj = this.f118692b;
        switch (i13) {
            case 0:
                WebViewClientSwazzledHooks._preOnPageStarted(webView, url, bitmap);
                Intrinsics.checkNotNullParameter(webView, "webView");
                Intrinsics.checkNotNullParameter(url, "url");
                InAppBrowserView inAppBrowserView = (InAppBrowserView) obj;
                inAppBrowserView.f45407t = false;
                InAppBrowserView.g(inAppBrowserView);
                ((li0.b) this.f118693c).Z0(url);
                bs1.c.U1(inAppBrowserView.f45403p);
                break;
            case 1:
                WebViewClientSwazzledHooks._preOnPageStarted(webView, url, bitmap);
                Intrinsics.checkNotNullParameter(webView, "webView");
                Intrinsics.checkNotNullParameter(url, "url");
                bs1.c.U1(((HandshakeWebView) obj).f49730d);
                break;
            case 2:
                WebViewClientSwazzledHooks._preOnPageStarted(webView, url, bitmap);
                Intrinsics.checkNotNullParameter(webView, "webView");
                Intrinsics.checkNotNullParameter(url, "url");
                bs1.c.U1(((TargetHandshakeWebView) obj).f52191d);
                break;
            default:
                WebViewClientSwazzledHooks._preOnPageStarted(webView, url, bitmap);
                super.onPageStarted(webView, url, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i13, String str, String str2) {
        switch (this.f118691a) {
            case 0:
                InAppBrowserView inAppBrowserView = (InAppBrowserView) this.f118692b;
                inAppBrowserView.f45407t = true;
                bs1.c.X0(inAppBrowserView.f45394g);
                LegoFloatingBottomActionBar legoFloatingBottomActionBar = inAppBrowserView.f45404q;
                if (legoFloatingBottomActionBar == null) {
                    Intrinsics.r("floatingBottomActionBar");
                    throw null;
                }
                bs1.c.X0(legoFloatingBottomActionBar);
                bs1.c.U1(inAppBrowserView.f45395h);
                return;
            default:
                super.onReceivedError(webView, i13, str, str2);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i13 = this.f118691a;
        Object obj = this.f118693c;
        switch (i13) {
            case 1:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((u50.r) obj).a(new qp1.b0(webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null, webResourceResponse != null ? webResourceResponse.getStatusCode() : 0));
                    break;
                }
                break;
            case 2:
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    ((u50.r) obj).a(new d92.y(webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null, webResourceResponse != null ? webResourceResponse.getStatusCode() : 0));
                    break;
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url;
        String host;
        Uri url2;
        Uri url3;
        String host2;
        Uri url4;
        String str = null;
        switch (this.f118691a) {
            case 1:
                if (request != null && (url2 = request.getUrl()) != null) {
                    str = url2.getScheme();
                }
                if (kotlin.text.z.i(str, "https", false)) {
                    List<String> list = HandshakeWebView.f49726g;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (String str2 : list) {
                            if (request != null && (url = request.getUrl()) != null && (host = url.getHost()) != null && StringsKt.E(host, str2, false)) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                if (request != null && (url4 = request.getUrl()) != null) {
                    str = url4.getScheme();
                }
                if (kotlin.text.z.i(str, "https", false)) {
                    List<String> list2 = TargetHandshakeWebView.f52187g;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (String str3 : list2) {
                            if (request != null && (url3 = request.getUrl()) != null && (host2 = url3.getHost()) != null && StringsKt.E(host2, str3, false)) {
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                Uri url5 = request.getUrl();
                mb2.e eVar = (mb2.e) this.f118693c;
                String host3 = url5.getHost();
                Uri uri = (Uri) this.f118692b;
                if (!Intrinsics.d(host3, uri.getHost()) || !Intrinsics.d(url5.getPathSegments(), uri.getPathSegments())) {
                    break;
                } else {
                    String code = url5.getQueryParameter("code");
                    if (code == null) {
                        code = "";
                    }
                    String queryParameter = url5.getQueryParameter(AnimatedTarget.PROPERTY_STATE);
                    String state = queryParameter != null ? queryParameter : "";
                    FragmentActivity requireActivity = eVar.requireActivity();
                    Intrinsics.g(requireActivity, "null cannot be cast to non-null type com.pinterest.unauth.controller.SSOActivity");
                    SSOActivity sSOActivity = (SSOActivity) requireActivity;
                    Intrinsics.checkNotNullParameter(code, "code");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intent intent = new Intent();
                    intent.putExtra("com.pinterest.EXTRA_SSO_CALLBACK_CODE", code);
                    intent.putExtra("com.pinterest.EXTRA_SSO_CALLBACK_STATE", state);
                    sSOActivity.setResult(-1, intent);
                    sSOActivity.finish();
                    break;
                }
                break;
        }
        return super.shouldOverrideUrlLoading(view, request);
    }

    public u(mb2.e eVar, Uri redirectUri) {
        this.f118691a = 3;
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f118693c = eVar;
        this.f118692b = redirectUri;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String url) {
        switch (this.f118691a) {
            case 0:
                Intrinsics.checkNotNullParameter(webView, "webView");
                Intrinsics.checkNotNullParameter(url, "url");
                return ((li0.b) this.f118693c).q0();
            default:
                return super.shouldOverrideUrlLoading(webView, url);
        }
    }
}
