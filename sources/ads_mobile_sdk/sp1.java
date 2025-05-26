package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sp1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11186a;

    public sp1(a.o8 o8Var) {
        this.f11186a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        oh0 flags = (oh0) this.f11186a.get();
        Intrinsics.checkNotNullParameter(flags, "flags");
        flags.getClass();
        zn2.a aVar = zn2.b.f142311b;
        return Long.valueOf(zn2.b.e(flags.a(dl2.b.P2(20, zn2.d.SECONDS), "gads:http_url_connection_factory:timeout_millis")));
    }
}
