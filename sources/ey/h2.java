package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h2 extends x1 {

    /* renamed from: g, reason: collision with root package name */
    public final long f60493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(String url, long j13) {
        super(url, 0);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f60493g = j13;
    }

    public final long l() {
        return this.f60493g;
    }
}
