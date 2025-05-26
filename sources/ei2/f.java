package ei2;

import a.cb;
import io.opentelemetry.api.trace.StatusCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f58978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58979b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58980c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58981d;

    /* renamed from: e, reason: collision with root package name */
    public final long f58982e;

    /* renamed from: f, reason: collision with root package name */
    public final long f58983f;

    /* renamed from: g, reason: collision with root package name */
    public final StatusCode f58984g;

    /* renamed from: h, reason: collision with root package name */
    public final List f58985h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f58986i;

    public f(String traceId, String spanId, String str, String name, long j13, long j14, StatusCode status, ArrayList events, LinkedHashMap attributes) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f58978a = traceId;
        this.f58979b = spanId;
        this.f58980c = str;
        this.f58981d = name;
        this.f58982e = j13;
        this.f58983f = j14;
        this.f58984g = status;
        this.f58985h = events;
        this.f58986i = attributes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f58978a, fVar.f58978a) && Intrinsics.d(this.f58979b, fVar.f58979b) && Intrinsics.d(this.f58980c, fVar.f58980c) && Intrinsics.d(this.f58981d, fVar.f58981d) && this.f58982e == fVar.f58982e && this.f58983f == fVar.f58983f && this.f58984g == fVar.f58984g && Intrinsics.d(this.f58985h, fVar.f58985h) && Intrinsics.d(this.f58986i, fVar.f58986i);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f58979b, this.f58978a.hashCode() * 31, 31);
        String str = this.f58980c;
        return this.f58986i.hashCode() + ep.b.c(this.f58985h, (this.f58984g.hashCode() + a.a.c(this.f58983f, a.a.c(this.f58982e, cb.d(this.f58981d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "EmbraceSpanData(traceId=" + this.f58978a + ", spanId=" + this.f58979b + ", parentSpanId=" + this.f58980c + ", name=" + this.f58981d + ", startTimeNanos=" + this.f58982e + ", endTimeNanos=" + this.f58983f + ", status=" + this.f58984g + ", events=" + this.f58985h + ", attributes=" + this.f58986i + ')';
    }
}
