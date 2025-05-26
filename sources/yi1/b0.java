package yi1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class b0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1.x f139072a;

    /* renamed from: b, reason: collision with root package name */
    public final Headers f139073b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139074c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139075d;

    /* renamed from: e, reason: collision with root package name */
    public final q8.c0 f139076e;

    public b0(hs1.x xVar, Headers headers, int i13, int i14) {
        q8.c0 perfEventTime = new q8.c0(1);
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f139072a = xVar;
        this.f139073b = headers;
        this.f139074c = i13;
        this.f139075d = i14;
        this.f139076e = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f139072a == b0Var.f139072a && Intrinsics.d(this.f139073b, b0Var.f139073b) && this.f139074c == b0Var.f139074c && this.f139075d == b0Var.f139075d && Intrinsics.d(this.f139076e, b0Var.f139076e);
    }

    public final int hashCode() {
        hs1.x xVar = this.f139072a;
        int hashCode = (xVar == null ? 0 : xVar.hashCode()) * 31;
        Headers headers = this.f139073b;
        return this.f139076e.hashCode() + ep.b.b(this.f139075d, ep.b.b(this.f139074c, (hashCode + (headers != null ? Arrays.hashCode(headers.f95627a) : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "BitmapImageDrawn(loadedFrom=" + this.f139072a + ", responseHeaders=" + this.f139073b + ", bitmapWidthInPixel=" + this.f139074c + ", containerWidthInPx=" + this.f139075d + ", perfEventTime=" + this.f139076e + ")";
    }
}
