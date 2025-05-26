package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s2 extends y1 implements c2 {

    /* renamed from: h, reason: collision with root package name */
    public final long f60576h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(String url, long j13) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f60576h = j13;
    }

    @Override // ey.c2
    public final long a() {
        return this.f60576h;
    }
}
