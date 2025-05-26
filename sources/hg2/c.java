package hg2;

import a11.p;
import android.content.Context;
import ei2.v;
import kh2.y0;
import kotlin.jvm.internal.Intrinsics;
import uf2.e;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: d, reason: collision with root package name */
    public final Context f69083d;

    /* renamed from: e, reason: collision with root package name */
    public final ki2.a f69084e;

    /* renamed from: f, reason: collision with root package name */
    public final og2.a f69085f;

    /* renamed from: g, reason: collision with root package name */
    public final d f69086g;

    /* renamed from: h, reason: collision with root package name */
    public oi2.b f69087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, v spanService, lh2.b logger, ki2.a backgroundWorker, og2.a clock, y0 provider) {
        super(spanService, logger, new wf2.c(a.f69082i));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f69083d = context;
        this.f69084e = backgroundWorker;
        this.f69085f = clock;
        this.f69086g = new d(provider, new b(1, this, c.class, "onPowerSaveModeChanged", "onPowerSaveModeChanged(Z)V", 0));
    }

    @Override // uf2.b, uf2.a
    public final void a() {
        d dVar = this.f69086g;
        dVar.getClass();
        Context ctx = this.f69083d;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        ctx.unregisterReceiver(dVar);
    }

    @Override // uf2.b, uf2.a
    public final void c() {
        d dVar = this.f69086g;
        dVar.getClass();
        Context context = this.f69083d;
        Intrinsics.checkNotNullParameter(context, "context");
        ki2.a backgroundWorker = this.f69084e;
        Intrinsics.checkNotNullParameter(backgroundWorker, "backgroundWorker");
        backgroundWorker.b(new p(29, dVar, context));
    }
}
