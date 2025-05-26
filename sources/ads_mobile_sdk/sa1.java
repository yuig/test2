package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sa1 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final fg f11015a;

    public sa1(fg appState) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.f11015a = appState;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.MEMORY;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        Runtime runtime = Runtime.getRuntime();
        return new pk0(new ra1(runtime.freeMemory(), runtime.maxMemory(), runtime.totalMemory(), this.f11015a.f5144d.get()));
    }
}
