package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f29041a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29042b;

    /* renamed from: c, reason: collision with root package name */
    public long f29043c;

    /* renamed from: d, reason: collision with root package name */
    public long f29044d;

    public LengthCheckInputStream(InputStream inputStream, long j13, boolean z13) {
        super(inputStream);
        if (j13 < 0) {
            throw new IllegalArgumentException();
        }
        this.f29041a = j13;
        this.f29042b = z13;
    }

    public final void e(boolean z13) {
        long j13 = this.f29041a;
        if (z13) {
            if (this.f29043c == j13) {
                return;
            }
            throw new AmazonClientException("Data read (" + this.f29043c + ") has a different length than the expected (" + j13 + ")");
        }
        if (this.f29043c <= j13) {
            return;
        }
        throw new AmazonClientException("More data read (" + this.f29043c + ") than expected (" + j13 + ")");
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i13) {
        super.mark(i13);
        this.f29044d = this.f29043c;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read >= 0) {
            this.f29043c++;
        }
        e(read == -1);
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        if (markSupported()) {
            this.f29043c = this.f29044d;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j13) {
        long skip = super.skip(j13);
        if (this.f29042b && skip > 0) {
            this.f29043c += skip;
            e(false);
        }
        return skip;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        int read = super.read(bArr, i13, i14);
        this.f29043c += read >= 0 ? read : 0L;
        e(read == -1);
        return read;
    }
}
