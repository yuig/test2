package pr;

import bz.i;
import com.pinterest.activity.web.WebViewActivity;
import cp1.p;
import kh2.g3;
import ku1.j;
import lh0.n1;
import m60.e;
import m60.w;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;
import tb0.h;
import tx.d;
import vo.f;
import vo.u;
import vy.m;

/* loaded from: classes.dex */
public abstract class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f101153a = false;

    public a() {
        addOnContextAvailableListener(new f(this, 9));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f101153a) {
            return;
        }
        this.f101153a = true;
        WebViewActivity webViewActivity = (WebViewActivity) this;
        s8 s8Var = (s8) ((c) generatedComponent());
        oa oaVar = s8Var.f114255d;
        webViewActivity.dauManager = (d) oaVar.Vc.get();
        webViewActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        webViewActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        webViewActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        webViewActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        webViewActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        webViewActivity.analyticsApi = (m) oaVar.M1.get();
        webViewActivity.eventManager = (w) oaVar.f113885r0.get();
        webViewActivity.navigationManager = (j) s8Var.f114402n.get();
        webViewActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        webViewActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        webViewActivity.hairballExperiments = (n1) oaVar.E0.get();
        webViewActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        webViewActivity.applicationInfoProvider = (e) oaVar.f113920t0.get();
        webViewActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        webViewActivity.baseCrashReporting = (h) oaVar.f113797m0.get();
        webViewActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        webViewActivity.dialogContainerFactory = oa.I0(oaVar);
        webViewActivity.timeSpentLoggingManager = (i) oaVar.C9.get();
        webViewActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        webViewActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        webViewActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        webViewActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        webViewActivity.adFormats = bf2.b.a(oaVar.P6);
        g3.U1(webViewActivity, new u(oaVar.e3(), 5));
        g3.K0(webViewActivity, (lu1.b) oaVar.f113961v5.get());
    }
}
