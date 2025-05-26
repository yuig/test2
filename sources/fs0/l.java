package fs0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f62868a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62869b;

    /* renamed from: c, reason: collision with root package name */
    public final List f62870c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f62871d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62872e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f62873f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62874g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f62875h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f62876i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f62877j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f62878k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f62879l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f62880m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f62881n;

    public l(boolean z13, boolean z14, List additionalOverflow, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28) {
        Intrinsics.checkNotNullParameter(additionalOverflow, "additionalOverflow");
        this.f62868a = z13;
        this.f62869b = z14;
        this.f62870c = additionalOverflow;
        this.f62871d = z15;
        this.f62872e = z16;
        this.f62873f = z17;
        this.f62874g = z18;
        this.f62875h = z19;
        this.f62876i = z23;
        this.f62877j = z24;
        this.f62878k = z25;
        this.f62879l = z26;
        this.f62880m = z27;
        this.f62881n = z28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f62868a == lVar.f62868a && this.f62869b == lVar.f62869b && Intrinsics.d(this.f62870c, lVar.f62870c) && this.f62871d == lVar.f62871d && this.f62872e == lVar.f62872e && this.f62873f == lVar.f62873f && this.f62874g == lVar.f62874g && this.f62875h == lVar.f62875h && this.f62876i == lVar.f62876i && this.f62877j == lVar.f62877j && this.f62878k == lVar.f62878k && this.f62879l == lVar.f62879l && this.f62880m == lVar.f62880m && this.f62881n == lVar.f62881n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62881n) + ep.b.e(this.f62880m, ep.b.e(this.f62879l, ep.b.e(this.f62878k, ep.b.e(this.f62877j, ep.b.e(this.f62876i, ep.b.e(this.f62875h, ep.b.e(this.f62874g, ep.b.e(this.f62873f, ep.b.e(this.f62872e, ep.b.e(this.f62871d, ep.b.c(this.f62870c, ep.b.e(this.f62869b, Boolean.hashCode(this.f62868a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverflowMenuCreationConfig(isPinCloseup=");
        sb3.append(this.f62868a);
        sb3.append(", mentionedInPin=");
        sb3.append(this.f62869b);
        sb3.append(", additionalOverflow=");
        sb3.append(this.f62870c);
        sb3.append(", isMyPin=");
        sb3.append(this.f62871d);
        sb3.append(", isCurrentUserAllowedToEditPin=");
        sb3.append(this.f62872e);
        sb3.append(", isPromotedPin=");
        sb3.append(this.f62873f);
        sb3.append(", isStoryPin=");
        sb3.append(this.f62874g);
        sb3.append(", isRemovablePin=");
        sb3.append(this.f62875h);
        sb3.append(", isStaticImageIdeaPin=");
        sb3.append(this.f62876i);
        sb3.append(", wasPinCreatedWithShufflesApp=");
        sb3.append(this.f62877j);
        sb3.append(", isHairPatternFilterApplied=");
        sb3.append(this.f62878k);
        sb3.append(", isSkinToneFilterApplied=");
        sb3.append(this.f62879l);
        sb3.append(", isBodyTypeApplied=");
        sb3.append(this.f62880m);
        sb3.append(", isGoLinklessPin=");
        return a.a.r(sb3, this.f62881n, ")");
    }
}
