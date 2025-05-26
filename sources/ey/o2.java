package ey;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class o2 extends x1 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f60557g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f60558h;

    /* renamed from: i, reason: collision with root package name */
    public final s92.c f60559i;

    /* renamed from: j, reason: collision with root package name */
    public final Headers f60560j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(String url, boolean z13, boolean z14, s92.c dataSource, Headers headers) {
        super(url, 1);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f60557g = z13;
        this.f60558h = z14;
        this.f60559i = dataSource;
        this.f60560j = headers;
    }

    public final boolean l() {
        return this.f60557g;
    }

    public final s92.c m() {
        return this.f60559i;
    }

    public final Headers n() {
        return this.f60560j;
    }

    public final boolean o() {
        return this.f60558h;
    }
}
