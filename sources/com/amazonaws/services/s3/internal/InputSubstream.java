package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;

/* loaded from: classes3.dex */
public final class InputSubstream extends SdkFilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f28795a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28796b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28797c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28798d;

    /* renamed from: e, reason: collision with root package name */
    public long f28799e;

    public InputSubstream(RepeatableFileInputStream repeatableFileInputStream, long j13, long j14) {
        super(repeatableFileInputStream);
        this.f28799e = 0L;
        this.f28795a = 0L;
        this.f28797c = j14;
        this.f28796b = j13;
        this.f28798d = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long j13 = this.f28795a;
        long j14 = this.f28796b;
        long j15 = this.f28797c;
        if (j13 >= j14) {
            j15 = (j15 + j14) - j13;
        }
        return (int) Math.min(j15, super.available());
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f28798d) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        this.f28799e = this.f28795a;
        super.mark(i13);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read == -1 ? read : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f28795a = this.f28799e;
        super.reset();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        long j13;
        long j14;
        while (true) {
            j13 = this.f28795a;
            j14 = this.f28796b;
            if (j13 >= j14) {
                break;
            }
            this.f28795a += skip(j14 - j13);
        }
        long j15 = (this.f28797c + j14) - j13;
        if (j15 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i13, (int) Math.min(i14, j15));
        this.f28795a += read;
        return read;
    }
}
