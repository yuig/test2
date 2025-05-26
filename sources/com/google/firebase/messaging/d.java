package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f33767a;

    /* renamed from: b, reason: collision with root package name */
    public long f33768b;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f33768b = -1L;
        this.f33767a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f33767a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        ((FilterInputStream) this).in.mark(i13);
        this.f33768b = this.f33767a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f33767a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f33767a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f33768b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f33767a = this.f33768b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j13, this.f33767a));
        this.f33767a -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        long j13 = this.f33767a;
        if (j13 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i13, (int) Math.min(i14, j13));
        if (read != -1) {
            this.f33767a -= read;
        }
        return read;
    }
}
