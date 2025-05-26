package androidx.work.impl;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final int f20012a;

    public WorkerStoppedException(int i13) {
        this.f20012a = i13;
    }

    /* renamed from: a, reason: from getter */
    public final int getF20012a() {
        return this.f20012a;
    }
}
