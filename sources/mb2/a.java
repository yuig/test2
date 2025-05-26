package mb2;

import bz.i;
import com.pinterest.unauth.controller.SSOActivity;
import cp1.p;
import ku1.j;
import lh0.n1;
import m60.w;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;
import vo.u;
import vy.m;

/* loaded from: classes2.dex */
public abstract class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f86869a = false;

    public a() {
        addOnContextAvailableListener(new vo.f(this, 15));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f86869a) {
            return;
        }
        this.f86869a = true;
        SSOActivity sSOActivity = (SSOActivity) this;
        s8 s8Var = (s8) ((d) generatedComponent());
        oa oaVar = s8Var.f114255d;
        sSOActivity.dauManager = (tx.d) oaVar.Vc.get();
        sSOActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        sSOActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        sSOActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        sSOActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        sSOActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        sSOActivity.analyticsApi = (m) oaVar.M1.get();
        sSOActivity.eventManager = (w) oaVar.f113885r0.get();
        sSOActivity.navigationManager = (j) s8Var.f114402n.get();
        sSOActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        sSOActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        sSOActivity.hairballExperiments = (n1) oaVar.E0.get();
        sSOActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        sSOActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        sSOActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        sSOActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        sSOActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        sSOActivity.dialogContainerFactory = oa.I0(oaVar);
        sSOActivity.timeSpentLoggingManager = (i) oaVar.C9.get();
        sSOActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        sSOActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        sSOActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        sSOActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        sSOActivity.adFormats = bf2.b.a(oaVar.P6);
        pe.i.J0(sSOActivity, new u(oaVar.e3(), 8));
    }
}
