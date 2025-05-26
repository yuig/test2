package ads_mobile_sdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import wo2.i0;

/* loaded from: classes2.dex */
public final class aq1 implements wo2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f2495a = ByteBuffer.allocateDirect(32768);

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f2496b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bq1 f2497c;

    public aq1(bq1 bq1Var) {
        this.f2497c = bq1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2496b) {
            return;
        }
        this.f2496b = true;
        if (this.f2497c.f3555b.get()) {
            return;
        }
        this.f2497c.f3562i.cancel();
    }

    @Override // wo2.e0
    public final long read(wo2.j jVar, long j13) {
        zp1 zp1Var;
        if (this.f2497c.f3556c.get()) {
            throw new IOException("The request was canceled!");
        }
        bf.b.j("sink == null", jVar != null);
        bf.b.g(j13, "byteCount < 0: %s", j13 >= 0);
        bf.b.u("closed", !this.f2496b);
        if (this.f2497c.f3555b.get()) {
            return -1L;
        }
        if (j13 < this.f2495a.limit()) {
            this.f2495a.limit((int) j13);
        }
        this.f2497c.f3562i.read(this.f2495a);
        try {
            bq1 bq1Var = this.f2497c;
            zp1Var = (zp1) bq1Var.f3557d.poll(bq1Var.f3559f, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            zp1Var = null;
        }
        if (zp1Var == null) {
            this.f2497c.f3562i.cancel();
            throw new av();
        }
        int c13 = a.bb.c(zp1Var.f14850a);
        if (c13 == 0) {
            zp1Var.f14851b.flip();
            int write = jVar.write(zp1Var.f14851b);
            zp1Var.f14851b.clear();
            return write;
        }
        if (c13 == 1) {
            this.f2497c.f3555b.set(true);
            this.f2495a = null;
            return -1L;
        }
        if (c13 == 2) {
            this.f2497c.f3555b.set(true);
            this.f2495a = null;
            throw new IOException(zp1Var.f14852c);
        }
        if (c13 != 3) {
            throw new AssertionError("The switch block above is exhaustive!");
        }
        this.f2495a = null;
        throw new IOException("The request was canceled!");
    }

    @Override // wo2.e0
    public final i0 timeout() {
        return i0.f130705e;
    }
}
