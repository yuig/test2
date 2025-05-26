package y01;

import a.cb;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final z f136443a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136444b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136445c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f136446d;

    /* renamed from: e, reason: collision with root package name */
    public final o f136447e;

    /* renamed from: f, reason: collision with root package name */
    public final h42.f f136448f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f136449g;

    /* renamed from: h, reason: collision with root package name */
    public final int f136450h;

    /* renamed from: i, reason: collision with root package name */
    public final String f136451i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f136452j;

    /* renamed from: k, reason: collision with root package name */
    public final int f136453k;

    /* renamed from: l, reason: collision with root package name */
    public final int f136454l;

    /* renamed from: m, reason: collision with root package name */
    public final nx.a f136455m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f136456n;

    /* renamed from: o, reason: collision with root package name */
    public final f30 f136457o;

    public n1(z pinFeedVMState, String initialPinUid, boolean z13, boolean z14, o navigationData, h42.f screenPagerVMState, boolean z15, int i13, String aggregatedPinDataId, boolean z16, int i14, int i15, nx.a analyticsContextProvider, boolean z17, f30 f30Var) {
        Intrinsics.checkNotNullParameter(pinFeedVMState, "pinFeedVMState");
        Intrinsics.checkNotNullParameter(initialPinUid, "initialPinUid");
        Intrinsics.checkNotNullParameter(navigationData, "navigationData");
        Intrinsics.checkNotNullParameter(screenPagerVMState, "screenPagerVMState");
        Intrinsics.checkNotNullParameter(aggregatedPinDataId, "aggregatedPinDataId");
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        this.f136443a = pinFeedVMState;
        this.f136444b = initialPinUid;
        this.f136445c = z13;
        this.f136446d = z14;
        this.f136447e = navigationData;
        this.f136448f = screenPagerVMState;
        this.f136449g = z15;
        this.f136450h = i13;
        this.f136451i = aggregatedPinDataId;
        this.f136452j = z16;
        this.f136453k = i14;
        this.f136454l = i15;
        this.f136455m = analyticsContextProvider;
        this.f136456n = z17;
        this.f136457o = f30Var;
    }

    public static n1 b(n1 n1Var, z zVar, h42.f fVar, boolean z13, String str, int i13, int i14, f30 f30Var, int i15) {
        z pinFeedVMState = (i15 & 1) != 0 ? n1Var.f136443a : zVar;
        String initialPinUid = n1Var.f136444b;
        boolean z14 = n1Var.f136445c;
        boolean z15 = n1Var.f136446d;
        o navigationData = n1Var.f136447e;
        h42.f screenPagerVMState = (i15 & 32) != 0 ? n1Var.f136448f : fVar;
        boolean z16 = (i15 & 64) != 0 ? n1Var.f136449g : z13;
        int i16 = n1Var.f136450h;
        String aggregatedPinDataId = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? n1Var.f136451i : str;
        boolean z17 = n1Var.f136452j;
        int i17 = (i15 & 1024) != 0 ? n1Var.f136453k : i13;
        int i18 = (i15 & 2048) != 0 ? n1Var.f136454l : i14;
        nx.a analyticsContextProvider = n1Var.f136455m;
        boolean z18 = n1Var.f136456n;
        f30 f30Var2 = (i15 & 16384) != 0 ? n1Var.f136457o : f30Var;
        n1Var.getClass();
        Intrinsics.checkNotNullParameter(pinFeedVMState, "pinFeedVMState");
        Intrinsics.checkNotNullParameter(initialPinUid, "initialPinUid");
        Intrinsics.checkNotNullParameter(navigationData, "navigationData");
        Intrinsics.checkNotNullParameter(screenPagerVMState, "screenPagerVMState");
        Intrinsics.checkNotNullParameter(aggregatedPinDataId, "aggregatedPinDataId");
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        return new n1(pinFeedVMState, initialPinUid, z14, z15, navigationData, screenPagerVMState, z16, i16, aggregatedPinDataId, z17, i17, i18, analyticsContextProvider, z18, f30Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.d(this.f136443a, n1Var.f136443a) && Intrinsics.d(this.f136444b, n1Var.f136444b) && this.f136445c == n1Var.f136445c && this.f136446d == n1Var.f136446d && Intrinsics.d(this.f136447e, n1Var.f136447e) && Intrinsics.d(this.f136448f, n1Var.f136448f) && this.f136449g == n1Var.f136449g && this.f136450h == n1Var.f136450h && Intrinsics.d(this.f136451i, n1Var.f136451i) && this.f136452j == n1Var.f136452j && this.f136453k == n1Var.f136453k && this.f136454l == n1Var.f136454l && Intrinsics.d(this.f136455m, n1Var.f136455m) && this.f136456n == n1Var.f136456n && Intrinsics.d(this.f136457o, n1Var.f136457o);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f136456n, (this.f136455m.hashCode() + ep.b.b(this.f136454l, ep.b.b(this.f136453k, ep.b.e(this.f136452j, cb.d(this.f136451i, ep.b.b(this.f136450h, ep.b.e(this.f136449g, ep.b.b(this.f136448f.f67648a, (this.f136447e.hashCode() + ep.b.e(this.f136446d, ep.b.e(this.f136445c, cb.d(this.f136444b, this.f136443a.hashCode() * 31, 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
        f30 f30Var = this.f136457o;
        return e13 + (f30Var == null ? 0 : f30Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinSwipeFragmentVMState(pinFeedVMState=");
        sb3.append(this.f136443a);
        sb3.append(", initialPinUid=");
        sb3.append(this.f136444b);
        sb3.append(", isAdExclusionAllowedInVisualRefresh=");
        sb3.append(this.f136445c);
        sb3.append(", isOffsiteAPIOptimizationEnabledAndActivate=");
        sb3.append(this.f136446d);
        sb3.append(", navigationData=");
        sb3.append(this.f136447e);
        sb3.append(", screenPagerVMState=");
        sb3.append(this.f136448f);
        sb3.append(", isLoading=");
        sb3.append(this.f136449g);
        sb3.append(", loadMoreThresholdIndex=");
        sb3.append(this.f136450h);
        sb3.append(", aggregatedPinDataId=");
        sb3.append(this.f136451i);
        sb3.append(", isErrorLoggingEnabled=");
        sb3.append(this.f136452j);
        sb3.append(", nextFragmentPosition=");
        sb3.append(this.f136453k);
        sb3.append(", lastActivePosition=");
        sb3.append(this.f136454l);
        sb3.append(", analyticsContextProvider=");
        sb3.append(this.f136455m);
        sb3.append(", isAndroidPinCloseupAfterScreenshotExperienceEnabled=");
        sb3.append(this.f136456n);
        sb3.append(", screenshotInProgressPin=");
        return jq.b.e(sb3, this.f136457o, ")");
    }
}
