package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f28586a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressListenerCallbackExecutor f28587b;

    /* renamed from: c, reason: collision with root package name */
    public int f28588c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28589d;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f28586a = 8192;
        this.f28587b = progressListenerCallbackExecutor;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i13 = this.f28588c;
        if (i13 > 0) {
            this.f28587b.a(new ProgressEvent(i13));
            this.f28588c = 0;
        }
        super.close();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f28587b;
        if (read != -1) {
            int i13 = this.f28588c + 1;
            this.f28588c = i13;
            if (i13 >= this.f28586a) {
                progressListenerCallbackExecutor.a(new ProgressEvent(i13));
                this.f28588c = 0;
            }
        } else if (this.f28589d) {
            ProgressEvent progressEvent = new ProgressEvent(this.f28588c);
            progressEvent.f28581b = 4;
            this.f28588c = 0;
            progressListenerCallbackExecutor.a(progressEvent);
        }
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.f28588c);
        progressEvent.f28581b = 32;
        this.f28587b.a(progressEvent);
        this.f28588c = 0;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int read = super.read(bArr, i13, i14);
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f28587b;
        if (read == -1 && this.f28589d) {
            ProgressEvent progressEvent = new ProgressEvent(this.f28588c);
            progressEvent.f28581b = 4;
            this.f28588c = 0;
            progressListenerCallbackExecutor.a(progressEvent);
        }
        if (read != -1) {
            int i15 = this.f28588c + read;
            this.f28588c = i15;
            if (i15 >= this.f28586a) {
                progressListenerCallbackExecutor.a(new ProgressEvent(i15));
                this.f28588c = 0;
            }
        }
        return read;
    }
}
