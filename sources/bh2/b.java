package bh2;

import dh2.e;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import x62.c;
import xh2.d;
import yg2.f;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: j, reason: collision with root package name */
    public static final List f22809j = f0.j(f.SESSION, f.CRASH);

    /* renamed from: a, reason: collision with root package name */
    public final ch2.a f22810a;

    /* renamed from: b, reason: collision with root package name */
    public final e f22811b;

    /* renamed from: c, reason: collision with root package name */
    public final e f22812c;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.b f22813d;

    /* renamed from: e, reason: collision with root package name */
    public final d f22814e;

    /* renamed from: f, reason: collision with root package name */
    public final ki2.e f22815f;

    /* renamed from: g, reason: collision with root package name */
    public final long f22816g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f22817h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f22818i;

    public b(ch2.a schedulingService, e payloadStorageService, e cacheStorageService, lh2.b logger, d serializer, ki2.e worker) {
        Intrinsics.checkNotNullParameter(schedulingService, "schedulingService");
        Intrinsics.checkNotNullParameter(payloadStorageService, "payloadStorageService");
        Intrinsics.checkNotNullParameter(cacheStorageService, "cacheStorageService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f22810a = schedulingService;
        this.f22811b = payloadStorageService;
        this.f22812c = cacheStorageService;
        this.f22813d = logger;
        this.f22814e = serializer;
        this.f22815f = worker;
        this.f22816g = 3000L;
        this.f22817h = new ConcurrentHashMap();
        this.f22818i = new ConcurrentHashMap();
    }

    public final void a(Envelope intake, yg2.d metadata) {
        Intrinsics.checkNotNullParameter(intake, "intake");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Future a13 = this.f22815f.a(new c(this, intake, metadata, 5), metadata);
        if (metadata.f139035e) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f22817h;
        f fVar = metadata.f139034d;
        Future future = (Future) concurrentHashMap.get(fVar);
        concurrentHashMap.put(fVar, a13);
        if (future != null) {
            future.cancel(false);
        }
    }
}
