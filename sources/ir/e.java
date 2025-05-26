package ir;

import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.typeahead.TypeaheadCacheWorkerSchedulerImpl;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import lh0.z0;
import nx.f0;
import so.f4;
import so.g4;
import so.j4;
import so.k4;
import so.oa;
import so.s8;

/* loaded from: classes.dex */
public abstract class e extends wo.b {

    /* renamed from: g, reason: collision with root package name */
    public boolean f73455g = false;

    public e() {
        addOnContextAvailableListener(new androidx.appcompat.app.m(this, 3));
    }

    @Override // cp1.q
    public final void inject() {
        if (this.f73455g) {
            return;
        }
        this.f73455g = true;
        MainActivity mainActivity = (MainActivity) this;
        s8 s8Var = (s8) ((z) generatedComponent());
        oa oaVar = s8Var.f114255d;
        mainActivity.dauManager = (tx.d) oaVar.Vc.get();
        mainActivity.dauWindowCallbackFactory = (tx.f) s8Var.f114344j.get();
        mainActivity.baseActivityHelperInternal = bf2.b.a(oaVar.f113961v5);
        mainActivity.chromeSettings = bf2.b.a(oaVar.f113764k2);
        mainActivity.inAppBrowserSettings = bf2.b.a(oaVar.Wc);
        mainActivity.fragmentFactory = (il1.a) s8Var.f114581z.get();
        mainActivity.analyticsApi = (vy.m) oaVar.M1.get();
        mainActivity.eventManager = (m60.w) oaVar.f113885r0.get();
        mainActivity.navigationManager = (ku1.j) s8Var.f114402n.get();
        mainActivity.shakeModalNavigation = bf2.b.a(s8Var.f114417o);
        mainActivity.activeUserManager = (b60.b) oaVar.f113850p0.get();
        mainActivity.hairballExperiments = (n1) oaVar.E0.get();
        mainActivity.contextLogViewHelper = bf2.b.a(oaVar.f113636cf);
        mainActivity.applicationInfoProvider = (m60.e) oaVar.f113920t0.get();
        mainActivity.lazyUnauthAnalyticsApi = bf2.b.a(oaVar.M1);
        mainActivity.baseCrashReporting = (tb0.h) oaVar.f113797m0.get();
        mainActivity.pinalyticsFactory = (f0) oaVar.f113747j2.get();
        mainActivity.dialogContainerFactory = oa.I0(oaVar);
        mainActivity.timeSpentLoggingManager = (bz.i) oaVar.C9.get();
        mainActivity.pinAuxHelper = bf2.b.a(oaVar.R8);
        mainActivity.offPinterestTimeSpentManager = bf2.b.a(oaVar.Xc);
        mainActivity.imageCache = bf2.b.a(oaVar.f113875q7);
        mainActivity.networkPinalytics = (nx.z) oaVar.f114043zf.get();
        mainActivity.adFormats = bf2.b.a(oaVar.P6);
        mainActivity.f130615f = new lh0.b((z0) s8Var.f114255d.D0.get());
        mainActivity.f35213z = x92.c.f134368a;
        m60.w eventManager = (m60.w) oaVar.f113885r0.get();
        rg0.s experiences = (rg0.s) oaVar.Q5.get();
        tb0.h crashReporting = (tb0.h) oaVar.f113797m0.get();
        lu1.b baseActivityHelper = (lu1.b) oaVar.f113961v5.get();
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        e3.a aVar = new e3.a();
        aVar.f56996b = eventManager;
        aVar.f56997c = experiences;
        aVar.f56998d = crashReporting;
        aVar.f56999e = baseActivityHelper;
        mainActivity.A = aVar;
        mainActivity.B = (lh0.o) oaVar.f113769k7.get();
        mainActivity.C = s8Var.Hc;
        mainActivity.D = bf2.b.a(oaVar.U3);
        bf2.b.a(s8Var.I0);
        mainActivity.E = bf2.b.a(oaVar.f113752j7);
        mainActivity.F = bf2.b.a(s8Var.f114387m);
        mainActivity.H = bf2.b.a(oaVar.Y4);
        mainActivity.K = bf2.b.a(oaVar.f114011y1);
        mainActivity.L = bf2.b.a(oaVar.F3);
        mainActivity.M = bf2.b.a(oaVar.f113635ce);
        mainActivity.N = bf2.b.a(oaVar.f113670ee);
        bf2.b.a(oaVar.Ce);
        mainActivity.O = bf2.b.a(oaVar.f113921t1);
        mainActivity.P = (lu1.b) oaVar.f113961v5.get();
        mainActivity.Q = (rg0.s) oaVar.Q5.get();
        mainActivity.R = (r70.f) oaVar.Ac.get();
        mainActivity.S = s8Var.Ic;
        mainActivity.T = oaVar.E9;
        mainActivity.U = (ac2.m) oaVar.C7.get();
        mainActivity.V = bf2.b.a(oaVar.Me);
        mainActivity.W = oaVar.f113828nd;
        mainActivity.X = (m60.r) oaVar.Df.get();
        mainActivity.Y = (gp1.l) oaVar.L7.get();
        mainActivity.Z = bf2.b.a(oaVar.f113730i2);
        mainActivity.f35170a0 = s8Var.Jc;
        mainActivity.f35171b0 = bf2.b.a(oaVar.f113797m0);
        mainActivity.f35172c0 = bf2.b.a(oaVar.Y5);
        mainActivity.f35173d0 = s8Var.A5();
        mainActivity.f35174e0 = (TypeaheadCacheWorkerSchedulerImpl) s8Var.Kc.get();
        mainActivity.f35175f0 = (ew.m) oaVar.Lf.get();
        mainActivity.f35176g0 = bf2.b.a(oaVar.f113880qc);
        mainActivity.f35178h0 = (ik1.g) oaVar.Pd.get();
        mainActivity.f35180i0 = bf2.b.a(oaVar.Y8);
        mainActivity.f35182j0 = (f4) s8Var.Lc.get();
        mainActivity.f35184k0 = bf2.b.a(oaVar.Y6);
        mainActivity.f35186l0 = bf2.b.a(oaVar.f113681f7);
        mainActivity.f35188m0 = bf2.b.a(oaVar.f113875q7);
        mainActivity.f35190n0 = (g4) s8Var.Pc.get();
        mainActivity.f35192o0 = new vo.r(oaVar.e3(), 1);
        mainActivity.f35194p0 = bf2.b.a(oaVar.f114010y0);
        mainActivity.f35196q0 = (j4) s8Var.Rc.get();
        mainActivity.f35198r0 = bf2.b.a(oaVar.f113780l0);
        mainActivity.B0 = (k4) s8Var.Sc.get();
        mainActivity.C0 = (lb0.q) oaVar.O0.get();
        mainActivity.D0 = (vo.x) s8Var.Tc.get();
        mainActivity.E0 = bf2.b.a(oaVar.f113742ie);
        mainActivity.F0 = oaVar.X2();
        mainActivity.G0 = s8Var.v6();
    }
}
