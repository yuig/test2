package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2 extends x1 {

    /* renamed from: g, reason: collision with root package name */
    public final String f60578g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(String url) {
        super(url, 0);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f60578g = url;
    }

    public final String l() {
        return this.f60578g;
    }
}
