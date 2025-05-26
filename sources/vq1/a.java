package vq1;

import androidx.appcompat.app.m;
import com.pinterest.identity.UnauthActivity;
import cp1.p;
import lh0.g1;
import lh0.n1;
import lh0.z0;
import m60.w;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;

/* loaded from: classes2.dex */
public abstract class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f126438a = false;

    public a() {
        addOnContextAvailableListener(new m(this, 6));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f126438a) {
            return;
        }
        this.f126438a = true;
        UnauthActivity unauthActivity = (UnauthActivity) this;
        s8 s8Var = (s8) ((k) generatedComponent());
        oa oaVar = s8Var.f114255d;
        unauthActivity.dauManager = (tx.d) oaVar.Vc.get();
        unauthActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        unauthActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        unauthActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        unauthActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        unauthActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        unauthActivity.analyticsApi = (vy.m) oaVar.M1.get();
        unauthActivity.eventManager = (w) oaVar.f113885r0.get();
        unauthActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        unauthActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        unauthActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        unauthActivity.hairballExperiments = (n1) oaVar.E0.get();
        unauthActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        unauthActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        unauthActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        unauthActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        unauthActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        unauthActivity.dialogContainerFactory = oa.I0(oaVar);
        unauthActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        unauthActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        unauthActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        unauthActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        unauthActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        unauthActivity.adFormats = bf2.b.a(oaVar.P6);
        unauthActivity.f49757c = (g1) oaVar.D0.get();
        unauthActivity.f49758d = (lu1.b) oaVar.f113961v5.get();
        unauthActivity.f49759e = s8Var.M5();
        unauthActivity.f49760f = (z0) oaVar.D0.get();
        unauthActivity.f49761g = new j(oaVar.e3());
    }
}
