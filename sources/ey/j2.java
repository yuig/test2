package ey;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class j2 extends x1 {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f60507g;

    /* renamed from: h, reason: collision with root package name */
    public final s92.c f60508h;

    /* renamed from: i, reason: collision with root package name */
    public final Headers f60509i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(String url, boolean z13, s92.c dataSource) {
        super(url, 0);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f60507g = z13;
        this.f60508h = dataSource;
        this.f60509i = null;
    }

    public final s92.c l() {
        return this.f60508h;
    }

    public final Headers m() {
        return this.f60509i;
    }

    public final boolean n() {
        return this.f60507g;
    }
}
