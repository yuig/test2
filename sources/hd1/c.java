package hd1;

import a.cb;
import com.pinterest.feature.pin.j;
import d7.g;
import g70.h;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.f4;
import m60.g0;
import m60.w;
import nr0.k;
import nx.b0;
import nx.f0;
import nx.o0;
import oa2.p;
import so.c6;
import uj2.q;
import wa2.i;
import x02.x0;
import x02.x2;
import yk1.v;
import z32.f2;

/* loaded from: classes5.dex */
public final class c {
    public final xr.a A;
    public final ro1.c B;
    public final ni1.d C;
    public final c6 D;
    public final f4 E;
    public final f0 F;
    public final r G;
    public final b0 H;
    public final ur.a I;

    /* renamed from: J, reason: collision with root package name */
    public final h f68883J;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f68884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68885b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f68886c;

    /* renamed from: d, reason: collision with root package name */
    public final q f68887d;

    /* renamed from: e, reason: collision with root package name */
    public final k f68888e;

    /* renamed from: f, reason: collision with root package name */
    public final v f68889f;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f68890g;

    /* renamed from: h, reason: collision with root package name */
    public final ps.a f68891h;

    /* renamed from: i, reason: collision with root package name */
    public final k81.k f68892i;

    /* renamed from: j, reason: collision with root package name */
    public final x2 f68893j;

    /* renamed from: k, reason: collision with root package name */
    public final b60.b f68894k;

    /* renamed from: l, reason: collision with root package name */
    public final w f68895l;

    /* renamed from: m, reason: collision with root package name */
    public final Function1 f68896m;

    /* renamed from: n, reason: collision with root package name */
    public final Function2 f68897n;

    /* renamed from: o, reason: collision with root package name */
    public final jd1.h f68898o;

    /* renamed from: p, reason: collision with root package name */
    public final String f68899p;

    /* renamed from: q, reason: collision with root package name */
    public final String f68900q;

    /* renamed from: r, reason: collision with root package name */
    public final i f68901r;

    /* renamed from: s, reason: collision with root package name */
    public final e02.a f68902s;

    /* renamed from: t, reason: collision with root package name */
    public final f2 f68903t;

    /* renamed from: u, reason: collision with root package name */
    public final o0 f68904u;

    /* renamed from: v, reason: collision with root package name */
    public final a11.d f68905v;

    /* renamed from: w, reason: collision with root package name */
    public final j f68906w;

    /* renamed from: x, reason: collision with root package name */
    public final x0 f68907x;

    /* renamed from: y, reason: collision with root package name */
    public final bc2.e f68908y;

    /* renamed from: z, reason: collision with root package name */
    public final p f68909z;

    public c(HashMap apiParamMap, String apiEndpoint, uk1.d presenterPinalytics, q networkStateStream, k viewBinderDelegate, v viewResources, g0 pageSizeProvider, ps.a adEventHandler, k81.k kVar, x2 userRepository, b60.b activeUserManager, w eventManager, id1.e merchantListener, gv0.b bubbleViewListener, jd1.h userFeedRepViewConfig, String str, String str2, i pinFeatureConfig, e02.a aVar, f2 quickSaveIcon, o0 pinalyticsManager, j jVar, x0 x0Var, bc2.e mp4TrackSelector, p legoUserRepPresenterFactory, xr.a attributionReporting, ro1.c deepLinkAdUtil, ni1.d deepLinkHelper, c6 pinImpressionLoggerFactory, f4 f4Var, f0 f0Var, r rVar, b0 pinAuxHelper, ur.a adsCoreDependencies, h boardNavigator) {
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(adEventHandler, "adEventHandler");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(merchantListener, "merchantListener");
        Intrinsics.checkNotNullParameter(bubbleViewListener, "bubbleViewListener");
        Intrinsics.checkNotNullParameter(userFeedRepViewConfig, "userFeedRepViewConfig");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(quickSaveIcon, "quickSaveIcon");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        Intrinsics.checkNotNullParameter(pinImpressionLoggerFactory, "pinImpressionLoggerFactory");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f68884a = apiParamMap;
        this.f68885b = apiEndpoint;
        this.f68886c = presenterPinalytics;
        this.f68887d = networkStateStream;
        this.f68888e = viewBinderDelegate;
        this.f68889f = viewResources;
        this.f68890g = pageSizeProvider;
        this.f68891h = adEventHandler;
        this.f68892i = kVar;
        this.f68893j = userRepository;
        this.f68894k = activeUserManager;
        this.f68895l = eventManager;
        this.f68896m = merchantListener;
        this.f68897n = bubbleViewListener;
        this.f68898o = userFeedRepViewConfig;
        this.f68899p = str;
        this.f68900q = str2;
        this.f68901r = pinFeatureConfig;
        this.f68902s = aVar;
        this.f68903t = quickSaveIcon;
        this.f68904u = pinalyticsManager;
        this.f68905v = null;
        this.f68906w = jVar;
        this.f68907x = x0Var;
        this.f68908y = mp4TrackSelector;
        this.f68909z = legoUserRepPresenterFactory;
        this.A = attributionReporting;
        this.B = deepLinkAdUtil;
        this.C = deepLinkHelper;
        this.D = pinImpressionLoggerFactory;
        this.E = f4Var;
        this.F = f0Var;
        this.G = rVar;
        this.H = pinAuxHelper;
        this.I = adsCoreDependencies;
        this.f68883J = boardNavigator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f68884a, cVar.f68884a) && Intrinsics.d(this.f68885b, cVar.f68885b) && Intrinsics.d(this.f68886c, cVar.f68886c) && Intrinsics.d(this.f68887d, cVar.f68887d) && Intrinsics.d(this.f68888e, cVar.f68888e) && Intrinsics.d(this.f68889f, cVar.f68889f) && Intrinsics.d(this.f68890g, cVar.f68890g) && Intrinsics.d(this.f68891h, cVar.f68891h) && Intrinsics.d(this.f68892i, cVar.f68892i) && Intrinsics.d(this.f68893j, cVar.f68893j) && Intrinsics.d(this.f68894k, cVar.f68894k) && Intrinsics.d(this.f68895l, cVar.f68895l) && Intrinsics.d(this.f68896m, cVar.f68896m) && Intrinsics.d(this.f68897n, cVar.f68897n) && Intrinsics.d(this.f68898o, cVar.f68898o) && Intrinsics.d(this.f68899p, cVar.f68899p) && Intrinsics.d(this.f68900q, cVar.f68900q) && Intrinsics.d(this.f68901r, cVar.f68901r) && Intrinsics.d(this.f68902s, cVar.f68902s) && this.f68903t == cVar.f68903t && Intrinsics.d(this.f68904u, cVar.f68904u) && Intrinsics.d(this.f68905v, cVar.f68905v) && Intrinsics.d(this.f68906w, cVar.f68906w) && Intrinsics.d(this.f68907x, cVar.f68907x) && Intrinsics.d(this.f68908y, cVar.f68908y) && Intrinsics.d(this.f68909z, cVar.f68909z) && Intrinsics.d(this.A, cVar.A) && Intrinsics.d(this.B, cVar.B) && Intrinsics.d(this.C, cVar.C) && Intrinsics.d(this.D, cVar.D) && Intrinsics.d(this.E, cVar.E) && Intrinsics.d(this.F, cVar.F) && Intrinsics.d(this.G, cVar.G) && Intrinsics.d(this.H, cVar.H) && Intrinsics.d(this.I, cVar.I) && Intrinsics.d(this.f68883J, cVar.f68883J);
    }

    public final int hashCode() {
        int hashCode = (this.f68891h.hashCode() + ((this.f68890g.hashCode() + ((this.f68889f.hashCode() + ((this.f68888e.hashCode() + ((this.f68887d.hashCode() + ((this.f68886c.hashCode() + cb.d(this.f68885b, this.f68884a.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        k81.k kVar = this.f68892i;
        int hashCode2 = (this.f68898o.hashCode() + ((this.f68897n.hashCode() + g.c(this.f68896m, (this.f68895l.hashCode() + ((this.f68894k.hashCode() + ((this.f68893j.hashCode() + ((hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        String str = this.f68899p;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68900q;
        int hashCode4 = (this.f68901r.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        e02.a aVar = this.f68902s;
        int hashCode5 = (this.f68904u.hashCode() + ((this.f68903t.hashCode() + ((hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31;
        a11.d dVar = this.f68905v;
        int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        j jVar = this.f68906w;
        int hashCode7 = (hashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        x0 x0Var = this.f68907x;
        int hashCode8 = (this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f68909z.hashCode() + ((this.f68908y.hashCode() + ((hashCode7 + (x0Var == null ? 0 : x0Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        f4 f4Var = this.E;
        int hashCode9 = (hashCode8 + (f4Var == null ? 0 : f4Var.hashCode())) * 31;
        f0 f0Var = this.F;
        int hashCode10 = (hashCode9 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        r rVar = this.G;
        return this.f68883J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((hashCode10 + (rVar != null ? rVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BaseShoppingFeedPagedListParams(apiParamMap=" + this.f68884a + ", apiEndpoint=" + this.f68885b + ", presenterPinalytics=" + this.f68886c + ", networkStateStream=" + this.f68887d + ", viewBinderDelegate=" + this.f68888e + ", viewResources=" + this.f68889f + ", pageSizeProvider=" + this.f68890g + ", adEventHandler=" + this.f68891h + ", remoteRequestListener=" + this.f68892i + ", userRepository=" + this.f68893j + ", activeUserManager=" + this.f68894k + ", eventManager=" + this.f68895l + ", merchantListener=" + this.f68896m + ", bubbleViewListener=" + this.f68897n + ", userFeedRepViewConfig=" + this.f68898o + ", apiFields=" + this.f68899p + ", consumerType=" + this.f68900q + ", pinFeatureConfig=" + this.f68901r + ", boardRouter=" + this.f68902s + ", quickSaveIcon=" + this.f68903t + ", pinalyticsManager=" + this.f68904u + ", clickThroughHelperFactory=" + this.f68905v + ", pinAction=" + this.f68906w + ", boardRepository=" + this.f68907x + ", mp4TrackSelector=" + this.f68908y + ", legoUserRepPresenterFactory=" + this.f68909z + ", attributionReporting=" + this.A + ", deepLinkAdUtil=" + this.B + ", deepLinkHelper=" + this.C + ", pinImpressionLoggerFactory=" + this.D + ", structuredFeedExperiments=" + this.E + ", pinalyticsFactory=" + this.F + ", prefsManagerUser=" + this.G + ", pinAuxHelper=" + this.H + ", adsCoreDependencies=" + this.I + ", boardNavigator=" + this.f68883J + ")";
    }
}
