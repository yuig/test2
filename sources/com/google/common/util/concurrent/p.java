package com.google.common.util.concurrent;

import a.a1;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class p extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f33580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f33581d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f33582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f33583f;

    public p(q qVar, a1 a1Var, r rVar) {
        this.f33583f = qVar;
        this.f33581d = qVar;
        rVar.getClass();
        this.f33580c = rVar;
        this.f33582e = a1Var;
    }

    @Override // com.google.common.util.concurrent.a0
    public final void a(Throwable th3) {
        q qVar = this.f33581d;
        qVar.f33584k = null;
        if (th3 instanceof ExecutionException) {
            qVar.w(((ExecutionException) th3).getCause());
        } else if (th3 instanceof CancellationException) {
            qVar.cancel(false);
        } else {
            qVar.w(th3);
        }
    }

    @Override // com.google.common.util.concurrent.a0
    public final void b(Object obj) {
        this.f33581d.f33584k = null;
        this.f33583f.v(obj);
    }

    @Override // com.google.common.util.concurrent.a0
    public final boolean d() {
        return this.f33581d.isDone();
    }

    @Override // com.google.common.util.concurrent.a0
    public final Object e() {
        return this.f33582e.call();
    }

    @Override // com.google.common.util.concurrent.a0
    public final String f() {
        return this.f33582e.toString();
    }
}
