package ey;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class p2 extends x1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(String url) {
        super(url, 0);
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // ey.x1, ey.w1, ey.u1
    public final String e() {
        return "dns_lookup";
    }

    @Override // ey.w1, ey.u1
    public final String[] h() {
        String[] strArr = a3.f60429a;
        return a3.f60431c;
    }
}
