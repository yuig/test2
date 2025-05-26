package gt1;

import et1.d0;
import et1.h0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f66118a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f66119b;

    public f(d0 passThroughNodeFactory, h0 simpleProducerFactory) {
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        this.f66118a = passThroughNodeFactory;
        this.f66119b = simpleProducerFactory;
    }
}
