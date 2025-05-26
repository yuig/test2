package qr;

import com.pinterest.activity.webhook.WebhookActivity;
import cp1.p;
import lb0.q;
import lh0.n1;
import m60.w;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f104953a = false;

    public i() {
        addOnContextAvailableListener(new androidx.appcompat.app.m(this, 4));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f104953a) {
            return;
        }
        this.f104953a = true;
        WebhookActivity webhookActivity = (WebhookActivity) this;
        s8 s8Var = (s8) ((l) generatedComponent());
        oa oaVar = s8Var.f114255d;
        webhookActivity.dauManager = (tx.d) oaVar.Vc.get();
        webhookActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        webhookActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        webhookActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        webhookActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        webhookActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        webhookActivity.analyticsApi = (vy.m) oaVar.M1.get();
        webhookActivity.eventManager = (w) oaVar.f113885r0.get();
        webhookActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        webhookActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        webhookActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        webhookActivity.hairballExperiments = (n1) oaVar.E0.get();
        webhookActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        webhookActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        webhookActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        webhookActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        webhookActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        webhookActivity.dialogContainerFactory = oa.I0(oaVar);
        webhookActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        webhookActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        webhookActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        webhookActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        webhookActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        webhookActivity.adFormats = bf2.b.a(oaVar.P6);
        webhookActivity.f35245e = oaVar.H2();
        webhookActivity.f35246f = (lu1.b) oaVar.f113961v5.get();
        webhookActivity.f35247g = oaVar.d2();
        webhookActivity.f35248h = (dy.a) oaVar.f113943u5.get();
        webhookActivity.f35249i = (m) s8Var.f114298fd.get();
        webhookActivity.f35250j = oaVar.C2();
        webhookActivity.f35251k = (tb0.h) oaVar.f113797m0.get();
        webhookActivity.f35252l = s8Var.u5();
        webhookActivity.f35253m = bf2.b.a(oaVar.Tc);
        webhookActivity.f35254n = new rd.j(bf2.b.a(s8Var.f114255d.f113907s5));
        webhookActivity.f35255o = (q) oaVar.O0.get();
        webhookActivity.f35256p = oaVar.k2();
        webhookActivity.f35257q = oa.f1(oaVar);
        webhookActivity.f35258r = bf2.b.a(oaVar.N0);
    }
}
