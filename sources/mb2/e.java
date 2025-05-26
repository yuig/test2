package mb2;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import h32.d4;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import qr1.d0;
import to0.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lmb2/e;", "Lnl1/d;", "<init>", "()V", "gi2/b", "to0/u", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class e extends b {

    /* renamed from: c0, reason: collision with root package name */
    public d0 f86874c0;

    /* renamed from: d0, reason: collision with root package name */
    public final d4 f86875d0 = d4.SSO;

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF86875d0() {
        return this.f86875d0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = v0.fragment_sso_authentication_webview;
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("com.pinterest.EXTRA_SSO_INFO");
            Intrinsics.g(serializable, "null cannot be cast to non-null type com.pinterest.identity.core.model.SSOInfo");
            this.f86874c0 = (d0) serializable;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        WebView webView = (WebView) v13.findViewById(t0.sso_authentication_webview);
        d0 d0Var = this.f86874c0;
        if (d0Var == null) {
            Intrinsics.r("ssoInfo");
            throw null;
        }
        Uri parse = Uri.parse(d0Var.getRedirectUri());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        webView.setWebViewClient(new u(this, parse));
        d0 d0Var2 = this.f86874c0;
        if (d0Var2 != null) {
            webView.loadUrl(d0Var2.getAuthorizationUri());
        } else {
            Intrinsics.r("ssoInfo");
            throw null;
        }
    }
}
