package tu1;

import com.pinterest.network.cronet.CronetTimeoutException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class s0 implements wo2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f119440a = ByteBuffer.allocateDirect(32768);

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f119441b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f119442c;

    public s0(t0 t0Var) {
        this.f119442c = t0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f119441b) {
            return;
        }
        this.f119441b = true;
        t0 t0Var = this.f119442c;
        if (!t0Var.f119453s || t0Var.f119445k.get()) {
            return;
        }
        this.f119442c.f119452r.cancel();
    }

    @Override // wo2.e0
    public final long read(wo2.j jVar, long j13) {
        q0 q0Var;
        if (this.f119442c.f119446l.get()) {
            throw new IOException("The request was canceled!");
        }
        bf.b.j("sink == null", jVar != null);
        bf.b.g(j13, "byteCount < 0: %s", j13 >= 0);
        bf.b.u("closed", !this.f119441b);
        if (this.f119442c.f119445k.get()) {
            return -1L;
        }
        if (j13 < this.f119440a.limit()) {
            this.f119440a.limit((int) j13);
        }
        this.f119442c.f119452r.read(this.f119440a);
        try {
            t0 t0Var = this.f119442c;
            q0Var = (q0) t0Var.f119447m.poll(t0Var.f119449o, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            q0Var = null;
        }
        if (q0Var == null) {
            this.f119442c.f119452r.cancel();
            throw new CronetTimeoutException();
        }
        int ordinal = q0Var.f119430a.ordinal();
        if (ordinal == 0) {
            q0Var.f119431b.flip();
            int write = jVar.write(q0Var.f119431b);
            q0Var.f119431b.clear();
            return write;
        }
        if (ordinal == 1) {
            this.f119442c.f119445k.set(true);
            this.f119440a = null;
            return -1L;
        }
        if (ordinal == 2) {
            this.f119442c.f119445k.set(true);
            this.f119440a = null;
            throw new IOException(q0Var.f119432c);
        }
        if (ordinal != 3) {
            throw new AssertionError("The switch block above is exhaustive!");
        }
        this.f119440a = null;
        throw new IOException("The request was canceled!");
    }

    @Override // wo2.e0
    public final wo2.i0 timeout() {
        return wo2.i0.f130705e;
    }
}
