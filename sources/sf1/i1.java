package sf1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112618a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f112620c;

    /* renamed from: d, reason: collision with root package name */
    public final String f112621d;

    /* renamed from: e, reason: collision with root package name */
    public final String f112622e;

    /* renamed from: f, reason: collision with root package name */
    public final int f112623f;

    public /* synthetic */ i1() {
        this(0, -1, "", "", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.d(this.f112618a, i1Var.f112618a) && Intrinsics.d(this.f112619b, i1Var.f112619b) && this.f112620c == i1Var.f112620c && Intrinsics.d(this.f112621d, i1Var.f112621d) && Intrinsics.d(this.f112622e, i1Var.f112622e) && this.f112623f == i1Var.f112623f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f112623f) + cb.d(this.f112622e, cb.d(this.f112621d, ep.b.b(this.f112620c, cb.d(this.f112619b, this.f112618a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdsAvatarState(creatorImageUrl=");
        sb3.append(this.f112618a);
        sb3.append(", creatorFallbackText=");
        sb3.append(this.f112619b);
        sb3.append(", avatarColorIndex=");
        sb3.append(this.f112620c);
        sb3.append(", sponsorImageUrl=");
        sb3.append(this.f112621d);
        sb3.append(", sponsorFallbackText=");
        sb3.append(this.f112622e);
        sb3.append(", sponsorAvatarColorIndex=");
        return a.a.n(sb3, this.f112623f, ")");
    }

    public i1(int i13, int i14, String creatorImageUrl, String creatorFallbackText, String sponsorImageUrl, String sponsorFallbackText) {
        Intrinsics.checkNotNullParameter(creatorImageUrl, "creatorImageUrl");
        Intrinsics.checkNotNullParameter(creatorFallbackText, "creatorFallbackText");
        Intrinsics.checkNotNullParameter(sponsorImageUrl, "sponsorImageUrl");
        Intrinsics.checkNotNullParameter(sponsorFallbackText, "sponsorFallbackText");
        this.f112618a = creatorImageUrl;
        this.f112619b = creatorFallbackText;
        this.f112620c = i13;
        this.f112621d = sponsorImageUrl;
        this.f112622e = sponsorFallbackText;
        this.f112623f = i14;
    }
}
