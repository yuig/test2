package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public final class m0 extends s implements RunnableFuture {

    /* renamed from: e */
    public volatile l0 f33577e;

    public m0(Callable callable) {
        this.f33577e = new l0(this, callable);
    }

    @Override // com.google.common.util.concurrent.b
    public final void k() {
        l0 l0Var;
        if (y() && (l0Var = this.f33577e) != null) {
            l0Var.c();
        }
        this.f33577e = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        l0 l0Var = this.f33577e;
        if (l0Var != null) {
            l0Var.run();
        }
        this.f33577e = null;
    }

    @Override // com.google.common.util.concurrent.b
    public final String t() {
        l0 l0Var = this.f33577e;
        if (l0Var == null) {
            return super.t();
        }
        return "task=[" + l0Var + "]";
    }
}
