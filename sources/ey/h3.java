package ey;

import java.util.Map;
import kotlin.Pair;
import okhttp3.internal.Util;

/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f60494a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f60495b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f60496c;

    public h3(long j13, long j14, long j15) {
        this.f60494a = j14;
        this.f60495b = kotlin.collections.z0.g(new Pair("X-B3-TraceId", Util.y(j13)), new Pair("X-B3-SpanId", Util.y(j14)), new Pair("X-B3-ParentSpanId", Util.y(j15)));
        this.f60496c = true;
    }

    public h3() {
        this.f60494a = -1L;
        this.f60495b = kotlin.collections.z0.d();
        this.f60496c = false;
    }
}
