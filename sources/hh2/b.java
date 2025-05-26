package hh2;

import bi2.h;
import ei2.u;
import ei2.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f69218a;

    /* renamed from: b, reason: collision with root package name */
    public final x f69219b;

    /* renamed from: c, reason: collision with root package name */
    public final ei2.a f69220c;

    /* renamed from: d, reason: collision with root package name */
    public final u f69221d;

    /* renamed from: e, reason: collision with root package name */
    public final eg2.a f69222e;

    /* renamed from: f, reason: collision with root package name */
    public final h f69223f;

    /* renamed from: g, reason: collision with root package name */
    public final og2.a f69224g;

    /* renamed from: h, reason: collision with root package name */
    public final lh2.b f69225h;

    public b(Function0 symbolMapProvider, x spanSink, ei2.a currentSessionSpan, u spanRepository, eg2.a otelPayloadMapper, h processStateService, og2.a clock, lh2.b logger) {
        Intrinsics.checkNotNullParameter(symbolMapProvider, "symbolMapProvider");
        Intrinsics.checkNotNullParameter(spanSink, "spanSink");
        Intrinsics.checkNotNullParameter(currentSessionSpan, "currentSessionSpan");
        Intrinsics.checkNotNullParameter(spanRepository, "spanRepository");
        Intrinsics.checkNotNullParameter(otelPayloadMapper, "otelPayloadMapper");
        Intrinsics.checkNotNullParameter(processStateService, "processStateService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f69218a = symbolMapProvider;
        this.f69219b = spanSink;
        this.f69220c = currentSessionSpan;
        this.f69221d = spanRepository;
        this.f69222e = otelPayloadMapper;
        this.f69223f = processStateService;
        this.f69224g = clock;
        this.f69225h = logger;
    }
}
