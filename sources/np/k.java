package np;

import com.pinterest.activity.create.RepinActivity;
import kh2.u2;
import lh0.n1;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class k extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91692a = false;

    public k() {
        addOnContextAvailableListener(new vo.f(this, 5));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f91692a) {
            return;
        }
        this.f91692a = true;
        RepinActivity repinActivity = (RepinActivity) this;
        s8 s8Var = (s8) ((u) generatedComponent());
        oa oaVar = s8Var.f114255d;
        repinActivity.dauManager = (tx.d) oaVar.Vc.get();
        repinActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        repinActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        repinActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        repinActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        repinActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        repinActivity.analyticsApi = (vy.m) oaVar.M1.get();
        repinActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        repinActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        repinActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        repinActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        repinActivity.hairballExperiments = (n1) oaVar.E0.get();
        repinActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        repinActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        repinActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        repinActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        repinActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        repinActivity.dialogContainerFactory = oa.I0(oaVar);
        repinActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        repinActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        repinActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        repinActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        repinActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        repinActivity.adFormats = bf2.b.a(oaVar.P6);
        u2.E0(repinActivity, s8Var.f114294f9);
        u2.F0(repinActivity, new vo.u(oaVar.e3(), 4));
    }
}
