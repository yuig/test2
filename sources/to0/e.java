package to0;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.pinterest.feature.browser.view.InAppBrowserView;
import ey.e5;
import h32.f1;
import java.util.HashMap;
import java.util.HashSet;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends WebChromeClient {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f118645e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118646a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f118647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f118648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f118649d;

    public e(li0.b bVar, InAppBrowserView inAppBrowserView, li0.a aVar) {
        this.f118647b = bVar;
        this.f118648c = inAppBrowserView;
        this.f118649d = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        switch (this.f118646a) {
            case 0:
                super.onCloseWindow(webView);
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.l(new Pair("BrowserBaseFragment", "end"));
                break;
            default:
                super.onCloseWindow(webView);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z13, boolean z14, Message message) {
        switch (this.f118646a) {
            case 0:
                String extra = webView.getHitTestResult().getExtra();
                if (!pk.a0.x0(extra)) {
                    ((WebView) this.f118648c).loadUrl(extra);
                }
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.l(new Pair("BrowserBaseFragment", "start"));
                return false;
            default:
                return super.onCreateWindow(webView, z13, z14, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest request) {
        switch (this.f118646a) {
            case 0:
                request.deny();
                return;
            default:
                Intrinsics.checkNotNullParameter(request, "request");
                InAppBrowserView inAppBrowserView = (InAppBrowserView) this.f118648c;
                Context context = inAppBrowserView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Activity k03 = bs1.c.k0(context);
                String[] resources = request.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                int i13 = 0;
                for (String str : resources) {
                    if (Intrinsics.d("android.webkit.resource.VIDEO_CAPTURE", str)) {
                        lb0.q qVar = inAppBrowserView.f45393f;
                        if (qVar == null) {
                            Intrinsics.r("prefsManagerPersisted");
                            throw null;
                        }
                        qy1.d.b(qVar, k03, "android.permission.CAMERA", qy1.d.f105360b, new t(i13, k03, request));
                    }
                }
                return;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i13) {
        int i14 = this.f118646a;
        Object obj = this.f118647b;
        switch (i14) {
            case 0:
                ro0.e eVar = (ro0.e) obj;
                if (i13 > eVar.f108944e) {
                    ((g) ((po0.d) eVar.getView())).f118655i0.setProgress(i13);
                    if (i13 > 0 && i13 < 100 && !eVar.f108947h) {
                        qo0.a aVar = (qo0.a) eVar.f139226a;
                        String str = eVar.f108943d;
                        aVar.getClass();
                        HashMap hashMap = new HashMap(aVar.f104523i);
                        hashMap.put("url", str);
                        hashMap.put("progress_percent", String.valueOf(i13));
                        hashMap.put("is_promoted_pin", String.valueOf(aVar.f104522h));
                        aVar.f122379a.g(f1.URL_LOAD_PERCENT, aVar.f122380b, hashMap, false);
                    }
                    if (i13 >= 75 && i13 < 100) {
                        k3.R1(((g) ((po0.d) eVar.getView())).f118655i0, false);
                        new e5(1).i();
                    }
                    eVar.f108944e = i13;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(webView, "webView");
                ((li0.b) obj).getClass();
                ((InAppBrowserView) this.f118648c).f45403p.setProgress(i13);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i13 = this.f118646a;
        Object obj = this.f118649d;
        switch (i13) {
            case 0:
                return lf.a.b(((g) obj).E4(), valueCallback, fileChooserParams);
            default:
                return ((li0.a) obj).G5(valueCallback, fileChooserParams);
        }
    }

    public e(g gVar, ro0.g gVar2, WebView webView) {
        this.f118649d = gVar;
        this.f118647b = gVar2;
        this.f118648c = webView;
    }
}
