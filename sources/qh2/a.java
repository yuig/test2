package qh2;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f103918a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f103919b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f103920c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f103921d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103922e;

    /* renamed from: f, reason: collision with root package name */
    public final ByteArrayOutputStream f103923f;

    public a(BufferedInputStream bufferedInputStream, boolean z13, cp.i iVar) {
        super(bufferedInputStream);
        this.f103918a = -1L;
        this.f103921d = new AtomicLong(0L);
        this.f103923f = new ByteArrayOutputStream();
        this.f103919b = iVar;
        this.f103922e = z13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        ((FilterInputStream) this).in.mark(i13);
        this.f103918a = this.f103921d.longValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f103921d.incrementAndGet();
            byte[] bArr = {Integer.valueOf(read).byteValue()};
            if (this.f103922e) {
                this.f103923f.write(bArr, 0, 1);
            }
        } else if (!this.f103920c) {
            this.f103920c = true;
            this.f103919b.invoke(this.f103923f.toByteArray());
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f103918a == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f103921d.set(this.f103918a);
        this.f103920c = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        long skip = ((FilterInputStream) this).in.skip(j13);
        this.f103921d.addAndGet(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int read = ((FilterInputStream) this).in.read(bArr, i13, i14);
        if (read != -1) {
            this.f103921d.addAndGet(read);
            if (this.f103922e && bArr != null) {
                this.f103923f.write(bArr, i13, read);
            }
        } else if (!this.f103920c) {
            this.f103920c = true;
            this.f103919b.invoke(this.f103923f.toByteArray());
        }
        return read;
    }
}
