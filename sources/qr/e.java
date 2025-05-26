package qr;

import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.s40;
import dl1.t;
import is1.k0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.t0;
import lh0.z0;
import lh0.z3;
import m60.f0;
import m60.g0;
import m60.w;
import nx.d0;
import okhttp3.OkHttpClient;
import pd.s;
import rr.a1;
import rr.b0;
import rr.b1;
import rr.d1;
import rr.e0;
import rr.e1;
import rr.e2;
import rr.f1;
import rr.f2;
import rr.g2;
import rr.h0;
import rr.h1;
import rr.h2;
import rr.i0;
import rr.i1;
import rr.i2;
import rr.j0;
import rr.j1;
import rr.j2;
import rr.k1;
import rr.k2;
import rr.l0;
import rr.l1;
import rr.l2;
import rr.m0;
import rr.m1;
import rr.m2;
import rr.n;
import rr.n1;
import rr.n2;
import rr.o0;
import rr.o1;
import rr.o2;
import rr.p;
import rr.p0;
import rr.p1;
import rr.p2;
import rr.q0;
import rr.q2;
import rr.r;
import rr.s2;
import rr.t2;
import rr.u;
import rr.u0;
import rr.v;
import rr.v0;
import rr.w0;
import rr.x;
import rr.y;
import rr.y0;
import rr.z;
import so.na;
import so.oa;
import so.r8;
import so.x4;
import x02.x0;

/* loaded from: classes.dex */
public final class e {
    public final ContextWrapper A;
    public final np1.j B;
    public final z82.b C;
    public final hf0.c D;
    public final rd.j E;
    public final gv1.f F;
    public final g70.h G;
    public final j10.g H;
    public s I;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f104904a;

    /* renamed from: b, reason: collision with root package name */
    public final i92.k f104905b;

    /* renamed from: c, reason: collision with root package name */
    public final gw f104906c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f104907d;

    /* renamed from: e, reason: collision with root package name */
    public final w f104908e;

    /* renamed from: f, reason: collision with root package name */
    public final b30.a f104909f;

    /* renamed from: g, reason: collision with root package name */
    public final j12.k f104910g;

    /* renamed from: h, reason: collision with root package name */
    public final c91.e f104911h;

    /* renamed from: i, reason: collision with root package name */
    public final lu1.d f104912i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f104913j;

    /* renamed from: k, reason: collision with root package name */
    public final OkHttpClient f104914k;

    /* renamed from: l, reason: collision with root package name */
    public final x10.b f104915l;

    /* renamed from: m, reason: collision with root package name */
    public final uo.a f104916m;

    /* renamed from: n, reason: collision with root package name */
    public final lb2.d f104917n;

    /* renamed from: o, reason: collision with root package name */
    public final h12.a f104918o;

    /* renamed from: p, reason: collision with root package name */
    public final u12.e f104919p;

    /* renamed from: q, reason: collision with root package name */
    public final g0 f104920q;

    /* renamed from: r, reason: collision with root package name */
    public final k0 f104921r;

    /* renamed from: s, reason: collision with root package name */
    public final f0 f104922s;

    /* renamed from: t, reason: collision with root package name */
    public final ag1.b f104923t;

    /* renamed from: u, reason: collision with root package name */
    public final t f104924u;

    /* renamed from: v, reason: collision with root package name */
    public final wk2.a f104925v;

    /* renamed from: w, reason: collision with root package name */
    public final e30.a f104926w;

    /* renamed from: x, reason: collision with root package name */
    public final k22.m f104927x;

    /* renamed from: y, reason: collision with root package name */
    public final b60.b f104928y;

    /* renamed from: z, reason: collision with root package name */
    public final x4 f104929z;

    public e(x0 boardRepository, i92.k toastUtils, gw modelHelper, t0 experiments, w eventManager, b30.a expandUrlRemoteRequest, j12.k boardSectionService, c91.e onDemandModuleControllerFactory, lu1.d activityIntentFactory, d0 pinalytics, OkHttpClient okHttpClient, x10.b pinApiService, s40 pinModelMerger, uo.a graphQLEmailDataSource, lb2.d accountManager, h12.a boardInviteApi, u12.e interestService, g0 pageSizeProvider, d12.i repositoryBatcher, se2.a lazyPinRepository, k0 webViewManager, f0 devUtils, ag1.b ideaPinComposeDataManager, t ideaPinLocalDataRepository, na ideaPinWorkUtilsProvider, e30.a yearInPreviewService, k22.m userService, b60.b activeUserManager, x4 deeplinkPinHelperFactory, ContextWrapper contextWrapper, np1.j handshakeManager, z82.b targetHandshakeManager, hf0.c deviceInfoProvider, rd.j emailLinkSignatureVerifier, gv1.f notificationsExperimentHelper, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(expandUrlRemoteRequest, "expandUrlRemoteRequest");
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        Intrinsics.checkNotNullParameter(onDemandModuleControllerFactory, "onDemandModuleControllerFactory");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(pinModelMerger, "pinModelMerger");
        Intrinsics.checkNotNullParameter(graphQLEmailDataSource, "graphQLEmailDataSource");
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(interestService, "interestService");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        Intrinsics.checkNotNullParameter(lazyPinRepository, "lazyPinRepository");
        Intrinsics.checkNotNullParameter(webViewManager, "webViewManager");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(ideaPinLocalDataRepository, "ideaPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(ideaPinWorkUtilsProvider, "ideaPinWorkUtilsProvider");
        Intrinsics.checkNotNullParameter(yearInPreviewService, "yearInPreviewService");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(deeplinkPinHelperFactory, "deeplinkPinHelperFactory");
        Intrinsics.checkNotNullParameter(contextWrapper, "contextWrapper");
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(targetHandshakeManager, "targetHandshakeManager");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(emailLinkSignatureVerifier, "emailLinkSignatureVerifier");
        Intrinsics.checkNotNullParameter(notificationsExperimentHelper, "notificationsExperimentHelper");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f104904a = boardRepository;
        this.f104905b = toastUtils;
        this.f104906c = modelHelper;
        this.f104907d = experiments;
        this.f104908e = eventManager;
        this.f104909f = expandUrlRemoteRequest;
        this.f104910g = boardSectionService;
        this.f104911h = onDemandModuleControllerFactory;
        this.f104912i = activityIntentFactory;
        this.f104913j = pinalytics;
        this.f104914k = okHttpClient;
        this.f104915l = pinApiService;
        this.f104916m = graphQLEmailDataSource;
        this.f104917n = accountManager;
        this.f104918o = boardInviteApi;
        this.f104919p = interestService;
        this.f104920q = pageSizeProvider;
        this.f104921r = webViewManager;
        this.f104922s = devUtils;
        this.f104923t = ideaPinComposeDataManager;
        this.f104924u = ideaPinLocalDataRepository;
        this.f104925v = ideaPinWorkUtilsProvider;
        this.f104926w = yearInPreviewService;
        this.f104927x = userService;
        this.f104928y = activeUserManager;
        this.f104929z = deeplinkPinHelperFactory;
        this.A = contextWrapper;
        this.B = handshakeManager;
        this.C = targetHandshakeManager;
        this.D = deviceInfoProvider;
        this.E = emailLinkSignatureVerifier;
        this.F = notificationsExperimentHelper;
        this.G = boardNavigator;
        this.H = new j10.g(pinModelMerger, lazyPinRepository, repositoryBatcher);
    }

    public final ArrayList a(h webhookDeeplinkUtil, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "deeplinkUtil");
        Intrinsics.checkNotNullParameter(activity, "activity");
        ArrayList arrayList = new ArrayList();
        r8 r8Var = this.f104929z.f114702a;
        vy.m analyticsApi = (vy.m) r8Var.f114090a.M1.get();
        oa oaVar = r8Var.f114090a;
        x10.b pinApiService = (x10.b) oaVar.f113705gd.get();
        d0 pinalytics = (d0) oaVar.f113817n2.get();
        i92.k toastUtils = (i92.k) oaVar.f113921t1.get();
        s40 pinModelMerger = oa.N0(oaVar);
        d12.i repositoryBatcher = (d12.i) oaVar.N2.get();
        se2.a lazyPinRepository = bf2.b.a(oaVar.G3);
        t0 experiments = new t0((z0) r8Var.f114091b.f114255d.D0.get());
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeepLinkUtil");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(pinModelMerger, "pinModelMerger");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        Intrinsics.checkNotNullParameter(lazyPinRepository, "lazyPinRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        s sVar = new s();
        sVar.f99747a = webhookDeeplinkUtil;
        sVar.f99748b = analyticsApi;
        sVar.f99749c = pinApiService;
        sVar.f99750d = pinalytics;
        sVar.f99751e = toastUtils;
        sVar.f99752f = experiments;
        sVar.f99753g = new j10.g(pinModelMerger, lazyPinRepository, repositoryBatcher);
        this.I = sVar;
        arrayList.add(new rr.t(webhookDeeplinkUtil, this.f104922s));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        t0 experiments2 = this.f104907d;
        Intrinsics.checkNotNullParameter(experiments2, "experiments");
        arrayList.add(new rr.f(webhookDeeplinkUtil));
        arrayList.add(new l2(webhookDeeplinkUtil, this.C));
        np1.j jVar = this.B;
        arrayList.add(new l0(webhookDeeplinkUtil, experiments2, jVar));
        experiments2.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) experiments2.f83480a;
        if (g1Var.o("android_ad_handshake_a2b", "enabled", z3Var) || g1Var.l("android_ad_handshake_a2b")) {
            arrayList.add(new rr.k0(webhookDeeplinkUtil, experiments2, jVar));
        }
        arrayList.add(new rr.e(webhookDeeplinkUtil, experiments2));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.g(webhookDeeplinkUtil));
        arrayList.add(new rr.l(webhookDeeplinkUtil, this.f104918o));
        b60.b bVar = this.f104928y;
        arrayList.add(new p(webhookDeeplinkUtil, this.f104904a, this.f104906c, new qq2.c(webhookDeeplinkUtil, bVar), this.G));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new i1(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new u(webhookDeeplinkUtil));
        y yVar = new y(webhookDeeplinkUtil, 3);
        arrayList.add(new v(webhookDeeplinkUtil, yVar));
        w wVar = this.f104908e;
        d0 d0Var = this.f104913j;
        arrayList.add(new x(webhookDeeplinkUtil, wVar, d0Var));
        arrayList.add(new y(webhookDeeplinkUtil, 0));
        arrayList.add(new rr.z0(webhookDeeplinkUtil, bVar));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.g1(webhookDeeplinkUtil));
        arrayList.add(new z(webhookDeeplinkUtil, bVar, this.f104927x));
        arrayList.add(new y(webhookDeeplinkUtil, 1));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new e0(webhookDeeplinkUtil));
        OkHttpClient okHttpClient = this.f104914k;
        uo.a aVar = this.f104916m;
        arrayList.add(new rr.f0(okHttpClient, aVar, webhookDeeplinkUtil, this.E));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.g0(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new q2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new o1(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new f2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new m0(webhookDeeplinkUtil));
        arrayList.add(new o0(webhookDeeplinkUtil, new ps0.m(6), this.f104913j, this.f104923t, this.f104924u, this.f104925v, this.f104905b));
        arrayList.add(new p0(webhookDeeplinkUtil, experiments2));
        arrayList.add(new q0(webhookDeeplinkUtil, yVar, this.f104919p, this.f104920q));
        arrayList.add(new n(webhookDeeplinkUtil, this.f104904a, this.f104906c, this.G));
        arrayList.add(new v0(webhookDeeplinkUtil, this.F));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new w0(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.x0(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new t2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new n1(webhookDeeplinkUtil));
        arrayList.add(new j1(webhookDeeplinkUtil, this.f104928y, this.f104905b, activity, this.f104913j));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new y0(webhookDeeplinkUtil));
        arrayList.add(new a1(webhookDeeplinkUtil, this.f104915l, this.H, d0Var));
        arrayList.add(new b1(webhookDeeplinkUtil, d0Var));
        arrayList.add(new d1(webhookDeeplinkUtil, this.f104912i, activity));
        String string = this.A.getString(m60.x0.loading);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new f1(webhookDeeplinkUtil, this.f104909f, wVar, string));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new h1(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new i0(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new k2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new h0(webhookDeeplinkUtil));
        arrayList.add(yVar);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new u0(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new p1(webhookDeeplinkUtil));
        arrayList.add(new e2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new m2(webhookDeeplinkUtil));
        ((hf0.b) this.D).getClass();
        arrayList.add(new n2(webhookDeeplinkUtil, hf0.b.q()));
        arrayList.add(new p2(webhookDeeplinkUtil, bVar, d0Var, this.f104911h));
        s sVar2 = this.I;
        if (sVar2 == null) {
            Intrinsics.r("deepLinkPinHelper");
            throw null;
        }
        arrayList.add(new e1(webhookDeeplinkUtil, sVar2));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.b(webhookDeeplinkUtil));
        arrayList.add(new l2(webhookDeeplinkUtil, this.f104921r));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.h(webhookDeeplinkUtil));
        arrayList.add(new rr.m(webhookDeeplinkUtil, this.f104904a, this.f104906c, new qq2.c(webhookDeeplinkUtil, bVar), this.f104918o, this.G));
        j12.k kVar = this.f104910g;
        arrayList.add(new rr.s(webhookDeeplinkUtil, kVar));
        i92.k kVar2 = this.f104905b;
        arrayList.add(new r(webhookDeeplinkUtil, kVar, kVar2));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new i2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new k1(webhookDeeplinkUtil));
        arrayList.add(new rr.d(webhookDeeplinkUtil, this.f104917n));
        s sVar3 = this.I;
        if (sVar3 == null) {
            Intrinsics.r("deepLinkPinHelper");
            throw null;
        }
        arrayList.add(new s2(webhookDeeplinkUtil, this.f104926w, webhookDeeplinkUtil, sVar3, activity, this.f104908e));
        arrayList.add(new b0(webhookDeeplinkUtil, this.f104925v, d0Var, kVar2));
        arrayList.add(new j0(webhookDeeplinkUtil, bVar));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new j2(webhookDeeplinkUtil));
        arrayList.add(new o2(webhookDeeplinkUtil, aVar, bVar));
        arrayList.add(new y(webhookDeeplinkUtil, 2));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new m1(webhookDeeplinkUtil));
        arrayList.add(new rr.i(webhookDeeplinkUtil, bVar));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new h2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.w(webhookDeeplinkUtil));
        arrayList.add(new l1(webhookDeeplinkUtil, bVar));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new g2(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.a(webhookDeeplinkUtil));
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        arrayList.add(new rr.j(webhookDeeplinkUtil));
        return arrayList;
    }
}
