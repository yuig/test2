package vo;

import com.pinterest.activity.SendShareActivity;
import lh0.n1;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class h extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f126365a = false;

    public h() {
        addOnContextAvailableListener(new f(this, 2));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f126365a) {
            return;
        }
        this.f126365a = true;
        SendShareActivity sendShareActivity = (SendShareActivity) this;
        s8 s8Var = (s8) ((v) generatedComponent());
        oa oaVar = s8Var.f114255d;
        sendShareActivity.dauManager = (tx.d) oaVar.Vc.get();
        sendShareActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        sendShareActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        sendShareActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        sendShareActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        sendShareActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        sendShareActivity.analyticsApi = (vy.m) oaVar.M1.get();
        sendShareActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        sendShareActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        sendShareActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        sendShareActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        sendShareActivity.hairballExperiments = (n1) oaVar.E0.get();
        sendShareActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        sendShareActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        sendShareActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        sendShareActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        sendShareActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        sendShareActivity.dialogContainerFactory = oa.I0(oaVar);
        sendShareActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        sendShareActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        sendShareActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        sendShareActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        sendShareActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        sendShareActivity.adFormats = bf2.b.a(oaVar.P6);
        dn.c.d0(sendShareActivity);
        dn.c.Z(sendShareActivity, new u(oaVar.e3(), 0));
        dn.c.X(sendShareActivity, s8Var.D6());
    }
}
