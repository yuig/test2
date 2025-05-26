package px;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final f f101570a;

    /* renamed from: b, reason: collision with root package name */
    public final List f101571b;

    /* renamed from: c, reason: collision with root package name */
    public final String f101572c;

    /* renamed from: d, reason: collision with root package name */
    public final String f101573d;

    /* renamed from: e, reason: collision with root package name */
    public final int f101574e;

    /* renamed from: f, reason: collision with root package name */
    public final long f101575f;

    public i(f metricType, ArrayList metrics, String dateEnd, String dateStart, int i13, long j13) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(dateEnd, "dateEnd");
        Intrinsics.checkNotNullParameter(dateStart, "dateStart");
        this.f101570a = metricType;
        this.f101571b = metrics;
        this.f101572c = dateEnd;
        this.f101573d = dateStart;
        this.f101574e = i13;
        this.f101575f = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f101570a == iVar.f101570a && Intrinsics.d(this.f101571b, iVar.f101571b) && Intrinsics.d(this.f101572c, iVar.f101572c) && Intrinsics.d(this.f101573d, iVar.f101573d) && this.f101574e == iVar.f101574e && this.f101575f == iVar.f101575f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101575f) + ep.b.b(this.f101574e, cb.d(this.f101573d, cb.d(this.f101572c, ep.b.c(this.f101571b, this.f101570a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProductTags(metricType=");
        sb3.append(this.f101570a);
        sb3.append(", metrics=");
        sb3.append(this.f101571b);
        sb3.append(", dateEnd=");
        sb3.append(this.f101572c);
        sb3.append(", dateStart=");
        sb3.append(this.f101573d);
        sb3.append(", numOfProducts=");
        sb3.append(this.f101574e);
        sb3.append(", totalMetrics=");
        return a.a.o(sb3, this.f101575f, ")");
    }
}
