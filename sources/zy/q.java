package zy;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements v {

    /* renamed from: a, reason: collision with root package name */
    public final List f143107a;

    /* renamed from: b, reason: collision with root package name */
    public final h32.i0 f143108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f143109c;

    public q(List impressions, h32.i0 pinalyticsContext, String str) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f143107a = impressions;
        this.f143108b = pinalyticsContext;
        this.f143109c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f143107a, qVar.f143107a) && Intrinsics.d(this.f143108b, qVar.f143108b) && Intrinsics.d(this.f143109c, qVar.f143109c);
    }

    public final int hashCode() {
        int hashCode = (this.f143108b.hashCode() + (this.f143107a.hashCode() * 31)) * 31;
        String str = this.f143109c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DumpReportedImpressions(impressions=");
        sb3.append(this.f143107a);
        sb3.append(", pinalyticsContext=");
        sb3.append(this.f143108b);
        sb3.append(", uniqueScreenKey=");
        return a.a.p(sb3, this.f143109c, ")");
    }
}
