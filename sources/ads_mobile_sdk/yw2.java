package ads_mobile_sdk;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import wo2.i0;

/* loaded from: classes2.dex */
public final class yw2 implements wo2.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f14440a = new ArrayBlockingQueue(1);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f14441b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f14442c = new AtomicReference();

    public final com.google.common.util.concurrent.c0 a(ByteBuffer byteBuffer) {
        Throwable th3 = (Throwable) this.f14442c.get();
        if (th3 != null) {
            return new com.google.common.util.concurrent.x(th3);
        }
        com.google.common.util.concurrent.k0 k0Var = new com.google.common.util.concurrent.k0();
        this.f14440a.add(Pair.create(byteBuffer, k0Var));
        Throwable th4 = (Throwable) this.f14442c.get();
        if (th4 != null) {
            k0Var.w(th4);
        }
        return k0Var;
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14441b.set(true);
    }

    @Override // wo2.c0, java.io.Flushable
    public final void flush() {
    }

    @Override // wo2.c0
    public final i0 timeout() {
        return i0.f130705e;
    }

    @Override // wo2.c0
    public final void write(wo2.j jVar, long j13) {
        bf.b.v(!this.f14441b.get());
        while (j13 != 0) {
            try {
                Pair pair = (Pair) this.f14440a.take();
                ByteBuffer byteBuffer = (ByteBuffer) pair.first;
                com.google.common.util.concurrent.k0 k0Var = (com.google.common.util.concurrent.k0) pair.second;
                int limit = byteBuffer.limit();
                byteBuffer.limit((int) Math.min(limit, j13));
                try {
                    long read = jVar.read(byteBuffer);
                    if (read == -1) {
                        IOException iOException = new IOException("The source has been exhausted but we expected more!");
                        k0Var.w(iOException);
                        throw iOException;
                    }
                    j13 -= read;
                    byteBuffer.limit(limit);
                    k0Var.v(xw2.SUCCESS);
                } catch (IOException e13) {
                    k0Var.w(e13);
                    throw e13;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new IOException("Interrupted while waiting for a read to finish!");
            }
        }
    }

    public final void a() {
        if (!this.f14441b.getAndSet(true)) {
            try {
                ((com.google.common.util.concurrent.k0) ((Pair) this.f14440a.take()).second).v(xw2.END_OF_BODY);
                return;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new IOException("Interrupted while waiting for a read to finish!");
            }
        }
        throw new IllegalStateException("Already closed");
    }

    public final void a(Throwable th3) {
        this.f14442c.set(th3);
        Pair pair = (Pair) this.f14440a.poll();
        if (pair != null) {
            ((com.google.common.util.concurrent.k0) pair.second).w(th3);
        }
    }
}
