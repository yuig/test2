package qg2;

import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCall;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l7.b0;
import xk2.v;

/* loaded from: classes4.dex */
public final class j implements bg2.b {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f103871a;

    /* renamed from: b, reason: collision with root package name */
    public final c f103872b;

    /* renamed from: c, reason: collision with root package name */
    public final og2.a f103873c;

    /* renamed from: d, reason: collision with root package name */
    public final v f103874d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture f103875e;

    /* renamed from: f, reason: collision with root package name */
    public k f103876f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f103877g;

    public j(ki2.a worker, c cacheManager, og2.a clock) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(cacheManager, "cacheManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f103871a = worker;
        this.f103872b = cacheManager;
        this.f103873c = clock;
        this.f103874d = xk2.m.b(new nd2.a(this, 18));
        this.f103876f = k.UNKNOWN;
        this.f103877g = new AtomicReference(null);
    }

    public final m a() {
        return (m) this.f103874d.getValue();
    }

    public final void b(ApiRequest request, Function1 action, boolean z13) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(action, "action");
        g gVar = (g) this.f103872b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        String str = "payload_" + kh2.d.x();
        jg2.h hVar = new jg2.h(gVar, str, action, 2);
        if (z13) {
            hVar.invoke();
        } else {
            gVar.f103863b.a(new p4.a(12, hVar), ki2.f.NORMAL);
        }
        a().a(new PendingApiCall(request, str, Long.valueOf(this.f103873c.now())));
        gVar.c(a(), z13);
    }

    public final void c(long j13) {
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f103875e;
                if ((scheduledFuture == null || scheduledFuture.isCancelled() || scheduledFuture.isDone()) && a().b()) {
                    this.f103875e = this.f103871a.a(new b0(this, j13, 7), j13, TimeUnit.SECONDS);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // bg2.b
    public final void d(k status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f103876f = status;
        if (status.isReachable()) {
            c(0L);
            return;
        }
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f103875e;
                if (scheduledFuture != null) {
                    if (scheduledFuture.cancel(false)) {
                        this.f103875e = null;
                    }
                    Unit unit = Unit.f80348a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
