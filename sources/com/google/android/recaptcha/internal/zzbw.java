package com.google.android.recaptcha.internal;

import ao2.o1;
import ao2.p0;
import ao2.s;
import ao2.u;
import ao2.v;
import ao2.x0;
import bl2.c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import xk2.d;

/* loaded from: classes3.dex */
public final class zzbw implements p0 {
    private final /* synthetic */ v zza;

    public zzbw(v vVar) {
        this.zza = vVar;
    }

    @Override // ao2.o1
    public final s attachChild(u uVar) {
        return this.zza.attachChild(uVar);
    }

    @Override // ao2.p0
    public final Object await(c cVar) {
        return this.zza.await(cVar);
    }

    @Override // ao2.o1
    @d
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.zza.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(h hVar) {
        return this.zza.get(hVar);
    }

    @Override // ao2.o1
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // ao2.o1
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // ao2.p0
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // ao2.p0
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final h getKey() {
        return this.zza.getKey();
    }

    @Override // ao2.p0
    public final lo2.d getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // ao2.o1
    public final lo2.c getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // ao2.o1
    public final o1 getParent() {
        return this.zza.getParent();
    }

    @Override // ao2.o1
    public final x0 invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // ao2.o1
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // ao2.o1
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // ao2.o1
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // ao2.o1
    public final Object join(c cVar) {
        return this.zza.join(cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(h hVar) {
        return this.zza.minusKey(hVar);
    }

    @Override // ao2.o1
    @d
    public final o1 plus(o1 o1Var) {
        return this.zza.plus(o1Var);
    }

    @Override // ao2.o1
    public final boolean start() {
        return this.zza.start();
    }

    @Override // ao2.o1
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // ao2.o1
    public final x0 invokeOnCompletion(boolean z13, boolean z14, Function1 function1) {
        return this.zza.invokeOnCompletion(z13, z14, function1);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    @Override // ao2.o1
    @d
    public final /* synthetic */ boolean cancel(Throwable th3) {
        return this.zza.cancel(th3);
    }
}
