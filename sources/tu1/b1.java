package tu1;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b1 implements wo2.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f119353a = new ArrayBlockingQueue(1);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f119354b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f119355c = new AtomicReference();

    public final Pair a() {
        try {
            return (Pair) this.f119353a.take();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for a read to finish!");
        }
    }

    @Override // wo2.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f119354b.set(true);
    }

    @Override // wo2.c0, java.io.Flushable
    public final void flush() {
    }

    @Override // wo2.c0
    public final wo2.i0 timeout() {
        return wo2.i0.f130705e;
    }

    @Override // wo2.c0
    public final void write(wo2.j jVar, long j13) {
        bf.b.v(!this.f119354b.get());
        while (j13 != 0) {
            Pair a13 = a();
            ByteBuffer byteBuffer = (ByteBuffer) a13.first;
            com.google.common.util.concurrent.k0 k0Var = (com.google.common.util.concurrent.k0) a13.second;
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
                k0Var.v(a1.SUCCESS);
            } catch (IOException e13) {
                k0Var.w(e13);
                throw e13;
            }
        }
    }
}
