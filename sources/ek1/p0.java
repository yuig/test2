package ek1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class p0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59312a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59313b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59314c;

    /* renamed from: d, reason: collision with root package name */
    public final s92.c f59315d;

    /* renamed from: e, reason: collision with root package name */
    public final Headers f59316e;

    /* renamed from: f, reason: collision with root package name */
    public final q8.c0 f59317f;

    public p0(String url, boolean z13, boolean z14, s92.c dataSource, Headers headers, q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f59312a = url;
        this.f59313b = z13;
        this.f59314c = z14;
        this.f59315d = dataSource;
        this.f59316e = headers;
        this.f59317f = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f59312a, p0Var.f59312a) && this.f59313b == p0Var.f59313b && this.f59314c == p0Var.f59314c && this.f59315d == p0Var.f59315d && Intrinsics.d(this.f59316e, p0Var.f59316e) && Intrinsics.d(this.f59317f, p0Var.f59317f);
    }

    public final int hashCode() {
        int hashCode = (this.f59315d.hashCode() + ep.b.e(this.f59314c, ep.b.e(this.f59313b, this.f59312a.hashCode() * 31, 31), 31)) * 31;
        Headers headers = this.f59316e;
        return this.f59317f.hashCode() + ((hashCode + (headers == null ? 0 : Arrays.hashCode(headers.f95627a))) * 31);
    }

    public final String toString() {
        return "LogFirstPageLoadStopEvent(url=" + this.f59312a + ", cached=" + this.f59313b + ", isSuccessful=" + this.f59314c + ", dataSource=" + this.f59315d + ", headers=" + this.f59316e + ", perfEventTime=" + this.f59317f + ")";
    }
}
