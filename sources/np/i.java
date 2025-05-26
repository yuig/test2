package np;

import com.pinterest.activity.create.CameraActivity;
import lh0.n1;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class i extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91690a = false;

    public i() {
        addOnContextAvailableListener(new vo.f(this, 3));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f91690a) {
            return;
        }
        this.f91690a = true;
        CameraActivity cameraActivity = (CameraActivity) this;
        s8 s8Var = (s8) ((h) generatedComponent());
        oa oaVar = s8Var.f114255d;
        cameraActivity.dauManager = (tx.d) oaVar.Vc.get();
        cameraActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        cameraActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        cameraActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        cameraActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        cameraActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        cameraActivity.analyticsApi = (vy.m) oaVar.M1.get();
        cameraActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        cameraActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        cameraActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        cameraActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        cameraActivity.hairballExperiments = (n1) oaVar.E0.get();
        cameraActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        cameraActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        cameraActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        cameraActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        cameraActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        cameraActivity.dialogContainerFactory = oa.I0(oaVar);
        cameraActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        cameraActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        cameraActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        cameraActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        cameraActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        cameraActivity.adFormats = bf2.b.a(oaVar.P6);
        kotlin.jvm.internal.r.Y(cameraActivity, new vo.u(oaVar.e3(), 1));
        kotlin.jvm.internal.r.X(cameraActivity, (lb0.q) oaVar.O0.get());
    }
}
