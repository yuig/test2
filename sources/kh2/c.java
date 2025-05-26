package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79448b = {kotlin.jvm.internal.k0.f80436a.g(new kotlin.jvm.internal.d0(c.class, "preferencesService", "getPreferencesService()Lio/embrace/android/embracesdk/internal/prefs/PreferencesService;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final c0 f79449a;

    public c(b1 initModule, o coreModule) {
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(coreModule, "coreModule");
        this.f79449a = new c0(g1.LAZY, new b(coreModule, initModule, 0));
    }

    public final uh2.b a() {
        return (uh2.b) this.f79449a.a(this, f79448b[0]);
    }
}
