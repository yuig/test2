package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i2 extends x1 implements b2 {

    /* renamed from: g, reason: collision with root package name */
    public final String f60499g;

    /* renamed from: h, reason: collision with root package name */
    public final int f60500h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(String url, int i13) {
        super(url, 0);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f60499g = url;
        this.f60500h = i13;
    }

    public final String l() {
        return this.f60499g;
    }
}
