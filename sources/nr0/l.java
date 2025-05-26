package nr0;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Map;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import m60.f0;
import nx.r0;
import x02.i2;
import yk1.v;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f91866a;

    /* renamed from: b, reason: collision with root package name */
    public final wa2.i f91867b;

    /* renamed from: c, reason: collision with root package name */
    public final qa2.n f91868c;

    /* renamed from: d, reason: collision with root package name */
    public final v f91869d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f91870e;

    /* renamed from: f, reason: collision with root package name */
    public final t f91871f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f91872g;

    /* renamed from: h, reason: collision with root package name */
    public final m7.c f91873h;

    /* renamed from: i, reason: collision with root package name */
    public final yq0.v f91874i;

    /* renamed from: j, reason: collision with root package name */
    public final es.a f91875j;

    /* renamed from: k, reason: collision with root package name */
    public final es.h f91876k;

    /* renamed from: l, reason: collision with root package name */
    public final b20.c f91877l;

    /* renamed from: m, reason: collision with root package name */
    public a f91878m;

    /* renamed from: n, reason: collision with root package name */
    public final j6.b f91879n;

    public l(uk1.d presenterPinalytics, wa2.i pinFeatureConfig, qa2.n gridFeatureConfig, v viewResources, i2 pinRepository, n1 hairballExperiments, ku1.l uriNavigator, t viewBindersMapProvider, f0 devUtils, m7.c dynamicStoryRecyclerViewTypeCalculator, yq0.v recyclerViewTypeLogging, es.a adFormats, es.h adsCommonDisplay, b20.c spanCountProvider) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(hairballExperiments, "hairballExperiments");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(viewBindersMapProvider, "viewBindersMapProvider");
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        Intrinsics.checkNotNullParameter(dynamicStoryRecyclerViewTypeCalculator, "dynamicStoryRecyclerViewTypeCalculator");
        Intrinsics.checkNotNullParameter(recyclerViewTypeLogging, "recyclerViewTypeLogging");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(spanCountProvider, "spanCountProvider");
        this.f91866a = presenterPinalytics;
        this.f91867b = pinFeatureConfig;
        this.f91868c = gridFeatureConfig;
        this.f91869d = viewResources;
        this.f91870e = hairballExperiments;
        this.f91871f = viewBindersMapProvider;
        this.f91872g = devUtils;
        this.f91873h = dynamicStoryRecyclerViewTypeCalculator;
        this.f91874i = recyclerViewTypeLogging;
        this.f91875j = adFormats;
        this.f91876k = adsCommonDisplay;
        this.f91877l = spanCountProvider;
        this.f91879n = new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d);
    }

    public static void b(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
    }

    @Override // nr0.p
    public final void F(a dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(dataSource, "<set-?>");
        this.f91878m = dataSource;
        a a13 = a();
        for (Map.Entry entry : this.f91871f.b(this.f91866a, this.f91867b, this.f91868c, this.f91869d).entrySet()) {
            a13.I0(((Number) entry.getKey()).intValue(), new r0(entry, 12));
        }
    }

    public final a a() {
        a aVar = this.f91878m;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("dataSource");
        throw null;
    }

    @Override // nr0.p
    public final boolean c() {
        return true;
    }

    @Override // nr0.p
    public final boolean e(int i13) {
        boolean z13;
        if (a().d2(i13)) {
            z13 = c0.w(n.f91880a, a().getItemViewType(i13));
        } else {
            z13 = false;
        }
        return !z13;
    }

    @Override // nr0.p
    public final boolean f(int i13) {
        return RecyclerViewTypes.FULL_SPAN_ITEM_TYPES.contains(Integer.valueOf(i13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        if (r0 != null) goto L33;
     */
    @Override // nr0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getItemViewType(int r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nr0.l.getItemViewType(int):int");
    }

    @Override // nr0.p
    public final boolean h(int i13) {
        boolean z13;
        if (a().d2(i13)) {
            z13 = c0.w(n.f91880a, a().getItemViewType(i13));
        } else {
            z13 = false;
        }
        return !z13;
    }

    @Override // nr0.p
    public final Integer j(int i13) {
        ((hf0.b) ((hf0.c) this.f91877l.f21278a)).getClass();
        if (!hf0.b.q()) {
            return null;
        }
        if (i13 != 6) {
            if (i13 == 92 || i13 == 100 || i13 == 166) {
                return null;
            }
            if (i13 != 259 && i13 != 273 && i13 != 274) {
                return 1;
            }
        }
        return 2;
    }

    @Override // nr0.p
    public final boolean m() {
        return true;
    }

    @Override // nr0.p
    public final boolean q(int i13) {
        return RecyclerViewTypes.INSTANCE.getFULL_BLEED_ITEM_TYPES().contains(Integer.valueOf(i13));
    }
}
