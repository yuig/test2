package dh2;

import kh2.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f55026a;

    /* renamed from: b, reason: collision with root package name */
    public final d f55027b;

    public e(k outputDir, ki2.e worker, z processIdProvider, lh2.b logger) {
        Intrinsics.checkNotNullParameter(outputDir, "outputDir");
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(processIdProvider, "processIdProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f55026a = processIdProvider;
        this.f55027b = new d(outputDir, worker, logger, 500);
    }
}
