package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u2 extends y1 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f60584h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(String url, boolean z13) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f60584h = z13;
    }

    public final boolean m() {
        return this.f60584h;
    }
}
