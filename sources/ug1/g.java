package ug1;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import dl1.s;
import h32.g0;
import h32.h2;
import h32.v2;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.e4;
import m60.t0;
import m60.w;
import nx.b0;
import nx.d0;
import nx.d1;
import nx.o0;
import so.c6;
import uj2.q;
import x02.x2;
import yk1.r;

/* loaded from: classes5.dex */
public final class g extends yk1.c {
    public final tq0.c A;
    public boolean B;
    public Float C;
    public Integer D;
    public String E;
    public HashMap F;
    public final f G;

    /* renamed from: a, reason: collision with root package name */
    public final w f122168a;

    /* renamed from: b, reason: collision with root package name */
    public final ll.j f122169b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f122170c;

    /* renamed from: d, reason: collision with root package name */
    public final nu1.a f122171d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f122172e;

    /* renamed from: f, reason: collision with root package name */
    public final a11.d f122173f;

    /* renamed from: g, reason: collision with root package name */
    public final x10.b f122174g;

    /* renamed from: h, reason: collision with root package name */
    public final e4 f122175h;

    /* renamed from: i, reason: collision with root package name */
    public final bc2.e f122176i;

    /* renamed from: j, reason: collision with root package name */
    public final vg1.a f122177j;

    /* renamed from: k, reason: collision with root package name */
    public final xr.a f122178k;

    /* renamed from: l, reason: collision with root package name */
    public final ro1.c f122179l;

    /* renamed from: m, reason: collision with root package name */
    public final ni1.d f122180m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f122181n;

    /* renamed from: o, reason: collision with root package name */
    public final ur.a f122182o;

    /* renamed from: p, reason: collision with root package name */
    public final g70.h f122183p;

    /* renamed from: q, reason: collision with root package name */
    public vh f122184q;

    /* renamed from: r, reason: collision with root package name */
    public List f122185r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f122186s;

    /* renamed from: t, reason: collision with root package name */
    public String f122187t;

    /* renamed from: u, reason: collision with root package name */
    public String f122188u;

    /* renamed from: v, reason: collision with root package name */
    public String f122189v;

    /* renamed from: w, reason: collision with root package name */
    public ih f122190w;

    /* renamed from: x, reason: collision with root package name */
    public final tq0.a f122191x;

    /* renamed from: y, reason: collision with root package name */
    public final tq0.c f122192y;

    /* renamed from: z, reason: collision with root package name */
    public final tq0.j f122193z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uk1.d pinalytics, q networkStateStream, w eventManager, x2 userRepository, nu1.a aVar, d1 d1Var, a11.d dVar, x10.b bVar, e4 experiments, bc2.e mp4TrackSelector, vg1.a aVar2, xr.a attributionReporting, ro1.c deepLinkAdUtil, ni1.d deepLinkHelper, c6 pinImpressionLoggerFactory, o0 pinalyticsManager, b0 pinAuxHelper, ur.a adsCoreDependencies, g70.h boardNavigator) {
        super(pinalytics, networkStateStream);
        tq0.j jVar;
        ll.j storyImpressionHelper = new ll.j(16, 0);
        pb0.g clock = new pb0.g();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(storyImpressionHelper, "storyImpressionHelper");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        Intrinsics.checkNotNullParameter(pinImpressionLoggerFactory, "pinImpressionLoggerFactory");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f122168a = eventManager;
        this.f122169b = storyImpressionHelper;
        this.f122170c = userRepository;
        this.f122171d = aVar;
        this.f122172e = d1Var;
        this.f122173f = dVar;
        this.f122174g = bVar;
        this.f122175h = experiments;
        this.f122176i = mp4TrackSelector;
        this.f122177j = aVar2;
        this.f122178k = attributionReporting;
        this.f122179l = deepLinkAdUtil;
        this.f122180m = deepLinkHelper;
        this.f122181n = pinAuxHelper;
        this.f122182o = adsCoreDependencies;
        this.f122183p = boardNavigator;
        this.f122185r = q0.f80391a;
        this.f122186s = new LinkedHashSet();
        this.f122187t = "";
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f122191x = new tq0.a(clock, d0Var);
        d0 d0Var2 = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        this.f122192y = new tq0.c(clock, d0Var2);
        if (d1Var != null) {
            d0 d0Var3 = getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
            jVar = pinImpressionLoggerFactory.a(d0Var3, h2.SEARCH_IMMERSIVE_HEADER);
        } else {
            jVar = null;
        }
        this.f122193z = jVar;
        d0 d0Var4 = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var4, "getPinalytics(...)");
        this.A = new tq0.c(clock, d0Var4, pinalyticsManager, g0.DYNAMIC_GRID_STORY, null, 16);
        this.G = new f(this);
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        this.f122186s.clear();
        this.f122168a.j(this.G);
        super.onUnbind();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0216, code lost:
    
        if (r5.l("android_slp_image_only_premiere") == false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v10, types: [ug1.n, wi0.b] */
    /* JADX WARN: Type inference failed for: r9v13, types: [ug1.m] */
    /* JADX WARN: Type inference failed for: r9v2, types: [yk1.b] */
    /* JADX WARN: Type inference failed for: r9v4, types: [ug1.e] */
    /* JADX WARN: Type inference failed for: r9v6, types: [wi0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3() {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ug1.g.q3():void");
    }

    public final HashMap r3() {
        HashMap o13 = bs1.c.o(new Pair[0]);
        Integer num = this.D;
        bs1.c.G1("story_index", num != null ? num.toString() : null, o13);
        Integer num2 = this.D;
        bs1.c.G1("grid_index", num2 != null ? num2.toString() : null, o13);
        vh vhVar = this.f122184q;
        bs1.c.G1("total_object_count", vhVar != null ? Integer.valueOf(vhVar.f42865w.size()).toString() : null, o13);
        return o13;
    }

    public final void s3(int i13, boolean z13) {
        s sVar = (s) CollectionsKt.U(i13, this.f122185r);
        if (sVar != null && (sVar instanceof f30)) {
            Boolean b53 = ((f30) sVar).b5();
            Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
            if (b53.booleanValue()) {
                tg1.j jVar = (tg1.j) getViewIfBound();
                if (jVar != null) {
                    jVar.q1(true, !z13);
                    return;
                }
                return;
            }
        }
        tg1.j jVar2 = (tg1.j) getViewIfBound();
        if (jVar2 != null) {
            jVar2.q1(false, !z13);
        }
    }

    @Override // yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(tg1.j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.X5(this);
        q3();
        this.f122168a.h(this.G);
        view.m1(Intrinsics.d(this.f122189v, "shopping_spotlight") ? t0.shopping_spotlight : -1);
        s3(0, true);
    }

    public final tg1.i u3() {
        v2 x13 = ll.j.x(this.f122169b, this.f122187t, this.f122185r.size(), this.f122186s.size(), this.E, null, null, 48);
        if (x13 != null) {
            return new tg1.i(x13, r3());
        }
        return null;
    }
}
