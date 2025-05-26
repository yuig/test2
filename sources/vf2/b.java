package vf2;

import bi2.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final si2.d f125776a;

    /* renamed from: b, reason: collision with root package name */
    public final ai2.b f125777b;

    /* renamed from: c, reason: collision with root package name */
    public final h f125778c;

    /* renamed from: d, reason: collision with root package name */
    public final og2.a f125779d;

    public b(si2.d logger, ai2.b sessionIdTracker, h processStateService, og2.a clock) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(sessionIdTracker, "sessionIdTracker");
        Intrinsics.checkNotNullParameter(processStateService, "processStateService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f125776a = logger;
        this.f125777b = sessionIdTracker;
        this.f125778c = processStateService;
        this.f125779d = clock;
    }
}
