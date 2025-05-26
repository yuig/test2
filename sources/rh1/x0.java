package rh1;

import com.pinterest.feature.unifiedcomments.view.CommentActivity;
import so.oa;
import so.s8;

/* loaded from: classes2.dex */
public abstract class x0 extends cp1.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f108329a = false;

    public x0() {
        addOnContextAvailableListener(new vo.f(this, 13));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f108329a) {
            return;
        }
        this.f108329a = true;
        CommentActivity commentActivity = (CommentActivity) this;
        s8 s8Var = (s8) ((o) generatedComponent());
        oa oaVar = s8Var.f114255d;
        commentActivity.dauManager = (tx.d) oaVar.Vc.get();
        commentActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        commentActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        commentActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        commentActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        commentActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        commentActivity.analyticsApi = (vy.m) oaVar.M1.get();
        commentActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        commentActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        commentActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        commentActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        commentActivity.hairballExperiments = (lh0.n1) oaVar.E0.get();
        commentActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        commentActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        commentActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        commentActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        commentActivity.pinalyticsFactory = (nx.f0) oaVar.f113747j2.get();
        commentActivity.dialogContainerFactory = oa.I0(oaVar);
        commentActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        commentActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        commentActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        commentActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        commentActivity.networkPinalytics = (nx.z) oaVar.f114043zf.get();
        commentActivity.adFormats = bf2.b.a(oaVar.P6);
        kh2.j.e2(commentActivity, new n(oaVar.e3()));
        kh2.j.X1(commentActivity, s8Var.v6());
    }
}
