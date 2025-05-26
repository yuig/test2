package dh2;

import kotlin.jvm.internal.Intrinsics;
import xk2.k;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final xh2.d f55016a;

    /* renamed from: b, reason: collision with root package name */
    public final d f55017b;

    public b(k outputDir, ki2.e worker, lh2.b logger, xh2.d serializer) {
        Intrinsics.checkNotNullParameter(outputDir, "outputDir");
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f55016a = serializer;
        this.f55017b = new d(outputDir, worker, logger, 100);
    }
}
