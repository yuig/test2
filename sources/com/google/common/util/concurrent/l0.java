package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class l0 extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f33575c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f33576d;

    public l0(m0 m0Var, Callable callable) {
        this.f33576d = m0Var;
        callable.getClass();
        this.f33575c = callable;
    }

    @Override // com.google.common.util.concurrent.a0
    public final void a(Throwable th3) {
        this.f33576d.w(th3);
    }

    @Override // com.google.common.util.concurrent.a0
    public final void b(Object obj) {
        this.f33576d.v(obj);
    }

    @Override // com.google.common.util.concurrent.a0
    public final boolean d() {
        return this.f33576d.isDone();
    }

    @Override // com.google.common.util.concurrent.a0
    public final Object e() {
        return this.f33575c.call();
    }

    @Override // com.google.common.util.concurrent.a0
    public final String f() {
        return this.f33575c.toString();
    }
}
