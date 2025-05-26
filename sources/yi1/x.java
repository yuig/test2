package yi1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class x implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Headers f139164a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1.x f139165b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.c0 f139166c;

    /* renamed from: d, reason: collision with root package name */
    public final long f139167d;

    /* renamed from: e, reason: collision with root package name */
    public final long f139168e;

    public x(hs1.x loadedFrom, q8.c0 perfEventTime, long j13, long j14) {
        Intrinsics.checkNotNullParameter(loadedFrom, "loadedFrom");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f139164a = null;
        this.f139165b = loadedFrom;
        this.f139166c = perfEventTime;
        this.f139167d = j13;
        this.f139168e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f139164a, xVar.f139164a) && this.f139165b == xVar.f139165b && Intrinsics.d(this.f139166c, xVar.f139166c) && this.f139167d == xVar.f139167d && this.f139168e == xVar.f139168e;
    }

    public final int hashCode() {
        Headers headers = this.f139164a;
        return Long.hashCode(this.f139168e) + a.a.c(this.f139167d, (this.f139166c.hashCode() + ((this.f139165b.hashCode() + ((headers == null ? 0 : Arrays.hashCode(headers.f95627a)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "OnBitmapLoaded(responseHeaders=" + this.f139164a + ", loadedFrom=" + this.f139165b + ", perfEventTime=" + this.f139166c + ", timestampElapsedRealTime=" + this.f139167d + ", timestampSysCurrentTimeMillis=" + this.f139168e + ")";
    }
}
