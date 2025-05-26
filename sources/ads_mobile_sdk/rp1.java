package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rp1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10742a;

    public rp1(a.o8 o8Var) {
        this.f10742a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        oh0 flags = (oh0) this.f10742a.get();
        Intrinsics.checkNotNullParameter(flags, "flags");
        return Integer.valueOf(((Number) flags.a("gads:offline_database_version_decagon", 1, oh0.f9285i)).intValue());
    }
}
