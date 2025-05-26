package gg;

import com.github.mustachejava.MustacheException;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class c extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f64889a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f64890b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final Writer f64891c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Throwable f64892d;

    public c(Writer writer) {
        this.f64891c = writer;
    }

    public final void a() {
        if (this.f64892d != null) {
            if (!(this.f64892d instanceof IOException)) {
                throw new IOException(this.f64892d);
            }
            throw ((IOException) this.f64892d);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
        try {
            this.f64889a.await();
            flush();
            this.f64891c.close();
        } catch (InterruptedException e13) {
            throw new MustacheException("Interrupted while waiting for completion", e13);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
        if (this.f64889a.getCount() == 0) {
            synchronized (this) {
                this.f64891c.flush();
            }
        }
    }

    @Override // java.io.Writer
    public final synchronized void write(char[] cArr, int i13, int i14) {
        try {
            a();
            if (this.f64889a.getCount() == 0) {
                this.f64891c.write(cArr, i13, i14);
            } else {
                this.f64890b.append(cArr, i13, i14);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
