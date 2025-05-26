package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class f0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f33558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f33559b;

    public f0(Executor executor, s sVar) {
        this.f33558a = executor;
        this.f33559b = sVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f33558a.execute(runnable);
        } catch (RejectedExecutionException e13) {
            this.f33559b.w(e13);
        }
    }
}
