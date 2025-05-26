package pw0;

import com.pinterest.feature.mediagallery.MediaGalleryActivity;
import kh2.g3;
import lh0.n1;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class b extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f101495a = false;

    public b() {
        addOnContextAvailableListener(new vo.f(this, 11));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f101495a) {
            return;
        }
        this.f101495a = true;
        MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this;
        s8 s8Var = (s8) ((h) generatedComponent());
        oa oaVar = s8Var.f114255d;
        mediaGalleryActivity.dauManager = (tx.d) oaVar.Vc.get();
        mediaGalleryActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        mediaGalleryActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        mediaGalleryActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        mediaGalleryActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        mediaGalleryActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        mediaGalleryActivity.analyticsApi = (vy.m) oaVar.M1.get();
        mediaGalleryActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        mediaGalleryActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        mediaGalleryActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        mediaGalleryActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        mediaGalleryActivity.hairballExperiments = (n1) oaVar.E0.get();
        mediaGalleryActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        mediaGalleryActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        mediaGalleryActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        mediaGalleryActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        mediaGalleryActivity.pinalyticsFactory = (nx.f0) oaVar.f113747j2.get();
        mediaGalleryActivity.dialogContainerFactory = oa.I0(oaVar);
        mediaGalleryActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        mediaGalleryActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        mediaGalleryActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        mediaGalleryActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        mediaGalleryActivity.networkPinalytics = (nx.z) oaVar.f114043zf.get();
        mediaGalleryActivity.adFormats = bf2.b.a(oaVar.P6);
        g3.g1(mediaGalleryActivity, s8Var.L6);
        g3.x0(mediaGalleryActivity, (lu1.d) oaVar.f113782l2.get());
        g3.V1(mediaGalleryActivity, new vo.u(oaVar.e3(), 6));
    }
}
