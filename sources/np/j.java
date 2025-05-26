package np;

import com.pinterest.activity.create.PinItActivity;
import kh2.b0;
import lh0.g1;
import lh0.n1;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class j extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91691a = false;

    public j() {
        addOnContextAvailableListener(new vo.f(this, 4));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f91691a) {
            return;
        }
        this.f91691a = true;
        PinItActivity pinItActivity = (PinItActivity) this;
        s8 s8Var = (s8) ((s) generatedComponent());
        oa oaVar = s8Var.f114255d;
        pinItActivity.dauManager = (tx.d) oaVar.Vc.get();
        pinItActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        pinItActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        pinItActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        pinItActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        pinItActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        pinItActivity.analyticsApi = (vy.m) oaVar.M1.get();
        pinItActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        pinItActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        pinItActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        pinItActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        pinItActivity.hairballExperiments = (n1) oaVar.E0.get();
        pinItActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        pinItActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        pinItActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        pinItActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        pinItActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        pinItActivity.dialogContainerFactory = oa.I0(oaVar);
        pinItActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        pinItActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        pinItActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        pinItActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        pinItActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        pinItActivity.adFormats = bf2.b.a(oaVar.P6);
        b0.M0(pinItActivity, (g1) oaVar.D0.get());
        b0.q1(pinItActivity, (i92.k) oaVar.f113921t1.get());
        b0.J0(pinItActivity, (tb0.h) oaVar.f113797m0.get());
        b0.F0(pinItActivity, (lu1.b) oaVar.f113961v5.get());
        b0.k1(pinItActivity, s8Var.f114367k8);
        b0.N0(pinItActivity, s8Var.f114564xc);
        b0.a1(pinItActivity, oaVar.F3);
        b0.o1(pinItActivity, new vo.u(oaVar.e3(), 2));
    }
}
