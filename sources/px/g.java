package px;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f101554a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f101555b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f101556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101557d;

    /* renamed from: e, reason: collision with root package name */
    public final long f101558e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101559f;

    /* renamed from: g, reason: collision with root package name */
    public final d f101560g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f101561h;

    public g(ArrayList metrics, Date startDate, boolean z13, int i13, long j13, d dVar) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f101554a = metrics;
        this.f101555b = startDate;
        this.f101556c = z13;
        this.f101557d = i13;
        this.f101558e = j13;
        this.f101559f = false;
        this.f101560g = dVar;
        this.f101561h = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f101554a, gVar.f101554a) && Intrinsics.d(this.f101555b, gVar.f101555b) && this.f101556c == gVar.f101556c && this.f101557d == gVar.f101557d && this.f101558e == gVar.f101558e && this.f101559f == gVar.f101559f && this.f101560g == gVar.f101560g && this.f101561h == gVar.f101561h;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f101559f, a.a.c(this.f101558e, ep.b.b(this.f101557d, ep.b.e(this.f101556c, (this.f101555b.hashCode() + (this.f101554a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        d dVar = this.f101560g;
        return Boolean.hashCode(this.f101561h) + ((e13 + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinMetrics(metrics=");
        sb3.append(this.f101554a);
        sb3.append(", startDate=");
        sb3.append(this.f101555b);
        sb3.append(", isRealtime=");
        sb3.append(this.f101556c);
        sb3.append(", numOfDays=");
        sb3.append(this.f101557d);
        sb3.append(", latestAvailableTimestamp=");
        sb3.append(this.f101558e);
        sb3.append(", containsLifetimeMetrics=");
        sb3.append(this.f101559f);
        sb3.append(", videoStatsMessage=");
        sb3.append(this.f101560g);
        sb3.append(", containsVideoLifetimeMetrics=");
        return a.a.r(sb3, this.f101561h, ")");
    }
}
