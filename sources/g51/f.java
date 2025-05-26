package g51;

import kotlin.jvm.internal.Intrinsics;
import lh0.u2;
import m60.g0;
import rg0.s;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final bq.c f63601a;

    /* renamed from: b, reason: collision with root package name */
    public final wj0.a f63602b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f63603c;

    /* renamed from: d, reason: collision with root package name */
    public final pb0.d f63604d;

    /* renamed from: e, reason: collision with root package name */
    public final x12.a f63605e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f63606f;

    /* renamed from: g, reason: collision with root package name */
    public final s f63607g;

    /* renamed from: h, reason: collision with root package name */
    public final u2 f63608h;

    public f(bq.c sortUtils, wj0.a sensitivityTracker, b60.b activeUserManager, pb0.d dateFormatter, x12.a pagedListService, g0 pageSizeProvider, s experiences, u2 experiments) {
        Intrinsics.checkNotNullParameter(sortUtils, "sortUtils");
        Intrinsics.checkNotNullParameter(sensitivityTracker, "sensitivityTracker");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f63601a = sortUtils;
        this.f63602b = sensitivityTracker;
        this.f63603c = activeUserManager;
        this.f63604d = dateFormatter;
        this.f63605e = pagedListService;
        this.f63606f = pageSizeProvider;
        this.f63607g = experiences;
        this.f63608h = experiments;
    }
}
