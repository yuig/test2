package ads_mobile_sdk;

import a.eh;
import a.of;
import a.s7;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ao2.j0;
import io.embrace.android.embracesdk.WebViewClientSwazzledHooks;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class kn0 extends WebViewClient {

    /* renamed from: s, reason: collision with root package name */
    public static final eh f7393s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f7394t;

    /* renamed from: a, reason: collision with root package name */
    public final a.ce f7395a;

    /* renamed from: b, reason: collision with root package name */
    public final ym0 f7396b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f7397c;

    /* renamed from: d, reason: collision with root package name */
    public final cm0 f7398d;

    /* renamed from: e, reason: collision with root package name */
    public final y4 f7399e;

    /* renamed from: f, reason: collision with root package name */
    public final oh0 f7400f;

    /* renamed from: g, reason: collision with root package name */
    public final co2 f7401g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f7402h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f7403i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f7404j;

    /* renamed from: k, reason: collision with root package name */
    public final co2 f7405k;

    /* renamed from: l, reason: collision with root package name */
    public final co2 f7406l;

    /* renamed from: m, reason: collision with root package name */
    public final co2 f7407m;

    /* renamed from: n, reason: collision with root package name */
    public of f7408n;

    /* renamed from: o, reason: collision with root package name */
    public s7 f7409o;

    /* renamed from: p, reason: collision with root package name */
    public final co2 f7410p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f7411q;

    /* renamed from: r, reason: collision with root package name */
    public volatile ed2 f7412r;

    static {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x(kn0.class, "loadedDeferred", "getLoadedDeferred()Lkotlinx/coroutines/CompletableDeferred;", 0);
        l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f7394t = new rl2.u[]{l0Var.e(xVar), a.a.y(kn0.class, "encounteredError", "getEncounteredError()Lcom/google/android/libraries/ads/mobile/sdk/internal/util/GmaResult$WebError;", 0, l0Var), a.a.y(kn0.class, "followUrls", "getFollowUrls()Z", 0, l0Var), a.a.y(kn0.class, "adEventEmitter", "getAdEventEmitter()Lcom/google/android/libraries/ads/mobile/sdk/internal/event/InternalAdEventListener;", 0, l0Var), a.a.y(kn0.class, "onJavascriptReadyListener", "getOnJavascriptReadyListener()Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/JavascriptReadyListener;", 0, l0Var)};
        f7393s = new eh();
    }

    public kn0(a.ce jsContext, ym0 gmaWebView, j0 backgroundScope, cm0 gmaUtil, y4 adSpamClient, oh0 flags) {
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f7395a = jsContext;
        this.f7396b = gmaWebView;
        this.f7397c = backgroundScope;
        this.f7398d = gmaUtil;
        this.f7399e = adSpamClient;
        this.f7400f = flags;
        Object obj = null;
        this.f7401g = new co2(obj);
        this.f7402h = new AtomicBoolean(false);
        this.f7403i = new AtomicBoolean(false);
        this.f7404j = new AtomicInteger(0);
        this.f7405k = new co2(obj);
        this.f7406l = new co2(Boolean.FALSE);
        this.f7407m = new co2(obj);
        this.f7410p = new co2(obj);
        this.f7411q = new AtomicBoolean(false);
    }

    public final void a() {
        co2 co2Var = this.f7405k;
        rl2.u[] uVarArr = f7394t;
        rk0 rk0Var = (rk0) co2Var.getValue(this, uVarArr[1]);
        if (rk0Var != null) {
            ao2.v vVar = (ao2.v) this.f7401g.getValue(this, uVarArr[0]);
            if (vVar != null) {
                ((ao2.w) vVar).Q(rk0Var);
            }
            this.f7401g.setValue(this, uVarArr[0], null);
            return;
        }
        if (this.f7396b.f14324j.get()) {
            sk0 sk0Var = sk0.f11130c;
            ao2.v vVar2 = (ao2.v) this.f7401g.getValue(this, uVarArr[0]);
            if (vVar2 != null) {
                ((ao2.w) vVar2).Q(sk0Var);
            }
            this.f7401g.setValue(this, uVarArr[0], null);
            return;
        }
        if (this.f7403i.get()) {
            sk0 sk0Var2 = sk0.f11130c;
            ao2.v vVar3 = (ao2.v) this.f7401g.getValue(this, uVarArr[0]);
            if (vVar3 != null) {
                ((ao2.w) vVar3).Q(sk0Var2);
            }
            this.f7401g.setValue(this, uVarArr[0], null);
            return;
        }
        if (!this.f7402h.get() || this.f7404j.get() > 0) {
            return;
        }
        pk0 pk0Var = new pk0(Unit.f80348a);
        ao2.v vVar4 = (ao2.v) this.f7401g.getValue(this, uVarArr[0]);
        if (vVar4 != null) {
            ((ao2.w) vVar4).Q(pk0Var);
        }
        this.f7401g.setValue(this, uVarArr[0], null);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        f7393s.getClass();
        if (eh.a(uri)) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new an0(this, uri, null));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f7402h.set(true);
        ik1 ik1Var = (ik1) this.f7410p.getValue(this, f7394t[4]);
        if (ik1Var != null) {
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new hk1(ik1Var.f6428a, ik1Var.f6429b, null));
        }
        a();
        if (this.f7396b.f14324j.get()) {
            j0 j0Var = this.f7397c;
            dn0 block = new dn0(this, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClientSwazzledHooks._preOnPageStarted(webView, str, bitmap);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i13, String str, String str2) {
        super.onReceivedError(webView, i13, str, str2);
        this.f7405k.setValue(this, f7394t[1], new rk0(i13, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.f7396b.a(detail.rendererPriorityAtExit(), detail.didCrash());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        kotlin.jvm.internal.j.z(this.f7397c, null, null, new en0(this, url, webResourceRequest, null), 3);
        of ofVar = this.f7408n;
        WebResourceResponse webResourceResponse = ofVar != null ? (WebResourceResponse) kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new gn0(ofVar, this, webResourceRequest, null)) : null;
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        if (((Boolean) this.f7400f.a("gads_analytics_events_via_webview_requests", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
            return (WebResourceResponse) kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new fn0(this, webResourceRequest, null));
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        eh ehVar = f7393s;
        Uri url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        ehVar.getClass();
        if (eh.a(url)) {
            Uri uri = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(uri, "getUrl(...)");
            Intrinsics.checkNotNullParameter(uri, "uri");
            kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new an0(this, uri, null));
            return true;
        }
        if (((Boolean) this.f7406l.getValue(this, f7394t[2])).booleanValue()) {
            Uri url2 = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
            Intrinsics.checkNotNullParameter(url2, "<this>");
            if (z.i(url2.getScheme(), "http", true) || z.i(url2.getScheme(), "https", true)) {
                if (!this.f7411q.getAndSet(true)) {
                    ft2.a(this.f7397c, new hn0(this, request, null));
                }
                return super.shouldOverrideUrlLoading(view, request);
            }
        }
        if (this.f7396b.willNotDraw()) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.c("Non-creative WebView unable to handle URL: " + request.getUrl(), null);
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        y4 y4Var = this.f7399e;
        Uri url3 = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url3, "getUrl(...)");
        intent.setData(y4Var.a(url3, this.f7396b));
        ed2 ed2Var = this.f7412r;
        if (ed2Var != null && !ed2Var.a()) {
            kotlin.jvm.internal.j.z(this.f7397c, null, null, new in0(this, request, null), 3);
            return true;
        }
        if (!this.f7398d.a(intent) || this.f7411q.getAndSet(true)) {
            return true;
        }
        ft2.a(this.f7397c, new jn0(this, request, null));
        return true;
    }
}
