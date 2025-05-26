package mt0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88143a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88144b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88145c;

    public a(String interestTags, String interestLabels, String freeformTags) {
        Intrinsics.checkNotNullParameter(interestTags, "interestTags");
        Intrinsics.checkNotNullParameter(interestLabels, "interestLabels");
        Intrinsics.checkNotNullParameter(freeformTags, "freeformTags");
        this.f88143a = interestTags;
        this.f88144b = interestLabels;
        this.f88145c = freeformTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f88143a, aVar.f88143a) && Intrinsics.d(this.f88144b, aVar.f88144b) && Intrinsics.d(this.f88145c, aVar.f88145c);
    }

    public final int hashCode() {
        return this.f88145c.hashCode() + cb.d(this.f88144b, this.f88143a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditInterestTagsEvent(interestTags=");
        sb3.append(this.f88143a);
        sb3.append(", interestLabels=");
        sb3.append(this.f88144b);
        sb3.append(", freeformTags=");
        return a.a.p(sb3, this.f88145c, ")");
    }
}
