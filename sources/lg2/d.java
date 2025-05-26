package lg2;

import kh2.y0;
import kotlin.jvm.internal.Intrinsics;
import uf2.e;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class d extends e {

    /* renamed from: d, reason: collision with root package name */
    public final ki2.a f83279d;

    /* renamed from: e, reason: collision with root package name */
    public final og2.a f83280e;

    /* renamed from: f, reason: collision with root package name */
    public b f83281f;

    /* renamed from: g, reason: collision with root package name */
    public final v f83282g;

    /* renamed from: h, reason: collision with root package name */
    public oi2.b f83283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ei2.v spanService, lh2.b logger, ki2.a backgroundWorker, og2.a clock, y0 powerManagerProvider) {
        super(spanService, logger, new wf2.c(c.f83278i));
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(powerManagerProvider, "powerManagerProvider");
        this.f83279d = backgroundWorker;
        this.f83280e = clock;
        this.f83282g = m.b(powerManagerProvider);
    }

    @Override // uf2.b, uf2.a
    public final void a() {
        this.f83279d.b(new a(this, 1));
    }

    @Override // uf2.b, uf2.a
    public final void c() {
        this.f83279d.b(new a(this, 0));
    }
}
