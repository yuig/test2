package pf2;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final og2.a f100030a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f100031b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f100032c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f100033d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f100034e;

    public f(og2.a clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f100030a = clock;
        this.f100031b = new AtomicBoolean(false);
        this.f100032c = clock.now();
        this.f100033d = clock.now();
    }
}
