package sf1;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f112604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f112605d;

    /* renamed from: e, reason: collision with root package name */
    public final String f112606e;

    /* renamed from: f, reason: collision with root package name */
    public final String f112607f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f112608g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f112609h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f112610i;

    /* renamed from: j, reason: collision with root package name */
    public final i1 f112611j;

    /* renamed from: k, reason: collision with root package name */
    public final Function0 f112612k;

    /* renamed from: l, reason: collision with root package name */
    public final qf1.o f112613l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f112614m;

    public h1(String pinId, String clickthroughUrl, String ctaButtonText, String creatorName, String sponsorName, String title, boolean z13, boolean z14, boolean z15, i1 avatarState, qf1.o oVar, boolean z16) {
        w action = w.f112786m;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(ctaButtonText, "ctaButtonText");
        Intrinsics.checkNotNullParameter(creatorName, "creatorName");
        Intrinsics.checkNotNullParameter(sponsorName, "sponsorName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatarState, "avatarState");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f112602a = pinId;
        this.f112603b = clickthroughUrl;
        this.f112604c = ctaButtonText;
        this.f112605d = creatorName;
        this.f112606e = sponsorName;
        this.f112607f = title;
        this.f112608g = z13;
        this.f112609h = z14;
        this.f112610i = z15;
        this.f112611j = avatarState;
        this.f112612k = action;
        this.f112613l = oVar;
        this.f112614m = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f112602a, h1Var.f112602a) && Intrinsics.d(this.f112603b, h1Var.f112603b) && Intrinsics.d(this.f112604c, h1Var.f112604c) && Intrinsics.d(this.f112605d, h1Var.f112605d) && Intrinsics.d(this.f112606e, h1Var.f112606e) && Intrinsics.d(this.f112607f, h1Var.f112607f) && this.f112608g == h1Var.f112608g && this.f112609h == h1Var.f112609h && this.f112610i == h1Var.f112610i && Intrinsics.d(this.f112611j, h1Var.f112611j) && Intrinsics.d(this.f112612k, h1Var.f112612k) && Intrinsics.d(this.f112613l, h1Var.f112613l) && this.f112614m == h1Var.f112614m;
    }

    public final int hashCode() {
        int b13 = d7.g.b(this.f112612k, (this.f112611j.hashCode() + ep.b.e(this.f112610i, ep.b.e(this.f112609h, ep.b.e(this.f112608g, cb.d(this.f112607f, cb.d(this.f112606e, cb.d(this.f112605d, cb.d(this.f112604c, cb.d(this.f112603b, this.f112602a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
        qf1.o oVar = this.f112613l;
        return Boolean.hashCode(this.f112614m) + ((b13 + (oVar == null ? 0 : oVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdsActionBarViewState(pinId=");
        sb3.append(this.f112602a);
        sb3.append(", clickthroughUrl=");
        sb3.append(this.f112603b);
        sb3.append(", ctaButtonText=");
        sb3.append(this.f112604c);
        sb3.append(", creatorName=");
        sb3.append(this.f112605d);
        sb3.append(", sponsorName=");
        sb3.append(this.f112606e);
        sb3.append(", title=");
        sb3.append(this.f112607f);
        sb3.append(", isVideoAd=");
        sb3.append(this.f112608g);
        sb3.append(", isIdeaAd=");
        sb3.append(this.f112609h);
        sb3.append(", isSponsoredIdeaAd=");
        sb3.append(this.f112610i);
        sb3.append(", avatarState=");
        sb3.append(this.f112611j);
        sb3.append(", action=");
        sb3.append(this.f112612k);
        sb3.append(", ideaState=");
        sb3.append(this.f112613l);
        sb3.append(", eligibleForGridRepTests=");
        return a.a.r(sb3, this.f112614m, ")");
    }
}
