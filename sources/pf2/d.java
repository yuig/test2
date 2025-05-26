package pf2;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh2.g;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f100019a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f100020b;

    /* renamed from: c, reason: collision with root package name */
    public final f f100021c;

    /* renamed from: d, reason: collision with root package name */
    public final e f100022d;

    /* renamed from: e, reason: collision with root package name */
    public final a f100023e;

    /* renamed from: f, reason: collision with root package name */
    public final lh2.b f100024f;

    /* renamed from: g, reason: collision with root package name */
    public long f100025g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f100026h;

    public d(sg2.a configService, ki2.a anrMonitorWorker, og2.a clock, f state, e targetThreadHandler, a blockedThreadDetector, lh2.b logger) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(anrMonitorWorker, "anrMonitorWorker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(targetThreadHandler, "targetThreadHandler");
        Intrinsics.checkNotNullParameter(blockedThreadDetector, "blockedThreadDetector");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f100019a = anrMonitorWorker;
        this.f100020b = clock;
        this.f100021c = state;
        this.f100022d = targetThreadHandler;
        this.f100023e = blockedThreadDetector;
        this.f100024f = logger;
        this.f100025g = ((sg2.b) configService).f112881f.b();
        c cVar = new c(1, blockedThreadDetector, a.class, "onTargetThreadResponse", "onTargetThreadResponse(J)V", 0);
        targetThreadHandler.getClass();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        targetThreadHandler.f100029c = cVar;
    }

    public final void a() {
        long b13 = ((sg2.b) this.f100023e.f100012a).f112881f.b();
        this.f100025g = b13;
        b runnable = new b(this, 0);
        try {
            q qVar = s.f135225b;
            ki2.a aVar = this.f100019a;
            TimeUnit unit = TimeUnit.MILLISECONDS;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            Intrinsics.checkNotNullParameter(unit, "unit");
            ScheduledFuture<?> scheduleAtFixedRate = aVar.f79804a.scheduleAtFixedRate(runnable, 0L, b13, unit);
            Intrinsics.checkNotNullExpressionValue(scheduleAtFixedRate, "impl.scheduleAtFixedRate…lDelay, intervalMs, unit)");
            this.f100026h = scheduleAtFixedRate;
            Unit unit2 = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }

    public final boolean b() {
        ScheduledFuture scheduledFuture = this.f100026h;
        if (scheduledFuture != null && scheduledFuture.cancel(false)) {
            this.f100026h = null;
            return true;
        }
        ((lh2.e) this.f100024f).b(g.ANR_HEARTBEAT_STOP_FAIL, new IllegalStateException("Scheduled heartbeat task could not be stopped.".concat(this.f100026h == null ? "Task is null." : "")));
        return false;
    }
}
