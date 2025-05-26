package to0;

import a.k1;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.c2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import i01.r0;
import i32.y0;
import is1.k0;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import okhttp3.HttpUrl;
import ro0.e;
import so.oa;

/* loaded from: classes.dex */
public abstract class g<T extends ro0.e> extends yk1.k implements po0.d {
    public static final /* synthetic */ int G0 = 0;
    public a80.a A0;
    public lb0.q B0;
    public f30.b C0;
    public gp1.c D0;
    public c2 E0;
    public final f F0;

    /* renamed from: e0, reason: collision with root package name */
    public z70.m f118651e0;

    /* renamed from: f0, reason: collision with root package name */
    public WebView f118652f0;

    /* renamed from: g0, reason: collision with root package name */
    public CoordinatorLayout f118653g0;

    /* renamed from: h0, reason: collision with root package name */
    public AppBarLayout f118654h0;

    /* renamed from: i0, reason: collision with root package name */
    public ProgressBar f118655i0;

    /* renamed from: j0, reason: collision with root package name */
    public fo1.a f118656j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltButton f118657k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltButton f118658l0;

    /* renamed from: m0, reason: collision with root package name */
    public Handler f118659m0;

    /* renamed from: n0, reason: collision with root package name */
    public ro0.e f118660n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f118661o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f118662p0;

    /* renamed from: q0, reason: collision with root package name */
    public final i92.k f118663q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f118664r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f118665s0;

    /* renamed from: t0, reason: collision with root package name */
    public lu1.b f118666t0;

    /* renamed from: u0, reason: collision with root package name */
    public d1 f118667u0;

    /* renamed from: v0, reason: collision with root package name */
    public lu1.d f118668v0;

    /* renamed from: w0, reason: collision with root package name */
    public so.v f118669w0;

    /* renamed from: x0, reason: collision with root package name */
    public m60.w f118670x0;

    /* renamed from: y0, reason: collision with root package name */
    public k0 f118671y0;

    /* renamed from: z0, reason: collision with root package name */
    public wk2.a f118672z0;

    public g() {
        Context context = kb0.a.f79058b;
        this.f118663q0 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
        this.f118665s0 = false;
        this.F0 = new f(this);
    }

    @Override // nl1.d
    public final void O7() {
        ro0.e eVar = this.f118660n0;
        if (eVar != null) {
            eVar.D3();
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a aVar) {
        ((GestaltToolbarImpl) aVar).I();
    }

    public final void Y7(String str, String str2, String str3) {
        try {
            Uri parse = Uri.parse(str);
            String guessFileName = URLUtil.guessFileName(str, str2, str3);
            DownloadManager.Request request = new DownloadManager.Request(parse);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
            ((DownloadManager) getContext().getSystemService("download")).enqueue(request);
        } catch (IllegalArgumentException unused) {
            this.f118663q0.h(cs1.d.file_save_fail);
        }
    }

    public final po0.a Z7() {
        Uri data;
        Navigation navigation = this.I;
        po0.a aVar = new po0.a();
        if (navigation != null) {
            aVar.f100875b = navigation.getF49940b();
            aVar.f100879f = navigation.v0("com.pinterest.TRACKING_PARAMETER");
            aVar.f100876c = Boolean.TRUE.equals(Boolean.valueOf(navigation.S("com.pinterest.EXTRA_WEBPAGE_PINNABLE", false)));
            aVar.f100877d = navigation.v0("com.pinterest.CLOSEUP_PIN_ID");
            aVar.f100874a = navigation.v0("com.pinterest.EXTRA_REFERRER");
            boolean S = navigation.S("com.pinterest.EXTRA_IS_SURVEY", false);
            aVar.f100889p = Boolean.valueOf(S);
            this.f118661o0 = S;
            if (navigation.i0("com.pinterest.PIN_LOGGING_AUX_DATA") instanceof y) {
                aVar.f100890q = (y) navigation.i0("com.pinterest.PIN_LOGGING_AUX_DATA");
            }
            if (navigation.i0("com.pinterest.PIN_LOGGING_EVENT_DATA") instanceof z) {
                aVar.f100882i = (z) navigation.i0("com.pinterest.PIN_LOGGING_EVENT_DATA");
            }
            if (navigation.i0("com.pinterest.EXTRA_PIN_DL_COLLECTION_EVENT_DATA") instanceof z) {
                aVar.f100884k = (z) navigation.i0("com.pinterest.EXTRA_PIN_DL_COLLECTION_EVENT_DATA");
            }
            aVar.f100883j = navigation.S("com.pinterest.EXTRA_PIN_IS_DL_COLLECTION", false);
        }
        Intent intent = E4().getIntent();
        if (intent != null) {
            aVar.f100891r = intent.getBooleanExtra("com.pinterest.EXTRA_IS_UNAUTH", false);
            aVar.f100885l = intent.getBooleanExtra("com.pinterest.EXTRA_ALLOW_REDIRECT_BACK", false);
            aVar.f100886m = intent.getBooleanExtra("com.pinterest.EXTRA_CATCH_BY_WEBHOOK", false);
            if (aVar.f100877d == null && getArguments() != null) {
                aVar.f100877d = getArguments().getString("com.pinterest.EXTRA_PIN_ID");
            }
            aVar.f100878e = intent.getStringExtra("com.pinterest.EXTRA_WEB_TITLE_STRING");
            if ((aVar.f100875b == null || intent.hasExtra("com.pinterest.EXTRA_HAS_URL")) && (data = intent.getData()) != null) {
                aVar.f100875b = data.toString();
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                boolean z13 = !pk.a0.x0(arguments.getString("com.pinterest.EXTRA_URL"));
                aVar.f100887n = z13;
                if (z13) {
                    aVar.f100875b = arguments.getString("com.pinterest.EXTRA_URL");
                    arguments.getBoolean("com.pinterest.EXTRA_FROM_PIN_IT", false);
                    aVar.f100880g = arguments.getString("com.pinterest.EXTRA_BOARD_ID");
                    aVar.f100881h = arguments.getString("com.pinterest.EXTRA_BOARD_NAME");
                    String stringExtra = intent.getStringExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE");
                    if (!pk.a0.x0(stringExtra)) {
                        aVar.f100888o = stringExtra;
                    }
                    if (intent.getExtras() != null && aVar.f100874a == null) {
                        aVar.f100874a = (String) intent.getExtras().get("com.pinterest.EXTRA_REFERRER");
                    }
                    if (aVar.f100874a == null) {
                        aVar.f100874a = (String) arguments.get("com.pinterest.EXTRA_REFERRER");
                    }
                    aVar.f100877d = arguments.getString("com.pinterest.CLOSEUP_PIN_ID", null);
                }
                if ((arguments.getSerializable("com.pinterest.PIN_LOGGING_AUX_DATA") instanceof y) && aVar.f100890q == null) {
                    aVar.f100890q = (y) arguments.getSerializable("com.pinterest.PIN_LOGGING_AUX_DATA");
                }
            }
        }
        return aVar;
    }

    public final void a8(int i13, int i14, Integer num) {
        Drawable k23 = bs1.c.k2(requireContext(), i13, i14);
        if (num != null && k23 != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(num.intValue());
            k23 = d7.b.p0(k23, getResources(), dimensionPixelSize, dimensionPixelSize);
        }
        if (k23 != null && !pk.a0.q0(requireContext())) {
            Context requireContext = requireContext();
            int i15 = eo1.b.color_black_900;
            Object obj = d5.a.f53679a;
            k23.setTint(requireContext.getColor(i15));
        }
        ((GestaltToolbarImpl) this.f118656j0).S(k23);
    }

    public final void b8(String session, String url) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(url, "url");
        String str = null;
        if (gp1.j.a(url)) {
            HttpUrl.f95629k.getClass();
            HttpUrl f13 = HttpUrl.Companion.f(url);
            if (f13 != null) {
                str = f13.f95634d;
            }
        }
        if (session.length() <= 0 || str == null || str.length() == 0) {
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        String str2 = "_pinterest_sess=" + session + "; secure; domain=.pinterest.com";
        Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
        cookieManager.setAcceptCookie(true);
        cookieManager.setCookie("https://" + str + "/", str2);
        new fk2.h(new k1(cookieManager, 21), 2).l(tk2.e.f118017c).i(new r0(16), new dl1.c(26, gp1.i.f65937i));
    }

    public void c5(ro0.g gVar) {
        if (getView() != null) {
            View inflate = ((ViewStub) getView().findViewById(cs1.b.browser_pin_bar_viewstub)).inflate();
            this.f118662p0 = inflate;
            GestaltIconButton gestaltIconButton = (GestaltIconButton) inflate.findViewById(ds1.b.open_in_browser_overflow_btn);
            this.f118657k0 = (GestaltButton) this.f118662p0.findViewById(ds1.b.save_pinit_bt);
            com.bumptech.glide.c.u1(gestaltIconButton);
            this.f118662p0.bringToFront();
            gestaltIconButton.u(new bp.j(25, this, gVar));
            GestaltButton gestaltButton = this.f118657k0;
            if (gestaltButton != null) {
                gestaltButton.e(new yb0.b(gVar, 27));
            }
            gw gwVar = fw.f37821a;
            String str = this.f118664r0;
            gwVar.getClass();
            f30 d2 = gw.d(str);
            if (d2 != null) {
                GestaltButton gestaltButton2 = (GestaltButton) this.f118662p0.findViewById(ds1.b.send_from_browser_bt);
                this.f118658l0 = gestaltButton2;
                gestaltButton2.e(new bp.j(26, this, d2));
                this.f118658l0.d(new oo0.b(4));
            }
        }
    }

    public final void c8(int i13, Object... objArr) {
        String message = getResources().getString(i13, objArr);
        Intrinsics.checkNotNullParameter(message, "message");
        m60.w f73 = f7();
        mf0.l lVar = new mf0.l();
        lVar.q7(message);
        f73.d(new of0.a(lVar));
    }

    public final void d8(String str) {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Intent b13 = this.f118668v0.b(E4, lu1.a.WEB_HOOK_ACTIVITY);
            b13.setData(Uri.parse(str));
            b13.putExtra("com.pinterest.EXTRA_SOURCE", "SOURCE_APP_NAVIGATION");
            E4.startActivity(b13);
        }
    }

    @Override // nl1.d
    public final void dismiss() {
        ro0.e eVar = this.f118660n0;
        if (eVar != null) {
            eVar.f108961v.m(y0.ANDROID_INAPP_BROWSER_TAKEOVER, i32.l.ANDROID_IAB_RATE_WEBSITE_TOOLTIP);
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            this.f118670x0.d(new za.c(navigation));
        } else {
            E4().finish();
        }
    }

    public final void e8() {
        fo1.a i73 = i7();
        WebView webView = this.f118652f0;
        if (webView == null || i73 == null || pk.a0.x0(webView.getTitle())) {
            return;
        }
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
        gestaltToolbarImpl.b0(this.f118652f0.getTitle());
        if (this.f118652f0.getCertificate() != null) {
            FragmentActivity E4 = E4();
            int i13 = cs1.a.ic_lock_green_nonpds;
            Object obj = d5.a.f53679a;
            Drawable drawable = E4.getDrawable(i13);
            IconView F = gestaltToolbarImpl.F(drawable);
            F.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            F.setPaddingRelative(0, 0, 0, 8);
            gestaltToolbarImpl.a(F, drawable.getIntrinsicWidth() + 8);
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ro0.e eVar = this.f118660n0;
        if (eVar != null) {
            eVar.f108961v.m(y0.ANDROID_INAPP_BROWSER_TAKEOVER, i32.l.ANDROID_IAB_RATE_WEBSITE_TOOLTIP);
        }
        ro0.e eVar2 = this.f118660n0;
        return eVar2 != null && eVar2.v3();
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        lf.a.n(i13, i14, intent);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = this.f118661o0 ? cs1.c.fragment_survey : cs1.c.fragment_webview;
        this.f118659m0 = new Handler();
        this.f118670x0.h(this.F0);
        this.A0.f1501a = true;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WebView webView = this.f118652f0;
        if (webView != null) {
            webView.stopLoading();
        }
        WebView webView2 = this.f118652f0;
        if (webView2 != null) {
            webView2.setWebViewClient(null);
            this.f118652f0.setWebChromeClient(null);
            this.f118652f0.removeJavascriptInterface("JavaScriptInterface");
        }
        WebView webVw = this.f118652f0;
        Intrinsics.checkNotNullParameter(webVw, "webVw");
        ViewParent parent = webVw.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webVw);
        }
        webVw.removeAllViews();
        webVw.destroy();
        this.f118660n0 = null;
        this.f118670x0.j(this.F0);
        this.f118659m0.removeCallbacksAndMessages(null);
        this.A0.f1501a = false;
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f118652f0 = (WebView) view.findViewById(cs1.b.webview);
        this.f118653g0 = (CoordinatorLayout) view.findViewById(cs1.b.collapsing_toolbar_container);
        this.f118654h0 = (AppBarLayout) view.findViewById(cs1.b.toolbar_container);
        this.f118655i0 = (ProgressBar) view.findViewById(cs1.b.webview_progress_bar);
        this.f118656j0 = i7();
        super.onViewCreated(view, bundle);
    }
}
