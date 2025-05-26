package uu1;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f123143a;

    public b(ExecutorService executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f123143a = executor;
    }

    public final a a(List requestInfoReceivers) {
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        return new a(requestInfoReceivers, this.f123143a);
    }
}
