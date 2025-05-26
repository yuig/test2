package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f82599a;

    /* renamed from: b, reason: collision with root package name */
    public final vb.b f82600b;

    public i0(o processor, vb.b workTaskExecutor) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f82599a = processor;
        this.f82600b = workTaskExecutor;
    }

    public final void a(t workSpecId, int i13) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f82600b.a(new ub.k(this.f82599a, workSpecId, false, i13));
    }
}
