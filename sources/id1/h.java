package id1;

import a.cb;
import com.pinterest.feature.pin.j;
import java.util.HashMap;
import k81.k;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.f4;
import m60.g0;
import m60.w;
import nx.b0;
import nx.f0;
import nx.o0;
import so.c6;
import x02.x0;
import x02.x2;
import z32.f2;
import zd1.o;

/* loaded from: classes5.dex */
public final class h {
    public final f0 A;
    public final r B;
    public final b0 C;
    public final ur.a D;
    public final g70.h E;

    /* renamed from: a, reason: collision with root package name */
    public final wk1.c f72162a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f72163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72164c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f72165d;

    /* renamed from: e, reason: collision with root package name */
    public final ps.a f72166e;

    /* renamed from: f, reason: collision with root package name */
    public final k f72167f;

    /* renamed from: g, reason: collision with root package name */
    public final o f72168g;

    /* renamed from: h, reason: collision with root package name */
    public final String f72169h;

    /* renamed from: i, reason: collision with root package name */
    public final String f72170i;

    /* renamed from: j, reason: collision with root package name */
    public final x2 f72171j;

    /* renamed from: k, reason: collision with root package name */
    public final b60.b f72172k;

    /* renamed from: l, reason: collision with root package name */
    public final w f72173l;

    /* renamed from: m, reason: collision with root package name */
    public final jd1.h f72174m;

    /* renamed from: n, reason: collision with root package name */
    public final String f72175n;

    /* renamed from: o, reason: collision with root package name */
    public final String f72176o;

    /* renamed from: p, reason: collision with root package name */
    public final e02.a f72177p;

    /* renamed from: q, reason: collision with root package name */
    public final f2 f72178q;

    /* renamed from: r, reason: collision with root package name */
    public final o0 f72179r;

    /* renamed from: s, reason: collision with root package name */
    public final j f72180s;

    /* renamed from: t, reason: collision with root package name */
    public final x0 f72181t;

    /* renamed from: u, reason: collision with root package name */
    public final bc2.e f72182u;

    /* renamed from: v, reason: collision with root package name */
    public final xr.a f72183v;

    /* renamed from: w, reason: collision with root package name */
    public final ro1.c f72184w;

    /* renamed from: x, reason: collision with root package name */
    public final ni1.d f72185x;

    /* renamed from: y, reason: collision with root package name */
    public final c6 f72186y;

    /* renamed from: z, reason: collision with root package name */
    public final f4 f72187z;

    public h(wk1.c params, g0 pageSizeProvider, String apiEndpoint, HashMap apiParamMap, ps.a adEventHandler, k remoteRequestListener, o oVar, String str, String str2, x2 userRepository, b60.b activeUserManager, w eventManager, jd1.h userFeedRepViewConfig, String str3, String str4, e02.a aVar, f2 quickSaveIcon, o0 pinlyticsManager, j jVar, x0 x0Var, bc2.e mp4TrackSelector, xr.a attributionReporting, ro1.c deepLinkAdUtil, ni1.d deepLinkHelper, c6 pinImpressionLoggerFactory, f4 f4Var, f0 f0Var, r rVar, b0 pinAuxHelper, ur.a adsCoreDependencies, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        Intrinsics.checkNotNullParameter(adEventHandler, "adEventHandler");
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userFeedRepViewConfig, "userFeedRepViewConfig");
        Intrinsics.checkNotNullParameter(quickSaveIcon, "quickSaveIcon");
        Intrinsics.checkNotNullParameter(pinlyticsManager, "pinlyticsManager");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        Intrinsics.checkNotNullParameter(pinImpressionLoggerFactory, "pinImpressionLoggerFactory");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f72162a = params;
        this.f72163b = pageSizeProvider;
        this.f72164c = apiEndpoint;
        this.f72165d = apiParamMap;
        this.f72166e = adEventHandler;
        this.f72167f = remoteRequestListener;
        this.f72168g = oVar;
        this.f72169h = str;
        this.f72170i = str2;
        this.f72171j = userRepository;
        this.f72172k = activeUserManager;
        this.f72173l = eventManager;
        this.f72174m = userFeedRepViewConfig;
        this.f72175n = str3;
        this.f72176o = str4;
        this.f72177p = aVar;
        this.f72178q = quickSaveIcon;
        this.f72179r = pinlyticsManager;
        this.f72180s = jVar;
        this.f72181t = x0Var;
        this.f72182u = mp4TrackSelector;
        this.f72183v = attributionReporting;
        this.f72184w = deepLinkAdUtil;
        this.f72185x = deepLinkHelper;
        this.f72186y = pinImpressionLoggerFactory;
        this.f72187z = f4Var;
        this.A = f0Var;
        this.B = rVar;
        this.C = pinAuxHelper;
        this.D = adsCoreDependencies;
        this.E = boardNavigator;
    }

    public static h a(h hVar, String str, e02.a aVar, f2 quickSaveIcon, j jVar, f4 f4Var, f0 f0Var, r rVar) {
        wk1.c params = hVar.f72162a;
        Intrinsics.checkNotNullParameter(params, "params");
        g0 pageSizeProvider = hVar.f72163b;
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        String apiEndpoint = hVar.f72164c;
        Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        HashMap apiParamMap = hVar.f72165d;
        Intrinsics.checkNotNullParameter(apiParamMap, "apiParamMap");
        ps.a adEventHandler = hVar.f72166e;
        Intrinsics.checkNotNullParameter(adEventHandler, "adEventHandler");
        k remoteRequestListener = hVar.f72167f;
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        x2 userRepository = hVar.f72171j;
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        b60.b activeUserManager = hVar.f72172k;
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        w eventManager = hVar.f72173l;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        jd1.h userFeedRepViewConfig = hVar.f72174m;
        Intrinsics.checkNotNullParameter(userFeedRepViewConfig, "userFeedRepViewConfig");
        Intrinsics.checkNotNullParameter(quickSaveIcon, "quickSaveIcon");
        o0 pinlyticsManager = hVar.f72179r;
        Intrinsics.checkNotNullParameter(pinlyticsManager, "pinlyticsManager");
        bc2.e mp4TrackSelector = hVar.f72182u;
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        xr.a attributionReporting = hVar.f72183v;
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        ro1.c deepLinkAdUtil = hVar.f72184w;
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        ni1.d deepLinkHelper = hVar.f72185x;
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        c6 pinImpressionLoggerFactory = hVar.f72186y;
        Intrinsics.checkNotNullParameter(pinImpressionLoggerFactory, "pinImpressionLoggerFactory");
        b0 pinAuxHelper = hVar.C;
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        ur.a adsCoreDependencies = hVar.D;
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        g70.h boardNavigator = hVar.E;
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        return new h(params, pageSizeProvider, apiEndpoint, apiParamMap, adEventHandler, remoteRequestListener, hVar.f72168g, hVar.f72169h, hVar.f72170i, userRepository, activeUserManager, eventManager, userFeedRepViewConfig, str, hVar.f72176o, aVar, quickSaveIcon, pinlyticsManager, jVar, hVar.f72181t, mp4TrackSelector, attributionReporting, deepLinkAdUtil, deepLinkHelper, pinImpressionLoggerFactory, f4Var, f0Var, rVar, pinAuxHelper, adsCoreDependencies, boardNavigator);
    }

    public final o b() {
        return this.f72168g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f72162a, hVar.f72162a) && Intrinsics.d(this.f72163b, hVar.f72163b) && Intrinsics.d(this.f72164c, hVar.f72164c) && Intrinsics.d(this.f72165d, hVar.f72165d) && Intrinsics.d(this.f72166e, hVar.f72166e) && Intrinsics.d(this.f72167f, hVar.f72167f) && Intrinsics.d(this.f72168g, hVar.f72168g) && Intrinsics.d(this.f72169h, hVar.f72169h) && Intrinsics.d(this.f72170i, hVar.f72170i) && Intrinsics.d(this.f72171j, hVar.f72171j) && Intrinsics.d(this.f72172k, hVar.f72172k) && Intrinsics.d(this.f72173l, hVar.f72173l) && Intrinsics.d(this.f72174m, hVar.f72174m) && Intrinsics.d(this.f72175n, hVar.f72175n) && Intrinsics.d(this.f72176o, hVar.f72176o) && Intrinsics.d(this.f72177p, hVar.f72177p) && this.f72178q == hVar.f72178q && Intrinsics.d(this.f72179r, hVar.f72179r) && Intrinsics.d(this.f72180s, hVar.f72180s) && Intrinsics.d(this.f72181t, hVar.f72181t) && Intrinsics.d(this.f72182u, hVar.f72182u) && Intrinsics.d(this.f72183v, hVar.f72183v) && Intrinsics.d(this.f72184w, hVar.f72184w) && Intrinsics.d(this.f72185x, hVar.f72185x) && Intrinsics.d(this.f72186y, hVar.f72186y) && Intrinsics.d(this.f72187z, hVar.f72187z) && Intrinsics.d(this.A, hVar.A) && Intrinsics.d(this.B, hVar.B) && Intrinsics.d(this.C, hVar.C) && Intrinsics.d(this.D, hVar.D) && Intrinsics.d(this.E, hVar.E);
    }

    public final int hashCode() {
        int hashCode = (this.f72167f.hashCode() + ((this.f72166e.hashCode() + a.c.d(this.f72165d, cb.d(this.f72164c, (this.f72163b.hashCode() + (this.f72162a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31;
        o oVar = this.f72168g;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str = this.f72169h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72170i;
        int hashCode4 = (this.f72174m.hashCode() + ((this.f72173l.hashCode() + ((this.f72172k.hashCode() + ((this.f72171j.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        String str3 = this.f72175n;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f72176o;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        e02.a aVar = this.f72177p;
        int hashCode7 = (this.f72179r.hashCode() + ((this.f72178q.hashCode() + ((hashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31;
        j jVar = this.f72180s;
        int hashCode8 = (hashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        x0 x0Var = this.f72181t;
        int hashCode9 = (this.f72186y.hashCode() + ((this.f72185x.hashCode() + ((this.f72184w.hashCode() + ((this.f72183v.hashCode() + ((this.f72182u.hashCode() + ((hashCode8 + (x0Var == null ? 0 : x0Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        f4 f4Var = this.f72187z;
        int hashCode10 = (hashCode9 + (f4Var == null ? 0 : f4Var.hashCode())) * 31;
        f0 f0Var = this.A;
        int hashCode11 = (hashCode10 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        r rVar = this.B;
        return this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((hashCode11 + (rVar != null ? rVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BaseShoppingPresenterParams(params=" + this.f72162a + ", pageSizeProvider=" + this.f72163b + ", apiEndpoint=" + this.f72164c + ", apiParamMap=" + this.f72165d + ", adEventHandler=" + this.f72166e + ", remoteRequestListener=" + this.f72167f + ", productFilterManager=" + this.f72168g + ", shopSource=" + this.f72169h + ", sourceIdentifier=" + this.f72170i + ", userRepository=" + this.f72171j + ", activeUserManager=" + this.f72172k + ", eventManager=" + this.f72173l + ", userFeedRepViewConfig=" + this.f72174m + ", apiFields=" + this.f72175n + ", consumerType=" + this.f72176o + ", boardRouter=" + this.f72177p + ", quickSaveIcon=" + this.f72178q + ", pinlyticsManager=" + this.f72179r + ", pinAction=" + this.f72180s + ", boardRepository=" + this.f72181t + ", mp4TrackSelector=" + this.f72182u + ", attributionReporting=" + this.f72183v + ", deepLinkAdUtil=" + this.f72184w + ", deepLinkHelper=" + this.f72185x + ", pinImpressionLoggerFactory=" + this.f72186y + ", structuredFeedExperiments=" + this.f72187z + ", pinalyticsFactory=" + this.A + ", prefsManagerUser=" + this.B + ", pinAuxHelper=" + this.C + ", adsCoreDependencies=" + this.D + ", boardNavigator=" + this.E + ")";
    }

    public h(wk1.c cVar, g0 g0Var, String str, HashMap hashMap, ps.a aVar, k kVar, o oVar, String str2, x2 x2Var, b60.b bVar, w wVar, jd1.h hVar, x0 x0Var, bc2.e eVar, xr.a aVar2, ro1.c cVar2, ni1.d dVar, c6 c6Var, b0 b0Var, ur.a aVar3, g70.h hVar2) {
        this(cVar, g0Var, str, hashMap, aVar, kVar, oVar, str2, null, x2Var, bVar, wVar, hVar, null, null, null, f2.NONE, o0.f92437i, null, x0Var, eVar, aVar2, cVar2, dVar, c6Var, null, null, null, b0Var, aVar3, hVar2);
    }
}
