package hq;

import bz.i;
import com.pinterest.activity.nux.NUXActivity;
import cp1.p;
import ey.j3;
import ku1.j;
import lh0.n1;
import m60.w;
import nx.f0;
import nx.z;
import rg0.s;
import so.oa;
import so.s8;
import tb0.h;
import vy.m;

/* loaded from: classes.dex */
public abstract class a extends p {
    private boolean injected = false;

    public a() {
        addOnContextAvailableListener(new vo.f(this, 7));
    }

    @Override // cp1.q
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        NUXActivity nUXActivity = (NUXActivity) this;
        s8 s8Var = (s8) ((g) generatedComponent());
        oa oaVar = s8Var.f114255d;
        nUXActivity.dauManager = (tx.d) oaVar.Vc.get();
        nUXActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        nUXActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        nUXActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        nUXActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        nUXActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        nUXActivity.analyticsApi = (m) oaVar.M1.get();
        nUXActivity.eventManager = (w) oaVar.f113885r0.get();
        nUXActivity.navigationManager = (j) s8Var.f114402n.get();
        nUXActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        nUXActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        nUXActivity.hairballExperiments = (n1) oaVar.E0.get();
        nUXActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        nUXActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        nUXActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        nUXActivity.baseCrashReporting = (h) oaVar.f113797m0.get();
        nUXActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        nUXActivity.dialogContainerFactory = oa.I0(oaVar);
        nUXActivity.timeSpentLoggingManager = (i) oaVar.C9.get();
        nUXActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        nUXActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        nUXActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        nUXActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        nUXActivity.adFormats = bf2.b.a(oaVar.P6);
        kh2.j.h1(nUXActivity, (mo1.d) oaVar.D5.get());
        kh2.j.w0(nUXActivity, (lu1.b) oaVar.f113961v5.get());
        kh2.j.R0(nUXActivity, (s) oaVar.Q5.get());
        j3 j3Var = j3.f60510a;
        kh2.j.t1(nUXActivity);
        kh2.j.d2(nUXActivity, new f(oaVar.e3()));
        kh2.j.U0(nUXActivity, s8Var.d6());
        kh2.j.m1(nUXActivity, (kv1.a) s8Var.Ec.get());
        kh2.j.n1(nUXActivity, (qy0.b) s8Var.f114269e.f114655e.get());
    }
}
