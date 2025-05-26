package ek1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class o0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59294a;

    /* renamed from: b, reason: collision with root package name */
    public final s92.c f59295b;

    /* renamed from: c, reason: collision with root package name */
    public final Headers f59296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f59297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f59298e;

    /* renamed from: f, reason: collision with root package name */
    public final q8.c0 f59299f;

    public o0(String pinUid, s92.c dataSource, Headers headers, int i13, int i14, q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f59294a = pinUid;
        this.f59295b = dataSource;
        this.f59296c = headers;
        this.f59297d = i13;
        this.f59298e = i14;
        this.f59299f = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f59294a, o0Var.f59294a) && this.f59295b == o0Var.f59295b && Intrinsics.d(this.f59296c, o0Var.f59296c) && this.f59297d == o0Var.f59297d && this.f59298e == o0Var.f59298e && Intrinsics.d(this.f59299f, o0Var.f59299f);
    }

    public final int hashCode() {
        int hashCode = (this.f59295b.hashCode() + (this.f59294a.hashCode() * 31)) * 31;
        Headers headers = this.f59296c;
        return this.f59299f.hashCode() + ep.b.b(this.f59298e, ep.b.b(this.f59297d, (hashCode + (headers == null ? 0 : Arrays.hashCode(headers.f95627a))) * 31, 31), 31);
    }

    public final String toString() {
        return "LogBitmapDrawEvents(pinUid=" + this.f59294a + ", dataSource=" + this.f59295b + ", responseHeaders=" + this.f59296c + ", bitmapWidthInPixel=" + this.f59297d + ", containerWidthInPx=" + this.f59298e + ", perfEventTime=" + this.f59299f + ")";
    }
}
