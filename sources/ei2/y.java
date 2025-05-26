package ei2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import xf2.c0;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f59048a;

    /* renamed from: b, reason: collision with root package name */
    public final long f59049b;

    /* renamed from: c, reason: collision with root package name */
    public final long f59050c;

    /* renamed from: d, reason: collision with root package name */
    public final oi2.a f59051d;

    /* renamed from: e, reason: collision with root package name */
    public final oi2.b f59052e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f59053f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f59054g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f59055h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f59056i;

    /* renamed from: j, reason: collision with root package name */
    public final List f59057j;

    /* renamed from: k, reason: collision with root package name */
    public final ErrorCode f59058k;

    public y(String name, long j13, long j14, oi2.a autoTerminationMode, oi2.b bVar, c0 type, boolean z13, boolean z14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f59048a = name;
        this.f59049b = j13;
        this.f59050c = j14;
        this.f59051d = autoTerminationMode;
        this.f59052e = bVar;
        this.f59053f = type;
        this.f59054g = z13;
        this.f59055h = z14;
        this.f59056i = attributes;
        this.f59057j = events;
        this.f59058k = errorCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f59048a, yVar.f59048a) && this.f59049b == yVar.f59049b && this.f59050c == yVar.f59050c && this.f59051d == yVar.f59051d && Intrinsics.d(this.f59052e, yVar.f59052e) && Intrinsics.d(this.f59053f, yVar.f59053f) && this.f59054g == yVar.f59054g && this.f59055h == yVar.f59055h && Intrinsics.d(this.f59056i, yVar.f59056i) && Intrinsics.d(this.f59057j, yVar.f59057j) && this.f59058k == yVar.f59058k;
    }

    public final int hashCode() {
        int hashCode = (this.f59051d.hashCode() + a.a.c(this.f59050c, a.a.c(this.f59049b, this.f59048a.hashCode() * 31, 31), 31)) * 31;
        oi2.b bVar = this.f59052e;
        int c13 = ep.b.c(this.f59057j, a.c.e(this.f59056i, ep.b.e(this.f59055h, ep.b.e(this.f59054g, (this.f59053f.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31), 31), 31), 31);
        ErrorCode errorCode = this.f59058k;
        return c13 + (errorCode != null ? errorCode.hashCode() : 0);
    }

    public final String toString() {
        return "BufferedRecordCompletedSpan(name=" + this.f59048a + ", startTimeMs=" + this.f59049b + ", endTimeMs=" + this.f59050c + ", autoTerminationMode=" + this.f59051d + ", parent=" + this.f59052e + ", type=" + this.f59053f + ", internal=" + this.f59054g + ", private=" + this.f59055h + ", attributes=" + this.f59056i + ", events=" + this.f59057j + ", errorCode=" + this.f59058k + ')';
    }
}
