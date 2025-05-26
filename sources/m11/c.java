package m11;

import bz.i;
import com.pinterest.feature.pin.creation.CreationActivity;
import cp1.p;
import dl1.t;
import ku1.j;
import lh0.n1;
import m60.e;
import m60.w;
import nx.f0;
import nx.z;
import so.oa;
import so.s8;
import tb0.h;
import tx.d;
import vo.f;
import vo.u;
import vy.m;

/* loaded from: classes.dex */
public abstract class c extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f85662a = false;

    public c() {
        addOnContextAvailableListener(new f(this, 12));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f85662a) {
            return;
        }
        this.f85662a = true;
        CreationActivity creationActivity = (CreationActivity) this;
        s8 s8Var = (s8) ((b) generatedComponent());
        oa oaVar = s8Var.f114255d;
        creationActivity.dauManager = (d) oaVar.Vc.get();
        creationActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        creationActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        creationActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        creationActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        creationActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        creationActivity.analyticsApi = (m) oaVar.M1.get();
        creationActivity.eventManager = (w) oaVar.f113885r0.get();
        creationActivity.navigationManager = (j) s8Var.f114402n.get();
        creationActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        creationActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        creationActivity.hairballExperiments = (n1) oaVar.E0.get();
        creationActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        creationActivity.applicationInfoProvider = (e) oaVar.f113920t0.get();
        creationActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        creationActivity.baseCrashReporting = (h) oaVar.f113797m0.get();
        creationActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        creationActivity.dialogContainerFactory = oa.I0(oaVar);
        creationActivity.timeSpentLoggingManager = (i) oaVar.C9.get();
        creationActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        creationActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        creationActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        creationActivity.networkPinalytics = (z) oaVar.f114043zf.get();
        creationActivity.adFormats = bf2.b.a(oaVar.P6);
        pp2.a.D(creationActivity, (lu1.d) oaVar.f113782l2.get());
        pp2.a.O(creationActivity, (h) oaVar.f113797m0.get());
        pp2.a.a0(creationActivity, (t) oaVar.Y7.get());
        pp2.a.Z(creationActivity, (ag1.b) oaVar.Z7.get());
        pp2.a.b0(creationActivity, (ag1.h) oaVar.K8.get());
        pp2.a.W(creationActivity, (zp.j) s8Var.U2.get());
        pp2.a.Y(creationActivity, (kf1.b) oaVar.Oc.get());
        pp2.a.z0(creationActivity, new u(oaVar.e3(), 7));
        pp2.a.w0(creationActivity, s8Var.v6());
    }
}
