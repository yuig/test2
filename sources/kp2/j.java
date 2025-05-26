package kp2;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f80620a = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    public boolean f80621b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f80622c;

    /* renamed from: d, reason: collision with root package name */
    public InterruptedIOException f80623d;

    /* renamed from: e, reason: collision with root package name */
    public RuntimeException f80624e;

    public final void a(int i13) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert(i13, TimeUnit.MILLISECONDS);
        if (this.f80622c) {
            InterruptedIOException interruptedIOException = this.f80623d;
            if (interruptedIOException == null) {
                throw this.f80624e;
            }
            throw interruptedIOException;
        }
        if (this.f80621b) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
        this.f80621b = true;
        while (this.f80621b) {
            if (i13 == 0) {
                try {
                    b(0L, false).run();
                } catch (InterruptedIOException e13) {
                    this.f80621b = false;
                    this.f80622c = true;
                    this.f80623d = e13;
                    throw e13;
                } catch (RuntimeException e14) {
                    this.f80621b = false;
                    this.f80622c = true;
                    this.f80624e = e14;
                    throw e14;
                }
            } else {
                b((convert - System.nanoTime()) + nanoTime, true).run();
            }
        }
    }

    public final Runnable b(long j13, boolean z13) {
        LinkedBlockingQueue linkedBlockingQueue = this.f80620a;
        try {
            Runnable runnable = !z13 ? (Runnable) linkedBlockingQueue.take() : (Runnable) linkedBlockingQueue.poll(j13, TimeUnit.NANOSECONDS);
            if (runnable != null) {
                return runnable;
            }
            throw new SocketTimeoutException();
        } catch (InterruptedException e13) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e13);
            throw interruptedIOException;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f80620a.put(runnable);
        } catch (InterruptedException e13) {
            throw new RejectedExecutionException(e13);
        }
    }
}
