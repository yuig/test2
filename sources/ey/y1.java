package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class y1 extends x1 {

    /* renamed from: g, reason: collision with root package name */
    public final String f60624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(String url) {
        super(url, 0);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f60624g = url;
    }

    @Override // ey.x1, ey.w1, ey.u1
    public final String e() {
        return "network_time";
    }

    @Override // ey.w1, ey.u1
    public final String[] h() {
        String[] strArr = a3.f60429a;
        return a3.f60430b;
    }

    public final String l() {
        return this.f60624g;
    }
}
