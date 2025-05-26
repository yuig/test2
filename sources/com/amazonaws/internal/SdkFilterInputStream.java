package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;

/* loaded from: classes3.dex */
public abstract class SdkFilterInputStream extends FilterInputStream implements MetricAware {
    @Override // com.amazonaws.internal.MetricAware
    public boolean a() {
        if (((FilterInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((FilterInputStream) this).in).a();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        d();
        return ((FilterInputStream) this).in.available();
    }

    public void c() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in.close();
        d();
    }

    public final void d() {
        if (Thread.interrupted()) {
            c();
            throw new AbortedException();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i13) {
        d();
        ((FilterInputStream) this).in.mark(i13);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        d();
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        d();
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        d();
        ((FilterInputStream) this).in.reset();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j13) {
        d();
        return ((FilterInputStream) this).in.skip(j13);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i13, int i14) {
        d();
        return ((FilterInputStream) this).in.read(bArr, i13, i14);
    }
}
