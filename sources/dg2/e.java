package dg2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends uf2.b {

    /* renamed from: d, reason: collision with root package name */
    public final tg2.h f54948d;

    /* renamed from: e, reason: collision with root package name */
    public final og2.a f54949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tg2.i breadcrumbBehavior, og2.a clock, ei2.a writer, lh2.b logger) {
        super(writer, logger, new wf2.c(new b(breadcrumbBehavior, 1)));
        Intrinsics.checkNotNullParameter(breadcrumbBehavior, "breadcrumbBehavior");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f54948d = breadcrumbBehavior;
        this.f54949e = clock;
    }
}
