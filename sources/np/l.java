package np;

import com.pinterest.activity.create.ScrapedImagesResultsActivity;
import kh2.j1;
import lh0.n1;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class l extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91693a = false;

    public l() {
        addOnContextAvailableListener(new vo.f(this, 6));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f91693a) {
            return;
        }
        this.f91693a = true;
        ScrapedImagesResultsActivity scrapedImagesResultsActivity = (ScrapedImagesResultsActivity) this;
        s8 s8Var = (s8) ((x) generatedComponent());
        oa oaVar = s8Var.f114255d;
        scrapedImagesResultsActivity.dauManager = (tx.d) oaVar.Vc.get();
        scrapedImagesResultsActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        scrapedImagesResultsActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        scrapedImagesResultsActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        scrapedImagesResultsActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        scrapedImagesResultsActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        scrapedImagesResultsActivity.analyticsApi = (vy.m) oaVar.M1.get();
        scrapedImagesResultsActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        scrapedImagesResultsActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        scrapedImagesResultsActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        scrapedImagesResultsActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        scrapedImagesResultsActivity.hairballExperiments = (n1) oaVar.E0.get();
        scrapedImagesResultsActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        scrapedImagesResultsActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        scrapedImagesResultsActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        scrapedImagesResultsActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        scrapedImagesResultsActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        scrapedImagesResultsActivity.dialogContainerFactory = oa.I0(oaVar);
        scrapedImagesResultsActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        scrapedImagesResultsActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        scrapedImagesResultsActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        scrapedImagesResultsActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        scrapedImagesResultsActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        scrapedImagesResultsActivity.adFormats = bf2.b.a(oaVar.P6);
        j1.O0(scrapedImagesResultsActivity, s8Var.f114367k8);
        j1.S0(scrapedImagesResultsActivity, new vo.u(oaVar.e3(), 3));
    }
}
