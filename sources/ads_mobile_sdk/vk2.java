package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vk2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12554a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f12555b;

    public vk2(a.o8 o8Var, a.o8 o8Var2) {
        this.f12554a = o8Var;
        this.f12555b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        wr2 topicsSignalSource = (wr2) this.f12554a.get();
        oh0 flags = (oh0) this.f12555b.get();
        Intrinsics.checkNotNullParameter(topicsSignalSource, "topicsSignalSource");
        Intrinsics.checkNotNullParameter(flags, "flags");
        ci2 ci2Var = ci2.f3929b;
        jh2 jh2Var = jh2.f6819b;
        gj2 gj2Var = gj2.f5594a;
        flags.getClass();
        zn2.a aVar = zn2.b.f142311b;
        return new yo1(topicsSignalSource, ci2Var, jh2Var, gj2Var, flags.a(dl2.b.P2(100, zn2.d.MILLISECONDS), "gads:topics_signal_timeout_in_millis"), new a.a7(flags, 1));
    }
}
