package z91;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f141408a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f141409b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f141410c;

    public x(i0 title, i0 description, i0 actionButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        this.f141408a = title;
        this.f141409b = description;
        this.f141410c = actionButtonText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f141408a, xVar.f141408a) && Intrinsics.d(this.f141409b, xVar.f141409b) && Intrinsics.d(this.f141410c, xVar.f141410c);
    }

    public final int hashCode() {
        return this.f141410c.hashCode() + ep.b.d(this.f141409b, this.f141408a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClaimedAmazonViewDisplayState(title=");
        sb3.append(this.f141408a);
        sb3.append(", description=");
        sb3.append(this.f141409b);
        sb3.append(", actionButtonText=");
        return jq.b.k(sb3, this.f141410c, ")");
    }
}
