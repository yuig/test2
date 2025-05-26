package vg2;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s81.g;
import xk2.k;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final wg2.a f125788a;

    /* renamed from: b, reason: collision with root package name */
    public final ki2.a f125789b;

    /* renamed from: c, reason: collision with root package name */
    public final long f125790c;

    /* renamed from: d, reason: collision with root package name */
    public final k f125791d;

    /* renamed from: e, reason: collision with root package name */
    public final v f125792e;

    public a(wg2.a store, v httpSource, ki2.a worker) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(httpSource, "httpSource");
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f125788a = store;
        this.f125789b = worker;
        this.f125790c = 3600000L;
        this.f125791d = httpSource;
        this.f125792e = m.b(new nd2.a(this, 20));
    }

    public final void a() {
        String etag;
        try {
            c0.d.M2("set-initial-etag");
            b bVar = (b) this.f125792e.getValue();
            if (bVar != null && (etag = bVar.f125794b) != null) {
                c cVar = (c) ((d) this.f125791d.getValue());
                cVar.getClass();
                Intrinsics.checkNotNullParameter(etag, "etag");
                cVar.f125798d = etag;
                Unit unit = Unit.f80348a;
            }
            c0.d.N();
            try {
                c0.d.M2("schedule-http-request");
                this.f125789b.f79804a.scheduleWithFixedDelay(new g(this, 29), 0L, this.f125790c, TimeUnit.MILLISECONDS);
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
