package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class RepeatableFileInputStream extends SdkInputStream {

    /* renamed from: e, reason: collision with root package name */
    public static final Log f28806e = LogFactory.b("RepeatableFIS");

    /* renamed from: a, reason: collision with root package name */
    public final File f28807a;

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f28808b;

    /* renamed from: c, reason: collision with root package name */
    public long f28809c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f28810d = 0;

    public RepeatableFileInputStream(File file) {
        this.f28808b = null;
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        this.f28808b = new FileInputStream(file);
        this.f28807a = file;
    }

    @Override // java.io.InputStream
    public final int available() {
        c();
        return this.f28808b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28808b.close();
        c();
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public final InputStream d() {
        return this.f28808b;
    }

    @Override // java.io.InputStream
    public final void mark(int i13) {
        c();
        this.f28810d += this.f28809c;
        this.f28809c = 0L;
        Log log = f28806e;
        if (log.b()) {
            log.f("Input stream marked at " + this.f28810d + " bytes");
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        c();
        int read = this.f28808b.read();
        if (read == -1) {
            return -1;
        }
        this.f28809c++;
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f28808b.close();
        c();
        this.f28808b = new FileInputStream(this.f28807a);
        long j13 = this.f28810d;
        while (j13 > 0) {
            j13 -= this.f28808b.skip(j13);
        }
        Log log = f28806e;
        if (log.b()) {
            log.f("Reset to mark point " + this.f28810d + " after returning " + this.f28809c + " bytes");
        }
        this.f28809c = 0L;
    }

    @Override // java.io.InputStream
    public final long skip(long j13) {
        c();
        long skip = this.f28808b.skip(j13);
        this.f28809c += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        c();
        int read = this.f28808b.read(bArr, i13, i14);
        this.f28809c += read;
        return read;
    }
}
