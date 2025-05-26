package dg2;

import ei2.v;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends uf2.e {

    /* renamed from: d, reason: collision with root package name */
    public final og2.a f54967d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f54968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tg2.i breadcrumbBehavior, og2.a clock, v spanService, lh2.b logger) {
        super(spanService, logger, new wf2.c(new f(breadcrumbBehavior, 1)));
        Intrinsics.checkNotNullParameter(breadcrumbBehavior, "breadcrumbBehavior");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f54967d = clock;
        this.f54968e = new LinkedHashMap();
    }
}
