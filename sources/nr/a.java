package nr;

import com.pinterest.activity.user.UserSetImageActivity;
import kh2.j1;
import lh0.n1;
import m60.w;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;
import x02.x2;

/* loaded from: classes.dex */
public abstract class a extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91833a = false;

    public a() {
        addOnContextAvailableListener(new vo.f(this, 8));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f91833a) {
            return;
        }
        this.f91833a = true;
        UserSetImageActivity userSetImageActivity = (UserSetImageActivity) this;
        s8 s8Var = (s8) ((o) generatedComponent());
        oa oaVar = s8Var.f114255d;
        userSetImageActivity.dauManager = (tx.d) oaVar.Vc.get();
        userSetImageActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        userSetImageActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        userSetImageActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        userSetImageActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        userSetImageActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        userSetImageActivity.analyticsApi = (vy.m) oaVar.M1.get();
        userSetImageActivity.eventManager = (w) oaVar.f113885r0.get();
        userSetImageActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        userSetImageActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        userSetImageActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        userSetImageActivity.hairballExperiments = (n1) oaVar.E0.get();
        userSetImageActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        userSetImageActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        userSetImageActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        userSetImageActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        userSetImageActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        userSetImageActivity.dialogContainerFactory = oa.I0(oaVar);
        userSetImageActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        userSetImageActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        userSetImageActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        userSetImageActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        userSetImageActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        userSetImageActivity.adFormats = bf2.b.a(oaVar.P6);
        j1.U0(userSetImageActivity, (i92.k) oaVar.f113921t1.get());
        j1.G0(userSetImageActivity, (e12.e) oaVar.X3.get());
        j1.X0(userSetImageActivity, (x2) oaVar.f113800m3.get());
        j1.T0(userSetImageActivity, new p(oaVar.e3()));
    }
}
