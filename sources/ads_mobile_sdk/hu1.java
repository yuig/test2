package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import bj.n;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class hu1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6088a;

    /* renamed from: b, reason: collision with root package name */
    public final cm0 f6089b;

    /* renamed from: c, reason: collision with root package name */
    public final x f6090c;

    /* renamed from: d, reason: collision with root package name */
    public final ku0 f6091d;

    /* renamed from: e, reason: collision with root package name */
    public final a.v7 f6092e;

    /* renamed from: f, reason: collision with root package name */
    public final a.v7 f6093f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f6094g;

    /* renamed from: h, reason: collision with root package name */
    public final a.v7 f6095h;

    /* renamed from: i, reason: collision with root package name */
    public final a.v7 f6096i;

    /* renamed from: j, reason: collision with root package name */
    public final mo2.a f6097j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f6098k;

    /* renamed from: l, reason: collision with root package name */
    public final kl0 f6099l;

    public hu1(Context applicationContext, cm0 gmaUtil, x activityTracker, ku0 inspectorManager, a.o8 appOpenComponentProvider, a.o8 bannerComponentProvider, a.o8 interstitialComponentProvider, a.o8 nativeComponentProvider, a.o8 rewardedComponentProvider) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(appOpenComponentProvider, "appOpenComponentProvider");
        Intrinsics.checkNotNullParameter(bannerComponentProvider, "bannerComponentProvider");
        Intrinsics.checkNotNullParameter(interstitialComponentProvider, "interstitialComponentProvider");
        Intrinsics.checkNotNullParameter(nativeComponentProvider, "nativeComponentProvider");
        Intrinsics.checkNotNullParameter(rewardedComponentProvider, "rewardedComponentProvider");
        this.f6088a = applicationContext;
        this.f6089b = gmaUtil;
        this.f6090c = activityTracker;
        this.f6091d = inspectorManager;
        this.f6092e = appOpenComponentProvider;
        this.f6093f = bannerComponentProvider;
        this.f6094g = interstitialComponentProvider;
        this.f6095h = nativeComponentProvider;
        this.f6096i = rewardedComponentProvider;
        this.f6097j = mo2.d.a();
        this.f6098k = new LinkedHashMap();
        this.f6099l = kl0.GMSG_OUT_OF_CONTEXT_TESTING;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String adUnitId;
        String str;
        Object a13;
        String str2 = (String) map.get("action");
        if (str2 != null && (adUnitId = (String) map.get("adUnitId")) != null && (str = (String) map.get("redirectUrl")) != null) {
            String format = (String) map.get("format");
            if (format != null) {
                h92.f5896b.getClass();
                Intrinsics.checkNotNullParameter(format, "format");
                LinkedHashMap linkedHashMap = h92.f5897c;
                String lowerCase = format.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                h92 h92Var = (h92) linkedHashMap.get(lowerCase);
                if (h92Var != null) {
                    if (z.j(str2) || z.j(adUnitId) || z.j(str)) {
                        return Unit.f80348a;
                    }
                    if (!Intrinsics.d(str2, "load")) {
                        if (!Intrinsics.d(str2, "show")) {
                            return Unit.f80348a;
                        }
                        Object a14 = a(adUnitId, str, cVar);
                        return a14 == cl2.a.COROUTINE_SUSPENDED ? a14 : Unit.f80348a;
                    }
                    int ordinal = h92Var.ordinal();
                    if (ordinal == 1) {
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        wi.h hVar = new wi.h(adUnitId, new LinkedHashSet(), new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null);
                        g40 g40Var = (g40) this.f6092e.get();
                        h92 h92Var2 = h92.f5899e;
                        g40Var.getClass();
                        g40Var.f5388d = h92Var2;
                        g40 g40Var2 = (g40) g40Var.a(hVar);
                        g40Var2.f5387c = hVar;
                        g40 g40Var3 = (g40) ((g40) g40Var2.b(true)).a(false);
                        kh2.a1.k(wi.h.class, g40Var3.f5386b);
                        kh2.a1.k(wi.k.class, g40Var3.f5387c);
                        kh2.a1.k(h92.class, g40Var3.f5388d);
                        kh2.a1.k(Boolean.class, g40Var3.f5389e);
                        kh2.a1.k(Boolean.class, g40Var3.f5390f);
                        a13 = a(new h40(g40Var3.f5385a, g40Var3.f5386b, g40Var3.f5387c, g40Var3.f5388d, g40Var3.f5389e, g40Var3.f5390f), adUnitId, str, cVar);
                        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                        if (a13 != aVar) {
                            a13 = Unit.f80348a;
                        }
                        if (a13 != aVar) {
                            a13 = Unit.f80348a;
                        }
                    } else if (ordinal == 2) {
                        vi.a adSize = vi.a.f125856f;
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        Intrinsics.checkNotNullParameter(adSize, "adSize");
                        List b13 = kotlin.collections.e0.b(adSize);
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        vi.c cVar2 = new vi.c(adUnitId, new LinkedHashSet(), new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null, adSize, b13);
                        j40 j40Var = (j40) this.f6093f.get();
                        h92 h92Var3 = h92.f5900f;
                        j40Var.getClass();
                        j40Var.f6672d = h92Var3;
                        j40 j40Var2 = (j40) j40Var.a((wi.h) cVar2);
                        j40Var2.f6671c = cVar2;
                        j40Var2.f6675g = cVar2;
                        j40Var2.f6676h = cVar2;
                        a13 = a(((j40) ((j40) j40Var2.b(true)).a(false)).b(), adUnitId, str, cVar);
                        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                        if (a13 != aVar2) {
                            a13 = Unit.f80348a;
                        }
                        if (a13 != aVar2) {
                            a13 = Unit.f80348a;
                        }
                    } else if (ordinal == 4) {
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        wi.h hVar2 = new wi.h(adUnitId, new LinkedHashSet(), new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null);
                        p40 p40Var = (p40) this.f6094g.get();
                        h92 h92Var4 = h92.f5902h;
                        p40Var.getClass();
                        p40Var.f9537d = h92Var4;
                        p40 p40Var2 = (p40) p40Var.a(hVar2);
                        p40Var2.f9536c = hVar2;
                        a13 = a(((p40) ((p40) p40Var2.b(true)).a(false)).b(), adUnitId, str, cVar);
                        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                        if (a13 != aVar3) {
                            a13 = Unit.f80348a;
                        }
                        if (a13 != aVar3) {
                            a13 = Unit.f80348a;
                        }
                    } else if (ordinal == 5) {
                        List nativeAdTypes = kotlin.collections.e0.b(bj.c.NATIVE);
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        Intrinsics.checkNotNullParameter(nativeAdTypes, "nativeAdTypes");
                        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Bundle bundle = new Bundle();
                        HashSet hashSet = new HashSet();
                        HashSet hashSet2 = new HashSet();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
                        bj.m mVar = new bj.m(adUnitId, linkedHashSet, linkedHashMap2, bundle, hashSet, hashSet2, linkedHashMap3, null, CollectionsKt.F0(nativeAdTypes), q0Var, bj.d.UNKNOWN, wi.d.TOP_RIGHT, null, q0Var);
                        a13 = a(((a.t4) ((a.t4) ((a.t4) ((a.t4) ((a.t4) ((a.t4) this.f6095h.get()).a(h92.f5903i)).a((wi.h) mVar)).a((wi.k) mVar)).a((n) mVar).a(mVar).b(true)).a(false)).a(1).a(), adUnitId, str, cVar);
                        cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                        if (a13 != aVar4) {
                            a13 = Unit.f80348a;
                        }
                        if (a13 != aVar4) {
                            a13 = Unit.f80348a;
                        }
                    } else if (ordinal == 6) {
                        a13 = a(adUnitId, h92Var, str, cVar);
                        if (a13 != cl2.a.COROUTINE_SUSPENDED) {
                            a13 = Unit.f80348a;
                        }
                    } else if (ordinal != 7) {
                        a13 = Unit.f80348a;
                    } else {
                        a13 = a(adUnitId, h92Var, str, cVar);
                        if (a13 != cl2.a.COROUTINE_SUSPENDED) {
                            a13 = Unit.f80348a;
                        }
                    }
                    return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
                }
            }
            return Unit.f80348a;
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return this.f6099l;
    }

    public final Object a(String adUnitId, h92 h92Var, String str, bl2.c cVar) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (adUnitId != null) {
            wi.h hVar = new wi.h(adUnitId, linkedHashSet, linkedHashMap, bundle, hashSet, hashSet2, linkedHashMap2, null);
            v40 v40Var = (v40) this.f6096i.get();
            v40Var.f12345d = h92Var;
            v40 v40Var2 = (v40) v40Var.a(hVar);
            v40Var2.f12344c = hVar;
            Object a13 = a(((v40) ((v40) v40Var2.b(true)).a(false)).b(), adUnitId, str, cVar);
            return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
        }
        throw new IllegalArgumentException("Ad unit ID cannot be null.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e5 A[PHI: r12
      0x00e5: PHI (r12v10 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:21:0x00e2, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.v6 r9, java.lang.String r10, java.lang.String r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hu1.a(a.v6, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0154 A[PHI: r12
      0x0154: PHI (r12v20 java.lang.Object) = (r12v18 java.lang.Object), (r12v1 java.lang.Object) binds: [B:24:0x0151, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:46:0x006b, B:48:0x0075), top: B:45:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v22, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r10, java.lang.String r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hu1.a(java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }
}
