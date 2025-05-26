package p11;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import df.n1;
import h32.d4;
import is1.k0;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp11/c;", "Lnl1/d;", "<init>", "()V", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f98640g0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public k0 f98641c0;

    /* renamed from: d0, reason: collision with root package name */
    public WebView f98642d0;

    /* renamed from: e0, reason: collision with root package name */
    public final v f98643e0 = xk2.m.b(new b(this));

    /* renamed from: f0, reason: collision with root package name */
    public final d4 f98644f0;

    public c() {
        this.E = ry1.d.add_website_fragment;
        this.f98644f0 = d4.PIN_CREATE_INFO;
    }

    public static final void Y7(c cVar, WebView webView) {
        String title;
        fo1.a i73;
        cVar.getClass();
        if (webView == null || (title = webView.getTitle()) == null || title.length() == 0 || (i73 = cVar.i7()) == null) {
            return;
        }
        ((GestaltToolbarImpl) i73).b0(webView.getTitle());
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(Z7().getHost());
        gestaltToolbarImpl.W(Z7().toString());
        v vVar = this.f98643e0;
        k3.J1((GestaltButton) vVar.getValue());
        gestaltToolbarImpl.c((GestaltButton) vVar.getValue());
    }

    public final Uri Z7() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_URI") : null;
        if (v03 == null) {
            v03 = "";
        }
        return Uri.parse(v03);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF86875d0() {
        return this.f98644f0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(ry1.c.website_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebView webView = (WebView) findViewById;
        this.f98642d0 = webView;
        if (this.f98641c0 == null) {
            Intrinsics.r("webViewManager");
            throw null;
        }
        k0.a(webView, true);
        webView.setWebViewClient(new n1(this, 3));
        webView.loadUrl(Z7().toString());
        return onCreateView;
    }
}
