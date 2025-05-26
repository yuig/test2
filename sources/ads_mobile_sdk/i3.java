package ads_mobile_sdk;

import a.j9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wi.z;

/* loaded from: classes2.dex */
public final class i3 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f6190a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6191b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.y f6192c;

    /* renamed from: d, reason: collision with root package name */
    public final z f6193d;

    /* renamed from: e, reason: collision with root package name */
    public final wi.w f6194e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6195f;

    /* renamed from: g, reason: collision with root package name */
    public final h92 f6196g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6197h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6198i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6199j;

    public i3(wi.k adRequest, long j13, wi.y tfcd, z tfuac, wi.w maxAdContentRating, boolean z13, h92 requestType, int i13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(tfcd, "tfcd");
        Intrinsics.checkNotNullParameter(tfuac, "tfuac");
        Intrinsics.checkNotNullParameter(maxAdContentRating, "maxAdContentRating");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.f6190a = adRequest;
        this.f6191b = j13;
        this.f6192c = tfcd;
        this.f6193d = tfuac;
        this.f6194e = maxAdContentRating;
        this.f6195f = z13;
        this.f6196g = requestType;
        this.f6197h = i13;
        this.f6198i = z14;
        this.f6199j = z15;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.requestTimeMilliseconds = this.f6191b;
        signals.adUnitId = this.f6190a.l();
        signals.contentUrl = this.f6190a.f129956c;
        if ((!r0.f129957d.isEmpty()) || (!this.f6190a.f129955b.isEmpty())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.f6190a.f129957d);
            if (!this.f6190a.f129955b.isEmpty()) {
                linkedHashMap.put("excl_cat", CollectionsKt.Z(this.f6190a.f129955b, ",", null, null, 0, null, null, 62));
            }
            signals.customTargeting = linkedHashMap;
        }
        signals.googleExtrasBundle = this.f6190a.f129958e;
        if (!r0.f129959f.isEmpty()) {
            signals.keywords = new ArrayList<>(this.f6190a.f129959f);
        }
        if (!this.f6190a.f129960g.isEmpty()) {
            signals.neighboringContentUrls = CollectionsKt.J0(this.f6190a.f129960g);
        }
        wi.k kVar = this.f6190a;
        signals.publisherProvidedId = kVar.f129962i;
        signals.requestAgent = kVar.f129963j;
        signals.tagForChildDirectedTreatment = this.f6192c.getValue() == 1 ? 1 : 0;
        signals.tagForUnderAgeOfConsent = this.f6193d.getValue() != 1 ? 0 : 1;
        if (this.f6194e.getValue().length() > 0) {
            signals.maxAdContentRating = this.f6194e.getValue();
        }
        signals.isTestRequest = this.f6195f;
        signals.publisherPrivacyPersonalizationState = Integer.valueOf(this.f6197h);
        h92 h92Var = this.f6196g;
        if (h92Var == h92.f5904j) {
            signals.isRewarded = Boolean.TRUE;
        }
        if (h92Var == h92.f5905k) {
            signals.isRewardedInterstitial = Boolean.TRUE;
        }
        signals.manualImpressionsEnabled = this.f6198i;
        if (this.f6199j) {
            signals.isPrefetchRequest = Boolean.TRUE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return Intrinsics.d(this.f6190a, i3Var.f6190a) && this.f6191b == i3Var.f6191b && this.f6192c == i3Var.f6192c && this.f6193d == i3Var.f6193d && this.f6194e == i3Var.f6194e && this.f6195f == i3Var.f6195f && this.f6196g == i3Var.f6196g && this.f6197h == i3Var.f6197h && this.f6198i == i3Var.f6198i && this.f6199j == i3Var.f6199j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f6194e.hashCode() + ((this.f6193d.hashCode() + ((this.f6192c.hashCode() + a.a.c(this.f6191b, this.f6190a.hashCode() * 31, 31)) * 31)) * 31)) * 31;
        boolean z13 = this.f6195f;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int f13 = kh2.n3.f(this.f6197h, (this.f6196g.hashCode() + ((hashCode + i13) * 31)) * 31);
        boolean z14 = this.f6198i;
        int i14 = z14;
        if (z14 != 0) {
            i14 = 1;
        }
        int i15 = (f13 + i14) * 31;
        boolean z15 = this.f6199j;
        return i15 + (z15 ? 1 : z15 ? 1 : 0);
    }

    public final String toString() {
        return "AdRequestSignal(adRequest=" + this.f6190a + ", timestamp=" + this.f6191b + ", tfcd=" + this.f6192c + ", tfuac=" + this.f6193d + ", maxAdContentRating=" + this.f6194e + ", isTestRequest=" + this.f6195f + ", requestType=" + this.f6196g + ", publisherPrivacyPersonalizationState=" + this.f6197h + ", manualImpressionsRequested=" + this.f6198i + ", isPrefetchRequest=" + this.f6199j + ")";
    }
}
