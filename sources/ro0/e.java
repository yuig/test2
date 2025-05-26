package ro0;

import a.k1;
import a11.y;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import ck2.i;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import df.j1;
import ey.e5;
import fk2.h;
import gp1.j;
import h32.c1;
import h32.f1;
import h32.g0;
import h32.u0;
import h32.v0;
import i01.r0;
import i32.y0;
import is1.k0;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import jk2.v;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.a2;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import m60.w;
import m60.x0;
import nx.b0;
import nx.d0;
import okhttp3.HttpUrl;
import pk.a0;
import q8.m0;
import to0.z;
import uj2.q;
import x02.i2;
import xo.l;
import z70.m;

/* loaded from: classes5.dex */
public abstract class e extends yk1.f implements po0.b {
    public final r A;
    public final gp1.c B;
    public final b0 C;
    public final es.a D;
    public final d E;

    /* renamed from: b, reason: collision with root package name */
    public Long f108941b;

    /* renamed from: c, reason: collision with root package name */
    public f30 f108942c;

    /* renamed from: d, reason: collision with root package name */
    public String f108943d;

    /* renamed from: e, reason: collision with root package name */
    public int f108944e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f108945f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f108946g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f108947h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f108948i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f108949j;

    /* renamed from: k, reason: collision with root package name */
    public int f108950k;

    /* renamed from: l, reason: collision with root package name */
    public final po0.a f108951l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f108952m;

    /* renamed from: n, reason: collision with root package name */
    public long f108953n;

    /* renamed from: o, reason: collision with root package name */
    public final String f108954o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f108955p;

    /* renamed from: q, reason: collision with root package name */
    public final b60.b f108956q;

    /* renamed from: r, reason: collision with root package name */
    public final x10.b f108957r;

    /* renamed from: s, reason: collision with root package name */
    public final w f108958s;

    /* renamed from: t, reason: collision with root package name */
    public final qb0.e f108959t;

    /* renamed from: u, reason: collision with root package name */
    public final so0.a f108960u;

    /* renamed from: v, reason: collision with root package name */
    public final zf0.f f108961v;

    /* renamed from: w, reason: collision with root package name */
    public final i2 f108962w;

    /* renamed from: x, reason: collision with root package name */
    public final m f108963x;

    /* renamed from: y, reason: collision with root package name */
    public final k0 f108964y;

    /* renamed from: z, reason: collision with root package name */
    public final y f108965z;

    public e(po0.a aVar, qo0.a aVar2, q qVar, b60.b bVar, w wVar, qb0.e eVar, x10.b bVar2, so0.a aVar3, zf0.f fVar, a2 a2Var, m mVar, i2 i2Var, m60.b0 b0Var, k0 k0Var, y yVar, r rVar, gp1.d dVar, b0 b0Var2, es.a aVar4) {
        super(aVar2, qVar);
        HashMap hashMap;
        HashMap hashMap2;
        this.f108949j = true;
        HashMap hashMap3 = new HashMap();
        this.f108954o = null;
        this.f108955p = false;
        this.E = new d(this);
        this.f108962w = i2Var;
        this.C = b0Var2;
        if (a0.x0(aVar.f100888o)) {
            aVar.f100888o = "in_app_browser";
        }
        this.f108951l = aVar;
        this.f108943d = aVar.f100875b;
        to0.y yVar2 = aVar.f100890q;
        if (yVar2 != null && (hashMap2 = yVar2.f118702a) != null && hashMap2.containsKey("grid_click_type") && hashMap2.get("grid_click_type") != null) {
            this.f108954o = (String) hashMap2.get("grid_click_type");
        }
        String str = aVar.f100877d;
        if (!a0.x0(str)) {
            f30 f30Var = (f30) i2Var.O(str);
            this.f108942c = f30Var;
            if (f30Var != null) {
                aVar2.f104522h = f30Var.d5().booleanValue();
            }
        }
        to0.y yVar3 = aVar.f100890q;
        if (yVar3 != null && (hashMap = yVar3.f118702a) != null) {
            aVar2.f104523i = hashMap;
        }
        this.f108956q = bVar;
        this.f108958s = wVar;
        this.f108959t = eVar;
        this.f108960u = aVar3;
        this.f108961v = fVar;
        this.f108963x = mVar;
        this.f108957r = bVar2;
        this.A = rVar;
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) a2Var.f83295a;
        if (g1Var.o("android_background_clickthrough_end", "enabled", z3Var) || g1Var.l("android_background_clickthrough_end")) {
            v o13 = b0Var.a().o();
            b bVar3 = new b(this, 1);
            x02.a2 a2Var2 = i.f27924d;
            o13.F(bVar3, a2Var2, i.f27923c, a2Var2);
        }
        hashMap3.put("url", this.f108943d);
        this.f108964y = k0Var;
        this.f108965z = yVar;
        this.B = dVar;
        this.D = aVar4;
    }

    public static void p3(e eVar, String str) {
        if (eVar.isBound()) {
            ((to0.g) ((po0.d) eVar.getView())).F7();
            ((to0.g) ((po0.d) eVar.getView())).f118663q0.i(str);
            new Handler().postDelayed(new a(eVar, 1), 7000L);
        }
    }

    public static void q3(e eVar, PinnableImageFeed pinnableImageFeed, final String str, vd0.c cVar) {
        if (eVar.isBound()) {
            eVar.f108945f = true;
            po0.d dVar = (po0.d) eVar.getView();
            final PinnableImageFeed pinnableImageFeed2 = new PinnableImageFeed(pinnableImageFeed);
            final String str2 = eVar.f108943d;
            po0.a aVar = eVar.f108951l;
            final String str3 = aVar.f100888o;
            final String str4 = aVar.f100880g;
            final String str5 = aVar.f100881h;
            final to0.g gVar = (to0.g) dVar;
            gVar.getClass();
            Runnable runnable = new Runnable() { // from class: to0.b
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar2 = g.this;
                    Intent b13 = gVar2.f118668v0.b(gVar2.requireContext(), lu1.a.PIN_MARKLET_ACTIVITY);
                    b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", str3);
                    b13.putExtra("com.pinterest.EXTRA_FEED", (Parcelable) pinnableImageFeed2);
                    b13.putExtra("com.pinterest.EXTRA_URL", str2);
                    b13.putExtra("com.pinterest.EXTRA_META", str);
                    b13.putExtra("com.pinterest.CLOSEUP_PIN_ID", gVar2.f118664r0);
                    b13.putExtra("com.pinterest.EXTRA_BOARD_ID", str4);
                    b13.putExtra("com.pinterest.EXTRA_BOARD_NAME", str5);
                    gVar2.F7();
                    gVar2.requireContext().startActivity(b13);
                    if (gVar2.f118651e0 == null) {
                        gVar2.f118651e0 = (z70.m) gVar2.f118672z0.get();
                    }
                    if (gVar2.f118651e0.e() && (gVar2.E4() instanceof np.r)) {
                        gVar2.E4().finish();
                    }
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                gVar.f118659m0.post(runnable);
            } else {
                runnable.run();
            }
            eVar.u3(pinnableImageFeed);
            if (cVar != null) {
                eVar.f108957r.h(cVar.o("url", ""), cVar.o("title", ""), cVar.o("description", ""), "200").o(new l(20), new b(eVar, 0));
            }
            if (eVar.f108946g) {
                to0.g gVar2 = (to0.g) ((po0.d) eVar.getView());
                gVar2.getClass();
                ne0.b bVar = new ne0.b(gVar2, 1);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    gVar2.f118659m0.post(bVar);
                } else {
                    bVar.run();
                }
            }
        }
    }

    public static boolean r3(String url) {
        if (url == null || !url.contains("pin/create")) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl.f95629k.getClass();
            HttpUrl f13 = HttpUrl.Companion.f(url);
            if (f13 == null || j1.b1(f13.b(), false) || !ie0.a.f72199d.contains(f13.f95634d) || qs1.b.a(url)) {
                return false;
            }
        }
        return true;
    }

    public final void B3() {
        HashMap hashMap = new HashMap();
        hashMap.put("page_load_finished", String.valueOf(this.f108947h));
        d0 pinalytics = getPinalytics();
        u0 u0Var = u0.PIN_REPIN_BUTTON;
        g0 g0Var = g0.MODAL_PIN;
        f30 f30Var = this.f108942c;
        pinalytics.f0(u0Var, g0Var, f30Var != null ? f30Var.getUid() : null, hashMap, false);
        if (this.f108947h) {
            s3();
        } else {
            this.f108948i = true;
        }
        ((to0.g) ((po0.d) getView())).c8(x0.loading_pins_webpage, j1.k0(this.f108943d));
    }

    public void D3() {
        f30 f30Var = this.f108942c;
        String uid = f30Var != null ? f30Var.getUid() : null;
        f30 f30Var2 = this.f108942c;
        this.f108958s.f(new x70.a(uid, Boolean.valueOf(f30Var2 != null ? f30Var2.d5().booleanValue() : false)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r3.f108964y.b(new java.net.URI(r4).getHost()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F3(java.lang.String r4) {
        /*
            r3 = this;
            po0.a r0 = r3.f108951l
            boolean r1 = r0.f100885l
            r2 = 0
            if (r1 == 0) goto L47
            boolean r0 = r0.f100886m
            if (r0 == 0) goto Lc
            goto L47
        Lc:
            java.lang.String r0 = "/secure/"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = "/login/"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L47
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> L2e
            r0.<init>(r4)     // Catch: java.net.URISyntaxException -> L2e
            java.lang.String r0 = r0.getHost()     // Catch: java.net.URISyntaxException -> L2e
            is1.k0 r1 = r3.f108964y     // Catch: java.net.URISyntaxException -> L2e
            boolean r0 = r1.b(r0)     // Catch: java.net.URISyntaxException -> L2e
            if (r0 == 0) goto L46
            goto L36
        L2e:
            r0 = move-exception
            java.util.HashSet r1 = tb0.h.f117076w
            tb0.h r1 = tb0.g.f117075a
            r1.p(r0)
        L36:
            java.lang.String r0 = "pinterest://"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "pinit"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L47
        L46:
            r2 = 1
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ro0.e.F3(java.lang.String):boolean");
    }

    public final boolean G3(String str) {
        if (str != null && str.startsWith("market://")) {
            to0.g gVar = (to0.g) ((po0.d) getView());
            WebView webView = gVar.f118652f0;
            if (webView != null) {
                webView.stopLoading();
            }
            if (str.startsWith("market://details?id=com.pinterest") && str.length() > 33) {
                FragmentActivity E4 = gVar.E4();
                if (E4 != null) {
                    E4.startActivity(((lu1.c) gVar.f118666t0).f());
                }
                ne0.b bVar = new ne0.b(gVar, 1);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    gVar.f118659m0.post(bVar);
                    return true;
                }
                bVar.run();
                return true;
            }
            FragmentActivity E42 = gVar.E4();
            if (E42 != null) {
                Intent intent = new Intent("android.intent.action.VIEW");
                try {
                    intent.setData(Uri.parse(str));
                    E42.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    intent.setData(Uri.parse(str.replaceFirst("market://", "https://play.google.com/store/apps/")));
                    E42.startActivity(intent);
                }
            }
            ne0.b bVar2 = new ne0.b(gVar, 1);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                gVar.f118659m0.post(bVar2);
                return true;
            }
            bVar2.run();
            return true;
        }
        if (!this.f108951l.f100891r && r3(str)) {
            if (j1.M0(str)) {
                f30 f30Var = this.f108942c;
                String uid = f30Var != null ? f30Var.getUid() : null;
                f30 f30Var2 = this.f108942c;
                this.f108958s.f(new x70.a(uid, Boolean.valueOf(f30Var2 != null ? f30Var2.d5().booleanValue() : false)));
                ((to0.g) ((po0.d) getView())).dismiss();
                return true;
            }
            to0.g gVar2 = (to0.g) ((po0.d) getView());
            gVar2.d8(str);
            WebView webView2 = gVar2.f118652f0;
            if (webView2 != null) {
                webView2.stopLoading();
            }
            gVar2.dismiss();
            return true;
        }
        if (H3(str) || str == null) {
            return true;
        }
        if (!URLUtil.isNetworkUrl(str) && !F3(str)) {
            return true;
        }
        if (str.startsWith("https://ads.pinterest.com/") && str.contains("/billing/simplest/?success=true")) {
            return true;
        }
        if (!this.f108955p || (!str.startsWith("https://play.google.com/store/apps/") && !str.startsWith("http://play.google.com/store/apps/"))) {
            if (r3(str) && Uri.parse(str).getQueryParameter("ppm-unauth-android-experience") != null && Objects.equals(Uri.parse(str).getQueryParameter("ppm-unauth-android-experience"), "true")) {
                this.f108955p = true;
            }
            return false;
        }
        to0.g gVar3 = (to0.g) ((po0.d) getView());
        WebView webView3 = gVar3.f118652f0;
        if (webView3 != null) {
            webView3.stopLoading();
        }
        FragmentActivity E43 = gVar3.E4();
        if (E43 != null) {
            E43.startActivity(((lu1.c) gVar3.f118666t0).f());
        }
        ne0.b bVar3 = new ne0.b(gVar3, 1);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gVar3.f118659m0.post(bVar3);
            return true;
        }
        bVar3.run();
        return true;
    }

    public final boolean H3(String str) {
        if (str != null && j.a(str)) {
            po0.d dVar = (po0.d) getView();
            b60.d dVar2 = (b60.d) this.f108956q;
            boolean x03 = a0.x0(dVar2.f() != null ? dVar2.f().getUid() : "");
            gp1.c cVar = this.B;
            if (!x03) {
                r rVar = ((gp1.d) cVar).f65930a;
                long a13 = rVar.a("PREF_COOKIE_SESSION_EXPIRED", 0L);
                String d2 = rVar.d("PREF_COOKIE_SESSION", null);
                if (a13 < System.currentTimeMillis() || d2 == null || d2.length() == 0) {
                    addDisposable(this.f108960u.prepare(new Object[0]).execute((ak2.e) new nr.b(3, this, str), (ak2.e) new l(21)));
                    return true;
                }
            }
            String d13 = ((gp1.d) cVar).f65930a.d("PREF_COOKIE_SESSION", null);
            ((to0.g) dVar).b8(d13 != null ? d13 : "", str);
        }
        return false;
    }

    @Override // yk1.p, yk1.b
    public void onUnbind() {
        new e5(1).i();
        t3();
        super.onUnbind();
    }

    public final void s3() {
        if (!(this.f108951l.f100887n && this.f108948i && !this.f108952m) && this.f108947h) {
            this.f108948i = false;
            to0.g gVar = (to0.g) ((po0.d) getView());
            k0 k0Var = gVar.f118671y0;
            WebView webView = gVar.f118652f0;
            k0Var.getClass();
            Intrinsics.checkNotNullParameter("pinmarklet.js", "scriptFile");
            Intrinsics.checkNotNullParameter(webView, "webView");
            try {
                InputStream open = webView.getContext().getAssets().open("pinmarklet.js");
                Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                open.close();
                webView.loadUrl("javascript:(function(w, d) {var s = d.createElement('SCRIPT');s.type = 'text/javascript';s.charset = 'UTF-8';s.innerHTML = w.atob('" + Base64.encodeToString(bArr, 2) + "');d.getElementsByTagName('HEAD')[0].appendChild(s)}(window, document))");
            } catch (IOException unused) {
            }
            gVar.f118659m0.postDelayed(new ne0.b(this), 10000);
        }
    }

    public final void t3() {
        to0.y yVar;
        HashMap hashMap;
        c1 c1Var;
        String str;
        f30 f30Var = this.f108942c;
        if (f30Var == null || !this.f108949j) {
            return;
        }
        HashMap m13 = this.C.m(f30Var);
        if (((es.c) this.D).r(this.f108942c)) {
            m13.put(SbaPinRep.AUX_DATA_IS_MDL_AD, "true");
            m13.put("mdl_did_succeed", "false");
            m13.put("is_third_party_ad", this.f108942c.i5().toString());
        }
        if (m13 != null && (str = this.f108954o) != null) {
            m13.put("grid_click_type", str);
        }
        long currentTimeMillis = (System.currentTimeMillis() * 1000000) - this.f108953n;
        po0.a aVar = this.f108951l;
        z zVar = aVar.f100882i;
        c1 c1Var2 = zVar != null ? zVar.f118703a : null;
        d0 pinalytics = getPinalytics();
        f1 f1Var = f1.PIN_CLICKTHROUGH_END;
        String uid = this.f108942c.getUid();
        v0 v0Var = new v0();
        v0Var.C = Long.valueOf(currentTimeMillis);
        pinalytics.H(f1Var, uid, c1Var2, m13, v0Var, false);
        f30 f30Var2 = this.f108942c;
        if (aVar.f100883j && (yVar = aVar.f100890q) != null && (hashMap = yVar.f118702a) != null && hashMap.get("collection_pin_click_position") != null) {
            if ("0".equals((String) aVar.f100890q.f118702a.get("collection_pin_click_position"))) {
                d0 pinalytics2 = getPinalytics();
                f1 f1Var2 = f1.COLLECTION_PIN_CLICKTHROUGH_END;
                String uid2 = f30Var2.getUid();
                HashMap hashMap2 = aVar.f100890q.f118702a;
                v0 v0Var2 = new v0();
                v0Var2.C = Long.valueOf(currentTimeMillis);
                pinalytics2.H(f1Var2, uid2, c1Var2, hashMap2, v0Var2, false);
            } else {
                c1 source = c1Var2;
                z zVar2 = aVar.f100884k;
                c1 c1Var3 = zVar2 != null ? zVar2.f118703a : null;
                if (source == null || c1Var3 == null || c1Var3.A == null) {
                    c1Var = source != null ? source : c1Var3;
                } else {
                    Intrinsics.checkNotNullParameter(source, "source");
                    c1Var = new c1(source.f66899a, source.f66901b, source.f66903c, source.f66905d, source.f66907e, source.f66909f, source.f66911g, source.f66912h, source.f66913i, source.f66914j, source.f66915k, source.f66916l, source.f66917m, source.f66918n, source.f66919o, source.f66920p, source.f66921q, source.f66922r, source.f66923s, source.f66924t, source.f66925u, source.f66926v, source.f66927w, source.f66928x, source.f66929y, source.f66930z, c1Var3.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f66898J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f66900a0, source.f66902b0, source.f66904c0, source.f66906d0, source.f66908e0, source.f66910f0);
                }
                d0 pinalytics3 = getPinalytics();
                f1 f1Var3 = f1.COLLECTION_ITEM_CLICKTHROUGH_END;
                String uid3 = f30Var2.getUid();
                HashMap hashMap3 = aVar.f100890q.f118702a;
                v0 v0Var3 = new v0();
                v0Var3.C = Long.valueOf(currentTimeMillis);
                pinalytics3.H(f1Var3, uid3, c1Var, hashMap3, v0Var3, false);
            }
        }
        this.f108958s.f(new ls1.g(this.f108942c.getUid(), System.currentTimeMillis() * 1000000));
        this.f108949j = false;
        f30 f30Var3 = this.f108942c;
        boolean[] zArr = f30Var3.f37485h3;
        int intValue = (zArr.length <= 199 || !zArr[199]) ? -1 : f30Var3.B6().intValue();
        boolean z13 = currentTimeMillis >= 120000000000L;
        q32.c cVar = q32.c.FOOD_AND_DRINKS;
        boolean z14 = intValue == cVar.value();
        q32.c cVar2 = q32.c.DIY_AND_CRAFTS;
        boolean z15 = intValue == cVar2.value();
        q32.c cVar3 = q32.c.ART;
        boolean z16 = intValue == cVar3.value();
        r rVar = this.A;
        if (z13 && (z14 || z15 || z16)) {
            rVar.b("PREF_COMMENT_NUDGE_UPSELL_PIN_ID", this.f108942c.getUid());
        }
        if (intValue == cVar.value() || intValue == cVar2.value() || intValue == cVar3.value()) {
            rVar.h("PREF_COMMENT_NUDGE_UPSELL_PIN_INTEREST", this.f108942c.B6().intValue());
        }
    }

    public final void u3(PinnableImageFeed pinnableImageFeed) {
        f1 f1Var;
        d0 pinalytics = getPinalytics();
        HashMap hashMap = new HashMap();
        hashMap.put("method", this.f108951l.f100888o);
        hashMap.put("url", this.f108943d);
        try {
            String host = new URI(this.f108943d).getHost();
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            hashMap.put("domain", host);
        } catch (URISyntaxException e13) {
            e13.printStackTrace();
        }
        if (pinnableImageFeed != null) {
            hashMap.put("image_count", String.valueOf(pinnableImageFeed.q().size()));
            f1Var = f1.SAVE_BROWSER_PIN_IMAGES_FOUND;
        } else {
            f1Var = f1.SAVE_BROWSER_PIN_IMAGES_NOT_FOUND;
        }
        pinalytics.h0(f1Var, null, null, null, hashMap, null, null, false);
    }

    public final boolean v3() {
        to0.g gVar = (to0.g) ((po0.d) getView());
        WebView webView = gVar.f118652f0;
        if (webView != null && webView.canGoBack()) {
            gVar.f118652f0.goBack();
            return true;
        }
        f30 f30Var = this.f108942c;
        String uid = f30Var != null ? f30Var.getUid() : null;
        f30 f30Var2 = this.f108942c;
        x70.a aVar = new x70.a(uid, Boolean.valueOf(f30Var2 != null ? f30Var2.d5().booleanValue() : false));
        w wVar = this.f108958s;
        wVar.f(aVar);
        wVar.d(new a11.c());
        wVar.d(new m0(false));
        return false;
    }

    public final void w3(po0.d dVar) {
        HashMap hashMap;
        List<HttpCookie> cookies;
        f30 f30Var;
        AppBarLayout appBarLayout;
        super.r3((yk1.r) dVar);
        f30 f30Var2 = this.f108942c;
        byte b13 = 0;
        po0.a aVar = this.f108951l;
        if (f30Var2 == null && aVar.f100877d != null) {
            c cVar = new c((g) this, b13 == true ? 1 : 0);
            this.f108962w.L(aVar.f100877d).d(cVar);
            addDisposable(cVar);
        }
        if (aVar.f100876c || ((f30Var = this.f108942c) != null && f30Var.R4().booleanValue())) {
            f30 f30Var3 = this.f108942c;
            if (f30Var3 != null) {
                boolean o03 = b40.o0(f30Var3);
                to0.g gVar = (to0.g) dVar;
                gVar.f118664r0 = this.f108942c.getUid();
                dVar.c5((g) this);
                boolean M0 = b40.M0(this.f108942c);
                GestaltButton gestaltButton = gVar.f118657k0;
                if (gestaltButton != null) {
                    gestaltButton.d(new bp.d(M0, 4));
                }
                String h43 = this.f108942c.h4();
                if (!a0.x0(h43)) {
                    ((GestaltToolbarImpl) gVar.f118656j0).W(h43);
                }
                if (o03) {
                    gVar.a8(sm1.b.ic_cancel_gestalt, eo1.b.color_themed_icon_default, null);
                }
            }
        } else if (aVar.f100889p.booleanValue()) {
            ((to0.g) dVar).a8(sm1.b.ic_cancel_gestalt, eo1.b.color_themed_icon_default, null);
        } else if (!qs1.b.a(this.f108943d) && (appBarLayout = ((to0.g) dVar).f118654h0) != null) {
            appBarLayout.setVisibility(8);
        }
        d dVar2 = this.E;
        int i13 = 1;
        boolean z13 = a0.E(this.f108943d, "realvirtualzone.com") || a0.E(this.f108943d, "thebmw4series.com") || a0.E(this.f108943d, "walmart-summer-every-second.com");
        final to0.g gVar2 = (to0.g) dVar;
        WebView webVw = gVar2.f118652f0;
        if (webVw != null) {
            gVar2.f118665s0 = z13;
            f30.b apiUtils = gVar2.C0;
            Intrinsics.checkNotNullParameter(webVw, "webVw");
            Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(webVw, true);
            cookieManager.removeSessionCookies(null);
            if (CookieHandler.getDefault() == null) {
                j.b(apiUtils);
            }
            CookieHandler cookieHandler = CookieHandler.getDefault();
            java.net.CookieManager cookieManager2 = cookieHandler instanceof java.net.CookieManager ? (java.net.CookieManager) cookieHandler : null;
            CookieStore cookieStore = cookieManager2 != null ? cookieManager2.getCookieStore() : null;
            if (cookieStore != null && (cookies = cookieStore.getCookies()) != null) {
                for (HttpCookie cookie : cookies) {
                    Intrinsics.f(cookie);
                    Intrinsics.checkNotNullParameter(cookie, "cookie");
                    StringBuilder sb3 = new StringBuilder(cookie.toString());
                    if (Intrinsics.d(cookie.getName(), "_pinterest_ct")) {
                        sb3.append("; SameSite=None");
                    }
                    sb3.append("; secure; domain=");
                    sb3.append(cookie.getDomain());
                    sb3.append("; path=");
                    sb3.append(cookie.getPath());
                    String sb4 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                    cookieManager.setCookie(".pinterest.com", sb4);
                }
            }
            new h(new k1(cookieManager, 21), 2).l(tk2.e.f118017c).i(new r0(16), new dl1.c(26, gp1.i.f65937i));
            k0 k0Var = gVar2.f118671y0;
            boolean z14 = !gVar2.f118665s0;
            k0Var.getClass();
            k0.a(webVw, z14);
            webVw.addJavascriptInterface(dVar2, "JavaScriptInterface");
            g gVar3 = (g) this;
            webVw.setWebViewClient(new to0.d(gVar2, gVar3, webVw));
            gVar2.f118652f0.setWebChromeClient(new to0.e(gVar2, gVar3, webVw));
            gVar2.f118652f0.setDownloadListener(new DownloadListener() { // from class: to0.c
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(final String str, String str2, final String str3, final String str4, long j13) {
                    int i14 = g.G0;
                    final g gVar4 = g.this;
                    if (str == null) {
                        gVar4.getClass();
                        return;
                    }
                    cp1.p pVar = (cp1.p) gVar4.E4();
                    if (Build.VERSION.SDK_INT < 29) {
                        qy1.d.b(gVar4.B0, pVar, "android.permission.WRITE_EXTERNAL_STORAGE", cs1.d.storage_permission_explanation_save_file, new c5.a() { // from class: to0.a
                            @Override // c5.a
                            public final void onRequestPermissionsResult(int i15, String[] strArr, int[] iArr) {
                                int i16 = g.G0;
                                g gVar5 = g.this;
                                if (qy1.d.a(gVar5.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    gVar5.Y7(str, str3, str4);
                                }
                            }
                        });
                    } else {
                        gVar4.Y7(str, str3, str4);
                    }
                }
            });
        }
        gVar2.f118660n0 = this;
        m mVar = this.f108963x;
        if (mVar.f141009i.f141017a && mVar.d()) {
            this.f108948i = true;
        }
        String str = this.f108943d;
        if (!TextUtils.isEmpty(str) && (URLUtil.isNetworkUrl(str) || F3(str) || ((str != null && str.startsWith("market://")) || r3(str) || j.a(str)))) {
            if (aVar.f100887n) {
                String str2 = this.f108943d;
                f30 f30Var4 = this.f108942c;
                jk2.m a13 = this.f108965z.a(str2, f30Var4 != null ? f30Var4.getUid() : "");
                c cVar2 = new c((g) this, i13);
                a13.d(cVar2);
                addDisposable(cVar2);
                this.f108948i = true;
                if (!mVar.f141009i.f141017a) {
                    this.f108946g = true;
                }
                gVar2.c8(x0.loading_pins_webpage, j1.k0(this.f108943d));
                if (gVar2.getView() != null) {
                    gVar2.getView().setVisibility(8);
                }
            }
            if (!a0.x0(aVar.f100878e)) {
                String str3 = aVar.f100878e;
                fo1.a aVar2 = gVar2.f118656j0;
                if (aVar2 != null) {
                    ((GestaltToolbarImpl) aVar2).b0(str3);
                }
            }
            H3(this.f108943d);
            String str4 = this.f108943d;
            if (aVar.f100874a != null) {
                hashMap = new HashMap();
                hashMap.put("Referer", aVar.f100874a);
                hashMap.put("Accept-Language", dl2.b.c1());
            } else {
                hashMap = null;
            }
            WebView webView = gVar2.f118652f0;
            if (webView != null) {
                webView.loadUrl(str4, hashMap);
            }
        } else {
            gVar2.dismiss();
        }
        ur0.g.d(y0.ANDROID_INAPP_BROWSER_TAKEOVER, gVar2, null);
        this.f108953n = System.currentTimeMillis() * 1000000;
    }

    public final void x3(int i13) {
        if (isBound()) {
            u3(null);
            ((to0.g) ((po0.d) getView())).F7();
            to0.g gVar = (to0.g) ((po0.d) getView());
            gVar.f118663q0.i(gVar.getString(i13));
            new Handler().postDelayed(new a(this, 0), 7000L);
        }
    }

    public final void z3(int i13, String str) {
        qo0.a aVar = (qo0.a) this.f139226a;
        aVar.getClass();
        HashMap hashMap = new HashMap(aVar.f104523i);
        hashMap.put("url", str);
        hashMap.put("status_code", String.valueOf(i13));
        hashMap.put("is_promoted_pin", String.valueOf(aVar.f104522h));
        aVar.f122379a.g(f1.URL_LOAD_ERROR, aVar.f122380b, hashMap, false);
        if (a0.N(str, this.f108943d)) {
            new e5(1).i();
        }
    }
}
